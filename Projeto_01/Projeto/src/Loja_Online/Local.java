package Loja_Online;

import java.util.Scanner;

public class Local{
	Scanner inp = new Scanner(System.in);
	
	private String[] nome = new String[10];
	private String[] endereco = new String[10];
	private int numLocal = 3;
	
//PRE DEFININDO LOCAIS
	Local(){
		nome[0] = "Casarão La Villa";
		nome[1] = "Sítio Miragem";
		nome[2] = "Vale Azul Eco Espaço";
		
		endereco[0] = "Est. Santa Rita, 261 Mogi das Cruzes";
		endereco[1] = "R. São Lázaro, km 21 Mogi das Cruzes";
		endereco[2] = "Rod. Engenheiro C. do Rego Chaves, 62 Mogi das Cruzes";
	}

//BUSCANDO LOCAIS PRE DEFINIDOS
	void Buscar(){
		for(int i = 0; i < numLocal; i++) 
		{
			System.out.println("=====================");
			System.out.println(nome[i]);
			System.out.println(endereco[i]);
		}
	}
	
//ADICIONANDO NOVO LOCAL
	void Adicionar(){
		
		System.out.println("Nome do Local");
		String nNome = inp.nextLine();
		nome[numLocal] = nNome;
		
		System.out.println("Endereco do Local: ");
		String nEndereco = inp.nextLine();
		endereco[numLocal] = nEndereco;
		
		numLocal++;
		System.out.println("Local adicionado com sucesso!");
	}

}
