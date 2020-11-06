package compatibilita_bindingDinamico;


public class EsercizioTeam {

	public static void main(String[] args) {
		Dipendente[] team= {
			new Dipendente("Paolo Rossi",1500),
			new Manager("Gino Bruni",3500,"Produzione"),
			new Dipendente("Luca Verdi",1300),
			new Manager("Paolo Neri",3500,"Progetto")
		};
		
		for(Dipendente dip:team) {
			dip.print();
		}
	}

}
