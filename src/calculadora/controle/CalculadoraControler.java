
package calculadora.controle;

import calculadora.enums.EnumOperacao;

public class CalculadoraControler {
     
    private Double total;

    public CalculadoraControler(){
        total = 0.0;
    }

    public Double realizaOperacao(EnumOperacao operacao, Double valor){
                total += valor;
        /*if (operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        } else if (operacao.equals(EnumOperacao.SUBTRACAO)){
            total -= valor;
        } else if (operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        } else if (operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        }*/
        return total;
    }

    public Double getTotal(){
        return this.total;
    }

    public void zerar(){
        total = 0.0;
    }
}
