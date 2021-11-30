/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se consigue el área de un cuadrado
 * 
 * @author javier
 * @version 1.0
 * @since 30-11-2021
 */
public class Cuadrado implements FiguraGeometrica
{
    /*Atributo de tipo double que contiene el lado del cuadrado*/
    private double lado;
    /*Atributo de tipo double que contiene el area del cuadrado*/
    private double areaCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Método consultor del lado del cuadrado
     * @return lado del cuadrado
     */
    public double getLado() 
    {
        return lado;
    }

    /**
     * Método modificador del lado del cuadrado
     * @param lado 
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    /**
     * Método consultor del area del cuadrado
     * @return area del cuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}