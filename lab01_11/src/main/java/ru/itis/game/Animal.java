package ru.itis.game;

public abstract class Animal {
    public String name;
    protected int x;
    protected int y;

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Animal(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public abstract void move();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void showPosition() {
        System.out.println("Animal " + name + " is at position (" + x + ", " + y + ")");
    }


}
