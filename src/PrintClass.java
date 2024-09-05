public class PrintClass {

    private final String miss = "miss";
    private final String hit = "hit";
    private final String cHit = "critical hit";
    private final String cMiss = "critical miss";
    private final String hp = "hp";
    private final String atk = "attack";
    private final String win = "win";



    public void print(int hit, int cHit, int dmg){
        if (cHit == 0){
            System.out.println(cMiss);
        } else if (cHit == 1) {
            System.out.println("hit for " + dmg);
        }
        System.out.println("Player 1 %s");
        System.out.println("Player 2 %s");
    }
}
