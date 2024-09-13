public class PrintClass {

    public void turnOrder(int turn, int ini){
        System.out.printf("Turn %d \n\n Player %d", turn, ini);
    }

    public void printFight(int hit, int cHit, int dmg){
        System.out.printf(" attack (hit %d crit %d)\nDeal %d damage", hit, cHit, dmg);
    }

    public void win (String name){
        System.out.printf("%s", name);
    }
}
