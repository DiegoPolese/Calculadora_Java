package calculadora.view;

import calculadora.controle.CalculadoraControler;
import calculadora.enums.EnumOperacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class jFrTela extends javax.swing.JFrame {

    private CalculadoraControler calculadoraControler ;

    private EnumOperacao ultimaOperacao;

    public jFrTela() {
        initComponents();
        calculadoraControler = new CalculadoraControler();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisMenos = new javax.swing.JButton();
        btPercentual = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btVirgula = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        tfValor.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        jPanel1.add(btAC);

        btMaisMenos.setText("+/-");
        jPanel1.add(btMaisMenos);

        btPercentual.setText("%");
        jPanel1.add(btPercentual);

        btDividir.setText("/");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });
        jPanel1.add(btDividir);

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);

        btMultiplicar.setText("*");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btMultiplicar);

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);

        btMenos.setText("-");
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btMenos);

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);

        btSoma.setText("+");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });
        jPanel1.add(btSoma);

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);

        btVirgula.setText(",");
        btVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(btVirgula);

        btFechar.setText("FECHAR");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(tfValor))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
        limpa();
        calculadoraControler.zerar();
    }//GEN-LAST:event_btACActionPerformed

    private void btVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgulaActionPerformed
        digita(",");
    }//GEN-LAST:event_btVirgulaActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        digita("7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        digita("8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        digita("9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        digita("4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        digita("5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        digita("6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        digita("1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        digita("2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        digita("3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        digita("0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        calculadoraControler.realizaOperacao(EnumOperacao.SOMA, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SOMA;
        limpa();
    }//GEN-LAST:event_btSomaActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        calculadoraControler.realizaOperacao(EnumOperacao.DIVISAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.DIVISAO;
        limpa();
    }//GEN-LAST:event_btDividirActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        calculadoraControler.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpa();
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        calculadoraControler.realizaOperacao(EnumOperacao.SUBTRACAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SUBTRACAO;
        limpa();
    }//GEN-LAST:event_btMenosActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        calculadoraControler.realizaOperacao(ultimaOperacao, stringToDouble(tfValor.getText()));
        tfValor.setText(DoubleToString(calculadoraControler.getTotal()));
    }//GEN-LAST:event_btIgualActionPerformed

    private String DoubleToString(Double numero){
        if (numero != null){
            DecimalFormat formato = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
}


    private Double stringToDouble(String numero){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Double dv = 0.0;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex) {
        
        }
        return dv;
    }

    private void digita(String caractere){
        if (tfValor.getText().equals("0,00")){
            tfValor.setText(caractere);
        } else{
            if(caractere.equals(",") && tfValor.getText().contains(",")){
        
            }else{
            tfValor.setText(tfValor.getText().concat(caractere));
            }
        }
    }

    private void limpa(){
        tfValor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMaisMenos;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btPercentual;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btVirgula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables


}
