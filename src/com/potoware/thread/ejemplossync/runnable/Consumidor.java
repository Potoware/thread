package com.potoware.thread.ejemplossync.runnable;

import com.potoware.thread.ejemplossync.Panaderia;

public class Consumidor implements Runnable{

    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

    }
}
