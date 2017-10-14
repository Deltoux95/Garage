import java.util.List;

public class Vehicule {
	
	private double prix;
	private String nom;
	private List<Options> listOfOptions;
	private Marque marque;
	
	Vehicule ()
	{
		
	}
	
	public String toString()
	{
		String str = " La voiture de marque " + marque.values() + " coutant " + prix +  " au doux nom de " + nom + " possedant les options : ";
		
		for (Options options : listOfOptions )
		{
			str =  str + "  - " + options.toString();
		}
		return str;
		
		
	}

}
