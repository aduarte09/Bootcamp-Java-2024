package list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        setDescricao(descricao);;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao;
    }
}