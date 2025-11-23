package ru.itis.game;

/*

Поле 1000x1000
Выигрыш при попадании в поле 200x200

Нечто случайно рандомно появляется в каком-то месте

Черепаха влево вправо вниз

Кузнечик влево вправо прыжок вниз

Муравей влево право вверх вниз

нач позиция 0;0

*/

import java.util.Random;

public class Main { 
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
