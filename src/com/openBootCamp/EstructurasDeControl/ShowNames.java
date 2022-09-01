package com.openBootCamp.EstructurasDeControl;

public class ShowNames {
    public static void main(String[] args) {

        nombresConcatenados();
        nombresConcatenados2();
        nombresConcatenados3();
    }


    //Obtiene los nombres concatenados en una linea de texto
    //forma 1
    static void nombresConcatenados() {

        String[] nombres = new String[]{"Jose", "Daniel", "Ramiro", "Natalia", "Maria", "Mariano"};



        StringBuilder nombresJuntos= new StringBuilder();

        for (String nombre : nombres) {// recorro el array de nombres.

            nombresJuntos.append(nombre).append(" ");

        }
        System.out.println(nombresJuntos);
    }

    //forma2
    static void nombresConcatenados2() {

        String[] nombres2 = new String[]{"Natalia", "Mariano"};


        String nombresJuntos2="";

        for (String nombre2 : nombres2) {// recorro el array de nombres.

            nombresJuntos2=nombresJuntos2.concat(nombre2+ " ");


        }
        System.out.println(nombresJuntos2);
    }

    //forma 3 para concatenar
    static void nombresConcatenados3() {

        String[] nombres2 ={"Natalia", "Maria", "Mariano"};


        String nombresJuntos2="";

        for (String nombre2 : nombres2) {// recorro el array de nombres.

            nombresJuntos2=nombresJuntos2+ " " +nombre2;


        }
        System.out.println(nombresJuntos2);
    }
}
