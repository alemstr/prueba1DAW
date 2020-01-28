/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.tasafincas;

/**
 *
 * @author AlumnoTarde
 */
public final class Rectangulo {
    static double ladoMayor, ladoMenor;
    
    Rectangulo(){}
    
    Rectangulo(double ladoMayor, double ladoMenor){
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor; 
    }
    
    static double calculaAreaRect(){
       return ladoMayor*ladoMenor; 
    }
    
    static double calculaPerimetroRect (){
        return (ladoMayor*2)+(ladoMenor*2);
    }
    
    static String showDatosRectangulo(){//toString() //Metodo por defecto para mostrar información.
        return "La finca de forma rectangular tiene los siguientes datos:\n\t- Lado Mayor --> "
                + ladoMayor + " metros.\n\t- Lado Menor --> " + ladoMenor +  " metros.\n\t- Perimetro-->  " + calculaPerimetroRect() +
                " metros.\n\t- Area--> " + calculaAreaRect() + " metros cuadrados.\n"; 
    }
}//fin de la clase

