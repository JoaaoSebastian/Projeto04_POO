package br.com.fatecpg.quiz;

public class Questao {
    String pergunta;
    String resposta;
    String alternativas[];

    public Questao(String pergunta, String resposta, String[] alternativas) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.alternativas = alternativas;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }
}
