package cambio;

public class Pessoa {

    IMoeda valor;
    MoedaAdapter persistencia;

    public Pessoa() {
        valor = new MoedaDolar();
        persistencia = new MoedaAdapter(valor);
    }

    public void setValor(float dolares) {
        valor.setValor(dolares);
        persistencia.salvarValor();
    }

    public float getValor() {
        return persistencia.recuperarValor();
    }

    public float getReais() {
        return persistencia.getReais();
    }
}
