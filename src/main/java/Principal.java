import javax.swing.JOptionPane;
import calculadora.Calculadora;
public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while(!opcao.equals("9")){
            opcao = JOptionPane.showInputDialog("""
                                                1 - Leitura 
                                                 2 - Soma 
                                                 3 - Subtra\u00e7\u00e3o 
                                                 4 - Produto 
                                                 5 - Divis\u00e3o 
                                                 9 - Sair""");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                    break;
            }
        }
    }
}
