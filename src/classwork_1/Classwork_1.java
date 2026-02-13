public class Main {
    public static void main(String[] args) {
    	//2
    	class Monster {
    	    String type;
    	    int health;
    	    int damage;

    	    Monster(String type, int health, int damage) {
    	        this.type = type;
    	        this.health = health;
    	        this.damage = damage;
    	    }

    	    void attack() {
    	        System.out.println(type + " атакует " + damage + " наносит урон");
    	    }

    	    void roar() {
    	        System.out.println(type + " рычит");
    	    }

    	    void specialAbility() {
    	        System.out.println(type + " Использует Ульту и гиперзаярд");
    	    }
    	}
    	
    	class Firemonster extends Monster {
    	    Firemonster() {
    	        super("Огненный монстр", 100, 10);
    	    }
    	    void specialAbility() {
    	        System.out.println("Огненный монстр бьет огнем ");
    	    }
    	}

    	class Icemonster extends Monster {
    	    Icemonster() {
    	        super("Ледяной монстр", 100, 15);
    	    }
    	    void specialAbility() {
    	        System.out.println(" Ледяной монстр бьет снегом");
    	    }
    	}

    	class Poisonmonster extends Monster {
    	    Poisonmonster() {
    	        super("Ядовитый монстр", 100, 20);
    	    }
    	    void specialAbility() {
    	        System.out.println(" Ядовитый монстр бьет ядом");
    	    }
    	}

    	public class Battle {
    	    public static void main(String[] args) {
    	        Monster monster = new Firemonster();
    	        int monsterhealth = 100;
    	        int heroDamage = 10;

    	        System.out.println("Герой бьется " + monster.type);
    	        monster.roar();

    	        while (herohealth > 0 && monster.health > 0) {
    	            System.out.println("Монстр бьет  " + heroDamage + " наносит урон");
    	            monster.health -= heroDamage;

    	            if (monster.health <= 0) {
    	                System.out.println(monster.type + "побежден");
    	                break;
    	            }

    	            monster.attack();
    	            herohealth -= monster.damage;
    	            monster.specialAbility();

    	            if (herohealth <= 0) {
    	                System.out.println("Герой умер");
    	                break;
    	            }

    	            System.out.println("Здоровье героя: " + herohealth);
    	            System.out.println("Здоровье монстра: " + monster.health);
    	        }
    	    }
    	}
    	//3
    	









   