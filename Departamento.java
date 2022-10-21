package app.rh;

public class Departamento {
	private String name;

	private Funcionarios[] funcionario = new Funcionarios[10];

	private int ultimoFuncionarioAdicionado = -1;

	public Departamento(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Uso da variável ultimoFuncionarioAdicionado, é para indicar a posição no
	 * array do último funcionario que foi adicionado. O primeiro funcionario
	 * adicionado estará na posição 0, será definido como negativo 1 inicialmente.
	 * Ao adicionar um novo funcionário à matriz de funcionários, considere o
	 * comprimento da matriz. Este método de adição de funcionários, vai para de
	 * adicionar funcionários quando atingir a capacidade(10) do array de
	 * funcionários.
	 */
	public void adicionarFuncionario(Funcionarios umFuncionario) {

		if (ultimoFuncionarioAdicionado < funcionario.length) {
			ultimoFuncionarioAdicionado++;
			funcionario[ultimoFuncionarioAdicionado] = umFuncionario;
		}
	}

	/*
	 * Retorno matriz de todos os Funcionários do Departamento, a matriz não deve
	 * conter valores nulos, O obterFuncionarios() é público, e retorna um array de
	 * Funcionários Ao criar um novo array chamado efetivoDeFuncionarios, esta
	 * configurado para (efetivoDeFuncionarios.length; i++). Mesmo que a matriz de
	 * funcionários seja provisionada ou configurada para ter 10 elementos e vários
	 * deles sejam nulos, apenas dois têm valores válidos, o array esta configurado
	 * para espelhar esses dois.
	 */
	public Funcionarios[] obterFuncionarios() {
		Funcionarios[] efetivoDeFuncionarios = new Funcionarios[ultimoFuncionarioAdicionado + 1];

		for (int i = 0; i < efetivoDeFuncionarios.length; i++) {
			efetivoDeFuncionarios[i] = funcionario[i];
		}
		return efetivoDeFuncionarios;
	}

	/*
	 * O método retorna o número de Funcionários atualmente no Departamento, obtendo
	 * a contagem de funcionários, a variável (ultimoFuncionarioAdicionado) indica a
	 * última posição válida.
	 */
	public int obterFuncionariosEContar() {
		return ultimoFuncionarioAdicionado + 1;
	}

	/*
	 * Método de consulta para localizar um funcionário com id específico deste
	 * departamento.
	 */
	public Funcionarios obterFuncionariosPorID(int funcId) {

		for (Funcionarios func : funcionario) {
			if (func != null) {
				if (func.getID() == (funcId)) {
					return func;
				}
			}
		}
		return null;
	}

	/*
	 * ultimoFuncionarioAdicionado começou em 1 negativo e foi para 0 para o
	 * primeiro, depois foi para 1 para o segundo. Então, agora,
	 * ultimoFuncionarioAdicionado é o índice correto para o índice mais alto. Ao
	 * fazer loop para int i igual a 0 enquanto i for menor que o
	 * ultimoFuncionarioAdicionado. Assim que se torna igual a ele, é parado. Então
	 * i começa em 0, obtemos o salário do primeiro funcionário, é adicionado em
	 * totalSalario, ai vai para o próximo, i se torna 1. Agora,
	 * ultimoFuncionarioAdicionado é 1. Então i é igual a 1, i menor que
	 * ultimoFuncionarioAdicionado.
	 */

	public double obterTotalDeSalario() {

		double totalSalario = 0.0;
		for (int i = 0; i <= ultimoFuncionarioAdicionado; i++) {
			totalSalario += funcionario[i].getSalario();
		}
		return totalSalario;
	}

	public double obterSalarioMedio() {

		if (ultimoFuncionarioAdicionado > -1) {
			return obterTotalDeSalario() / (ultimoFuncionarioAdicionado);
		}
		return 0.0;
	}

	public String toString() {
		return name;
	}

}
