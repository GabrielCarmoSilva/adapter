package cambio;

public class MoedaDolar implements IMoeda {

    private float dolares;

    @Override
    public float getValor() {
        return this.dolares;
    }

    @Override
    public void setValor(float valor) {
        this.dolares = valor;
    }
}
