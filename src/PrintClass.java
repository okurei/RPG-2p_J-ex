public class PrintClass {
    DamageLogic dmgL = new DamageLogic();

    public void turnOrder(int turn){
        System.out.printf("Turn %d\n", turn);
    }

    public int printFight(String name,int hit, int cHit1, int cHit2){
        int dmg = dmgL.endDmg(hit, cHit1, cHit2);
        System.out.printf("%s attack (hit %d crit %d, %d)\nDeal %d damage\n", name, hit, cHit1, cHit2, dmg);
        return dmg;
    }

    public void printHp(String name, int hp){
        if (hp > 0) {
            System.out.printf("%s %dhp\n\n", name, hp);
        }else{
            System.out.printf("%s is dead.\n\n", name);
        }
    }

    public void win (String name){
        System.out.printf("%s Win!", name);
    }
}
