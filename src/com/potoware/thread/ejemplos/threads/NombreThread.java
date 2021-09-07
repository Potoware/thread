package com.potoware.thread.ejemplos.threads;

public class NombreThread extends Thread{

    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicia el mentodo run del hilo"+getName());
    for(int i= 0; i<100000; i++){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name = " + getName());
    }
    }
}
