public class Assassin extends Character{
    int hp = 70;
    int baseAtk = 12;
    int cHit = 4;
    public Assassin(String name) {
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
    @Override
    public int getBaseAtk(){
        return baseAtk;
    }
    @Override
    public int getCHit(){
        return rdm.nextInt(cHit)+3;
    }
}
