package cambio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    void deveRetornarDolaresPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setValor(100.0f);

        assertEquals(100.0f, pessoa.getValor());
    }

    @Test
    void deveRetornarReaisPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setValor(100.0f);

        assertEquals(520.0f, pessoa.getReais());
    }
}
