/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class Pedido {
    private Item item;
    private int quantidade;
    
    
    public Pedido(Item item, int quantidade){
        this.item = item;
        this.quantidade = quantidade;
    }
        
    public double total(){
        return this.item.getPreco()*quantidade;
    }
    
    void imprimir(){
        String nome = this.item.getNome();
        double preco = this.item.getPreco();
        System.out.println("Pedido = {"+nome+","+preco+","+this.quantidade+"}");
    }
    
}
