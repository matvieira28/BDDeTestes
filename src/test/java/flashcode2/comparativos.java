package flashcode2;

import java.util.Scanner;

public class comparativos {

	

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo a Pizzaria Italia");
		System.out.println("");
		System.out.println("A melhor Pizzaria Italiana de S�o Paulo");
		System.out.println("");
		System.out.println("Aten��o entregas somente por retirada e pagamentos somente em avista em dinheiro");
		System.out.println("");
		System.out.println("Fa�a seu pedido pelo chat ou entre em contato conosco : 9999-9999");
		System.out.println("");
		System.out.println("No cardapio de hoje temos os seguintes sabores: Calabresa, Mussarela, Atum, Portuquesa, 4 queijos. ");
		System.out.println("");
		System.out.println("Para mais detalhes da Pizza digite: Igredientes");
		System.out.println("");
		
		
		
		
		String Sabor =  sc.next();
		  
	    switch (Sabor) {
	    	
	    case "Igredientes":
	    	
	    	System.out.println("");
	    	System.out.println("[Mussarela] - Oregano, mussarela, azeitona e tomate");
	    	System.out.println("");
	    	System.out.println("[Portuguesa] - Presunto, cebola, ovos e mussarela");
	    	System.out.println("");
	    	System.out.println("[Atum] - Cebola, mussarela e atum");
	    	System.out.println("");
	    	System.out.println("[Calabresa] - Calabresa e cebola fatiada");
	    	System.out.println("");
	    	System.out.println("[4Queijos] - Mussarela, catupiry, parmes�o e provolone");
	    	System.out.println("");
	    	System.out.println("Digite o Sabor:");
	    	
	    	break; 
		
		
	    }
		
		
		
        String Pizzaria =  sc.next();
	    
	    switch (Pizzaria) {
	    
	    case "Calabresa":
	    	System.out.println("");
	    	System.out.println("Com o Sabor Escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 op��es:");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- M�dio");
	    	System.out.println("(C)- Grande");
	    	
	    	
	    	
	    	
	    	break;
	    	
	    case "Mussarela":
	    	    System.out.println("");
	    	    System.out.println("Muito bem escolhido");
		    	System.out.println("");
		    	System.out.println("Agora vamos de tamanhos");
		    	System.out.println("");
		    	System.out.println("Temos 3 op��es:");
		    	System.out.println("");
		    	System.out.println("(A)- Pequeno");
		    	System.out.println("(B)- M�dio");
		    	System.out.println("(C)- Grande");
		    	
	    	
	    	
	    
	    break;
	    
	    
	   
	   
	    case "Atum":
	    	System.out.println("");
	    	System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 op��es:");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- M�dio");
	    	System.out.println("(C)- Grande");
	    	
	    break;
	    

	    case "Portuguesa":
	    	System.out.println("");
            System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 op��es:");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- M�dio");
	    	System.out.println("(C)- Grande");
	    	
	    	break;
	    	
	    case "4Queijos":
	    	System.out.println("");
	    	System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 op��es:");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- M�dio");
	    	System.out.println("(C)- Grande");
	    	break; 
	    	
	    	
	    	
	    }
		  
	    
	   
	  
		String Tamanhos =  sc.next();
	  
	    switch (Tamanhos) {
    
    case "A":
    	
    	System.out.println("");	
        System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
       	
	    
	    break; 

	       
    case "B":
    	
    	System.out.println("");	
        System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
       	
	    break; 
	    
	    
  case "C":
     System.out.println("");	
     System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
    	
	    
	    break; 
	    
	    
	    }
	    
	    
	    String Borda =  sc.next();
		  
	    switch (Borda) {
    
    case "Sim":
    	
    	System.out.println("Beleza, recheio adicionado");
    	System.out.println("");
    	System.out.println("Falta pouco agora");
    	System.out.println("");
    	System.out.println("Escolha a forma de pagamento");
    	System.out.println("");
	    System.out.println("Cart�o de credito ");
        System.out.println("");
        System.out.println("Pix");
	    
	    
	    break; 
	    	
    case "N�o":
    	System.out.println(" Sem recheio,como desejar!");
    	System.out.println("");
    	System.out.println("Falta pouco agora");
    	System.out.println("");
    	System.out.println("Escolha a forma de pagamento:");
	    System.out.println("");
	    System.out.println("Cart�o");
        System.out.println("");
        System.out.println("Pix");
	    
	}
	    String Pagamento =  sc.next();
		  
	    switch (Pagamento) {
    
    case "Cart�o":
    	
    	System.out.println("Insira o Cart�o e digite a senha:");
    	
	    break;
	    
	    }
         int Cartão = sc.nextInt();   
	    
	 	

		if (Cartão ==1803 ) {
			System.out.println("Transa��o Aceita");
			System.out.println("Sua pizza ficar� pronta em 40 minutos");
	    	System.out.println("O endere�o para retirada:Av. Marta Maria Bernades n�1527 - S�o Paulo.");
		    System.out.println("Para fazer receber seu pedido apresente esse codigo 73056");

		    
		    
		    
		}else {
			System.out.println("Senha incorreta, tente novamente");
	    
	    
	  

		
		}
		
		
		
		

			

		}
		}



 
		
	


	    

