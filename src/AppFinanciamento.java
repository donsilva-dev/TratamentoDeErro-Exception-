public class AppFinanciamento {

    /* Regra de negocio! Entrada minima 20% do valorTotal*/

    public static void main(String[] args) {
        double valorTotal = 1000.0;
        double valorEntrada = 100.0;
        int qtParcelas = 10;

        /* tentar execultar*/
        try {
            Financiamento financiamento = new Financiamento(valorTotal,valorEntrada,qtParcelas);
            System.out.println(financiamento.prestacao());

        }
        /* capturar*/
        catch (RuntimeException e){
            System.out.println(e.getMessage());

        }

    }


}
