package org.example;

import java.util.Map;
import java.util.Set;

public class RoundRobin implements LoadBalance {
    private static Integer position = 0;

    @Override
    public String getInstance(Map<Integer, String> serverMap) {
        String target = null;

        synchronized (position) {
            if (position > serverMap.size() - 1) {
                position = 0;
            }
            target = serverMap.get(position);
            position++;
        }
        return target;
    }
}