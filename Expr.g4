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
ID : [a-zA-Z][0-9a-zA-Z]* ;
WS : [ \t\r\n]+ -> skip;
END: ';' ;