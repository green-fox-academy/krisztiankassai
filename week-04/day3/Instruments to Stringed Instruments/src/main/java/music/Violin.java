package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    numberOfStrings = 4;
    name = "Violin";
  }
  public Violin(int stringNumber){
    numberOfStrings = stringNumber;
    name = "Violin";

  }
  public String sound(){
    return"Screech";
  }

}
