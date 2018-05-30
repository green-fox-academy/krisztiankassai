public class Plant {
  private String name;
  private String color;
  private double waterLevel;


  public Plant(String name, String color, double waterLevel) {
    this.name = name;
    this.color = color;
    this.waterLevel = waterLevel;
  }
  public Plant(){
    this("Plant", "white", 0);
  }
  public void watering(int water){
    waterLevel += water;
  }
  public void needsWater(){
    System.out.println("The " + color + " " + name + " needs water.");
    }
  public void noWaterNeeded(){
    System.out.println("The " + color + " " + name + "doesn't need water.");

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
}
