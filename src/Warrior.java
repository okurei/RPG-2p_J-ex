public class Warrior extends Character {
    int hp = 120;
    public Warrior(String name) {
        super(name);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int dmg) {
        this.hp = hp - dmg;
        if(hp < 0){this.hp = 0;}
    }
}
