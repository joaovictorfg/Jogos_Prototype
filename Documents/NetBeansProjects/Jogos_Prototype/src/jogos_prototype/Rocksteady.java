package jogos_prototype;

/**
 *
 * @author João Victor Firmino
 */
public abstract class Rocksteady {
    protected double valorJogo;
    
    public abstract String exibirDados();
    
    public abstract Rocksteady clonar();
 
    public double getValorJogo() {
        return valorJogo;
    }
 
    public void setValorJogo(double valorJogo) {
        this.valorJogo = valorJogo;
    }
}

