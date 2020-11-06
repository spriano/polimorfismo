package override;

public class Main {

	public static void main(String[] args) {
		Dipendente d=new Dipendente("Paolo Rossi",1500);
		Manager m =new Manager("Luc verdi",3000,"IT");
		d.print();
		m.print(); // metodo sovrascritto

	}

}
