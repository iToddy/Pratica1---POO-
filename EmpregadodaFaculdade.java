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
	String message = "Seu sal�rio � R$" + newSalary;
	}
	
	public void  showAll() {
		String show = "Sal�rio =" + newSalary + "Info =" + getInfo();
		return show; 
	}

}
