package compatibilita_bindingDinamico;

public class Main {

	public static void main(String[] args) {
		
		Dipendente d=new Dipendente("Paolo Rossi",1500);
		Dipendente m =new Manager("Luc verdi",3000,"Produzione");
		// d ed m sono riferimenti ad oggetti di tipo diverso ma hanno lo stesso tipo di riferimento Dipendente.
		
		d.print(); // binding dinamico, usa il metodo print() di Dipendente
		m.print(); // binding dinamico usa il metodo print() di Manage		  
	}
}
