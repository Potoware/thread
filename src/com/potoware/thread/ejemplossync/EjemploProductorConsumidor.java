package com.potoware.thread.ejemplossync;

import com.potoware.thread.ejemplossync.runnable.Consumidor;
import com.potoware.thread.ejemplossync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
