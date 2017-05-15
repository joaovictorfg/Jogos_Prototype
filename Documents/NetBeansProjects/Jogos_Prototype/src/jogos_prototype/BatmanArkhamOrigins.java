package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public class BatmanArkhamOrigins extends Rocksteady{
    
  protected BatmanArkhamOrigins(BatmanArkhamOrigins Batman) {
        this.valorJogo = Batman.getValorJogo();
    }
 
    public BatmanArkhamOrigins() {
        valorJogo = 90.90;
    }
 
    @Override
    public String exibirDados() {
        return "Jogo: Batman: Arkham Origins\nDesenvolvedores:  NetherRealm Studios\n" + "Valor: R$"
                + getValorJogo();
    }
 
    @Override
    public Rocksteady clonar() {
        return new BatmanArkhamOrigins(this);
    }

}
