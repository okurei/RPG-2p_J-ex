public class Combat {

    DamageLogic dmgLog = new DamageLogic();
    PrintClass printC = new PrintClass();
    Character char1 = new Character("Player 1");
    Character char2 = new Character("Player 2");

    public void fight(){
        do{

        }while(char1.getHp() > 0 && char2.getHp() > 0);
    }


}
