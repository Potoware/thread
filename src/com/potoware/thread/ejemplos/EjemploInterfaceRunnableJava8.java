package com.potoware.thread.ejemplos;

import com.potoware.thread.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) {
        Runnable viaje = ()-> {

            {
                for (int i=0;i<10;i++){
                    System.out.println( i + " - "+Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) Math.random());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a "+ Thread.currentThread().getName());
            }
        };

        new Thread(viaje,"San Andres Islas").start();
        new Thread(viaje,"Baru").start();
        new Thread(viaje,"Cartagena").start();
        new Thread(viaje,"Mexico").start();
    }
}
