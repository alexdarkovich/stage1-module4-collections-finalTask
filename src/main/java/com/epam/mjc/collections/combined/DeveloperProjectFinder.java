package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                list.add(e.getKey());
            }
        }
        Collections.sort(list, new MyComparator());
        return list;
    }
}

class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return 1;
        } else if (o1.length() > o2.length()) {
            return -1;
        }
        return o2.compareTo(o1);
    }
}
