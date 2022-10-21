package app.rh;

public class RHApp {

	public static void main(String[] args) {

		Funcionarios f1 = new Funcionarios(230, "Francisco Merli", 2058);
		Funcionarios f2 = new Funcionarios(231, "Chico da Tiana", 2523);
		Funcionarios f3 = new Funcionarios(232, "Hermano Silva", 2000);

		Departamento dept = new Departamento("Education");

		dept.adicionarFuncionario(f1);
		dept.adicionarFuncionario(f2);
		dept.adicionarFuncionario(f3);
		dept.adicionarFuncionario(new Funcionarios(233, "Maria Fonseca", 2566));

		Funcionarios[] efetivoDeFuncionarios = dept.obterFuncionarios();

		for (Funcionarios funcionario : efetivoDeFuncionarios) {
			System.out.println(funcionario);
		}

		System.out.println("Total: " + dept.obterTotalDeSalario());
		
		System.out.println("Média de Salário: " + dept.obterSalarioMedio());
		
		System.out.println("Indentificado " + dept.obterFuncionariosPorID(232));
		
		
	}

}
