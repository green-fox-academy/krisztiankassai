package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
    numberOfStrings = 4;
    name = "Bass Guitar";
  }
  public BassGuitar(int stringNumber){
    numberOfStrings = stringNumber;
    name = "Bass Guitar";
  }
  public String sound(){
    return"Duum-duum-duum";
  }
}
