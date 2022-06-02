import java.util.Scanner;

public class Pizzas {

	static Scanner sc = new Scanner(System.in);
	public static void main (String []args) {
		
		
	System.out.println("Bem vindo a pizzaria Italia");
	System.out.println("");
	System.out.println("A melhor pizzaria de São Paulo");
	System.out.println("");
	System.out.println("Tamanhos P, M e G");
	System.out.println("");
	System.out.println("Sabores: Mussarela, Calabresa,Atum,4 quiejos,Portuguesa");
	System.out.println("");
	System.out.println("Aceitamos pagamento á vista no dinheiro. Somente Retirada."
			+"Para mais informações ligue ligue:0000-0000.");
	System.out.println("");
	System.out.println("Digite o sabor");
	
	
	String Sabores = sc.next();
	
	switch (Sabores) {
	
	
	
	case "Mussarela":
	    System.out.println("Boa escolha!");
	break;
	
	case "Calabresa":
		System.out.println("Otimo pidida!");
    break;
    
	case "Atum":
		System.out.println("excelente!");
    break;
	
	case "4 queijos":
		System.out.println("Perfeito!");
	break;
	
	case "Portuguesa":
		System.out.println("Correto!");
    break;
    
    
   	
	}
	
	System.out.println("Qual o tamanho");
	
	String Tamanho = sc.next();
	
	switch (Tamanho) {
	
	case "P":
		System.out.println("Está 10,00");
		break;
	case "M":
		System.out.println("Está 20,00");
		break;
	case "G":
		System.out.println("Está 30,00");
		break;
				
		
	
	}
	
	System.out.println("Seu pedido está sendo preparado, avisaremos quando estiver pronto! ;)");
	
	
	
	}
		
		
	}
	
	
	

