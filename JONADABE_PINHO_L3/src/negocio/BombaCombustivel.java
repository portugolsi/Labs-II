
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
    private boolean isLiberada;
    private String senha;
    private String senhaGerente;
    private int tentativas;
    
    public BombaCombustivel( String tipo,double precoLitro, double quantidadeAtual, String senha, String senhaGerente){
        
        this.tipo = tipo;
        this.precoLitro = precoLitro;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeVendida = 0;
        this.valorVendido = 0;
        this.senha = senha;
        this.senhaGerente = senhaGerente;
        this.isLiberada = false;
        this.tentativas = 0;
        
        
    }
    public BombaCombustivel(){
        
    }
    
    
    public boolean liberar(String senha){
        if (tentativas <=3 && senha.equals(this.senha)){
           this.isLiberada = true;
           this.tentativas = 0;
            System.out.println("Bomba liberada");
        } else{
             this.tentativas++;
             System.out.println("Senha incorreta. Bomba não liberada");
        }
        return isLiberada;
    }
    
    public boolean liberarGerente(String senha){
        if (this.senhaGerente.equals(senha)){
            this.tentativas = 0;
            this.isLiberada = true;
            return true;
        }   else{
            return false;
        }
    }
    
    public void bloquar(){
        this.isLiberada = false;
    }
    
    
    
    
    public boolean abasteceCliente(double i){ /** i representa a quantidade em listros do abastecimento*/
        
        if (this.isLiberada == true){
           
            if (quantidadeAtual>=i){
                quantidadeAtual -= i;
                quantidadeVendida += i;
                valorVendido += i * precoLitro; 
                this.isLiberada = false;
                System.out.println("Abastecimento realizado com sucesso");
                return true;
            } else{ 
                System.out.println("Quantidade solicitada maior que a disponível");
                return false;
            }  
        } else{ 
            System.out.println("Bomba bloqueada");
            return false;}
    }
     
    
     /** Metodos Setters*/
    
    public void setPrecoAtual(double novoPreco){
        if (this.isLiberada==true && novoPreco>0){
            this.precoLitro = novoPreco;
            this.isLiberada=false;
            System.out.println("Preço atualizado para "+novoPreco);
               
        }else{
               System.out.println("Preço não foi atualizado pois a bomba está bloqueada. Por favor, selecione a opção 1 e insira a senha");     
                    } 
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
