package main.java.music;

abstract class StringedInstrument extends Instrument {

  public int numberOfStrings;

  public void play(){
    System.out.println(name + " a " + numberOfStrings +
            "-stringed instrument that goes " + sound());
  }

  abstract String sound();
}
