package classwork_1;
public static void main(String[] args) {
	//1
}
		 public class Account {
			    private String owner;
			    private double balance;
			    public Account(String owner, double balance) {
			        this.owner = owner;
			        this.balance = balance;
			    }
			    public void deposit(double amount) {
			        if (amount > 0) {
			           balance += amount;
			            System.out.println("Денег на счет добавлено: " + amount);
			        } else {
			            System.out.println("Так столько нельзя добавить");
			        }
			    }
			    public void (double amount) {
			        if (amount > 0 && amount <= balance) {
			            balance -= amount;
			            System.out.println("Со счета снято: " + amount);
			        } else {
			            System.out.println("Столько дене у тебя нету чтобы вывести");
			        }
			    }
			    public double getBalance() {
			        return balance;
			    }
			    //2
			    public class Rectangle {
			        double width;
			        double height;
			        public Rectangle(double width, double height) {
			            this.width = width;
			            this.height = height;
			        }
			        public double area() {
			            return width * height;
			        }
			        public Rectangle scale(double factor) {
			            return new Rectangle(width * factor, height * factor);
			        }
			    }
			    //5
			    class Character {
			        String name;
			        int health;
			        int strength;
			        public Character(String name, int health, int strength) {
			            this.name = name;
			            this.health = health;
			            this.strength = strength;
			        }
			        public Character heal(int value) {
			            health += value;
			            return this;
			        }
			        public Character train() {
			            strength += 5;
			            return this;
			        }
			        public void Stats() {
			            System.out.println(name + " hp: " + health + "  strangeht: " + strength);
			        }
			    }
			    
			    //6
			    class Book {
			        String title;
			        String author;
			        int year;
			        public Book(String title, String author, int year) {
			            this.title = title;
			            this.author = author;
			            this.year = year;
			        }
			        public Book(String title, String author) {
			            this(title, author, 0);
			        }
			        public void Info() {
			          
			        }
			    }
			    //7
			    class Engine {
			        int horsepower;

			        public Engine(int horsepower) {
			            this.horsepower = horsepower;
			        }
			    }

			    class Car {
			        Engine engine;
			        String model;

			        public Car(String model, Engine engine) {
			            this.model = model;
			            this.engine = engine;
			        }
			        public void printDetails() {
			            System.out.println(model + " мощность " + engine.horsepower + " лолшадиные силы.");
			        }
			    }
			}
		 









