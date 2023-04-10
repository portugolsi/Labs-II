
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class Cardapio {
    
    private ArrayList<Item> itens;

    public Cardapio() {
        this.itens = new ArrayList<Item>();
    }
    
    public void adicionarItem(String nomeItem, double valor){
        Item item = new Item(nomeItem,valor);
        this.itens.add(item);
    }
    
    public Pedido fazerPedido(String nomeItem, int quantidade){
        Pedido pedido = null;
        for (Item item : itens) {
            if(item.getNome().equals(nomeItem)){
                pedido = new Pedido(item,quantidade);
                return pedido;
            }
        }
        return pedido;
    }
    
    void imprimir(){
        System.out.println("-----------------------------------------");
        System.out.println("ITENS DO CARDAPIO");
        System.out.println("-----------------------------------------");
        for (Item i : this.itens) {
            System.out.println(i);                    
        }
        System.out.println("-----------------------------------------");
    }
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean vorf = false; // varíavel que retornar v or f
       if (obj instanceof Cardapio ){
           
           if (this.itens.size()==((Cardapio) obj).itens.size()){
               
             ArrayList<Item> itensIguais = new ArrayList<Item>();
             ArrayList<String> itensSelf = new ArrayList<String>();
             ArrayList<String> itensObj = new ArrayList<String>();
             for (int k=0;k<this.itens.size();k++){
                 itensObj.add(((Cardapio) obj).itens.get(k).getNome());
                 
             }
             
             for (int k=0;k<this.itens.size();k++){
                 itensSelf.add(this.itens.get(k).getNome());
             }
             
             Collections.sort(itensSelf);
             Collections.sort(itensObj);
             
             
             for (int k=0;k<this.itens.size();k++){
                 if (itensSelf.get(k)==itensObj.get(k)){
                     itensIguais.add(this.itens.get(k));
                 }
             }
           
               
              
               
               
               
               if (this.itens.size()==itensIguais.size()){
                   
                   vorf = true;
       
               
               }
                   
           }
           
       }
       else{
           
           vorf = false;
       }

       
       return vorf;
       
    }
    
    
    
}
