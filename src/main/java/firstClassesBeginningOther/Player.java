package firstClassesBeginningOther;

import java.util.Arrays;

public class Player {
    private int hp = 100;
    public Player(int h){
        hp = h;
    }
    int getHp(){
        return hp;
    }
    public void damage(int value) {
        hp -= value;
        if (hp < 0) {
            hp = 0;
        }
    }
    boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return "hp = " + hp +", isAlive = " + isAlive();
    }



    public static void main(String[] args) {
        Player hero = new Player(100);
        Player killer = new Player(100);
        System.out.println("hero = " + hero);
        System.out.println("killer = " + killer);

        hero.damage(20);
        System.out.println(hero);
        hero.damage(10500);
        System.out.println(hero);

        Player [] players = new Player[5];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i +1 );

        }
        System.out.println("Arrays.toString(players) = " + Arrays.toString(players));
    }
}
