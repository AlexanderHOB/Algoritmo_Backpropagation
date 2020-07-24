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
public class Arreglo {
    
   //Imprimir los arreglos bidimensionales para testear
    public static void imprimir(double[][] x){
        for(int i = 0; i<x.length;i++){
            for(int j = 0;j<x[i].length;j++){
                System.out.print(x[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static String imprimirGUI(double[][] x){
        String rpt ="";
        for(int i = 0; i<x.length;i++){
            for(int j = 0;j<x[i].length;j++){
                rpt += " " + x[i][j]+ " ";
            }
            rpt+= "\n";
        }
        return rpt;
    }
    //Restar matrices
        static double[][] restar(double[][] a, double[][] b){
            double [][] tmp = new double[a.length][a[0].length];
            for(int i = 0; i<a.length;i++){
                for(int j = 0;j<a[i].length;j++){
                    tmp[i][j] = a[i][j] - b[i][j];
                }
            }
            return tmp;
        }
    //Copiar un arreglo en otro, sin referenciarlo
    static double[][] copiar(double[][] x){
        double [][] tmp = new double[x.length][x[0].length];
        for(int i = 0; i<x.length;i++){
            for(int j = 0;j<x[i].length;j++){
                tmp[i][j] = x[i][j];
            }
        }
        return tmp;
    }
    //transpuesta de una matriz
    public static double[][] transpuesta(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        double[][] b = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
    //Multiplicar arreglo por un escalar
    static double[][] multiEscalar(double[][] x, double y){
        double[][] c = new double[x.length][x[0].length];
        for(int i = 0; i < x.length ; i++){
                for(int j = 0; j< x[0].length;j++){
                    c[i][j] = x[i][j] * y;
                }
           }
        return c;
    }
    //Multiplicación punto a punto
     static double[][] multiPunto(double[][] x, double[][] y){
        double[][] c = new double[x.length][x[0].length];
        if(x.length == y.length){
            for(int i = 0; i < x.length ; i++){
                for(int j = 0; j< x[0].length;j++){
                    c[i][j] = x[i][j] * y[i][j];
                }
            }
            
        }
        return c;
    }
    // Multiplicación matricial
    static double[][] multiMatricial(double[][] x, double[][] y){
        double[][] c = new double[x.length][y[0].length];
        if(x[0].length == y.length){
            for(int i = 0; i < x.length ; i++){
                for(int j = 0; j< y[0].length;j++){
                    for(int k=0; k < x[0].length; k++){
                        c[i][j] += x[i][k] * y[k][j];
                    }
                }
            }
            
        }
        return c;
    }
    // Suma de matrices
    public static double[][] sumar(double[][] a, double[][] b) {
        int m = a.length;
        int n = a[0].length;
        double[] tmp = b[0];
        double[][] c = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] +tmp[j];
            }
        }
        return c;
    }
    // resta de vectores
    static double[] restarVectores(double[]x,double[]y){
        double[] tmp = new double[x.length];
        for (int i = 0 ; i < x.length; i++) {
            tmp[i] = x[i]- y[i];
        }
        return tmp;
    }
    //Funcion para calcular la media
    static double[][] media(double[][] x){

        double[][] media = new double[1][x[0].length];
        for(int i = 0; i < x[0].length;i++){
            for(int j = 0; j < x.length;j++){
                media[0][i] += x[j][i];
            }
            media[0][i] = media[0][i]/x.length;
        }
        return media;
    }
    
    
}
