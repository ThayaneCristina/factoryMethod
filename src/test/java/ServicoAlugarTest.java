import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoAlugarTest {

    @Test
    void deveExecutarAlugar (){
        IServico servico = ServicoFactory.obterServico("Alugar");
        assertEquals("Imóvel alugado", servico.executar());
    }

    @Test
    void deveCancelarAluguel (){
        IServico servico = ServicoFactory.obterServico("Alugar");
        assertEquals("Aluguel rescindido", servico.cancelar());
    }
}
