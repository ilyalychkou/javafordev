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

        // создаем связныи список через конструктор - которыи принимает множество значении карты частотного словаря
        List list = new LinkedList(this.getFrequencyDictionary().entrySet());
        System.out.println(list);
        //сортируем связныи список, в метод sort() передаем кастомныи компаратор
        Collections.sort(list, new FrequencyDictionaryComparator());

        //используется LinkedHashMap,   так как элементы будут возвращатся в том порядке в котором выполнена их вставка в карту
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

}
