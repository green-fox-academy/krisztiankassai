import java.time.LocalDateTime;
import java.time.Period;

public class Todo {
  int id;
  String description;
  LocalDateTime createdAt;
  LocalDateTime completedAt;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(LocalDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public Todo(int id, String description, LocalDateTime createdAt, LocalDateTime completedAt) {

    this.id = id;
    this.description = description;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
  }

  public Todo(){
    id = 1;
    description = "A thing to do";
    createdAt = LocalDateTime.now();
    completedAt = LocalDateTime.now();
  }

  public static Period complitionTime(LocalDateTime createdAt, LocalDateTime completedAt){
    return Period.between(createdAt.toLocalDate(), completedAt.toLocalDate());
  }

  public static void timeToDoThings(Period between){
    System.out.println("There are " + between.getYears() + " years, " + between.getMonths() + " months and "
    + between.getDays() + " days, for this thing to do");
  }

}





