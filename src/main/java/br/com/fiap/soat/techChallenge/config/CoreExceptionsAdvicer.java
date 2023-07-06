package br.com.fiap.soat.techChallenge.config;

import br.com.fiap.soat.techChallenge.core.exceptions.ClienteNaoEncontradoException;
import br.com.fiap.soat.techChallenge.core.exceptions.ProdutoNaoEncontradoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CoreExceptionsAdvicer {
    @ExceptionHandler(value = { ProdutoNaoEncontradoException.class })
    protected ResponseEntity<String> handleProdutoNaoEncontradoException(ProdutoNaoEncontradoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(value  = { ClienteNaoEncontradoException.class })
    protected ResponseEntity<String> handleClienteNaoEncontradoException(ClienteNaoEncontradoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}