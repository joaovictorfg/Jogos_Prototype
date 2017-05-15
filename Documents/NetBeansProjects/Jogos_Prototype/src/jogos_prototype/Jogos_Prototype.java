package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public class Jogos_Prototype {

    public static void main(String[] args) {
        
        BatmanArkhamAsylum jogoBatmanA = new  BatmanArkhamAsylum();
        BatmanArkhamCity jogoBatmanC = new  BatmanArkhamCity();
        BatmanArkhamKnight jogoBatmanK = new  BatmanArkhamKnight();
        BatmanArkhamOrigins jogoBatmanO = new  BatmanArkhamOrigins();
        
        Rocksteady batmanArkhamAsylum = jogoBatmanA.clonar();
        batmanArkhamAsylum.setValorJogo(79.95);
        Rocksteady batmanArkhamCity = jogoBatmanC.clonar();
        batmanArkhamCity.setValorJogo(85.00);
        Rocksteady batmanArkhamKnight = jogoBatmanK.clonar();
        batmanArkhamKnight.setValorJogo(120.00);
        Rocksteady batmanArkhamOrigins = jogoBatmanO.clonar();
        batmanArkhamOrigins.setValorJogo(90.90);
        
        System.out.println(jogoBatmanA.exibirDados());
        System.out.println("\n");
        System.out.println(jogoBatmanC.exibirDados());
        System.out.println("\n");
        System.out.println(jogoBatmanK.exibirDados());
        System.out.println("\n");
        System.out.println(jogoBatmanO.exibirDados());
        
    }
    
}