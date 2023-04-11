public class Cryptomonaie
{
	private String nom;
	private double valeurDeJeton; //en euro
	
	public Cryptomonaie (String nom, double valeurDeJeton)
	{
		this.nom = nom ;
		this.valeurDeJeton = valeurDeJeton ;
	}
	public String getNom()
	{
		return nom ;
	}
	public double getValeurDeJeton()
	{
		return valeurDeJeton ;
	}
	@Override
	public String toString()
	{
		return String.format("%5s",nom)+":"+String.format("%10.1f",valeurDeJeton);
	}
}
