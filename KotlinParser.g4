parser grammar KotlinParser;

options {
    tokenVocab=KotlinLexer;
}

// ==================== program definition

prog        : package_def? import_stmt* root_elem? EOF;
root_elem   : decl (sep decl)* sep?;

// ==================== file header

package_def : PACKAGE identifier sep;
import_stmt : IMPORT identifier ALL? sep;

// ==================== loops

loop        : FOR n L_PAREN n ID n IN n expr n R_PAREN n (block | stmt | SEMICOLON);

// ==================== operator groups

assign_op   : ASSIGN
            | PLUS_ASSN
            | MINUS_ASSN
            | MULTI_ASSN
            | DIVIDE_ASSN
            | REMAIN_ASSN
            ;

equal_op    : REF_EQUAL
            | REF_NEQUAL
            | EQUAL
            | NEQUAL
            ;

comp_op     : GRTR_EQ
            | GRTR
            | LESS_EQ
            | LESS
            ;

check_op    : NOT_IS
            | NOT_IN
            | IS
            | IN
            ;

add_op      : PLUS
            | MINUS
            ;

mult_op     : MULTI
            | DIVIDE
            | REMAIN
            ;

prefix      : INCR
            | DECR
            | PLUS
            | MINUS
            | NEGATE
//          | L_PAREN identifier R_PAREN    out of spec
            ;

postfix     : INCR
            | DECR
            | DOT n ID
            | arg_list
            | L_BRACKET expr R_BRACKET
            ;

modifier    : OVERRIDE
            | PUBLIC
            | PRIVATE
            | INTERNAL
            | PROTECTED
            | ABSTRACT
            | FINAL
            | OPEN
            ;

// ==================== expression related

expr        : expr_or;
expr_or     : expr_and (n OR n expr_and)*;
expr_and    : expr_eq (n AND n expr_eq)*;
expr_eq     : expr_comp (n equal_op n expr_comp)*;
expr_comp   : expr_check (n comp_op n expr_check)?;
expr_check  : expr_elvis (n check_op n expr_elvis)*;
expr_elvis  : expr_infix (n ELVIS n expr_infix)*;
expr_infix  : expr_range (n (DOWNTO | STEP) n expr_range)*;
expr_range  : expr_add (n RANGE n expr_add)*;
expr_add    : expr_mult (n add_op n expr_mult)*;
expr_mult   : expr_pre (n mult_op n expr_pre)*;
expr_pre    : (prefix n)* expr_post;
expr_post   : expr_term (n postfix)*;

expr_term   : THIS
            | ID
            | literal
            | paren_expr
            | if_expr
//          | when_expr                     out of spec
            | jumps
            ;

paren_expr  : L_PAREN n expr n R_PAREN;

// ==================== if / when / jump expressions

if_expr     : IF n paren_expr (n block | n stmt | sep) (n ELSE n (block | stmt | SEMICOLON))?;

jumps       : CONTINUE
            | BREAK
            | RETURN n expr?
            ;

// ==================== function related

func_decl   : modifier* n FUN n ID n param_list n type_def? n func_body?;
func_body   : block
            | assn_rhs
            ;
param_list  : L_PAREN n (ID n type_def (n COMMA n ID n type_def)*)? n R_PAREN;

arg_list    : L_PAREN n (expr (n COMMA n expr)*)? n R_PAREN;

// ==================== literal values

literal     : INT
            | REAL
            | SINGLE_CH
            | BOOL
            | str
            | NULL
            ;

// ==================== string related

str         : DBLE_Q CHAR* DBLE_Q;

// ==================== variable / value related

assn_rhs    : ASSIGN n expr;
reassn_rhs  : assign_op n expr;
var_decl    : modifier* n (VAR | VAL) n ID n type_def? n assn_rhs?;
assn        : expr_term n reassn_rhs;

// ==================== miscellaneous

stmt        : expr
            | assn
            | loop
            | decl
            ;
decl        : var_decl
            | func_decl
//          | class_decl                    out of spec
            ;

identifier  : ID (DOT ID)*;
type_def    : COLON n type;
type        : identifier (n LESS n type n GRTR)? n QUESTION?;
block       : L_BRACE n (stmt (sep stmt)* sep?)? R_BRACE;
n           : NL*;
sep         : (NL | SEMICOLON) n;



// ==================== GRAVEYARD ====================

/*
loop        : for_loop
            | while_loop
            ;

for_loop    : FOR n L_PAREN n ID n IN n expr n R_PAREN n (block | stmt | SEMICOLON);
while_loop  : WHILE n L_PAREN n expr n R_PAREN n (block | stmt | SEMICOLON);

when_expr   : WHEN n when_targ? n L_BRACE n when_case (sep when_case)* n R_BRACE;
when_targ   : L_PAREN n (VAL n ID n type_def? n ASSIGN n)? expr n R_PAREN;
when_case   : check_op? n expr (n check_op? n expr)* n CASE n (block | stmt)
            | ELSE n CASE n (block | stmt);

class_decl  : modifier* n (CLASS | INTERFACE) n ID n prim_cstr? n inherit? n class_body;
class_body  : L_BRACE n root_elem? n R_BRACE;
prim_cstr   : L_PAREN n (var_decl (n COMMA n var_decl )*)? n R_PAREN;
inherit     : COLON n identifier n arg_list? (n COMMA n identifier n arg_list?)*;

str         : DBLE_Q str_elem* DBLE_Q;
str_elem    : CHAR+
            | expr_tmpl
            | smpl_tmpl
            ;
smpl_tmpl   : DOLLAR ID;
expr_tmpl   : TMPL_ENTRY expr R_BRACE;
*/