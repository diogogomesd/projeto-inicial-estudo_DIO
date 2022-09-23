package calculadora;

import javax.swing.*;

public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraObjeto obj = new CalculadoraObjeto();
        obj.setN1(Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro numero")));
        obj.setN2(Integer.parseInt(JOptionPane.showInputDialog("insira o segundo numero")));

        System.out.println("a soma e = "+obj.soma());
        System.out.println("a subtracao e = "+obj.subtrair());
        System.out.println("a multiplicacao e = "+obj.multiplicacao());
        System.out.println("a divisao e = "+obj.divisao());
    }
}
