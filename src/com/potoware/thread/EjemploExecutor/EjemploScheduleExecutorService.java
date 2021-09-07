package com.potoware.thread.EjemploExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea antes del main");
        executor.schedule(()->{
            System.out.println("Esta es una tarea programada");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        },1000,TimeUnit.MILLISECONDS);
        System.out.println("Otra tarea del main");
        executor.shutdown();
    }
}
