package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Monday", 1);
        sourceMap.put("Tuesday", 2);
        sourceMap.put("Wednesday", 3);
        sourceMap.put("Thursday", 4);
        sourceMap.put("Friday", 5);

        Set<String> str = new HashSet<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            str.add(e.getKey());
        }
        System.out.println(str);

        Set<Integer> iii = new HashSet<>();
        for (String sss : str){
            iii.add(sss.length());
        }
        System.out.println(iii);

        Map<Integer, Set<String>> mapToPrint = new HashMap<>();
        for (Integer ii : iii){
            Set<String> setForMap = new HashSet<>();
            for (String ssss : str) {
                if (ssss.length() == ii) {
                    setForMap.add(ssss);
                }
            }
            mapToPrint.put(ii, setForMap);
        }

        System.out.println(mapToPrint);

    }
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Set<String> str = new HashSet<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            str.add(e.getKey());
        }
        System.out.println(str);

        Set<Integer> iii = new HashSet<>();
        for (String sss : str){
            iii.add(sss.length());
        }
        System.out.println(iii);

        Map<Integer, Set<String>> mapToPrint = new HashMap<>();
        for (Integer ii : iii){
            Set<String> setForMap = new HashSet<>();
            for (String ssss : str) {
                if (ssss.length() == ii) {
                    setForMap.add(ssss);
                }
            }
            mapToPrint.put(ii, setForMap);
        }
        return mapToPrint;
    }
}
