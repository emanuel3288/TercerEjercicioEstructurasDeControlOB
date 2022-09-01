package com.openBootCamp.EstructurasDeControl;

public class ShowNames {
    public static void main(String[] args) {

        nombresConcatenados();

    }


    //Obtiene los nombres concatenados en una linea de texto
    static void nombresConcatenados() {

        String[] nombres = new String[]{"Jose", "Daniel", "Ramiro", "Natalia", "Maria", "Mariano"};

        for (String nombre : nombres) {// recorro el array de nombres.

            System.out.println("Hola soy " + nombre + " mucho gusto.");

        }
    }
}
