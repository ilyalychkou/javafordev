package com.javafordev.lesson7.task4.objects;

public abstract class Entity {

    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getName();

}
