package com.alejandro.tasafincas;

/**
 *
 * @author Alejandro Maestre Morueta
 */
public final class Cuadrado {
    static double lado;
    
    Cuadrado(){}
    
    Cuadrado(double lado){
        this.lado = lado;
        
    }
    
    static double calculaAreaCuadr (){
        return lado*lado;
    }
    
    static double calculaPerimetroCuadr(){
        return lado*4;        
    }
    
    static String showDatosCuadrado(){
        return "La finca de forma cuadrada tiene los siguientes datos:\n\t- Lado --> "
                + lado + " metros.\n\t- Perimetro-->  " + calculaPerimetroCuadr() +
                " metros.\n\t- Area--> " + calculaAreaCuadr() + " metros cuadrados.\n";
    }
}//fin de la clase
