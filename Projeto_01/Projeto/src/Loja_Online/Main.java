package Loja_Online;

import java.util.Scanner;

public class Main{

	static Scanner inp = new Scanner(System.in);
	

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		Pessoa_Vr pv = new Pessoa_Vr();
		Local l = new Local();

		int opc = 0;
		int opc1 = 0;
		
//MENU
		do{
			opc = menu(opc);
			
//CADASTRO
			if(opc == 1){
				p.Cadastro();
				
//LOGIN
			}else if(opc == 2){				
				if(p.Login()) 
				{	
//MENU 2
					do{
						opc1 = menu2(opc1);
							
						if(opc1 == 1){
							l.Buscar();
							
						}else if(opc1 == 2){
							if(pv.Login()){
								
//MENU 3
								do{
									opc1 = menu3(opc1);
									
									if(opc1 == 1){
										l.Buscar();
									}else if(opc1 == 2){
										l.Adicionar();
									}
								}while(opc1 != 3);
								
							}
						}
							
		
						
					}while(opc1 != 3);
			
				}
			}
	
		}while(opc != 3);
	}

	public static int menu(int opc){

		System.out.println("=====================");
		System.out.println("1-CADASTRAR");
		System.out.println("2-LOGIN");
		System.out.println("3-SAIR");
		opc = inp.nextInt();

		return opc;
	}


	public static int menu2(int opc1){

		System.out.println("=====================");
		System.out.println("1-ENCONTRAR LOCAL");
		System.out.println("2-VERIFICAR-SE");
		System.out.println("3-DESLOGAR");
		opc1 = inp.nextInt();

		return opc1;
	}

	public static int menu3(int opc1){

		System.out.println("=====================");
		System.out.println("1-ENCONTRAR LOCAL");
		System.out.println("2-ADICIONAR LOCAL");
		System.out.println("3-DESLOGAR");
		opc1 = inp.nextInt();

		return opc1;
	}
}
