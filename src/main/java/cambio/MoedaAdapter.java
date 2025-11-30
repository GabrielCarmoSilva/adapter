package cambio;

public class MoedaAdapter extends MoedaReal {

    private IMoeda moedaDolar;

    public MoedaAdapter(IMoeda moedaDolar) {
        this.moedaDolar = moedaDolar;
    }

    public float recuperarValor() {
        return this.getReais() / 5.20f;
    }

    public void salvarValor() {
        this.setReais(moedaDolar.getValor() * 5.20f);
    }
}
