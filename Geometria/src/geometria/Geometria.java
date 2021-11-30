/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se consigue el área de diversas figuras geométricas
 * 
 * @author javier
 * @version 1.0
 * @since 30-11-2021
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas

        /*Otorga al cuadrado un lado de 10*/
        Cuadrado cuadrado = new Cuadrado(10);
        /*Calcula el área del cuadrado*/
        cuadrado.area();
        /*Muestra en pantalla el resultado*/
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        
        /*Otorga al círculo un radio de 200*/
        Circulo circulo = new Circulo(200);
        /*Calcula el área del círculo*/
        circulo.area();
        /*Muestra en pantalla el resultado*/
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        
        /*Otorga al rectángulo una base de 100 y una altura de 20*/
        Rectangulo rectangulo = new Rectangulo(100, 20);
       /*Calcula el área del rectángulo*/
        rectangulo.area();
        /*Muestra en pantalla el resultado*/
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

        
        /*Otorga ak triángulo una base de 5 y una altura de 10*/
        Triangulo triangulo = new Triangulo(5, 10);
        /*Calcula el área de un triángulo de base 5 y altura 10*/
        triangulo.area();
        /*Muestra en pantalla el resultado*/
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
