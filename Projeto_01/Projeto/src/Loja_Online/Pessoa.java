package Loja_Online;

import java.util.Scanner;

public class Pessoa{
    Scanner inp = new Scanner(System.in);

    protected static String nome[] = new String[10];
    protected static String email[] = new String[10];
    protected static String senha[] = new String[10];
    protected static int numPess = 0;

	
//GET  
	public int getNumPess() {
		return numPess;
	}
	public String[] getNome() {
		return nome;
	}
	public String[] getEmail() {
		return email;
	}
	public String[] getSenha() {
		return senha;
	}
	
	
//CADASTRO
	void Cadastro(){
	    System.out.println("=====DIGITE SEUS DADOS=====");
	    System.out.println("Nome: ");
	    nome[numPess] = inp.nextLine();
	    System.out.println("Email: ");
	    email[numPess] = inp.nextLine();
	    System.out.println("Senha: ");
	    senha[numPess] = inp.nextLine();
	    numPess++;
	}
    
//LOGIN
    boolean Login(){
        System.out.println("====LOGIN====");
        System.out.println("Usuario(Email): ");
        String usuarioD = inp.nextLine();
        System.out.println("Senha: ");
        String senhaD = inp.nextLine();
        System.out.println("=====================");

        for (int i = 0; i < numPess; i++){
            if (email[i].equals(usuarioD) && senha[i].equals(senhaD)) {
                System.out.println("Bem-vindo " + nome[i] + "!");
                return true;
            }
        }

        System.out.println("Usuario ou senha incorretos.");
        return false;
    }
}
