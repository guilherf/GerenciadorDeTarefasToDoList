package net.bifewagyu;

public class AplicarTarefas {

   String descricao;
    int id;
    boolean status;

    public AplicarTarefas(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
        this.status = false;
    }

    @Override
    public String toString() {
        String ver = status ?  " [X] " : " [] ";
        return id + ". "+ descricao + ver;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

