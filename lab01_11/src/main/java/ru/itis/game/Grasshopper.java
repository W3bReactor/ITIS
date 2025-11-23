package ru.itis.game;

import java.util.Random;

public class Grasshopper extends Animal {


    public Grasshopper(String name) {
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        int direction = random.nextInt(1, 4);
        switch (direction) {
            case 1:
                if(x < Game.FIELD_WIDTH) {
                    x++;
                }
                break;
            case 2:
                if(y < Game.FIELD_HEIGHT-1) {
                    y+=2;
                }
                break;
            case 3:
                if(x > 0) {
                    x--;
                }
        }

    }
}
