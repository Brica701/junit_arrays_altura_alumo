package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {
    @Test
    void verdadero() {
        assertTrue(1==1);
    }


    @Test
    void aniadeNombreTest1() {


        final String[] array = new String[2];

        array[0]="Jose";
        array[1]="Paco";

        String nombre = "María";
        String[] arrayActual = AlturaAlumno
                .añadeNombre(array, nombre);

        assertTrue(arrayActual[arrayActual.length-1]
                    .equals(nombre) );

        for (int i = 0; i< array.length;i++)
            assertEquals(array[i], arrayActual[i]);

//        String[] arrayExpected = Arrays.copyOf(array, array.length+1);
//        arrayExpected[arrayExpected.length-1]=nombre;
//
//        assertArrayEquals(arrayExpected, arrayActual);

    }

    @Test
    void aniadeNombreTest2() {


        final String[] array = new String[0];
        int longInicial = array.length;

        String nombre = "María";
        String[] arrayActual = AlturaAlumno
                .añadeNombre(array, nombre);

//        assertTrue(arrayActual[arrayActual.length-1]
//                .equals(nombre) );
        assertEquals(longInicial+1, arrayActual.length);
        assertEquals(nombre, arrayActual[longInicial+1]);

    }

    @Test
    void modificaAlturaPosicionEnElArray() {

        //When (Cuando)
        double[] array = {1.6, 1.8, 1.7};
        double[] array2 = Arrays.copyOf(array,array.length);
        int posicion = 1;
        double altura = 1.9;


        //Do (Hacer)
        AlturaAlumno.modificaAltura(array, posicion, altura);


        //Then (Entonces)

        //altura esta en la posicion
        assertTrue( altura == array[posicion]);

        //Todos los demas elementos del array no cambian
        for (int i = 0; i < array.length; i++) {
            if (i != posicion) {
                assertEquals(array[i], array2[i]);
            }
        }

    }

    @Test
    void modificaAlturaPosicionFueraDeRangoArray() {

        //When (Cuando)
        double[] array = {1.6, 1.8, 1.7};
        double[] array2 = Arrays.copyOf(array,array.length);
        int posicion = array.length+2;
        double altura = 1.9;


        //Do (Hacer)
        AlturaAlumno.modificaAltura(array, posicion, altura);


        //Then (Entonces)

        //altura esta en la posicion
        //assertTrue( altura == array[posicion]);

        //Todos los demas elementos del array no cambian
//        for (int i = 0; i < array.length; i++) {
//                assertEquals(array[i], array2[i]);
//        }
        assertArrayEquals(array2, array);

    }

    @Test
    public void testCalculaMaximo() {
        // Creamos un arreglo de números de ejemplo
        double[] array = {3.5, 1.2, 5.7, 2.8, 4.1};

        // Llamamos a la función calculaMaximo()
        double[] resultado = calcularMaximo(array);

        // Verificamos que el resultado sea correcto
        assertEquals(2.0, resultado[0]); // La posición del máximo debe ser 2
        assertEquals(5.7, resultado[1]); // El máximo debe ser 5.7
    }

    @Test
    public void testCalculaMaximoArrayVacio() {
        // Creamos un arreglo vacío
        double[] arrayVacio = {};

        // Llamamos a la función calculaMaximo() con el arreglo vacío
        double[] resultado = calcularMaximo(arrayVacio);

        // Verificamos que el resultado para un arreglo vacío sea un arreglo vacío
        assertArrayEquals(new double[]{0.0, 0.0}, resultado); // El resultado para un arreglo vacío debe ser {0.0, 0.0}
    }

    private double[] calcularMaximo(double[] arrayVacio) {
        return arrayVacio;
    }
}
class MediaAlturasTest {

    @Test
    public void testCalculaMedia() {
        // Creamos un arreglo de alturas de ejemplo
        double[] alturas = {1.75, 1.80, 1.65, 1.70, 1.72};

        // Calculamos la media esperada
        double mediaEsperada = (1.75 + 1.80 + 1.65 + 1.70 + 1.72) / 5.0;

        // Llamamos a la función calculaMedia()
        double mediaCalculada = calcularMedia(alturas);

        // Verificamos que la media calculada sea igual a la media esperada
        assertEquals(mediaEsperada, mediaCalculada, 0.01); // Usamos un delta pequeño para comparar valores de punto flotante
    }

    private double calcularMedia(double[] alturas) {
        return 0;
    }
}




