package org.example;

import java.util.Map;

public interface LoadBalance {

    String getInstance(Map<Integer, String> serverMap);
}
