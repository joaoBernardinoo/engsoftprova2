public class CriterioBomFornecedorPorNota implements CriterioBomFornecedor {

    @Override
    public boolean isBomFornecedor(double mediaNotas, int novaNota) {
        return mediaNotas >= 5 && novaNota > 9;
    }
}
