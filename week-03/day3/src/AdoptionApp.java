public class AdoptionApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Morzsa";
        dog.breed = "Swiss sheperd";
        dog.age = 2;
        Dog dog2 = new Dog("Mano", "mix", 2);
        System.out.println(dog);
    }
}
