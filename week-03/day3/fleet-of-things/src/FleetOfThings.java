public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing name = new Thing("Get milk");
        Thing name1 = new Thing("Remove the obstacles");
        Thing name2 = new Thing("Stand up");
        Thing name3 = new Thing("Eat Lunch");

        fleet.add(name);
        fleet.add(name1);
        fleet.add(name2);
        fleet.add(name3);

        name2.complete();
        name3.complete();


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}