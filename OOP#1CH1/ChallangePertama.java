class ChallangePertama {
  public static void main (String[] args) {
    Cat meu = new Cat("Hitam", 4);
    meu.show_identity();
    
    Fish nemo = new Fish("Nemo", "Rumput Laut");
    nemo.show_identity();
    
    Flower mawar = new Flower("Mawar", "Merah", 3);
    mawar.show_identity();
    
    Car bmw = new Car("BMW", "Silver", 4);
    bmw.show_identity();
  }
}

class Cat {
    // Attribute
    protected String fur_color = "";
    protected int num_of_leg = 0;
    
    // Constructor
    public Cat(String fur_color, int num_of_leg) {
      this.fur_color = fur_color;
      this.num_of_leg = num_of_leg;
    }
    
    // Method
    public void show_identity() {
      System.out.println("Saya Kucing dengan detail, Warna Bulu: " + fur_color + " dengan jumlah kaki: " + num_of_leg);
    }
}

class Fish {
    // Attribute
    protected String type = "";
    protected String feed = "";
    
    // Constructor
    public Fish(String type, String feed) {
      this.type = type;
      this.feed = feed;
    }
    
    // Method
    public void show_identity() {
      System.out.println("Saya Ikan dengan detail, Jenis: " + type + ", makanan: " + feed);
    }
}

class Flower {
    // Attribute
    protected String nama = "";
    protected String color = "";
    protected int num_of_petal = 0;
    
    // Constructor
    public Flower(String nama, String color, int num_of_petal) {
      this.nama = nama;
      this.color = color;
      this.num_of_petal = num_of_petal;
    }
    
    // Method
    public void show_identity() {
      System.out.println("Saya Bunga dengan detail, Jenis: " + nama + ", warna: " + color + " num of petal: "+ num_of_petal);
    }
}

class Car{
    // Attribute
    protected String type = "";
    protected String color = "";
    protected int num_of_tire = 0;
    
    // Constructor
    public Car(String type, String color, int num_of_tire) {
      this.type = type;
      this.color = color;
      this.num_of_tire = num_of_tire;
    }
    
    // Method
    public void show_identity() {
      System.out.println("Saya mobil dengan detail, Tipe: " + type + ", Warna: " + color + ", num of tire: "+ num_of_tire);
    }
}