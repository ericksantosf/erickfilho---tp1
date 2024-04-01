package br.edu.infnet.erickfilho.model.domain;

public class Estudante {
    private String nome;
    private int idade;
    private String curso;
    private int matricula;

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Método para retornar informações sobre o estudante
    public String getInfo() {
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso + ", Matrícula: " + matricula;
    }

    public boolean podeVotar() {
        return idade >= 16;
    }
}