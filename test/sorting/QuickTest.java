/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 *QuickTest.java
* Prueba unitaria del tipo de ordenamiento Quick*/

//package sorting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isa
 */
public class QuickTest {
    
    public QuickTest() {
    }
    //Prueba Unitaria del método QuickSort 
    //Se crea una cadena de número desordenados y se indica como se espera que sean ordenados
    @Test
    public void testQuickSort() {
        System.out.println("QUICK SORT");
        Merge instance = new Merge();
        Integer [] ingresado = {4500,2000,3400,9000};
        Comparable[] inputArr = ingresado;
        instance.mergeSort(inputArr);
        Integer [] esperado = {2000,3400,4500,9000};  
        //Si ambas cadenas son iguales, la prueba será exitosa
        assertArrayEquals(ingresado,esperado);
    }
    
}
