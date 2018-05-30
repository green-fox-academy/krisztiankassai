import java.util.ArrayList;
import java.util.List;

public class Ship {
    int numbOfPirates;
    ArrayList<Pirates> pirates = new ArrayList<>();

    public Ship(){
        this(pirates,0);
    }
    public Ship(ArrayList pirates, int numbOfPirates){
        this.numbOfPirates = numbOfPirates;
        this.pirates = pirates;
    }
    public static ArrayList fillship(ArrayList pirates, int numbOfPirates){
        numbOfPirates = (int) (Math.random()* 50);
        ArrayList<Object> crew = new ArrayList<>();
        for (int i = 0; i < numbOfPirates ; i++) {

        }
        return crew;
    }

}
