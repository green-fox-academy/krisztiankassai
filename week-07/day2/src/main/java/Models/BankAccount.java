package Models;

public class BankAccount {

  private String name;
  private long balance;
  private String animaltype;

  public BankAccount(String name, long balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimaltype() {
    return animaltype;
  }

  public void setAnimaltype(String animaltype) {
    this.animaltype = animaltype;
  }
}
