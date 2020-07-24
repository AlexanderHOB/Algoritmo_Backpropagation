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
public class CapaNeuronal {
    //creación de las matrices de pesos y las bias
    private double[][] pesos;
    private double[][] bias;
    CapaNeuronal(int n_conexiones, int n_neuronas){
        //genero los valores random de inicio de cada capa
        this.bias =  FormulasML.generarValoresRandom(1,n_neuronas);                
        this.pesos = FormulasML.generarValoresRandom(n_conexiones,n_neuronas);
    }
    // obtener los pesos
    public double[][] getPesos(){
        return pesos;
    }
    //set pesos
    public void setPesos(double[][] pesos){
        this.pesos = pesos;
    }
    // obtener bias
    public double [][] getBias(){
        return bias;
    }
    // set bias
    public void setBias(double[][] bias){
        this.bias = bias;
    }  
}
