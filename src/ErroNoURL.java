public class ErroNoURL extends RuntimeException {
    private String mensagem;
    public ErroNoURL(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
