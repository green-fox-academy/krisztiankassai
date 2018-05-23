public class Animals {
  int hunger;
  int thirst;
public Animals(){
    this(50,50);
}
public Animals(int hunger, int thirst){
    this.hunger = hunger;
    this.thirst = thirst;
}
public void eat(){
     hunger--;
}
public void thirst(){
    thirst--;
}
public void play(){
    thirst++;
    hunger++;
}
}
