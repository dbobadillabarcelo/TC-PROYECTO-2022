package com.primerproyecto.symbolsTable;

public class Variable extends Id {

    public Variable(){
        super();
    }

    public Variable(boolean inicializado, boolean utilizado, String tipoDato, String tokenNombre){
        super(inicializado, utilizado, tipoDato, tokenNombre);
    }

    @Override
    public boolean equals(Object objeto) {
        Variable var = (Variable) objeto;
        if( this.getTipoDato().equals(var.getTipoDato()) &&
            this.getTokenNombre().equals(var.getTokenNombre()))
            return true;
        else   
            return false;
    }

    @Override
    public String toString(){
        return this.getTipoDato() + " " + this.getTokenNombre() + " " + this.isInicializado() + " " + this.isUsado();
    } 
}