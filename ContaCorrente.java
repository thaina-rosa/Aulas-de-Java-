
public class ContaCorrente extends Conta {
	//Rescrever o metodo de minha classe PAI
	//Overriding
	@Override

	public void sacar(double valor){
		super.sacar(valor);
		 this.juro();
	}
	//Overloading
			public void sacar(double valor, String senha){
			
			if(senha == "123"){
				if (this.saldo >= valor) 
				this.saldo -= valor;
			else 
				System.out.println("Nao possui saldo");
				}
		}
	@Override
	protected void juro(){
		this.saldo -= 1;
	}
}