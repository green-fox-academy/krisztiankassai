import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class MatchMaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane", "Reka", "Dora"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys ){
        ArrayList<String> matches = new ArrayList<>();
        int matchsize = 0;
        if (girls.size()>boys.size()){
            matchsize = boys.size();
        } else {
            matchsize = girls.size();

        }
        for (int i = 0; i < matchsize ; i++) {
            matches.add(girls.get(i));
            matches.add(boys.get(i));
        }
        return matches;

    }
}
