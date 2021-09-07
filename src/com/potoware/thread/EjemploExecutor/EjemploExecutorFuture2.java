package com.potoware.thread.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        System.out.println("Tamaño del pool"+ executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola" +executor.getQueue().size());

        Callable<String> tarea= ()->{
            System.out.println("inicio de la tarea");
            try {
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
            return "Algun resultado ";
        };

        Callable<Integer> tarea2 =()->{
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String>resultadoFuturo = executor.submit(tarea);
        Future<String>resultadoFuturo2 = executor.submit(tarea);
        Future<Integer> resultadoFuturo3 = executor.submit(tarea2);
        System.out.println("Tamaño del pool"+ executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola" +executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del main 1");
        System.out.println(resultadoFuturo.isDone());
        while (!(resultadoFuturo.isDone()&&resultadoFuturo2.isDone()&&resultadoFuturo3.isDone())){
            System.out.println(String.format("resultado 1: %s -resultado 2: %s - resultado 3: %s",
                    resultadoFuturo.isDone()? "finalizo":"en proceso",
                    resultadoFuturo2.isDone()? "finalizo":"en proceso",
                    resultadoFuturo3.isDone()? "finalizo":"en proceso"));
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        System.out.println(resultadoFuturo.get());
        System.out.println(resultadoFuturo.isDone());

    }
}
