
package negocio;

/**
 *
 * @author SuperGeeks
 * 
tipo (String) : guarda o nome do combustível a ser bombeado
precoLitro (double) : guarda o preço atual do litro 
quantidadeAtual (double): define a quantidade atual de litros do tanque da bomba.
quantidadeVendida (double): define quantos litros foram vendidos.
valorVendido (double): define o valor acumulado pela venda do combustível
 * 
 * 
 */
public class BombaCombustivel {
    
    private String tipo;
    private double precoLitro;
    private double quantidadeAtual;
    private double quantidadeVendida;
    private double valorVendido;
    
    public BombaCombustivel( String tipo,double precoLitro, double quantidadeAtual){
        
        this.tipo = tipo;
        this.precoLitro = precoLitro;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeVendida = 0;
        this.valorVendido = 0;
        
    }
    
    public boolean abasteceCliente(double i){ /** i representa a quantidade em listros do abastecimento*/
        if (quantidadeAtual>=i){
            quantidadeAtual -= i;
            quantidadeVendida += i;
            valorVendido += i * precoLitro; 
            return true;
        } else{ 
            return false;
        }  
    }
     
    
     /** Metodos Setters*/
    
    void setPrecoAtual(double novoPreco){
        this.precoLitro = novoPreco;
    }
    public double mediaPreco(){
        return valorVendido/quantidadeVendida;
    }

    /** Metodos Getters*/
    
    public String getTipo(){
        
        return tipo;
        
    }
    public double getPrecoLitro(){
        
        return precoLitro;
        
    }
    public double getQuantidadeAtual(){
        
        return quantidadeAtual;
        
    }
    public double getQuantidadeVendida(){
        return quantidadeVendida;
    }
    public double getValorVendido(){
        return valorVendido;
    }
    
    public String toString(){ /**tipo, preço, quantidade atual, quantidade vendida e o valor vendido, nesta ordem */
            String texto = "Tipo: "+tipo+"\n" + "Preço: "+precoLitro+"\n"+"Quantidade Atual:"+quantidadeAtual+"\n"+"Quantidade vendida: "+quantidadeVendida+"\n"+"Valor vendido: "+valorVendido;
            return texto;
    }
    
    
    
   
    
    
    
    
}
