/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Quick.java
 * Ordenamiento de números que utiliza datos del archivo de texto generado
 */

//package sorting;


public class Quick {

    private Comparable array[];
    private int tamaño;
 
    public void quickSort(Comparable[] inputArr) {
         
        //si existe algun error en la lista a ordenar o no tiene datos
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        
        //instanciacion de atributos
        this.array = inputArr;
        tamaño = inputArr.length;
        
        //ordenamiento de lista
        quickSorting(0, tamaño - 1);
        
        
        System.out.println("El resultado ordenado (Quick) es");
                for (int x = 0; x < inputArr.length-1; x++){
                    System.out.println(inputArr[x]);
                }
        
    }
 
    private void quickSorting(int indicarodMenor, int indicarodMayor) {
         
        
        int i = indicarodMenor;
        int j = indicarodMayor;
        // se obtiene el numero central
        int central = (Integer)array[indicarodMenor+(indicarodMayor-indicarodMenor)/2];
        // Divicion en dos arrays
        while (i <= j) {

            //Si dato central es mayor al dato actual en i pasa al siguente
            while ((Integer)array[i] < central) {
                i++;
            }
            
            //Si dato central es menor al dato actual en j pasa al anterior
            while ((Integer)array[j] > central) {
                j--;
            }
            
            //Si el dato indicadorMenor es menor al indicadorMayor
            if (i <= j) {
                //intercambia los datos
                int temporal = (Integer)(array[i]);
                array[i] = array[j];
                array[j] = temporal;
                //los mueve a la siguiente posicion segun su extremo
                i++;
                j--;
            }
        }
        
        // llamado del quickSorting recurrentemente
        if (indicarodMenor < j)
            quickSorting(indicarodMenor, j);
        if (i < indicarodMayor)
            quickSorting(i, indicarodMayor);
    }
 
} 

//Bibliografia:
//Bailey, D. Java Structures, 2007. Septima Edicion. William College
//Java Sorting Algorithms. En: http://www.java2novice.com/java-sorting-algorithms/quick-sort/, [visitado el dia 31/07/2014]
