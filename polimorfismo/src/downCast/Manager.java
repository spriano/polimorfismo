package downCast;

public class Manager extends Dipendente{
	
	
	public Manager(String nome, double salario, String dipartimento) {
		super(nome, salario);
		this.dipartimento = dipartimento;
	}

	private String dipartimento;
	
	public void cambiaDipartimento(String dipartimento) {
		this.dipartimento=dipartimento;
	}
	@Override
	public void print(){
		System.out.println("Manager: "+nome+", "+salario+", "+dipartimento);
		
	}

}
