public class DamageLogic {

    /**
     * check the hit and return the damage based on the parameter passed
     */
    private int damage(double hit, int baseAtk){
        double dmg;
        if (hit <26) {
            dmg = 0;
        }
        else{
            if (hit > 89){
                dmg = baseAtk;
            }
            else{
                dmg = hit/100*baseAtk;
            }
        }
        return (int) dmg;
    }
    /**
     * return 0, 1 or 2 based on the random critical.
     * */
    private int critical(int crt1, int crt2){
        if (crt1 == crt2){
            if (crt1 < 4){
                return  0;

            }
            else{
                return  2;

            }
        }
        else{
            return 1;
        }
    }
/**
 * return the final damage based on hit, critical hit and base atk based on the job*/
    public int endDmg(double hit, int baseAtk, int crt1,int crt2){
        double dmg;
        dmg = damage(hit, baseAtk)*critical(crt1, crt2);
        return (int) dmg;
    }

}
