public class Main {
    public static void main(String[] args) {
    	//1
    	class Dragon {
    	    String name;
    	    int health;
    	    double firePower;
    	    boolean canFly;

    	    public Dragon(String name, int health, double firePower, boolean canFly) {
    	        this.name = name;
    	        this.health = health;
    	        this.firePower = firePower;
    	        this.canFly = canFly;
    	    }

    	    void breatheFire() {
    	        System.out.println(name + " дышит огнём с силой " + firePower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    //2
    	class Vampir {

    	    String name;
    	    int health;
    	    double bloodpower;
    	    boolean canbite;

    	    public Vampir(String name, int health, double bloodpower, boolean canbite) {
    	        this.name = name;
    	        this.health = health;
    	        this.bloodpower = bloodpower;
    	        this.canbite = canbite;
    	    }

    	    void takeblood() {
    	        System.out.println(name + " кусает клыками с силью крови " + bloodpower );
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//3
    	class zombie {

    	    String name;
    	    int health;
    	    double listiningpower;
    	    boolean Canshout;

    	    public zombie(String name, int health, double listiningpower, boolean Canshout) {
    	        this.name = name;
    	        this.health = health;
    	        this.lfirePower;
    	        this.canFly = canFly;
    	    }

    	    void breatheFire() {
    	        System.out.println(name + " );
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//4
    	class witch {

    	    String name;
    	    int health;
    	    double CastspeelPower;
    	    boolean canFly;

    	    public Witch(String name, int health, double CastspeelPower, boolean canFly) {
    	        this.name = name;
    	        this.health = health;
    	        this.CastspeelPower = CastspeelPower ;
    	        this.canFly = canFly;
    	    }

    	    void Cursespower() {
    	        System.out.println(name + " делает проклятие и колдует " + CastspeelPower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//5
    	class Frankestein {

    	    String name;
    	    int health;
    	    double Hittinghamer;
    	    boolean Sterngtpower;

    	    public Frankestein(String name, int health, double Hitiinghamer, boolean Strenghtpower) {
    	        this.name = name;
    	        this.health = health;
    	        this.Hittinghamer = Hittinghamer;
    	        this.Sterngtpower = Sterngtpower;
    	    }

    	    void Hiitwithhammer() {
    	        System.out.println(name + " Бьет мошно молотком " + Sterngtpower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//7
    	class Skelet {

    	    String name;
    	    int health;
    	    double Shootbowpower;
    	    boolean Cansawagery;

    	    public Dragon(String name, int health, double Shootbowpower, boolean Cansagery) {
    	        this.name = name;
    	        this.health = health;
    	        this.Shootbowpower = Shootbowpower ;
    	        this.Cansawagery = Cansawagery;
    	    }

    	    void Shootarrows() {
    	        System.out.println(name + " стреялет с лука и меткий " + Shootbowpower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//8
    	class Robber {

    	    String name;
    	    int health;
    	    double Fastpower;
    	    boolean cankill;

    	    public Dragon(String name, int health, double Fastpower, boolean cankill) {
    	        this.name = name;
    	        this.health = health;
    	        this.Fastpower = Fastpower;
    	        this.cankill = cankill;
    	    }

    	    void killpeople() {
    	        System.out.println(name + " огробляет и убивает мирных жителей " + Fastpower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//9
    	class Gast {

    	    String name;
    	    int health;
    	    double firePower;
    	    boolean canFly;

    	    public Gast(String name, int health, double firePower, boolean canFly) {
    	        this.name = name;
    	        this.health = health;
    	        this.firePower = firePower;
    	        this.canFly = canFly;
    	    }

    	    void breatheFire() {
    	        System.out.println(name + " кидает огонем и летает " + firePower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    	//10
    	class Enderman {

    	    String name;
    	    int health;
    	    double Takelandpower;
    	    boolean canteleport;

    	    public Enderman(String name, int health, double Takelanderpower, boolean canteleport) {
    	        this.name = name;
    	        this.health = health;
    	        this.Takelandpower = Takelandpower;
    	        this.canteleport = canteleport;
    	    }

    	    void Teleportstrnght() {
    	        System.out.println(name + " Телерпортируется и берет блоки " + Takelandpower);
    	    }

    	    void takeDamage(int damage) {
    	        health -= damage;
    	    }

    	    boolean isAlive() {
    	        return health > 0;
    	    }
    	}
    }
    }
