/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica 
{
    /*Atributo de tipo double que contiene la base del triángulo*/
    private double base;
    /*Atributo de tipo double que contiene la altura del triángulo*/
    private double altura;
    /*Atributo de tipo double que contiene el área del triángulo*/
    private double areaTriangulo;
    
/**
 * 
 * @param base parámetro de tipo double para calcular el área
 * @param altura parámetro de tipo double para calcular el área
 */
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

/**
 * 
 * @return base devuelve el valor la base del triángulo
 */
    public double getBase() 
    {
        return base;
    }

/**
 * 
 * @param base parámetro de tipo double para calcular el área
 */    
    public void setBase(double base)
    {
        this.base = base;
    }

/**
 * 
 * @return altura devuelve el valor de la altura del triángulo
 */
    public double getAltura() 
    {
        return altura;
    }
    
/**
 * 
 * @param altura  parámetro de tipo double para calcular el área
 */
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

/**
 * 
 * @return devuelve el valor del área del triángulo
 */    
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}