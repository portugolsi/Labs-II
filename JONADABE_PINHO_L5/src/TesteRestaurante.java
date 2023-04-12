
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SuperGeeks
 */
public class TesteRestaurante {
    
    public static void main(String [] args){
        
    Cardapio cardapio1 = new Cardapio();
    Cardapio cardapio2 = new Cardapio();
    Cardapio cardapio3 = new Cardapio();
    
    cardapio1.adicionarItem("feijão", 10);
    cardapio1.adicionarItem("Macarrão", 7);
    cardapio1.adicionarItem("Arroz", 9);

    cardapio2.adicionarItem("Arroz", 9);
    cardapio2.adicionarItem("feijão", 10);
    cardapio2.adicionarItem("Macarrão", 7);
    
    cardapio3.adicionarItem("Arroz", 9);
    cardapio3.adicionarItem("feijão", 10);
    cardapio3.adicionarItem("Suco", 3);
    
    
    System.out.println(cardapio1.equals(cardapio2));
    System.out.println(cardapio2.equals(cardapio3));
    
    
    ContaEspecial conta1 = new ContaEspecial(); 
    ContaEspecial conta2 = new ContaEspecial();
    ContaNormal conta3 = new ContaNormal();
    ContaNormal conta4 = new ContaNormal();
    
    conta1.adicionar(cardapio1.fazerPedido("feijão",3));
    conta1.adicionar(cardapio1.fazerPedido("Macarrão",5));
    
    conta2.adicionar(cardapio1.fazerPedido("Arroz",1));
    conta2.adicionar(cardapio1.fazerPedido("Macarrão",3));

    conta3.adicionar(cardapio3.fazerPedido("Suco", 2));
    conta3.adicionar(cardapio3.fazerPedido("feijão", 2));
    
    conta4.adicionar(cardapio2.fazerPedido("feijão", 1));
    conta4.adicionar(cardapio3.fazerPedido("Suco", 2));
    
    
    ArrayList<ContaAbstrata> contas = new ArrayList();
    contas.add(conta1);
    contas.add(conta2);
    contas.add(conta3);
    contas.add(conta4);
    
    for (ContaAbstrata conta : contas){
        System.out.println(conta.taxaServico());
    }
    
    
    }
    


}
