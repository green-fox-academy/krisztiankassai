import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoApp {

   private static String todofilepath = "TodoList";
   private static List<String> thingsToDo;

  public static void main(String[] args) {

    thingsToDo = new ArrayList<>();

    argsChecker(args);
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
      Path filepath = Paths.get(todofilepath);
      Files.write(filepath, thingsToDo);
    }catch(Exception e){
      System.out.println("Could not write file");
    }
  }

  public static void printCLArguments(){
    System.out.println("Command Line Todo application");
    System.out.println("=============================\n");
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes a task");
    System.out.println("-c   Completes a task");
  }
  public static void listThingsToDo(){
    thingsToDo = fileReader(todofilepath);
    if(thingsToDo.size() != 0) {
      System.out.println(thingsToDo.toString());
    }else {
      System.out.println("No things to do today! :)");
    }
  }
  public static void addThingToDo(String[] args){
    addToList(args[1]);
    fileWriter();
  }
  public static void removeThingToDo(String[] args) {
    if (thingsToDo.size() >= 2) {
      thingsToDo.remove(args[1]);
    }
  }
  public static void addToList (String input) {
    String listOfThingsToDo = (Integer.toString(thingsToDo.size()) + 1) + " - " + "[ ] " + input;
    thingsToDo.add(listOfThingsToDo);
  }
}




