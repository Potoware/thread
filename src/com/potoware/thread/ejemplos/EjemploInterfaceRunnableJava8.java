package com.potoware.thread.ejemplos;

import com.potoware.thread.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Thread main= Thread.currentThread();
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
                System.out.println("main.getState() = " + main.getState());
            }
        };

       Thread v1 = new Thread(viaje,"San Andres Islas");
        Thread v2 =new Thread(viaje,"Baru");
        Thread v3 =new Thread(viaje,"Cartagena");
        Thread v4 =new Thread(viaje,"Mexico");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();


      //  Thread.sleep(5);
        System.out.println(" Continuando con Main"+main.getName());
    }
}
