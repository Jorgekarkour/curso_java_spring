package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin - Jorge
 */
public class ProbandoGenericos {
    
    public static void probarMetodo() {
        int num = 10;
        Integer objNum = new Integer(10);
        String texto = "" + String.valueOf(num);
        String texto2 = "" + objNum.toString();
        
        ArrayList<Integer> listaInt = new ArrayList<>();
        insertarDobleGenerico(listaInt, 10);
        insertarDobleGenerico(listaInt, 15);
        insertarDobleGenerico(listaInt, 20);
        
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList<String> listaStr = new ArrayList<>();
        insertarDobleGenerico(listaStr, "texto 1");
        insertarDobleGenerico(listaStr, "texto 2");
        insertarDobleGenerico(listaStr, "texto 3");
        
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList<Date> listaDate = new ArrayList<>();
        insertarDobleGenerico(listaDate, new Date(82, 4, 10));
        insertarDobleGenerico(listaDate, new Date(90, 5, 28));
        insertarDobleGenerico(listaDate, new Date(97, 9, 15));
        
        System.out.println("Enteros: " + listaDate.toString());
    }
    
        public static <Clase> void insertarDobleGenerico(ArrayList<Clase> lista, Clase valor) {
        lista.add(valor);
        lista.add(valor);
    }
    
    /*public static void insertarDoble(ArrayList<String> lista, String valor) {
        lista.add(valor);
        lista.add(valor);
    }*/
    
    /*public static void insertarDoble(ArrayList<Integer> lista, int valor) {
        lista.add(valor);
        lista.add(valor);
    }*/
    
}
