package downCast;

public class Main {

	public static void main(String[] args) {
		
	
		Dipendente m =new Manager("Luca verdi",3000,"Produzione");
		Dipendente d= new Dipendente("Mario Rossi",1500);
		Manager mgr;
		m.print(); 
		
       
		Manager m1=(Manager)m;
		m1.cambiaDipartimento("IT");
		m1.print();
		
		// occorre verificare che il tipo puntato dal riferimento d 
		// sia di tipo Manager.
		
		if(d instanceof Manager)
		    mgr=(Manager)d;
		else
			System.out.println("non è di tipo Manager");
		// in questo caso si genera una ClassCastException
	}

}
