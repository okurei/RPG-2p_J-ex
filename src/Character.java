import java.util.Random;

public class Character{
    private final String name;
    private int hp = 100;
    private final double baseAtk = 10;
    private int baseHit = 100;
    private int cHit = 6;

    Random rdm = new Random();

    public Character(String name) {
        this.name = name;
    }

   /* public double getBaseAtk() {
        return baseAtk;
    }*/

    public int getHp() {
        return hp;
    }

    public void setHp(int dmg) {
        this.hp = hp - dmg;
        if(hp < 0){this.hp = 0;}
    }

    public String getName() {
        return name;
    }

    public int getBaseHit(){
        return baseHit = rdm.nextInt(100)+1;
    }

    public int getCHit(){
        return cHit = rdm.nextInt(6)+1;
    }
}
