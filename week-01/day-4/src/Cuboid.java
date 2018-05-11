public class Cuboid {
    public static void main(String[] args) {
        double length = 17.5;
        double width = 12;
        double height = 13.33;
        double SurfaceArea = 2 * ((length * width) + (width * height) + (height * length));
        double Volume = (width * length * height);

        System.out.println("Surface Area= " + ((int) SurfaceArea));
        System.out.println("Volume= " + ( (int) Volume));
    }
}
