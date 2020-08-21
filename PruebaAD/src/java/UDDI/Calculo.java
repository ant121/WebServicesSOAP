/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

/**
 *
 * @author Elvis
 */
public class Calculo {
    public static int horasTrabajadas(int h1,int h2, int h3, int h4,int h5,int h6){
        int suma= h1+h2+h3+h4+h5+h6;
       return suma;
}
    public static double sueldoSemanal(int horas, double pxh){
        double sueldo=pxh*horas;
       return sueldo;
}
}
