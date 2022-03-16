package Pratica1_OO;

public class EmpregadodaFaculdade {

	private String nome;
	private double salario;
	private int horasAula;
	
	int newSalary = salario * horasAula;
	
	double getGastos(){
		return newSalary;
	}
	
	String getInfo(){
	String message = "Seu salário é R$" + newSalary;
	}
	
	public void  showAll() {
		String show = "Salário =" + newSalary + "Info =" + getInfo();
		return show; 
	}

}
