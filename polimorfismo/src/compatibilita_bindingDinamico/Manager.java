package compatibilita_bindingDinamico;

public class Manager extends Dipendente{
	
	private String dipartimento;
	
	public Manager(String nome, double salario, String dipartimento) {
		super(nome, salario);
		this.dipartimento = dipartimento;
	}

	public void cambiaDipartimento(String dipartimento) {
		this.dipartimento=dipartimento;
	}
	
	public String getDipartimento() {
		return dipartimento;
	}
	
	@Override
	public void print(){
		System.out.println("Manager: "+nome+", "+salario+", "+dipartimento);
		
	}

}
