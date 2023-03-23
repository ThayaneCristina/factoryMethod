import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoVenderTest {
    @Test
    void deveExecutarAlugar (){
        IServico servico = ServicoFactory.obterServico("Vender");
        assertEquals("Imóvel vendido.", servico.executar());
    }

    @Test
    void deveCancelarAluguel (){
        IServico servico = ServicoFactory.obterServico("Vender");
        assertEquals("Venda Cancelada.", servico.cancelar());
    }
}
