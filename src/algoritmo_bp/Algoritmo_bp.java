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
public class Algoritmo_bp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arquitectura = {7,12,6};
       CapaNeuronal[] red_neuronal = crearRed(arquitectura);
       double[][] X = {{1, 0, 0, 0, 0, 0 ,0},{0, 1, 0 ,0 ,0 ,0 ,0},{0, 0, 1 ,0, 0 ,0, 0},{0, 0 ,0 ,1, 0, 0, 0 },{0, 0 ,0 ,0 ,1, 0, 0},
            {0, 0, 0 ,0 ,0, 1, 0},{0, 0, 0, 0, 0, 0 ,1}};
        double[][] Y={{1,0,0,0,0,0},{1,1,1,0,0,0},{0,0,1,1,1,1},{0,0,0,1,1,1},{0,0,0,1,1,0},{0,1,1,0,0,0},{0,0,0,0,0,1}};
        double[][] t= {{1, 0, 0, 0, 0, 0 ,0},{0, 1, 0 ,0 ,0 ,0 ,0},{0, 0, 1 ,0, 0 ,0, 0},{0, 0 ,0 ,1, 0, 0, 0 },{0, 0 ,0 ,0 ,1, 0, 0},
            {0, 0, 0 ,0 ,0, 1, 0},{0, 0, 0, 0, 0, 0 ,1}};
        // Entrenar red
       for(int i= 0; i < 2500; i++){
           double[][]pY = entrenamiento(red_neuronal,X,Y, (float) 1.5,true);
       }
       
       
        double[][]r = entrenamiento(red_neuronal,t,Y, (float) 1.5,false);
        
        Arreglo.imprimir(r);
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
    //funcion de entrenamiento
    public static double[][] entrenamiento(CapaNeuronal[] red_neuronal,double[][] X, double[][] Y,float lr,boolean train){
    // Capa de entrada
    CapaEntrenamiento[] capas = new CapaEntrenamiento[red_neuronal.length];
    capas[0] = new CapaEntrenamiento();
    capas[0].setCapaA(X);
    
    // inicio fordward pass
    for(int i =0; i<red_neuronal.length-1; i++){
        double[][] z = Arreglo.sumar(Arreglo.multiMatricial(capas[i].getCapaA(), red_neuronal[i].getPesos()),red_neuronal[i].getBias());
        double[][] a = FormulasML.sigmoideM(z);
        capas[i+1] = new CapaEntrenamiento();
        capas[i+1].setCapaZ(z);
        capas[i+1].setCapaA(a);
        }
    // fin fordward pass
        System.out.print("COSTO");
        Arreglo.imprimir(Arreglo.media(FormulasML.MSEM( capas[red_neuronal.length-1].getCapaA(), Y)));
       if(train){
           // backpropagation
           Delta [] deltas = new Delta[red_neuronal.length-1];
           double[][] _W = red_neuronal[red_neuronal.length-2].getPesos();
           for(int i = red_neuronal.length-1; i > 0; i--){
                double[][] z =capas[i].getCapaZ();
                double[][] a =capas[i].getCapaA();                               
                if (i == red_neuronal.length-1){
                 
                    deltas[i-1] = new Delta();
                    deltas[i-1].setD(Arreglo.multiPunto(FormulasML.MSE_dxM(a,Y), FormulasML.sigmoide_dxM(a)));                  
                   
                }else{
                    //calculo de deltas respecto a la capa previa
                    deltas[i-1] = new Delta();
                    
                    deltas[i-1].setD(Arreglo.multiPunto(Arreglo.multiMatricial(deltas[i].getD(), Arreglo.transpuesta(_W)),  FormulasML.sigmoide_dxM(a)));
                    
                }
            _W = red_neuronal[i-1].getPesos();
            
            red_neuronal[i-1].setBias(Arreglo.restar(red_neuronal[i-1].getBias(), Arreglo.multiEscalar(Arreglo.media(deltas[i-1].getD()),lr)) );
           
            red_neuronal[i-1].setPesos(Arreglo.restar(red_neuronal[i-1].getPesos(),Arreglo.multiEscalar(Arreglo.multiMatricial(Arreglo.transpuesta(capas[i-1].getCapaA()), deltas[i-1].getD()), lr)));
/*
          
*/
           }
       }
        return capas[red_neuronal.length-1].getCapaA();
    }
}

