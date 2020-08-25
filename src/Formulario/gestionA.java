package Formulario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class gestionA {
    File archivo;
    
    public gestionA(){
        
    }
    /*public ArrayList<Integer> AbrirTextoEspacio(File archivo){
        Scanner contenido = null;
        try{
        contenido = new Scanner(archivo);
        contenido.useDelimiter(" |\n|");
        ArrayList<Integer> datos = new ArrayList<>();
        while(contenido.hasNext()){
            if(contenido.hasNextInt()){
                datos.add(contenido.nextInt());
            }else{
                contenido.next();
            }
        }
        return datos;
        }catch(Exception e){
            return null;
        }
        
    }
    public ArrayList<Integer> AbrirTextoTab(File archivo){
        Scanner contenido = null;
        try{
        contenido = new Scanner(archivo);
        contenido.useDelimiter("\t|\n|");
        ArrayList<Integer> datos = new ArrayList<>();
        while(contenido.hasNext()){
            if(contenido.hasNextInt()){
                datos.add(contenido.nextInt());
            }else{
                contenido.next();
            }
        }
        return datos;
        }catch(Exception e){
            return null;
        }
        
    }*/
    public ArrayList<String> AbrirTexto(File archivo){
        Scanner contenido = null;
        try{
        contenido = new Scanner(archivo);       
  
        ArrayList<String> datos = new ArrayList<>();
        while(contenido.hasNext()){
            if(contenido.hasNextLine()){
                datos.add(contenido.nextLine());
            }else{
                contenido.next();
            }
        }
        return datos;
        }catch(Exception e){
            return null;
        }
        
    }
   
    /*public ArrayList<Integer> AbrirTextoPunto(File archivo){
        Scanner contenido = null;
        try{
        contenido = new Scanner(archivo);
        contenido.useDelimiter(";|\n|");
        ArrayList<Integer> datos = new ArrayList<>();
        while(contenido.hasNext()){
            if(contenido.hasNextInt()){
                datos.add(contenido.nextInt());
            }else{
                contenido.next();
            }
        }
        return datos;
        }catch(Exception e){
            return null;
        }
        
    }*/
    
}
