
public class Pessoa {
	int cpf;
	String nome;
	String fone;
	
		public Pessoa (int cpf, String nome, String fone) {
			this.cpf = cpf;
			this.nome = nome;
			this.fone = fone;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String verInfo() {
			return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Fone: " + fone;
		}
		
}
