public class PrintClass {
    DamageLogic dmgL = new DamageLogic();

    /**
     * print the turn number
     */
    public void turnOrder(int turn){
        System.out.printf("Turn %d\n", turn);
    }

    /**
     * print the layout of the fight with the random and the data
     * return also the final damage that will be used to decrease the hp
     */
    public int printFight(Character character){
        int hit = character.getBaseHit();
        int cHit1 = character.getCHit();
        int cHit2 = character.getCHit();
        int dmg = dmgL.endDmg(hit, character.getBaseAtk(), cHit1, cHit2);
        System.out.printf("%s attack (hit %d critical %d, %d)\nDeal %d damage\n", character.getName(), hit, cHit1, cHit2, dmg);
        return dmg;
    }

    /**
     * print current hp and if below 0 print the death of the character
     */

    public void printHp(String name, int hp){
        if (hp > 0) {
            System.out.printf("%s %dhp\n\n", name, hp);
        }else{
            System.out.printf("%s is dead.\n\n", name);
        }
    }

    /**
     * print the name of the winner
     */
    public void win (String name){
        System.out.printf("%s Win!", name);
    }
}
