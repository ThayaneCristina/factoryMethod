import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoComprarTest {

    @Test
    void deveExecutarComprar (){
        IServico servico = ServicoFactory.obterServico("Comprar");
        assertEquals("Imóvel Comprado", servico.executar());
    }

    @Test
    void deveCancelarAluguel (){
        IServico servico = ServicoFactory.obterServico("Comprar");
        assertEquals("Compra Cancelada.", servico.cancelar());
    }

}
