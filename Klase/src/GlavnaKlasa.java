
public class GlavnaKlasa {

	public static void main(String[] args) {
		
		
		
		Car automobil = new Car (); //instanca klase >Car
         
		automobil.boja = "crvena";
		automobil.cena = 150000;
		automobil.kubikaza = 4.8;
		automobil.marka = "ferari";
		automobil.model = "La ferara";
		automobil.daljinskoZakljucavanje = true;
		
		System.out.println("Napraviosam auto marke" + automobil.marka);
		System.out.println("Model je:" + automobil.model);
	    System.out.println("Boje je:" + automobil.boja);
	    System.out.println("Koji kosta:"+ automobil.cena + "evra");
	    System.out.println("I koji ima:" + automobil.kubikaza + "L");
	    System.out.println("Daljinsko zakljucavanje:" + automobil.daljinskoZakljucavanje);
	    
	    
	    
	    Car automobil2 = new Car();
	    automobil2.marka = "Mc laren";
	    automobil2.model = "Sena";
	    
	    System.out.println("Najbrzi auto je " +automobil2.marka +" " + automobil2.model  );
	
	
	
	
	
	}
	
	
	
	


}
