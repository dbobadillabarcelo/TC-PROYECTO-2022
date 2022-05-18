grammar tp1;

@header {
package com.primerproyecto;
}

// DIGITO : '0' | '1' | '2' | ... | '9'
fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

//Operadores aritmeticos 
SUMA : '+';
RESTA : '-';
MULT : '*';
DIV : '/';
MOD : '%';
//asignacion
ASIGN : '=';
//Operadores logicos
AND : '&&';
OR : '||';
NOT: '!';
//Llaves corchetes y parentesis
PA: '(';
PC: ')';
CA: '[';
CC: ']';
LA: '{';
LC: '}';
//Estructuras de control
WHILE : 'while';
FOR : 'for';
IF: 'if';
//Comparadores
IGUAL : '==';
DISTINTO : '!=';
MENOR : '<';
MAYOR : '>';
MENOR_IGUAL : '<=';
MAYOR_IGUAL : '>=';
//Punto y coma, y coma
PUNTOYCOMA : ';';
COMA : ',';
//Tipos de dato
INT : 'int';
DOUBLE : 'double';
VOID : 'void';

NUMERO : DIGITO+;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS : [ \t\n\r] -> skip;

//Reglas sintácticas

prog: instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion PUNTOYCOMA
            | declaraciones
            | bloque
            | iwhile
            | iif
            | ifor
            | definicion_funcion
            | declaracion_funcion 
            | llamada_funcion PUNTOYCOMA
            ;

asignacion: ID ASIGN (opal | llamada_funcion);  

definicion: tipo asignacion; 

declaraciones: tipo secuencia;

tipo: INT | DOUBLE | VOID;

secuencia: ID (COMA secuencia | PUNTOYCOMA) 
    | asignacion (COMA secuencia | PUNTOYCOMA)
    | PUNTOYCOMA
    ;    

bloque : LA instrucciones LC;

iwhile: WHILE PA opal PC instruccion;

iif: IF PA opal PC instruccion;

ifor : FOR PA (ID | asignacion | definicion) PUNTOYCOMA opal PUNTOYCOMA (asignacion | operIncremento | operDecremento) PC instruccion ;

operIncremento : ID SUMA SUMA | SUMA SUMA ID;
operDecremento : ID RESTA RESTA | RESTA RESTA ID;
/////////////////Funciones/////////////////
declaracion_funcion : tipo ID PA parametros PC PUNTOYCOMA;

definicion_funcion : tipo ID PA parametros PC bloque
                   ;

parametros : param parametros
           | COMA parametros
           |
           ;

param: tipo ID? ; 

llamada_funcion : ID PA argumentos PC 
                ;

argumentos: (ID | NUMERO) argumentos
          | COMA argumentos
          |
          ;

// operaciones aritmeticologicas

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

comp : comparadores expresion comp
     |
     ;

comparadores : IGUAL | DISTINTO | MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL;

expresion : term exp;
//suma o resta
exp : SUMA term exp
    | RESTA term exp
    |
    ;   
term : factor t;

//multiplicacion, division o modulo
t : MULT factor t
  | DIV  factor t
  | MOD  factor t
  |
  ;   

factor :f NUMERO
       |f ID
       |f PA opal PC
       |
       ;

f : SUMA
  | RESTA
  | NOT
  |
  ;

