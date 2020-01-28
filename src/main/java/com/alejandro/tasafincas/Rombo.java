package com.alejandro.tasafincas;

/**
 *
 * @author Alejandro Maestre Morueta
 */
public class Rombo {
    static double lado, diagonalMay, diagonalMen;
    
    Rombo(){}
    
    Rombo(double lado, double diagonalMay, double diagonalMen){
        this.lado = lado;
        this.diagonalMay = diagonalMay;
        this.diagonalMen = diagonalMen;        
    }
    
    static double calculaAreaRombo() {
        return(diagonalMay*diagonalMen)/2;
    }
    
    static double calculaPerimetroRombo(){
        return lado*4;
    }
    
    static String showDatosRombo(){
        return "La finca de forma romboidal tiene los siguientes datos:\n\t- Lado --> "
                + lado + " metros.\n\t- Diagonal Mayor --> " + diagonalMay + " metros.\n\t- Diagonal Menor --> " + diagonalMen + 
                "\n\t- Perimetro-->  " + calculaPerimetroRombo() +
                " metros.\n\t- Area--> " + calculaAreaRombo() + " metros cuadrados.\n"; 
    }
}//fin de la clase
