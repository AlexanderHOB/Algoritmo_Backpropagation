/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_bp;

/**
 *
 * @author alexander obispo buendía
 * @github: https://github.com/AlexanderHOB
 */
public class FormulasML {
    // Función de activacion sigmoide
        static double  sigmoide(double x){
            return 1/(1 + Math.pow(Math.E,(-x)));
        }
    // Función de activación sigmoide matricial
        static double[][] sigmoideM(double[][] z){
            double[][] a = new double[z.length][z[0].length];
            for(int i = 0; i < z.length;i++){
                for(int j=0; j<z[0].length;j++){
                    a[i][j] = sigmoide(z[i][j]);
                }
            }
            return a;
        }
    //Función derivada de la funcion sigmoidal
        static double sigmoide_dx(double x){
            return x*(1-x);
        }
    // Función  sigmoide dx  matricial
    static double[][] sigmoide_dxM(double[][] z){
        double[][] a = new double[z.length][z[0].length];
        for(int i = 0; i < z.length;i++){
            for(int j=0; j<z[0].length;j++){
                a[i][j] = sigmoide_dx(z[i][j]);
            }
        }
        return a;
    }
    //Funcion de coste (Error cuadrático medio)
        static double MSE(double Yp, double Yr ){
            return Math.pow((Yp-Yr),2);
        }
    // Funcion derivada de coste (MSE) matricial
    static double[][] MSEM(double[][] Yp, double[][]Yr ){
        double[][] tmp = new double[Yp.length][Yp[0].length];
        for(int i=0;i<Yp.length;i++){
            for(int j=0;j<Yp[0].length;j++){
                tmp[i][j] = MSE(Yp[i][j], Yr[i][j]);
            }
        }
        return tmp;
    }    
    // Funcion derivada de coste (MSE)
    static double  MSE_dx(double Yp, double Yr ){
        return (Yp - Yr);
    }
    // Funcion derivada de coste (MSE) matricial
    static double[][] MSE_dxM(double[][] Yp, double[][]Yr ){
        double[][] tmp = new double[Yp.length][Yp[0].length];
        for(int i=0;i<Yp.length;i++){
            for(int j=0;j<Yp[0].length;j++){
                tmp[i][j] = MSE_dx(Yp[i][j], Yr[i][j]);
            }
        }
        return tmp;
    }
    //Función para generar los pesos iniciales aleatorios
    static double[][] generarValoresRandom(int conexiones, int cantidad){
        double[][] tmp = new double[conexiones][cantidad];       
        for(int i = 0; i<conexiones;i++){
            for(int j = 0; j<cantidad;j++){
                tmp[i][j]= Math.random()*2-1;
            }
        }
        return tmp;
    }
    // funcion para crear la red neuronal   
    public static CapaNeuronal[] crearRed(int[] arquitectura){
        CapaNeuronal[] nn = new CapaNeuronal[arquitectura.length];
        //cada bucle inserta una capa neuronal a la red
        for(int i = 0; i<arquitectura.length-1; i++){
            //System.out.println(arquitectura[i]); // imprimir arquitectura
            CapaNeuronal tmp = new CapaNeuronal(arquitectura[i],arquitectura[i+1]);
            nn[i]=tmp;
        }
        return nn;
    }
}
