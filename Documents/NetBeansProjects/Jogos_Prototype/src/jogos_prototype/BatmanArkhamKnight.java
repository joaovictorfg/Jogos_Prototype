package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public class BatmanArkhamKnight extends Rocksteady{
    
    protected BatmanArkhamKnight(BatmanArkhamKnight Batman) {
        this.valorJogo = Batman.getValorJogo();
    }
 
    public BatmanArkhamKnight() {
        valorJogo = 120.0;
    }
 
    @Override
    public String exibirDados() {
        return "Jogo: Batman: Arkham Knight\nDesenvolvedores:  Rocksteady Studios\n" + "Valor: R$"
                + getValorJogo();
    }
 
    @Override
    public Rocksteady clonar() {
        return new BatmanArkhamKnight(this);
    }

}

