package ScreenMatch.excecao;

public class ErroDeConversaoDeException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
