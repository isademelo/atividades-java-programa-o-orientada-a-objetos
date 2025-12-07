//Crie uma classe Pessoa com um metodo que exibe "Olá, mundo!" no console.
public class Desafio1Alura {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.printarOlaMundo();

//Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcularDobroDoNumeroEscolhido(90));

//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo = "seek and destroy";
        musica.artista = "metallica";
        musica.anoLancamento = 1983;
        musica.printarInformacoesDaMusica();

        musica.avaliacaoDaMusica(9.0);
        musica.avaliacaoDaMusica(10.0);
        musica.avaliacaoDaMusica(8.0);
        musica.avaliacaoDaMusica(6.0);

        System.out.println("méda das notas da musica: " + musica.printarMediaDasAvaliacoes());

        //Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo = "Fiat uno rebaixado 2 portas com escada em cima";
        carro.cor  = "Branco";
        carro.anoDeFabricacao = 1983;
        carro.printarInformacoesDaCarro();
        System.out.println("idade do carro: " + carro.calcularIdadeDoCarro());

        //Crie uma classe Aluno com atributos nome, idade, e um metodo para exibir informações.
        // Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o metodo para exibir as informações.

        Aluno aluno = new Aluno();
        aluno.nome = "Isack";
        aluno.idade = 19;
        aluno.printarInformacoesDaAluno();

    }
}

