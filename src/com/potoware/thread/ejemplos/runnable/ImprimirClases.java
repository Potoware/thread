package com.potoware.thread.ejemplos.runnable;

import com.potoware.thread.ejemplos.EjemploSincronizacionThread;

import static com.potoware.thread.ejemplos.EjemploSincronizacionThread.*;

public class ImprimirClases implements Runnable{

    String frase1, frase2;

    public ImprimirClases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1,this.frase2);
    }
}
