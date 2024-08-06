public class AvaliadorNovaNota {
    private CalculadoraMediaNotas calculadoraMediaNotas;
    private CriterioBomFornecedor criterioBomFornecedor;

    public AvaliadorNovaNota(CalculadoraMediaNotas calculadoraMediaNotas, CriterioBomFornecedor criterioBomFornecedor) {
        this.calculadoraMediaNotas = calculadoraMediaNotas;
        this.criterioBomFornecedor = criterioBomFornecedor;
    }

    public void avaliaNotaFornecedor(Avaliacao novaAvaliacao) {
        Fornecedor fornecedor = novaAvaliacao.getFornecedorAvaliado();
        double mediaNotas = calculadoraMediaNotas.calculaMedia(fornecedor.getMinhasAvaliacoes());

        if (criterioBomFornecedor.isBomFornecedor(mediaNotas, novaAvaliacao.getNota())) {
            fornecedor.setBomFornecedor(true);
        }
    }
}
