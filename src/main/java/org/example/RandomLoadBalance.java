package org.example;

import java.util.Map;
import java.util.Random;

public class RandomLoadBalance implements LoadBalance {

    @Override
    public String getInstance(Map<Integer, String> serverMap) {
        int randomIndex = new Random().nextInt(serverMap.size());
        return serverMap.get(randomIndex);
    }
}
