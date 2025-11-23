package ru.itis.game;

import java.util.Random;

public class Ant extends Animal {

    public Ant(String name) {
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
//       Получили псевдослучайное число от 0 до 3
        int direction = random.nextInt(4);
//      0 - вниз
//      1 - вправо
//      2 - вверх
//      3 - влево
        switch (direction) {
            case 0:
                if(y > 0) {
                    y--;
                }
                break;
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
