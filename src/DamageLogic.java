public class DamageLogic {


    private int damage(double hit){
        double dmg;
        if (hit <26) {
            dmg = 0;
        }
        else{
            if (hit > 89){
                dmg = 10;
            }
            else{
                dmg = hit / 10;
            }
        }
        return (int) dmg;
    }
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

    public int endDmg(double hit, int crt1,int crt2){
        double dmg;
        dmg = damage(hit)*critical(crt1, crt2);
        return (int) dmg;
    }

}
