package com.potoware.thread.ejemplos;

import com.potoware.thread.ejemplos.runnable.ImprimirClases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirClases("Hola ","Que tal!")).start();
        new Thread(new ImprimirClases("Quien eres ","Tu")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirClases("Muchas graicas ","amigo"));
        Thread.sleep(100);
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);

    }
}
