package classwork_14;
public class Chracter {
	String name;
	int health = 100;
	int level = 1;
	 
	public void Chracter(String name) {
		this.name = name;
	}
public void Damage(int Damage) {
	health = Math.max(0, health - damage);
}
public void health( int health) {
	health = Math.min(100, health + health);
}
public void Alive() {
return health > 0;
}
public void levelup() {
	level++;
}
}
