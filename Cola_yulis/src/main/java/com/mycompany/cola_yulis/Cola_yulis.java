/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cola_yulis;

/**
 *
 * @author Lenovo V15
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;

public class Cola_yulis {

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("Ejercicios colas con librerias de JAVA");
        System.out.println("==========================================");
        Colasimple();
        Colascircular();
        Colasprioridad();
        Colasdobles();
    }
    
    static void Colasimple(){
    System.out.println("--- SIMPLE: primero en llegar primero en salir (FIFO)\n");
    Queue<String> java = new ArrayDeque<>(); // se crea
    java.offer("Ana");
    java.offer("Viviana");
    java.offer("Leiner");
    System.out.println("Java:   " + java.poll() + ", " + java.poll() + "\n");
    }
    
    static void Colascircular(){
    System.out.println("---CIRCULAR: reutiliza los espacios del arreglo\n");
    Queue<String> java = new ArrayDeque<>(); // se crea
    java.offer("Ana");
    java.offer("Viviana");
    java.offer("Leiner");
    System.out.println("SALE  :    " + java.poll());
    java.offer("Fabio");
    System.out.println("Java:   " + java.poll() + ", " + java.poll() + ", " + java.poll() + "\n");
    }
    
    static void Colasprioridad(){
    System.out.println("---PRIORIDAD: el menor numero se atiende primero");
    Queue<Integer> java = new PriorityQueue<>(); // se crea
    java.offer(5);
    java.offer(2);
    java.offer(3);
    System.out.println("Java:   " + java.poll() + ", " + java.poll() + ", " + java.poll() + "\n");
    }
    
    static void Colasdobles(){
    System.out.println("---DOBLE: permite usar ambos extremos\n");
    Deque<String> java = new ArrayDeque<>(); // se crea
    java.offerLast("Ana");
    java.offerLast("Viviana");
    java.offerFirst("Leiner");
    
    System.out.println("Java:   Sale del inicio " + java.pollFirst() + ", Sale del final " + java.pollLast());
    }
    
    
}
