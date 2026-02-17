public class Main {
    public static void main(String[] args) {
//1
    	class Superhero {
    	    String name;
    	    int powerlevel;
    	    String secretIdentity;
    	    boolean isgood;

    	    Superhero(String name, int powerlevel, String secretIdentity, boolean isgood) {
    	        this.name = name;
    	        this.powerlevel = powerlevel;
    	        this.secretIdentity = secretIdentity;
    	        this.isgood = isgood;
    	    }

    	    void showheroCard() {
    	        System.out.println("Имя:" + name + 
    	                           "Сила:" + powerlevel + 
    	                           "Секретная личность:" + secretIdentity + 
    	                           "Добрый герой:" + isgood);
    	    }

    	    void usePower() {
    	        System.out.println("Герой " + name + " использует силу  " + powerlevel);
    	    }

    	    void goodorbadchoice() {
    	        if (isgood && Math.random() > 1) {
    	            System.out.println(name + " стал злодеем");
    	            isgood = true; 
    	        }
    	    }
    	}
//2
    	class Animal {
    	    String name;
    	    int age;

    	    Animal(String name, int age) {
    	        this.name = name;
    	        this.age = age;
    	      
    	    }

    	    void sound() {
    	        System.out.println(name + "мяу");
    	    }
//3
    	   // ?
    	    		//4
    	    abstract class Musician {
    	        String name;
    	        int experienceyears;

    	        Musician(String name, int experienceyears) {
    	            this.name = name;
    	            this.experienceyears = experienceyears;
    	        }
    	        abstract void playinstrument();
    	    }
//5
    	    class Book {
    	        String title;
    	        String author;
    	        int year;
    	        boolean isavailable = true;

    	        Book(String title, String author, int year) {
    	            this.title = title;
    	            this.author = author;
    	            this.year = year;
    	        }
    	    }

//6
    	    



   