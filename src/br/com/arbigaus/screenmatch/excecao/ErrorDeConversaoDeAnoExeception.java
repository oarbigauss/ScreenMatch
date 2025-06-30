package br.com.arbigaus.screenmatch.excecao;

public class ErrorDeConversaoDeAnoExeception extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoDeAnoExeception(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
