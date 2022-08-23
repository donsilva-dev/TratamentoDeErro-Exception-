public class Financiamento {
    public double valorTotal;
    public double valorEntrada;
    public int qtParcelas;

    public Financiamento(double valorTotal, double valorEntrada, int qtParcelas) {

        if (valorEntrada < valorTotal * 0.2) {
            throw new RuntimeException("Entrada deve ser 20% do valorTotal");
        } else if (qtParcelas < 6) {
            throw new RuntimeException("Quantidade de parcelas no minimo 6");
        }
            this.valorTotal = valorTotal;
            this.valorEntrada = valorEntrada;
            this.qtParcelas = qtParcelas;
        }

        public double prestacao () {
            return (valorTotal - valorEntrada) / qtParcelas;
        }
    }
