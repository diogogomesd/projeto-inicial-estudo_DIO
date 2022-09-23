package emprestimos;

public class ObjetoEmprestimo {
    private int qtd2Parcelas;
    private int qtd3Parcelas;
    private double juros2Parcelas;
    private double juros3Parcelas;
    private double valorParcela;

    public int getQtd2Parcelas() {
        return qtd2Parcelas;
    }

    public void setQtd2Parcelas(int qtd2Parcelas) {
        this.qtd2Parcelas = qtd2Parcelas;
    }

    public int getQtd3Parcelas() {
        return qtd3Parcelas;
    }

    public void setQtd3Parcelas(int qtd3Parcelas) {
        this.qtd3Parcelas = qtd3Parcelas;
    }

    public double getJuros2Parcelas() {
        return juros2Parcelas;
    }

    public void setJuros2Parcelas(double juros2Parcelas) {
        this.juros2Parcelas = juros2Parcelas;
    }

    public double getJuros3Parcelas() {
        return juros3Parcelas;
    }

    public void setJuros3Parcelas(double juros3Parcelas) {
        this.juros3Parcelas = juros3Parcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public double calcular(){
      if(qtd2Parcelas == 2){
         double valorFinal = valorParcela * juros2Parcelas;
         return valorFinal;
      }
      else if(qtd3Parcelas == 3 ){
         double valorFinal = valorParcela * juros3Parcelas;
         return valorFinal;
      }
      else{
          return 0;
      }
    }

    @Override
    public String toString() {
        return "ObjetoEmprestimo{" +
                "qtd2Parcelas=" + qtd2Parcelas +
                ", qtd3Parcelas=" + qtd3Parcelas +
                ", juros2Parcelas=" + juros2Parcelas +
                ", juros3Parcelas=" + juros3Parcelas +
                ", valorParcela=" + valorParcela +
                '}';
    }
}
