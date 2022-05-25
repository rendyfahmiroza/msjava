class ChallangeKetiga {
  public static void main (String[] args) {
    Vehicle vh = new Vehicle("Gerobak", "no engine");
    vh.identify_myself();
    
    Bikes bike = new Bikes("Pedal Bikes", "no engines", 2);
    bike.identify_myself();
  }
}

class Vehicle {
  protected String name;
  protected String with_engine;
  
  public Vehicle(String name, String with_engine) {
    this.name = name;
    this.with_engine = with_engine;
  }
  
  public void identify_myself () {
    System.out.println("Hi I'm Parent of All Vehicles, My Name is "+ name + ", My Engine Status is '"+ with_engine+"'");
  }
}

class Bikes extends Vehicle {
  protected int wheel_count = 0;
  
  public Bikes(String name, String with_engine, int wheel_count) {
    super(name, with_engine);
    this.wheel_count = wheel_count;
  }
  
  public void identify_myself () {
    System.out.println("Hi I'm Bike, My Name is "+ name + ", My Engine Status is '"+ with_engine+"', I have "+ wheel_count +" Wheel (s)");
  }
}

class Cars extends Vehicle {
  protected int wheel_count = 0;
  protected String engine_type;
  
  public Cars(String name, String with_engine, int wheel_count, String engine_type) {
    super(name, with_engine);
    this.wheel_count = wheel_count;
    this.engine_type = engine_type;
  }
}

class Buses extends Vehicle {
  protected int wheel_count = 0;
  protected boolean private_bus;
  
  public Buses(String name, String with_engine, int wheel_count, boolean private_bus) {
    super(name, with_engine);
    this.wheel_count = wheel_count;
    this.private_bus = private_bus;
  }
}