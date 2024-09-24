import java.util.Random;

public abstract class Character{
    private final String name;
    private int hp = 100;
    private final int baseAtk = 10;
    private final int baseHit = 101;
    private final int cHit = 7;

    Random rdm = new Random();

    public Character(String name) {
        this.name = name;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int dmg) {
        this.hp = hp - dmg;
        if(hp < 0){this.hp = 0;}
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public String getName() {
        return name;
    }

    public int getBaseHit(){
        return rdm.nextInt(baseHit);
    }

    public int getCHit(){
        return rdm.nextInt(cHit);
    }
}
