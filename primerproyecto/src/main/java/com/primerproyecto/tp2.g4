grammar tp2;

@header {
package com.primerproyecto;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

// TOKENS 

PA   : '(' ;
PC   : ')' ;
CA   : '[' ;
CC   : ']' ;
LA   : '{' ;
LC   : '}' ;

PYC  : ';' ;
COMA : ',' ;

IGUAL : '=' ;

MAYOR  : '>' ;
MAYOR_IGUAL: '>=';
MENOR  : '<' ;
MENOR_IGUAL: '<=';
EQL  : '==';
DISTINTO  : '!=';

SUM  : '+' ;
RES  : '-' ;
MUL  : '*' ;
DIV  : '/' ;
MOD  : '%' ;

OR   : '||' ;
AND  : '&&' ;
NOT  : '!'  ;

FOR  : 'for';
WHILE: 'while';

IF   : 'if' ;
ELSE : 'else' ;

INT     : 'int' ;
CHAR    : 'char' ;
DOUBLE  : 'double' ;
VOID    : 'void' ;

RETURN : 'return';

ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

INTEGER : DIGITO+;
DECIMAL : INTEGER'.'INTEGER;
CHARACTER: '\''(LETRA|OTRO|DIGITO)'\'';

WS : [ \r\n\t] -> skip ;
OTRO : . ;

//Reglas gramaticales

prog: instrucciones EOF; 

instrucciones : instruccion instrucciones 
              |
              ;

bloque : LA instrucciones LC 
       ;

instruccion : declaracion PYC
            | asignacion PYC
            | bucleFor
            | bucleWhile
            | condif
            | declaracionFuncion PYC
            | definicionFuncion
            | llamadaFuncion PYC
            | retorno PYC
            | bloque
            ;

retorno : RETURN opal;

declaracion : tipoDato ID
            | tipoDato ID asign
            ;

asign : IGUAL operacion
      ;

tipoDato : INT
         | CHAR
         | DOUBLE
         | VOID
         ;

asignacion  : ID asign
            ;

bucleFor : FOR PA asignacion PYC operacion PYC ID asign PC instruccion
         ;

bucleWhile : WHILE PA operacion PC instruccion
           ;

condif : IF PA operacion PC instruccion
       | IF PA operacion PC bloque ELSE bloque
       ;

declaracionFuncion : tipoDato ID PA parametros PC
          ;

definicionFuncion : tipoDato ID PA parametros PC bloque
        ;

parametros : param
           ;

param : declaracion param
      | COMA declaracion param
      |
      ;

llamadaFuncion : ID PA argumentos PC
               ;

argumentos : operacion args
          ;

args  : COMA operacion args
     |
     ;

operacion : opal ;

opal : disyuncion 
     |
     ;

disyuncion : conjuncion disy
           ;

disy : OR conjuncion disy
     |
     ;

conjuncion : comparaciones conj
           ;

conj : AND comparaciones conj
     |
     ;

comparaciones : expresion comp
              ;

comp : opcomp expresion comp
     |
     ;

opcomp : EQL
       | DISTINTO
       | MAYOR
       | MAYOR_IGUAL
       | MENOR
       | MENOR_IGUAL
       ;

expresion : term exp;

exp : SUM term exp
    | RES term exp
    |
    ;

term : factor t ;

t : MUL factor t
    | DIV factor t
    | MOD factor t
    |
    ;

factor : f PA opal PC
       | f llamadaFuncion
       | f INTEGER
       | f DECIMAL
       | f CHARACTER
       | f ID
       ;

f : SUM
  | RES
  | NOT
  |
  ;