	
	import javax.swing.JOptionPane;

import br.com.familia.Veiculo;
	public class Main {
	
	
	public static void main(String args[]) {
		System.out.println("Hello Guy�s");
		
		// Instanciar uma classe ela vira um objeto
		
		Carro c4 = new Carro();
	
		c4.ligar();
		/*c4.freio = false;
		
		c4.trocarMarcha(); 
		
		c4.acelerar(20);
		
		c4.desligar();*/
		
		/*
		Carro ix35 = new Carro();
		ix35.desligar();
		
		Calc ca = new calc();
		
		int total = ca.Somar(10,20)
		
		int valor2 = 200;
		
		Integer valor3 = 200;
		
		char txt = 'A';
		
		String nome = "Rafael";
		
		int[] numeros = {1,2,3,4};
		
		String[] paises = {"Brasil", "EUA", "Portugal", "Argentina", "Angola"};
		
		for(int i = 0; i < paises.lenght; i++){
		
		}
		
		for(String paises : paises){
			System.out.println(pais);
		}
			
			int e = 0;
			
			while (e < 5){
			System.out.println(paises[e]);
			e++;
			
		 }
			
	ContaCorrente c = new ContaCorrente();
	c.depositar(100);
	c.sacar();
	c.verSaldo();
	
	Procedimentos.Escrever("TESTE");
	
	*/
		
					/*
			String acao = JOptionPane.showInputDialog("Digite o tipo conta");
			
			Conta conta; 
			
			if(acao.equals("c")) {
				conta = new ContaCorrente();
			}else {
				conta= new ContaPoupanca();
			}
			conta.depositar(100);
			conta.sacar();
			conta.verSaldo();*/
		
		
		
		
		
	
	
	IDb db;
	
	String acao = JOptionPane.showInputDialog("Digite o tipo de banco");
	
	if(acao.equals ("m")) {
		db = new MySQL();
	} else {
		db = new Oracle();
	}
	
	db.conectar();
	db.desconectar();
	}
	}