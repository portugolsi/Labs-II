
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SuperGeeks
 */
public abstract class ContaAbstrata{
   
    private double taxaServico;
    private ArrayList<Pedido> pedidos;
    
    
    public void adicionar(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public double getTotal(){
        double total=0.0;
        for(Pedido p : this.pedidos){
            total += p.total();
        }
        return total;
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
    
    public double taxaServico(){
        return this.taxaServico;
    }
}
