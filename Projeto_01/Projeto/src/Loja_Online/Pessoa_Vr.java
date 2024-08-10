package Loja_Online;

import java.util.Scanner;

public class Pessoa_Vr extends Pessoa{

	Scanner inp = new Scanner(System.in);
	Pessoa pe = new Pessoa();
	
	private String cpf[] = new String[10];
	private String tel[] = new String[10];
	
	
	
//GET
	public String[] getCpf(){
		return cpf;
	}
	public String[] getTel(){
		return tel;
	}


//VERIFICAÇÃO COM CPF E TELEFONE
	boolean Login(){
		
		super.getNome();
		super.getEmail();
		super.getSenha();
		
		System.out.println("=====DIGITE SEUS DADOS=====");
		System.out.println("Nome: ");
		String nomeD = inp.nextLine();
		System.out.println("Email: ");
		String emailD = inp.nextLine();
		System.out.println("Senha: ");
		String senhaD = inp.nextLine();
		
		
		System.out.println("CPF: ");
        String cpfD = inp.nextLine();
        if (!validarCPF(cpfD)){
            System.out.println("CPF invalido");
            return false;
        }
        
        System.out.println("(DDD)Tel: ");
        String telD = inp.nextLine();
        if (!validarTel(telD)){
            System.out.println("Numero de telefone invalido");
            return false;
        }
		
		
		
		for(int i = 0; i < getNumPess(); i++){
			if(getNome()[i].equals(nomeD) && getEmail()[i].equals(emailD) && getSenha()[i].equals(senhaD)){
				
				cpf[i] = cpfD;
				tel[i] = telD;
				
				System.out.println("Verificado com sucesso!");
				System.out.println("Agora voce esta autorizado a adicionar novos locais!");
				return true;
			}
		}
		
		System.out.println("Nome, Email ou Senha incorretos");
		return false;
	}
	

//METODO DE VALIDAÇÃO DE CPF
	private boolean validarCPF(String cpf){
	
	//REMOVE CARACTERES NAO NUMERICOS
		cpf = cpf.replaceAll("\\D", "");
		
	//VERIFICA SE POSSUI 11 DIGITOS
		if(cpf.length() != 11){
			return false;
		}
		
		return true;
	}
	
//METODO DE VALIDAÇÃO DE TELEFONE
	private boolean validarTel(String telefone){
	    
	//REMOVE CARACTERES NAO NUMERICOS
	    telefone = telefone.replaceAll("\\D", "");

	//VERIFICA SE POSSUI 10 OU 11 DIGITOS
	    if (telefone.length() != 10 && telefone.length() != 11){
	        return false;
	    }
	    
	    return true;
	}
}
