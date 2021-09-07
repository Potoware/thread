package com.potoware.thread.ejemplos.runnable;

import javax.swing.plaf.TableHeaderUI;

public class ViajeTarea implements Runnable{

    private String name;

    public ViajeTarea(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println( i + " - "+name);
            try {
                Thread.sleep((long) Math.random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalmente me voy de viaje a "+ name);
    }
}
