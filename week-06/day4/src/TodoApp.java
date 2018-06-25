import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TodoApp {

   private static String todoFilePath = "TodoList";
   private static List<String> thingsToDo;

  public static void main(String[] args) {

    thingsToDo = new ArrayList<>();
    argsChecker(args);

    LocalDateTime createdAt = LocalDateTime.now();
    LocalDateTime completedAt = LocalDateTime.of(2019, 11, 9, 22, 15);

    System.out.println(timeToDoThings(complitionTime(createdAt, completedAt)));

  }

  public static String timeToDoThings(Period between){
    return ("There are " + between.getYears() + " years, " + between.getMonths() + " months and "
            + between.getDays() + " days, for this thing to do");
  }

  public static Period complitionTime(LocalDateTime createdAt, LocalDateTime completedAt){
    return Period.between(createdAt.toLocalDate(), completedAt.toLocalDate());
  }

  public static void argsChecker(String[] args) {
    if(args.length == 0){
      printCLArguments();
    }else if(args[0].equals("-l")) {
      listThingsToDo();
    }else if(args[0].equals("-a")){
      addThingToDo(args);
    }else if(args[0].equals("-r")){
      removeThingToDo(args);
      }
    }

  public static List<String> fileReader(String path) {
    List<String> lines = new ArrayList<>();
    try {
      Path filepath = Paths.get(path);
      lines = Files.readAllLines(filepath);
    } catch (Exception e) {
      System.out.println("File reading is not working");
    }
    return lines;
  }

  public static void fileWriter(){
    try{
      Path filepath = Paths.get(todoFilePath);
      Files.write(filepath, thingsToDo);
    }catch(Exception e){
      System.out.println("Could not write file");
    }
  }

  public static void printCLArguments(){
    System.out.println("Command Line Todo application\n=============================\n\nCommand line arguments:\n" +
            "-l   Lists all the tasks\n" + "-a   Adds a new task\n-r   Removes a task\n-c   Completes a task");
  }

  public static void listThingsToDo(){
    thingsToDo = fileReader(todoFilePath);
    if(thingsToDo.size() != 0) {
      for (int i = 0; i < thingsToDo.size() ; i++) {
        System.out.println(thingsToDo.get(i));
      }
    }else {
      System.out.println("No things to do today! :)");
    }
  }

  public static void addThingToDo(String[] args){
    if (!args[1].isEmpty()) {
      addToList(args[1]);
      fileWriter();
    }
  }

  public static void removeThingToDo(String[] args) {
    thingsToDo = fileReader(todoFilePath);
    if (thingsToDo.size() >= 2) {
      thingsToDo.remove(Integer.parseInt(args[1]) - 1);
      fileWriter();
    }
  }

  public static void addToList (String input) {
    Todo todo = new Todo();
    String objectToDo = todo.toString();
    thingsToDo = fileReader(todoFilePath);
    String listOfThingsToDo = ((thingsToDo.size()) + 1) + " - " + "[ ] " + input;
    thingsToDo.add(objectToDo);
  }
}




