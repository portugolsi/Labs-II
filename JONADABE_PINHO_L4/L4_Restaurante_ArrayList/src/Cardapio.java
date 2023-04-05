
import java.util.ArrayList;
import java.util.Comparator;

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
    public void reajusta(double ajuste){
        for (Item item : this.itens) {
            double preco = item.getPreco();
            item.setPreco(preco+(preco*ajuste/100));
        }
    }
    
    public ArrayList<Item> busca(String str){
        ArrayList<Item> encontrados = new ArrayList<Item>();
        
        
        if (this.itens.contains(str)){
            for (Item item : this.itens) {
                if (item.getNome()==str){
                    encontrados.add(item);
                }
                
            }
       
        }
        
        return encontrados ;
    }
    
    public void listaItensOrdemCrescente(){
        ArrayList<String> ordenadosNomes = new ArrayList<String>();
        for (Item item : this.itens) {
           ordenadosNomes.add(item.getNome());         
        }
        ordenadosNomes.sort(Comparator.naturalOrder());
        for (String nome : ordenadosNomes) {
            System.out.println(nome);
            /*
            int j =0;
            for (Item item : itens){
                if (nome==itens.get(j).getNome()){
                    itensOrdenados.add(itens.get(j));
                }
                j++;
             */
            }
    }
    public void listaOrdemDecrescente(){
        ArrayList<String> ordenadosNomes = new ArrayList<String>();
        for (Item item : this.itens) {
           ordenadosNomes.add(item.getNome());         
        }
        ordenadosNomes.sort(Comparator.reverseOrder());
        for (String nome : ordenadosNomes) {
            System.out.println(nome);
        }
    }
    
}
