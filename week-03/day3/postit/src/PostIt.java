public class PostIt {
    String backgroundcolor;
    String text;
    String textcolor;

    public PostIt(){
        this("unkown", "unkown", "unkown");
    }

    public PostIt(String backgroundcolor, String text, String textcolor){
        this.backgroundcolor = backgroundcolor;
        this.text = text;
        this.textcolor = textcolor;
    }
    public String print(){
        return backgroundcolor + " " + textcolor + " " + text;
    }
}
