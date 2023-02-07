
package interfaces;
import negocio.BombaCombustivel;
import java.util.Scanner; 

/**
 *
 * @author SuperGeeks
 */
public class MenuBombaCombustivel {
    public static void main(String[] args) {
        // Como não foi orientado a o valor da senha, criei "123" para a senha normal e "321" para a senha do gerente
        BombaCombustivel bomba = new BombaCombustivel("gasolina",5.5,200,"123","321");
        
        Scanner leitor = new Scanner(System.in);
        
       String opcao = "0";
       
       while (opcao != "8"){
           System.out.println("Menu\n"
                   + "1 - Liberar\n" +
"2 - Abastecer\n" +
"3 - Atualizar preço\n" +
"4 - Imprimir informações da bomba\n" +
"5 - Exibir média do preço \n" +
"6 - Bloquear bomba\n" +
"7 - Liberar (gerente)\n" +
"8 - Sair");
    opcao = leitor.nextLine();
    if (opcao.equals("1")){
        System.out.println("Digite a Senha da Bomba");
        String senha = leitor.nextLine();
        bomba.liberar(senha);
        
    } else if (opcao.equals("2")){
        System.out.println("Quantos litros você deseja abastecer?");
        double litros = leitor.nextDouble();
        bomba.abasteceCliente(litros);
    } else if (opcao.equals("3")){
        System.out.println("Qual o novo valor da gasolina?");
        double novoValor = leitor.nextDouble();
        bomba.setPrecoAtual(novoValor);
    } else if (opcao.equals("4")){
        System.out.println(bomba.toString());
    } else if(opcao.equals("5")){
        System.out.println(bomba.mediaPreco());
    } else if(opcao.equals("6")){
        bomba.bloquar();
    } else if(opcao.equals("7")){
        System.out.println("Digite a Senha do gerente");
        String senha = leitor.nextLine();
        bomba.liberarGerente(senha);
    } else if(opcao.equals("8")){
        break;
    }
                    
       }
    }
}
