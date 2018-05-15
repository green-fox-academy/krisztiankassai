public class SimpleReplace {
    public static void main(String... args){
        String example = "In a dishwasher far far away";

        String urlreplace = example.replace("dishwasher","galaxy");

        System.out.println(urlreplace);

        System.out.println(example.replace("dishwasher", "galaxy"));
    }
}
