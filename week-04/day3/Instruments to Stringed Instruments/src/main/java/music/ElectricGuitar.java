package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(){
    numberOfStrings = 6;
    name = "Electric Guitar";
  }
  public ElectricGuitar(int stringNumber){
    numberOfStrings = stringNumber;
    name = "Electric Guitar";
  }
  public String sound(){
    return "Twang";
  }




}
