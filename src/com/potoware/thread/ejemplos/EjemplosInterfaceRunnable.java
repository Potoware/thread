package com.potoware.thread.ejemplos;

import com.potoware.thread.ejemplos.runnable.ViajeTarea;

public class EjemplosInterfaceRunnable {

    public static void main(String[] args) {
        new Thread(new ViajeTarea("San Andres Islas")).start();
        new Thread(new ViajeTarea("Baru")).start();
        new Thread(new ViajeTarea("Cartagena")).start();
        new Thread(new ViajeTarea("Mexico")).start();
    }
}
