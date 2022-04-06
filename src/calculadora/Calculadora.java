package calculadora;

import calculadora.view.jFrTela;

public class Calculadora {

    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
    }
    
}
