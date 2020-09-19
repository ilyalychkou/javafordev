package com.javafordev.lesson6.task2;

import java.util.*;

/**
 * 1.Имеется текст. Необходимо составить для него частотныи словарь.
 */

public class TextService {

    private HashMap<String, Integer> frequencyDictionary;

    public TextService(HashMap<String, Integer> frequencyDictionary) {
        this.frequencyDictionary = frequencyDictionary;
    }

    public HashMap<String, Integer> getFrequencyDictionary() {
        return frequencyDictionary;
    }

    public void setFrequencyDictionary(HashMap<String, Integer> frequencyDictionary) {
        this.frequencyDictionary = frequencyDictionary;
    }

    public void printDictionary() {
        Set set = this.getFrequencyDictionary().entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry element = (Map.Entry) iterator.next();
            System.out.println("Слово : \"" + element.getKey() + "\" , количество вхождении : " + element.getValue());
        }


    }


    public HashMap<String, Integer> sortDictionaryByCountOfOccurrences() {

        List list = new LinkedList(this.getFrequencyDictionary().entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

}
