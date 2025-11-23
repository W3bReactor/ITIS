package ru.itis.game;

import java.util.Random;

public class Turtle extends Animal {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
//       Получили псевдослучайное число от 0 до 3
        int direction = random.nextInt(1, 4);
        switch (direction) {
            case 1:
                if(x < Game.FIELD_WIDTH) {
                    x++;
                }
                break;
            case 2:
                if(y < Game.FIELD_HEIGHT) {
                    y++;
                }
                break;
            case 3:
                if(x > 0) {
                    x--;
                }
        }

    }
}
