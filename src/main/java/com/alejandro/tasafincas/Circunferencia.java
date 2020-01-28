package com.alejandro.tasafincas;

/**
 *
 * @author Alejandro Maestre Morueta
 */
public class Circunferencia {
    static double radio;    
    static final double PI = 3.141592;
    
    Circunferencia(){}
    
    Circunferencia(double radio){
        this.radio = radio;                       
    }
    
    static double calculaAreaCirc(){
        return PI*radio*radio;
    }
    
    static double calculaPerimetroCirc(){
        return 2*PI*radio;
    }
    
    static String showDatosCirculo(){
        return "La finca de forma circular tiene los siguientes datos:\n\t- Radio --> "
                + radio + " metros.\n\t- Perimetro-->  " + calculaPerimetroCirc() +
                " metros.\n\t- Area--> " + calculaAreaCirc() + " metros cuadrados.\n"; 
    }
    
    
}
