package org.example;

public class Main {
    public static void main(String[] args) {

        ServerPool sp = new ServerPool();
        sp.registerServer(0, "1.1.1.1");
        sp.registerServer(1, "2.2.2.2");
        sp.registerServer(2, "3.3.3.3");
        sp.registerServer(3, "4.4.4.4");
        sp.registerServer(4, "5.5.5.5");
        sp.registerServer(5, "6.6.6.6");
        sp.registerServer(6, "7.7.7.7");

        RoundRobin rr = new RoundRobin();

        for (int i = 0; i < 10; i++){
            System.out.println(rr.getInstance(sp.getServers()));
        }

        System.out.println("----------");

        RandomLoadBalance rlb=  new RandomLoadBalance();

        for (int i = 0; i < 10; i++){
            System.out.println(rlb.getInstance(sp.getServers()));
        }


    }
}