public class Office {
    public static void main(String[] args) {
        PostIt postit = new PostIt("orange", "Idea 1", "blue");
        PostIt postit1 = new PostIt("pink","awesome", "black");
        PostIt postit2 = new PostIt("yellow", "Superb", "green");
        System.out.println(postit.print() + postit1.print() + postit2.print());
    }
}
