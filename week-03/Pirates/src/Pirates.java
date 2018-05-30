public class Pirates {

    int pirateID,
    int rumLevel;
    boolean isAlive;

    public Pirates(){
        this(0,0,true);
    }

    public Pirates(int pirateID, int rumLevel, boolean isAlive){
        this.pirateID = pirateID;
        this.rumLevel = rumLevel;
        this.isAlive = isAlive;
    }

    public static int drinkSomeRum(int rumLevel, boolean isalive){
        if (isalive) {
            return rumLevel += rumLevel;
        }else {
            System.out.println("he's dead");
            return 0;
        }
    }

    public static void howisitGoingMate(int rumLevel){
        if (rumLevel <= 4){
            System.out.println("Pour me anudder!");
        }else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public static boolean die(boolean isalive){
        if (isalive){
            return true;
        }else{
            return false;
        }
    }
    public static boolean brawl(int pirateID, Pirates pirates,  boolean isAlive){
        int brawlResult = (int) (Math.random()*3);
        if (isAlive && brawlResult ==1){
            pirates
        }
    }
}
