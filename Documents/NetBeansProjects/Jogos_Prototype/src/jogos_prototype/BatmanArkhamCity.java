package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public class BatmanArkhamCity extends Rocksteady{
    
    protected BatmanArkhamCity(BatmanArkhamCity Batman) {
        this.valorJogo = Batman.getValorJogo();
    }
 
    public BatmanArkhamCity() {
        valorJogo = 85.00;
    }
 
    @Override
    public String exibirDados() {
        return "Jogo: Batman: Arkham City\nDesenvolvedores: Rocksteady Studios\n" + "Valor: R$"
                + getValorJogo();
    }
 
    @Override
    public Rocksteady clonar() {
        return new BatmanArkhamCity(this);
    }

}
