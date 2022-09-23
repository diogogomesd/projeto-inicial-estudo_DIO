package menssagem;

import javax.swing.*;

public class MainMessage {
    public static void main(String[] args) {
        ObjetoMessage obj = new ObjetoMessage();
        obj.setHora(Integer.parseInt(JOptionPane.showInputDialog("digite a hora de 0 a 23")));

        System.out.println(obj.obterMessage());
    }
}
