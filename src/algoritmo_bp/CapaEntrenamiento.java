/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_bp;

/**
 * @author alexander obispo buendía
 * @github: https://github.com/AlexanderHOB
 
 */
public class CapaEntrenamiento {
    double[][] capa_z;
    double[][] capa_a;
    
    public void setCapaZ(double[][] capa_z){
        this.capa_z = capa_z;
    }
    public double[][] getCapaZ(){
        return this.capa_z;
    }
    public void setCapaA(double[][] capa_a){
        this.capa_a = capa_a;
    }
    public double[][] getCapaA(){
        return this.capa_a;
    }
}
