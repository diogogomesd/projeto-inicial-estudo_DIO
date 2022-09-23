package emprestimos;

import javax.swing.*;

public class MainEmprestimo {
    public static void main(String[] args) {
        ObjetoEmprestimo obj = new ObjetoEmprestimo();
        obj.setValorParcela(Double.parseDouble(JOptionPane.showInputDialog("digite o valor do emprestimo")));
        int parcela = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de pracelas entre 2 e 3"));
            if(parcela == 2){
               obj.setQtd2Parcelas(parcela);
               obj.setJuros2Parcelas(0.3);
            }
            if(parcela == 3){
                obj.setJuros3Parcelas(parcela);
                obj.setJuros2Parcelas(0.45);
            }
            else{
                if(parcela < 2 || parcela > 3){
                    System.out.println("Quantidade de parcelas nao aceita.");
                }
            }
        System.out.println("Valor final para emprestimo para duas parcelas e = R$ "+ obj.calcular());
    }
}
