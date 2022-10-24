package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServerPool {

    private static final Map<Integer, String> serverMap = new ConcurrentHashMap<>();


    public boolean registerServer(Integer id, String ip){
        serverMap.put(id, ip);
        return true;
    }


    public Map<Integer, String> getServers(){
        return serverMap;
    }


    public boolean serverExists(String ip){
        return serverMap.containsValue(ip);
    }

}
