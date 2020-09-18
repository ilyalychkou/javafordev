package com.javafordev.lesson5.task1;

public class CompareRunner {

    private String name;

    @Override
    public boolean equals(Object o) {
        // проверка на равенство ссылок текущего и входного объектов
        // если true то они ссылаются на один объекта в куче, сразу возвращаем true
        //если false - выполняем следующие уровни проверок
        if (this == o) return true;

        //проверка 2 условии через логическое ИЛИ 1) определена ли ссылка на входнои объект o; 2) сравнение типов объектов через значение класса
        if (o == null || getClass() != o.getClass()) return false;

        // явное приведение входного объекта к классу (типу) текущего объекта
        CompareRunner that = (CompareRunner) o;

        //тернарныи оператор - входное условие name != null - ссылка поля name текущего объекта не равна null
        //1) если true (то есть name текущего объекта не равно null) => return name.equals(that.name) - то есть результат сравнения полеи name по значению у 2 объектов
        //2) если false (то есть name текущего объекта null) => that.name == null - то есть результат сравнения поля name входного объекта с null
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
