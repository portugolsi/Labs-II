
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sidneynogueira
 */
public class TesteRestaurante {

    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();
        
        //Adicionando itens no  Cardapio.
        cardapio.adicionarItem("Refrigerante", 3.59);
        cardapio.adicionarItem("Coxinha", 1.56);
        cardapio.adicionarItem("Bolinho", 1.34);
        cardapio.adicionarItem("Tapioca", 2.65);
        cardapio.adicionarItem("Salgadinho", 1.12);
        
        cardapio.imprimir();
        cardapio.reajusta(100);
        cardapio.imprimir();
        
        /*
        Item[] busca = cardapio.busca("inho");
        for (Item item : busca) {
            System.out.println(item.toString());
        }
        */
        
        //Imprimindo Cardapio em ordem Crescente.
        System.out.println("======CRESCENTE=========");
        cardapio.listaItensOrdemCrescente();
        System.out.println("========================\n");
        
        //Imprimindo Cardapio em ordem Decrescente.
        System.out.println("======DECRESCENTE=======");
        cardapio.listaOrdemDecrescente();
        System.out.println("========================");
        
        // Instanciando conta A e fazendo Pedidos.
        Conta contaA = new Conta();
        
        Pedido pedidoContaA1 = cardapio.fazerPedido("Bolinho", 2);
        Pedido pedidoContaA2 = cardapio.fazerPedido("Coxinha", 3);
        Pedido pedidoContaA3 = cardapio.fazerPedido("Refrigerante", 5);
        
        contaA.adicionar(pedidoContaA1);
        contaA.adicionar(pedidoContaA2);
        contaA.adicionar(pedidoContaA3);
        
        //Imprimindo Total da Conta A.
        System.out.println("\nTotal da Conta A: " + contaA.getTotal());
        
        // Instanciando conta B e fazendo Pedidos.
        Conta contaB = new Conta();
        
        Pedido pedidoContaB1 = cardapio.fazerPedido("Tapioca", 3);
        Pedido pedidoContaB2 = cardapio.fazerPedido("Salgadinho", 2);
        Pedido pedidoContaB3 = cardapio.fazerPedido("Refrigerante", 5);
        
        contaB.adicionar(pedidoContaB1);
        contaB.adicionar(pedidoContaB2);
        contaB.adicionar(pedidoContaB3);
        
        //Imprimindo Total da Conta B. <-- Estava conta A, ajeitei.
        System.out.println("\nTotal da Conta B: " + contaB.getTotal());
        
        //Juntando os pedidos das Contas A e B numa mesma Conta C.
        System.out.println("========================\n");
        Conta contaC = contaA.juntaContas(contaB);
       
        
        contaC.imprimir();
        System.out.println("\nTotal da Conta C: " + contaC.getTotal());

    }

}
