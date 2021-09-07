package com.potoware.thread.ejemplos;

import com.potoware.thread.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        
        Thread hilo = new NombreThread("John Doe");

        System.out.println("hilo.getState() = " + hilo.getState());

        hilo.start();

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        Thread hilo3 = new NombreThread("pepe");
        hilo3.start();
        //Thread.sleep(1);
        System.out.println("hilo.getState() = " + hilo.getState());
    }
}
