package com.nongsa;

public class Main {

    public static void main(String[] args) {

        // Group 6
        Hero hero = new Hero("Waisul Kuroni", 21);

        hero.player();

        // walk 15x
        int temp = 15;
        for (int i = 0; i < temp; i++) {
            hero.walk();
        }
        //  run 1x
        hero.run();
        //  eat 4x
        temp = 4;
        for (int i = 0; i < temp; i++) {
            hero.eat();
        }
        //  drink 2x
        temp = 2;
        for (int i = 0; i < temp; i++) {
            hero.drink();
        }
        //  jump 6x, 
        temp = 6;
        for (int i = 0; i < temp; i++) {
            hero.jump();
        }
        // walk 12x
        temp = 12;
        for (int i = 0; i < temp; i++) {
            hero.walk();
        }
        //  sit 5x
        temp = 5;
        for (int i = 0; i < temp; i++) {
            hero.sit();
        }
        //  attack 1x
        hero.attack();

        /*
        Group 1: walk 20x, run 5x, eat 3x, drink 2x, walk 5x, jump 2x, sit 1x, attack 3x
        Group 2: walk 5x, run 2x, walk 35x, eat 4x, drink 3x, jump 3x, sit 1x, attack 2x
        Group 3: walk 7x, run 4x, eat 4x, drink 3x, jump 3x, sit 4x, walk 50x, attack 4x
        Group 4: walk 10x, run 6x, walk 30x, eat 3x, drink 2x, jump 6x, sit 5x, attack 2x
        Group 5: walk 10x, run 2x, eat 3x  walk 30x, drink 5x, jump 3x, sit 5x, attack 6x
        Group 6: walk 15x, run 1x, eat 4x, drink 2x, jump 6x, walk 12x, sit 5x, attack 1x
        Group 7: walk 2x, run 3x, eat 5x, drink 2x,  walk 50x, jump 6x, sit 5x, attack 3x
        Group 8: walk 1x, run 5x, eat 4x, drink 2x, walk 60x, jump x4, sit 2x, attack 4x
        Group 9: walk 7x, run 2x, eat 3x, drink 2x, jump 6x, sit 5x, walk 10x, attack 2x
        */
        
        hero.player();
    }
}
