import java.util.Random;

public class Combat {

    PrintClass printC = new PrintClass();
    Warrior char1 = new Warrior("Player 1");
    Assassin char2 = new Assassin("Player 2");
    Random rdm = new Random();

    /**
     * the main function that handle the fight*/
    public void fight(){
        int turn = 1;
        do{
            int initiative = rdm.nextInt(2)+1; /* set first to attack each turn*/
            printC.turnOrder(turn);
            turn++;
            /*if statement for the initiative*/
            handleFight(initiative == 1 ? char1 : char2, initiative == 1 ? char2 : char1);

        }while(char1.getHp() > 0 && char2.getHp() > 0);/*do while both the player have hp above 0 */

        printC.win(char2.getHp() == 0 ? char1.getName(): char2.getName());
    }


    private void handleFight(Character character1, Character character2){
        int dmg = printC.printFight(character1);
        character2.setHp(dmg);
        printC.printHp(character2.getName(), character2.getHp());

    }
}
