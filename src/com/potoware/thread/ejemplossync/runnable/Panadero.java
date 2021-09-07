package com.potoware.thread.ejemplossync.runnable;

import com.potoware.thread.ejemplossync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

    }
}
