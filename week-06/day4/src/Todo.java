public class Todo {

  private String description;
  private boolean isDone;

  public Todo(String description, boolean isDone) {
    this.description = description;
    this.isDone = isDone;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}


