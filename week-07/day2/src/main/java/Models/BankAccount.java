package Models;

public class BankAccount {

  private String name;
  private double balance;
  private String animaltype;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, double balance, String animaltype, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public BankAccount() {
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimaltype() {
    return animaltype;
  }

  public void setAnimaltype(String animaltype) {
    this.animaltype = animaltype;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }
}
