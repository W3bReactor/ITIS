package ru.itis.game;

import java.util.Random;

public class Aught extends Animal {
    public Aught(String name) {
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        int positionX = random.nextInt(0, Game.FIELD_WIDTH);
        int positionY = random.nextInt(0, Game.FIELD_HEIGHT);
        setPosition(positionX, positionY);
    }
}
