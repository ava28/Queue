/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import QueueSimpleList.QueueSimpleLinkedList;
import excepciones.IsEmptyException;
import excepciones.IsFullException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QueueSimpleLinkedList<Double> cola = new QueueSimpleLinkedList<>(5);
        Scanner sc = new Scanner(System.in); 
        String respuesta = null;
        try {
            cola.EnQueue(11d);
            cola.EnQueue(23d);
            cola.EnQueue(32d);
            cola.EnQueue(100d);
            cola.EnQueue(34d);
            
           
            for (Double double1 : cola) {
                System.out.println(double1);
            }
            
            System.out.println("El proximo Valor a salir es: " + cola.Front());
            System.out.println("Se elimino el valor: " + cola.DeQueue());
            System.out.println("El de la cola es: "+cola.Last());
            cola.EnQueue(66d);
            
            for (Double double1 : cola) {
                System.out.println(double1);
            }
            
            System.out.println("El proximo Valor a salir es: " + cola.Front());
            System.out.println("Se elimino el valor: " + cola.DeQueue());
            System.out.println("El de la cola es: "+cola.Last());
            for (Double double1 : cola) {
                System.out.println(double1);
            }
               
                
            
        } catch (IsFullException | IsEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}

