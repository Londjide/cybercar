package admin.finance;

import javafx.beans.property.SimpleStringProperty;

public class panierData 
{

	

	private final SimpleStringProperty nomVoiture;
	
	private final SimpleStringProperty quantityVoiture;
	
	
	 
	
	panierData(String nCar, String quantity) {
		
		this.nomVoiture = new SimpleStringProperty(nCar);
		this.quantityVoiture = new SimpleStringProperty(quantity);
		
	}
	 
	
	public String getNomVoiture()
	{
		return nomVoiture.get();
		
	}
	
	public void setNomVoiture(String nCar)
	{
		nomVoiture.set(nCar);
		
	}
	
	public String getQuantityVoiture()
	{
		return quantityVoiture.get();
		
	}

	public void setQuantityVoiture(String quantity)
	{
		nomVoiture.set(quantity);
		
	}

	
	
	
	
}
