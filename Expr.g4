grammar Expr;

prog : stmt+ ;
stmt : (expr | assn) END ;
expr : expr ('+'|'-'|'*'|'/') expr
     | '(' expr ')'
     | NUM
     | ID
     ;
assn : ID '=' expr ;

NUM: [+-]?[0-9]+('.'[0-9]*)? ;
ID : [a-zA-Z_][0-9a-zA-Z_]* ;
WS : [ \t\r\n]+ -> skip;
END: ';' ;