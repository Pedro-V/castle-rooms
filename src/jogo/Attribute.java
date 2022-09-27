package jogo;

public enum Attribute {
    MONSTER(), CHEFE(), CURA(), QUIZ(),
    ARMADILHA(), VAZIA();
    private String descricao;
    // Uma mensagem a ser mostrada caso o atributo ja tenha sido utilizado
    private String mensagemAtributoUtilizado;
    // Um valor associado a ação do atributo
    private int valor_associado;

    Attribute() {
        setDescricaoMensagem();
        inicializaValorAssociado();
    }

    private void setDescricaoMensagem(){
        switch (this) {
            case MONSTER:
                descricao = "Você encontrou um monstro nessa sala! Ele tem 3 de vida e 1 de dano.\nSó após derrotar ele você pode sair dessa sala.";
                mensagemAtributoUtilizado = "O monstro dessa sala já está morto.";
                break;
            case CHEFE:
                descricao = "Você encontrou o chefe! Para obter a safira, você precisa derrotá-lo!\nO chefe tem 8 de vida e 2 de dano! Tome cuidado.";
                mensagemAtributoUtilizado = "O chefe foi derrotado, parabéns!";
                break;
            case CURA:
                descricao = "Essa sala possui uma aura curadora!\nVocê automaticamente recebeu uma pequena quantia de cura!";
                mensagemAtributoUtilizado = "";
                break;
            case QUIZ:
                descricao = "Essa sala possui um erudita! Responda corretamente à charada e ganhe um feitiço de bola de fogo!";
                mensagemAtributoUtilizado = "O erudita só faz a pergunta uma vez.";
                break;
            case ARMADILHA:
                descricao = "Ao entrar nessa sala você ativou uma armadilha automática! Voce sofre uma pequena quantia de dano!";
                mensagemAtributoUtilizado = "";
                break;
            case VAZIA:
                descricao = "";
                break;
        }
    }

    private void inicializaValorAssociado() {
        switch (this) {
            case ARMADILHA:
                valor_associado = -1;
                break;
            case CURA:
                valor_associado = 2;
                break;
            case QUIZ:
                valor_associado = 3;
                break;
            default:
                valor_associado = 0;
                break;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor_associado() {
        return valor_associado;
    }

    public String getmensagemAtributoUtilizado() {
        return mensagemAtributoUtilizado;
    }
}
