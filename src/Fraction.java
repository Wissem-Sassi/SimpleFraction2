
public class Fraction {
	private int numerateur, denominateur;
	
	public Fraction(int num, int denom) {
		numerateur = num;
		denominateur = denom;
	}
	
	public String toString() {
		return "la fraction de "+numerateur +"/"+denominateur +" est egale "+ numerateur/denominateur;
	}

}
