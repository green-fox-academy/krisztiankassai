public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public void getGoal(){
        System.out.println("Be a software developer.");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() +
                " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public Student(){
        this("Jane Doe", 30, "female", "The School of life");
    }
}
