package br.com.fiap.soat.techChallenge.core.ports.inbound;

import br.com.fiap.soat.techChallenge.core.domain.Produto;

import java.util.Optional;

public interface EditarProdutoUseCasePort {
    Produto execute(Produto produto);
}