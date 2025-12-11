package DesafioHoraDaPratica2;

//Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.

public class IdadePessoa {
    private String nome;
    private byte idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade () {
        return idade;
    }

    public String getNome () {
        return nome;
    }

    public byte setIdade (byte idade) {
        this.idade = idade;
        return idade;
    }

    void verificarIdade(){
        if (idade >= 18){
            System.out.println(String.format("%s é maior de idade", this.nome));
        } else {
            System.out.println(String.format("%s é menor de idade", this.nome));
        }
    }
}
