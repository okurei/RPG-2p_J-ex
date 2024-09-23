import java.util.Random;

public class Combat {

    PrintClass printC = new PrintClass();
    Character char1 = new Character("Player 1");
    Character char2 = new Character("Player 2");
    Random rdm = new Random();

    public void fight(){
        do{
            int turn = rdm.nextInt(2)+1;
            if (turn == 1){
                int dmg = printC.printFight(char1.getName(), char1.getBaseHit(), char1.getCHit(), char1.getCHit());
                char2.setHp(dmg);
            }

        }while(char1.getHp() > 0 && char2.getHp() > 0);
    }


}
