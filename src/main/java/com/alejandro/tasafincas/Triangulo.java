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
public class Triangulo {
    static double base, lado1, lado2, altura;
    
    Triangulo(){}
    
    Triangulo(double base, double lado1, double lado2 , double altura){
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;        
    }
    
    static double calculaAreaTriang(){
        return (base*altura)/2;
    }
    
    static double calculaPerimetroTriang(){
        return base+lado1+lado2;
    }
    
    static String showDatosTriang(){
        return "La finca de forma triangular tiene los siguientes datos:\n\t- Base --> "
                + base + " metros.\n\t- Lado 1 --> " + lado1 + " metros.\n\t- Lado 2 --> " + lado2 + " metros."
                + "\n\t- Altura --> " + altura + " metros.\n\t- Perimetro-->  " + calculaPerimetroTriang() +
                " metros.\n\t- Area--> " + calculaAreaTriang() + " metros cuadrados.\n"; 
    }
}//fin de la clase
