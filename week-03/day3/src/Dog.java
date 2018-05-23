public class Dog {

    String breed;
    String name;
    int age;

    public Dog(){
      this.name = "Buksi";
      this.breed = "unknown";
      int age = -1;
    }


    public Dog(String name, String breed, int age) {
      this.name = name;
      this.breed = breed;
      this.age = age;
   }
}