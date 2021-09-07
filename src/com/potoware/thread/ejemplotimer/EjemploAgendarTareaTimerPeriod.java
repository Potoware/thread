package com.potoware.thread.ejemplotimer;

import javax.tools.Tool;
import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriod {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
           // int contador = 3;
            @Override
            public void run() {

               int i = contadorAtomic.getAndDecrement();
                if(i>0){
                    toolkit.beep();
                System.out.println("Tarea "+contadorAtomic+" periodica en "+ new Date()+" nombre del Thread" +
                        Thread.currentThread().getName());
                    }
               else{
                   System.out.println("Finaliza el tiempo");
                   timer.cancel();;
               }
               // timer.cancel();

            }
        },0,10000);

        System.out.println("Agendamos una tarea inmediata que se repirte cada 10 segundos...");
    }
}
