lexer grammar KotlinLexer;

// ========================= skippers

WS          : [ \t]+ -> channel(HIDDEN);        // whitespaces
SNGL_CMNT   : '//' ~[\r\n]* -> channel(HIDDEN); // single line comment
MLTI_CMNT   : '/*' .*? '*/' -> channel(HIDDEN); // multi line comment

// ========================= keywords

PACKAGE : 'package '-> pushMode(PACK_DEF)    ;  // package declaration keyword
IMPORT  : 'import ' -> pushMode(IMPORT_DEF)  ;  // import statement keyword
CLASS   : 'class'   ;                           // class declaration keyword
INTERFACE: 'interface';                         // interface declaration keyword
FUN     : 'fun'     ;                       // function declaration keyword
VAR     : 'var'     ;                       // variable declaration keyword
VAL     : 'val'     ;                       // value declaration keyword
RETURN  : 'return'  ;                       // return statement keyword
IF      : 'if'      ;                       // if statement keyword
ELSE    : 'else'    ;                       // else statement keyword
FOR     : 'for'     ;                       // for loop keyword
WHILE   : 'while'   ;                       // while loop keyword
WHEN    : 'when'    ;                       // when expression keyword
DOWNTO  : 'downTo'  ;                       // downTo range option keyword
STEP    : 'step'    ;                       // step range option keyword
NULL    : 'null'    ;                       // null value keyword
TRUE    : 'true'    ;                       // true value keyword
FALSE   : 'false'   ;                       // false value keyword
THIS    : 'this'    ;                       // this keyword
CONTINUE: 'continue';                       // continue keyword
BREAK   : 'break'   ;                       // break keyword
OVERRIDE: 'override';                       // override keyword
PUBLIC  : 'public'  ;                       // public keyword
PRIVATE : 'private' ;                       // private keyword
INTERNAL: 'internal';                       // internal keyword
PROTECTED: 'protected';                     // protected keyword
ABSTRACT: 'abstract';                       // abstract keyword
FINAL   : 'final'   ;                       // final keyword
OPEN    : 'open'    ;                       // open keyword

// ========================= special operators

DBLE_Q      : '"'   -> pushMode(STRING);        // double quote is a start character of a string
TMPL_ENTRY  : '${'  ;

// ========================= operators

IS          : 'is'  ;
NOT_IS      : '!is' ;
IN          : 'in'  ;
NOT_IN      : '!in' ;
CASE        : '->'  ;
ELVIS       : '?:'  ;
ALL         : '.*'  ;
INCR        : '++'  ;
DECR        : '--'  ;
PLUS_ASSN   : '+='  ;
MINUS_ASSN  : '-='  ;
MULTI_ASSN  : '*='  ;
DIVIDE_ASSN : '/='  ;
REMAIN_ASSN : '%='  ;
PLUS        : '+'   ;
MINUS       : '-'   ;
MULTI       : '*'   ;
DIVIDE      : '/'   ;
REMAIN      : '%'   ;
COLON       : ':'   ;
COMMA       : ','   ;
RANGE       : '..'  ;
DOT         : '.'   ;
NEGATE      : '!'   ;
AND         : '&&'  ;
OR          : '||'  ;
REF_EQUAL   : '===' ;
REF_NEQUAL  : '!==' ;
EQUAL       : '=='  ;
NEQUAL      : '!='  ;
GRTR_EQ     : '>='  ;
GRTR        : '>'   ;
LESS_EQ     : '<='  ;
LESS        : '<'   ;
QUESTION    : '?'   ;
L_PAREN     : '('   ;
R_PAREN     : ')'   ;
L_BRACKET   : '['   ;
R_BRACKET   : ']'   ;
SNGL_Q      : '\''  ;
R_BRACE     : '}'   -> popMode;
L_BRACE     : '{'   -> pushMode(DEFAULT_MODE);
DOLLAR      : '$'   ;
ASSIGN      : '='   ;

// ==================== primitive values

REAL        : DIGIT* DOT DIGIT+ SUF_FLOAT?      // real number
            | DIGIT+ SUF_FLOAT?
            ;
INT         : DIGIT+ SUF_LONG?;                 // integer
BOOL        : TRUE | FALSE;                     // boolean
SINGLE_CH   : SNGL_Q (CHAR | DOLLAR) SNGL_Q;    // single character

// ==================== string related

ID          : [a-zA-Z][0-9a-zA-Z]*;           // identifier

CHAR        : ~('\\' | '\n' | '\r' | '$')
            | '\\' ~'u'
            | '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            ;

// ==================== miscellaneous

NL          : ('\r'? '\n')+;
SEMICOLON   : ';';

// ========================= fragments

fragment
SUF_LONG    : [lL];     // long suffix
fragment
SUF_FLOAT   : [fF];     // float suffix
fragment
HEX_DIGIT   : [0-9A-Fa-f];
fragment
DIGIT       : [0-9];

/* ========================= inside of package ========================= */

mode PACK_DEF;

PACK_ID     : ID -> type(ID);
PACK_DOT    : DOT -> type(DOT);
PACK_NL     : NL -> type(NL), popMode;
PACK_SEMI   : SEMICOLON -> type(SEMICOLON), popMode;

/* ========================= inside of import ========================= */

mode IMPORT_DEF;

IMPORT_ID   : ID -> type(ID);
IMPORT_DOT  : DOT -> type(DOT);
IMPORT_ALL  : ALL -> type(ALL);
IMPORT_NL   : NL -> type(NL), popMode;
IMPORT_SEMI : SEMICOLON -> type(SEMICOLON), popMode;

/* ========================= inside of string ========================= */

mode STRING;

STR_EXIT    : DBLE_Q -> type(DBLE_Q), popMode;
STR_TMPL_ENT: TMPL_ENTRY -> type(TMPL_ENTRY), pushMode(DEFAULT_MODE);
STR_DOLLAR  : DOLLAR -> type(DOLLAR), pushMode(ID_TEMPLATE);
STR_CHAR    : CHAR -> type(CHAR);

/* ========================= inside of id-based template ========================= */

mode ID_TEMPLATE;

IDTMPL_ID   : ID -> type(ID), popMode;