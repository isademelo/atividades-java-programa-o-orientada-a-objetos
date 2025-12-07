import javax.swing.plaf.synth.SynthOptionPaneUI;

class Pessoa {
    //Crie uma classe Pessoa com um metodo que exibe "Olá, mundo!" no console.
    void printarOlaMundo(){
        System.out.println("Ola,  mundo");
    }
}

//Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.
class Calculadora {
    int calcularDobroDoNumeroEscolhido(int nota){
        return nota * 2;
    }
}

//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
class Musica {
        String titulo;
        String artista;
        int anoLancamento;
        double avaliacaoGeral;
        byte numAvaliacoesTotais;

        void printarInformacoesDaMusica(){
            System.out.println(String.format("""
                    nome da música: %s
                    artista: %s
                    ano de lançamento: %d
                    """, titulo, artista, anoLancamento));
        }

        void avaliacaoDaMusica(double nota){
            avaliacaoGeral += nota;
            numAvaliacoesTotais++;
        }

        double printarMediaDasAvaliacoes(){
            return avaliacaoGeral /numAvaliacoesTotais;
        }
}

//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
class Carro{
    String modelo;
    int anoDeFabricacao;
    String cor;

    void printarInformacoesDaCarro(){
        System.out.println(String.format("""
                modelo do carro: %s
                ano de fabricação: %d
                cor: %s
                """, modelo, anoDeFabricacao, cor));
    }

    int calcularIdadeDoCarro(){
        return 2025 - anoDeFabricacao;
    }
}

class Aluno {
    String nome;
    byte idade;

    void printarInformacoesDaAluno(){
        System.out.println(String.format("""
                informações do aluno: 
                nome: %s
                idade: %d
                """, nome, idade));
    }
}