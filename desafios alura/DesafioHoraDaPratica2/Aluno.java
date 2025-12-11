package DesafioHoraDaPratica2;

public class Aluno {

    private String nome = "isack";
    private double nota = 0;
    public byte quantidadeDeNotas = 0;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(){
        this.nota = nota;
    }

    public double notaTotalDoAluno (double nota){
        this.nota += nota;
        quantidadeDeNotas++;
        return this.nota;
    }

    public double calcularMediaDoAluro(){
        double media = nota / quantidadeDeNotas;
        return media;
    }
}
