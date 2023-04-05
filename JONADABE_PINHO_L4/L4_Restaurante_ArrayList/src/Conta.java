
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class Conta {
    private ArrayList<Pedido> pedidos;
    
    public Conta(){
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public void adicionar(Pedido pedido){
        this.pedidos.add(pedido);
    }
        
    public void imprimir(){
        System.out.println("-----------------------------------------");
        System.out.println("PEDIDOS DA CONTA");
        System.out.println("-----------------------------------------");
        for (Pedido pedido : pedidos) {
            pedido.imprimir();
        }
        System.out.println("-----------------------------------------");
    }
    
    public double getTotal(){
        double total=0;
        for (Pedido pedido : pedidos){
            total+=pedido.total();
        }
        return total;
    }
    
    public Conta juntaContas(Conta outraConta){
        Conta contaJunta = new Conta();
        ArrayList<Pedido> pedidosConta = new ArrayList<Pedido>();
        for (Pedido pedido : pedidos){
            pedidosConta.add(pedido);
        }
        for (Pedido pedido: outraConta.pedidos){
            pedidosConta.add(pedido);
        }
       
       for (Pedido pedido:pedidosConta){
           contaJunta.adicionar(pedido);
       }
        
        return contaJunta;
    }
    
    
}
