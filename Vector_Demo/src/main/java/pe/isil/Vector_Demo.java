package pe.isil;

import java.util.Arrays;

public class Vector_Demo {
    public static void main(String[] args){

        System.out.println("===== ARREGLOS UNIDIMENSIONALES CON MI PROFESOR ======");

        EjemploCrearRepresentar();
        EjemploAccederYmodificar();
        EjemploRecorrecYllenar();
        EjemploBuscar();
        EjemlploAgregarYEliminar();
    }


    public static void EjemploCrearRepresentar() {

        System.out.println("----------Ejemplo 1 : Crear Y Representar------------ ");

        int[] notas = {15, 18, 12, 11};

        System.out.println("vector: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("indice: " + i + " -> " + notas[i]);
        }

        System.out.println("Ultimo indice valido: " + (notas.length - 1));
    }
    public static void EjemploAccederYmodificar(){
        System.out.println("--------------Ejemplo 2: ACCER Y MODIFICAR---------");

        int[] notas = {15, 18, 12, 11};

        System.out.println("Valor en la nota 1: " + notas[1]);

        notas[1] = 19;
        System.out.println("vector: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);

    }

    public static void EjemploRecorrecYllenar(){
        System.out.println("--------- ELEMPLO 3: RECORRER Y LLENAR---------");

        int[] notas = {15, 18, 12, 11};

        for(int i = 0; i < notas.length; i++) {
            System.out.println("indice: " + i + " -> " + notas[i]);
        }

        int[] edades = new int[5];

        for (int i = 0; i < edades.length; i++){
            edades[i] = 18 + i ;
        }

        System.out.println("Edades :" + Arrays.toString(edades));

    }

    public static void EjemploBuscar (){
        System.out.println("-----------EJEMPLO: 4 BUSCAR----------");
        int[] notas = {15, 18, 12, 11};
        int buscado = 12;
        int posicion = -1;

        for (int i = 0; i < notas.length; i++){
            if (notas[i] == buscado){
                posicion = i;
                break;
            }
        }

        if (posicion != -1){
            System.out.println("Encontrado indice:" + posicion);
        }else{
            System.out.println("No encontrado");
        }
    }

    public static void EjemlploAgregarYEliminar (){
        System.out.println("--------EJEMPLO 5: AGREGAR Y ELIMINAR---------");

        int[] datos = new int[5];
        datos[0] = 10;
        datos[1] = 20;
        datos[2] = 30;

        int usados = 3;

        System.out.println("inicial: ");
        mostrarSoloUsados(datos, usados);

        if (usados < datos.length){
            datos[usados] = 40;
            usados++;

        }

        System.out.println("Despues de agregar 40: ");
        mostrarSoloUsados(datos, usados);

        // Eliminar el elemento del indice 1

        int indiceEliminar = 1;
        if(indiceEliminar >= 0 && indiceEliminar < usados){
            for (int i = indiceEliminar; i < usados -1; i++){
                datos[i] = datos[i + 1];
            }

            datos[usados-1] = 0;
            usados --;

        }
        System.out.println("Despues de eliminar el indice 1: ");


        mostrarSoloUsados(datos, usados);

    }

    public static void mostrarSoloUsados (int[] dato, int usados){
        for (int i = 0; i < usados; i++){
            System.out.println(dato[i]);
            System.out.println(", ");
        }
    }

}
