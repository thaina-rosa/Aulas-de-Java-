import java.io.File;
import java.io.FileWriter;

public class Cliente{ 
	
	private String nome;
	private int idade;
	public String getNome(){
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
	
	public String salvar(){
	File fl = new File("c:\\dados\\clientes.txt");
	
		if(!fl.exists()) {
			try {
			fl.createNewFile();
			FileWriter writer = new FileWriter(fl);		
			writer.write(this.nome + " - " + this.email + " - " + this.idade);
			writer.flush();
			writer.close();
			} catch(Exception ex ) {
				return "Erro no sistema. Msg:" + ex.getMessage();		
	} 
	}
		return "Sucesso ao executar";
	}
}