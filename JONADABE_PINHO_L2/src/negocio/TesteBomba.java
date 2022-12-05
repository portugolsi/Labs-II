
package negocio;

/**
 *
 * @author SuperGeeks
 */
public class TesteBomba {
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel("gasolina",5.5,200);  // a 
        BombaCombustivel bomba2 = new BombaCombustivel("alcool",3.8,100);// a 
        System.out.println(bomba1.toString()); // b 
        System.out.println(bomba2.toString()); // b 
        bomba1.abasteceCliente(201); // c 
        System.out.println(bomba1.toString()); // d 
        bomba1.abasteceCliente(100); // e 
        System.out.println(bomba1.toString()); // f 
        bomba1.setPrecoAtual(6); // g 
        bomba1.abasteceCliente(100); // h 
        System.out.println(bomba1.toString()); // i 
        System.out.println(bomba1.mediaPreco()); // j
    }
}
