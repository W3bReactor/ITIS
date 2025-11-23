package ru.itis.game;

import java.util.Random;

public class Game {
    public static final int FIELD_WIDTH = 1000;
    public static final int FIELD_HEIGHT = 1000;
    public static final int WIN_X = 400;
    public static final int WIN_Y = 400;
    public static final int WIN_WIDTH = 200;
    public static final int WIN_HEIGHT = 200;




    public void run() {
        Random random = new Random();
//       Получили псевдослучайное число от 0 до 3
        int spawnPosition1 = random.nextInt(1, FIELD_WIDTH);
        Ant ant = new Ant("Джунгарик");
        ant.setPosition(spawnPosition1, 0);
        int spawnPosition2 = random.nextInt(1, FIELD_WIDTH);
        Grasshopper grasshopper = new Grasshopper("Алёша");
        grasshopper.setPosition(spawnPosition2, 0);
//        int spawnPosition3 = random.nextInt(1, FIELD_WIDTH);
//        Aught aught = new Aught("Ваня");
//        aught.setPosition(spawnPosition3, 0);
        int spawnPosition4 = random.nextInt(1, FIELD_WIDTH);
        Turtle turtle = new Turtle("Саня");
        turtle.setPosition(spawnPosition4, 0);
        Animal[] animals = {ant, grasshopper, turtle};
        boolean winnerGetted = false;
        while (!winnerGetted) {
            for (int i = 0; i < animals.length; i++) {
                animals[i].move();
                if(animals[i].getX() > WIN_X && animals[i].getY() > WIN_Y && animals[i].getX() < WIN_X+WIN_WIDTH && animals[i].getY() < WIN_Y+WIN_HEIGHT) {
                    System.out.println(animals[i].name + " победил!");
                    winnerGetted = true;
                    break;
                }
            }

        }

    }
}
