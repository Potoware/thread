package com.potoware.thread.EjemploExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduleExecutorServicePeriod {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea antes del main");
        //CountDownLatch lock = new CountDownLatch(5);
        AtomicInteger atomic = new AtomicInteger(5);

        Future<?> future = executor.scheduleAtFixedRate(()->{
            System.out.println("Esta es una tarea programada");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                atomic.getAndDecrement();
               // lock.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        },1000,2000,TimeUnit.MILLISECONDS);
       //lock.await();
       ///future.cancel(true);
        // TimeUnit.MILLISECONDS.sleep(5000);
        while(atomic.get()>=0){
            if(atomic.get()==0){
                future.cancel(true);
                atomic.getAndDecrement();
            }
        }
        System.out.println("Otra tarea del main");
        executor.shutdown();
    }
}
