package srp;

class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		if (Cargos.DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		if (Cargos.DBA.equals(funcionario.getCargo()) || Cargos.TESTER.equals(funcionario.getCargo())) {
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		throw new RuntimeException("funcionario invalido");

	}

	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double dezOuVintePorcento(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}