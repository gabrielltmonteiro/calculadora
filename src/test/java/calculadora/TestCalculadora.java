package calculadora;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestCalculadora {
        @Test
        public void testGetAdicao(){
            Calculadora calculadora = new Calculadora(4.0, 2.0);
            double retornoEsperado = 6.0;
            double retornoFeito = calculadora.getAdicao();
            assertEquals(retornoEsperado, retornoFeito, 0);
        }

    private void assertEquals(double retornoEsperado, double retornoFeito, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
