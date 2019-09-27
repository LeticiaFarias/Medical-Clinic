package model;

public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private String endereco;
    private String telefone;

    public Medico() {

    }

    public Medico(String nome, String crm, String especialidade, String endereco, String telefone) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
