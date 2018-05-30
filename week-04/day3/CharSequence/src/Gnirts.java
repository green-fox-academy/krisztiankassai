

public class Gnirts implements CharSequence {

  String string;

  public Gnirts(String string) {
    this.string = string;
  }
  public Gnirts(){
    this("This is a string");
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt((this.string.length() - 1) - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public int length() {
    return this.string.length();
  }
}
