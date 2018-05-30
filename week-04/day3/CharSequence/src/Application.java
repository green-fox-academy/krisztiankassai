public class Application {

  public static void main(String[] args) {
    Gnirts gnirt = new Gnirts("this is a string");
    System.out.println(gnirt.charAt(2));
    System.out.println(gnirt.length());
    System.out.println(gnirt.subSequence(1,5));

    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));


    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));


  }

}
