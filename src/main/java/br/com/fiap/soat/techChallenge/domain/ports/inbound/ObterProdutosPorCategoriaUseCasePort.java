package br.com.fiap.soat.techChallenge.domain.ports.inbound;
import br.com.fiap.soat.techChallenge.domain.entity.Produto;

import java.util.List;

public interface ObterProdutosPorCategoriaUseCasePort {
    List<Produto> execute(Produto.TipoDeProduto categoria);
}