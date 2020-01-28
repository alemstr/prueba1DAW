/** Nos piden crear una aplicación para una empresa de tasadores de fincas rústicas en la que normalmente trabajan con el área
 * y el perímetro de la parcela. Desean una aplicación que sea capaz de realizar dichos cálculos después de que se le indique la forma
 * geométrica de la parcela a través de un menú, tras lo cuál pedirá los lados, el radio, etc. Realiza esta aplicación que será capaz de resolver
 * el problema para cualquier figura geométrica regular (cuadrado, rectangulo, triangulo, circunferencia, rombo). Crea una clase para cada tipo, 
 * con su constructor al que se le deben de pasar todos los parámetros necesarios. Además la clase debe de tener un método que devuelva un string con toda
 * la información de los atributos, así como el área y el perímetro.
 * 
 * Crea una clase principal que gestione todas estas clases a través de un menú en la que se solicite el tipo de figura y que después de tomar los
 * datos muestre el resultado de los cálculos realizados. También deberá tener una opción para salir del programa.
 * 
 
 */
package com.alejandro.tasafincas;

/**
 *
 * @author Alejandro Maestre Morueta
 */

import java.util.*;
public class TasaFincas {
    
    static Scanner teclado = new Scanner (System.in);
            
    public static void main(String[] args) {
        
        byte opcion=6;
        String pulsaTecla;
        boolean correctoMenu;
        
        do{
            cleanScreen();
            do{
                try
                {   
                    correctoMenu=true;
                    showMenu();
                    opcion = teclado.nextByte();
                }catch (InputMismatchException a){
                    System.err.print("\nLa opción seleccionada no es válida.\n");
                    correctoMenu=false;
                    System.err.print("Pulse una tecla para continuar: ");
                    pulsaTecla=teclado.next();
                    teclado.next();
                    cleanScreen();                    
                }
            }while(!correctoMenu);
                    switch (opcion){
                        case 1:
                            try
                            {
                                getDatosCuadrado();
                                System.out.println(Cuadrado.showDatosCuadrado());
                            }catch (Exception a){
                                System.err.println("Se ha producido un error.\n");
                                teclado.nextLine();
                            }
                            System.out.print("Pulse una tecla para continuar: ");
                            pulsaTecla = teclado.next();
                            break;

                        case 2:
                            try
                            {
                                getDatosRectangulo();
                                System.out.println(Rectangulo.showDatosRectangulo());
                            }catch (Exception b){
                                System.err.println("Se ha producido un error.");
                                teclado.nextLine();
                            }
                            System.out.print("Pulse una tecla para continuar: ");
                            pulsaTecla = teclado.next();
                            break;

                        case 3:
                            try
                            {
                                getDatosTriangulo();
                                System.out.println(Triangulo.showDatosTriang());
                            }catch (Exception c){
                                System.err.println("Se ha producido un error.");
                                teclado.nextLine();
                            }
                            System.out.print("Pulse una tecla para continuar: ");
                            pulsaTecla = teclado.next();
                            break;

                        case 4:
                            try
                            {
                                getDatosRombo();
                                System.out.println(Rombo.showDatosRombo());
                            }catch (Exception d){
                                System.err.println("Se ha producido un error.");
                                teclado.nextLine();
                            }
                            System.out.print("Pulse una tecla para continuar: ");
                            pulsaTecla = teclado.next();
                            break;

                        case 5:
                            try
                            {
                                getDatosCircunferencia();
                                System.out.println(Circunferencia.showDatosCirculo());
                            }catch (Exception e){
                                System.err.println("Se ha producido un error.");
                                teclado.nextLine();
                            }
                            System.out.print("Pulse una tecla para continuar: ");
                            pulsaTecla = teclado.next();
                            break;

                        default:
                            break;
                    }
                    cleanScreen();

            }while (opcion!=6);
        
        
    }//fin del main
    
    static void showMenu(){
        System.out.println("\n-------TASADOR DE FINCAS--------");
        System.out.println("| * 1 ------- Cuadrangular-----|");
        System.out.println("| * 2 ------- Rectangular------|");
        System.out.println("| * 3 ------- Triangular-------|");
        System.out.println("| * 4 ------- Romboidal--------|");
        System.out.println("| * 5 ------- Circular---------|");
        System.out.println("| * 6 ------- Cerrar-----------|");
        System.out.println("--------------------------------");
        System.out.print("\nIntroduzca el numero de la opción deseada: ");
    }//fin menu
    
    static void cleanScreen(){
        for(byte i=1;i<80;i++){
            System.out.println(" ");
        
        }
    }//fin clase "cleanScreen"
    
    static Cuadrado getDatosCuadrado() throws Exception{
        double lado;               
        
        System.out.print("\nIntroduzca el lado: ");
        lado = teclado.nextDouble();
                
        if (lado<=0)
            throw new Exception();
  
        return new Cuadrado (lado);
    }//fin clase "getDatosCuadrado"
    
    static Rectangulo getDatosRectangulo()throws Exception{
        double ladoMayor, ladoMenor;
        
        System.out.print("\nIntroduzca la longitud del lado mayor: ");
        ladoMayor = teclado.nextDouble();
        System.out.print("\nIntroduzca la longitud del lado menor: ");
        ladoMenor = teclado.nextDouble();
        
        if (ladoMayor<=0 || ladoMenor<=0)
            throw new Exception();
        
        return new Rectangulo (ladoMayor, ladoMenor);        
    }//fin clase "getDatosRectangulo"
    
    static Triangulo getDatosTriangulo() throws Exception{
        double base, lado1, lado2, altura;
        
        System.out.print("\nIntroduzca la longitud de la base: ");
        base = teclado.nextDouble();
        System.out.print("\nIntroduzca la longitud de uno de los otros dos lados: ");
        lado1 = teclado.nextDouble();
        System.out.print("\nIntroduzca la longitud del otro lado: ");
        lado2 = teclado.nextDouble();
        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();
        
        if (base<=0 || lado1<=0 || lado2<=0 || altura<=0)
            throw new Exception();
        
        return new Triangulo (base, lado1, lado2, altura);
    }//fin clase "getDatosTriangulo"
    
    static Rombo getDatosRombo() throws Exception{
        double lado, diagonalMay, diagonalMen;
        
        System.out.print("\nIntroduzca la longitud del lado: ");
        lado = teclado.nextDouble();
        System.out.print("\nIntroduzca la longitud de la diagonal mayor: ");
        diagonalMay = teclado.nextDouble();
        System.out.print("\nIntroduzca la longitud de la diagonal menor: ");
        diagonalMen = teclado.nextDouble();
        
        if (lado<=0 || diagonalMay<=0 || diagonalMen<=0)
            throw new Exception();
        
        return new Rombo (lado, diagonalMay, diagonalMen);
    }//fin clase "getDatosRombo"
    
    static Circunferencia getDatosCircunferencia() throws Exception{
        double radio;
        
        System.out.print("\nIntroduzca la longitud del radio: ");
        radio = teclado.nextDouble();
        
        if (radio<=0)
            throw new Exception();
                
        return new Circunferencia(radio);
    }//fin clase "getDatosCircunferencia"  
        
    
}//fin de la clase
