
public abstract class Conta {

	// criar atributos abaixo
		protected double saldo;
		public int conta;
		
		// Metodos 	
		//Overloading
		public void sacar(double valor, String senha){

		if (this.saldo >= valor){
			this.saldo -= valor;
		} else {
			System.out.println("Nao possui saldo");
			}
		}
		//Overloading
		public void sacar(){

			if (this.saldo >= 50){
				this.saldo -= 50;
			} else {
				System.out.println("Nao possui saldo");
				}
		}
	
		// Metodo Abstrato
		protected abstract void juro();
			
		
		public void depositar(double valor) {
			this.saldo += valor;
			if(valor ==100){
	}
		}
		public void verSaldo() {
			System.out.println("Saldo = U$$ " + this.saldo);
			
		}
		public void sacar(double valor) {
			// TODO Auto-generated method stub
			
		}
			

}
