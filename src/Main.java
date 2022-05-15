
public class Main {
	static  Pessoa[] listaPessoa = new Pessoa [10];
	
		public static void main(String[] args) {
			while (true) {
				System.out.println("Ola Seja bem vindo ao nosso sistema de cadastro pessoa \n");
				int op = Teclado.lerInteiro("1 - Cadastro \n" + "2 - Alteracao \n" + "3 - Exclusao \n" + "4 - Consulta \n" + "5 - Sair \n");
					switch (op) {
					
							case 1: //Cadastrar dados
								String nome = Teclado.lerString("Digite nome");
								int cpf = Teclado.lerInteiro("Digite cpf");
								String fone = Teclado.lerfone("Digite telefone");
								Pessoa p = new Pessoa(cpf, nome, fone);
								
									for(int i = 0; i < listaPessoa.length; i++) {
										if(listaPessoa[i] == null) {
											listaPessoa[i]= p;
												break;
									}
								}
						break;
						case 2: //Alteração de dados
							int cpf1 = Teclado.lerInteiro("Digite o cpf que deseja alterar");
							
								for(int i = 0; i < listaPessoa.length; i++) {
									Pessoa p2 =  listaPessoa[i];
										if(cpf1 == p2.getCpf()) {
											int cpf2 = Teclado.lerInteiro("Digite o novo cpf");
											p2.setCpf(cpf2);
												break;
										}
								}
							
						break;
						
						
						case 3: //Exclusão de dados
							int cpf3 = Teclado.lerInteiro("Digite o cpf que deseja excluir");
							
								for(int i = 0; i < listaPessoa.length; i++) {
									Pessoa p3 = listaPessoa[i];
										if(cpf3 == p3.getCpf()) {
											listaPessoa[i] = null;
												break;
									}
								}
						break;
						
						
						case 4: //Consulta os dados informados
							for(int i = 0; i < listaPessoa.length; i++) {
								Pessoa p4 = listaPessoa[i];
									if(p4 != null) {
										System.out.println(p4.verInfo());
									}
							}
						break;
						
						
						case 5: //sair da tela. 
							System.exit(0);
							
						break;		
							}
					}
			}
		}

