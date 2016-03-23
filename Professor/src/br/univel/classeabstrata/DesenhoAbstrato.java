package br.univel.classeabstrata;

abstract class DesenhoAbstrato  {

	public void identificar() {
		System.out.println("\n\n===================================");
		System.out.println(getNome());
		System.out.println("===================================");
		System.out.println("\n");
	}
	
	public void executar(){
		identificar();
		desenhar();
	}
	
	protected abstract String getNome();
	
	protected abstract void desenhar();
}
