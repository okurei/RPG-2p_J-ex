import java.util.Random;

public class Combat {

    PrintClass printC = new PrintClass();
    Warrior char1 = new Warrior("Player 1");
    Assassin char2 = new Assassin("Player 2");
    Random rdm = new Random();

    public void fight(){
        int turn = 1;
        do{
            int ini = rdm.nextInt(2)+1;
            printC.turnOrder(turn);
            turn++;
            if (ini == 1){
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
