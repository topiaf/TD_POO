package perso;


public class Enseignant extends Personne{

	private int heures;

	public Enseignant(String nom, int age, int heures) {
		super(nom, age);
		setHeures(heures);

	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}
	
	public String getMaclasse()
	{
		return "Enseignant";
		
	}

	public String toString()
	{
		return ( super.toString()+ " et travaille au moins " + this.getHeures() + " heures.");
		
	}
}
