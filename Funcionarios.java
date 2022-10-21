package app.rh;

public class Funcionarios {

	private int ID;
	private String name;
	private double salario;

	public Funcionarios(int iD, String name, double salario) {
		this.ID = iD;
		this.name = name;
		this.salario = salario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario: " + getID() + " " + getName() + " " + getSalario();
	}

}
