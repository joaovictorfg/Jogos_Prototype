package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public class BatmanArkhamAsylum extends Rocksteady{
    
   protected BatmanArkhamAsylum(BatmanArkhamAsylum Batman) {
        this.valorJogo = Batman.getValorJogo();
    }
 
    public BatmanArkhamAsylum() {
        valorJogo = 79.95;
    }
 
    @Override
    public String exibirDados() {
        return "Jogo: Batman: Arkham Asylum\nDesenvolvedores: Rocksteady Studios\n" + "Valor: R$"
                + getValorJogo();
    }
 
    @Override
    public Rocksteady clonar() {
        return new BatmanArkhamAsylum(this);
    }
    
    
 
}
