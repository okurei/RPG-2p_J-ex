import java.util.Random;

public class Combat {

    PrintClass printC = new PrintClass();
    Character char1 = new Character("Player 1");
    Character char2 = new Character("Player 2");
    Random rdm = new Random();

    public void fight(){
        int turn = 1;
        do{
            int initiative = rdm.nextInt(2)+1;
            printC.turnOrder(turn);
            turn++;
            if (initiative == 1){
                int dmg = printC.printFight(char1.getName(),char1.getBaseHit(), char1.getBaseAtk(), char1.getCHit(), char1.getCHit());
                char2.setHp(dmg);
                printC.printHp(char2.getName(), char2.getHp());
            }
            else {
                int dmg = printC.printFight(char2.getName(),char2.getBaseHit(), char2.getBaseAtk(), char2.getCHit(), char2.getCHit());
                char1.setHp(dmg);
                printC.printHp(char1.getName(), char1.getHp());

            }
        }while(char1.getHp() > 0 && char2.getHp() > 0);
        if (char2.getHp() == 0) {
            printC.win(char1.getName());
        }
        else {
            printC.win(char2.getName());
        }
    }
}
