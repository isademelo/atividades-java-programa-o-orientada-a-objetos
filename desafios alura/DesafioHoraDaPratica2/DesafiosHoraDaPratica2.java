package DesafioHoraDaPratica2;
import java.util.Scanner;

public class DesafiosHoraDaPratica2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
        // Implemente métodos getters e setters para os atributos privados.

        ContaBancaria conta = new ContaBancaria();

        System.out.println(String.format("""
                Saldo: %.1f
                Titular da conta: %s
                Número da conta: %d
                """, conta.getSaldo(), conta.titular, conta.getNumeroConta()));

        //Crie uma classe IdadePessoa com os atributos privados nome e idade.
        // Utilize métodos getters e setters para acessar e modificar esses atributos.
        // Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.

        IdadePessoa pessoa = new IdadePessoa();

        System.out.println("Digite seu nome: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Digite sua idade: ");
        pessoa.setIdade(input.nextByte());

        System.out.println(String.format("""
                Nome: %s
                idade %d
                """, pessoa.getNome(), pessoa.getIdade()));
        pessoa.verificarIdade();

        //Desenvolva uma classe Produto com os atributos privados nome e preco.
        // Utilize métodos getters e setters para acessar e modificar esses atributos.
        // Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

        Produto produto = new Produto();
        System.out.println(String.format("Produto '%s' sem desconto: %.1f", produto.getNome(), produto.getPreco()));
        produto.calcularPrecoProdutoComDesconto();
        System.out.println(String.format("Produto '%s' com desconto de 20 por cento: %.1f", produto.getNome(), produto.getPreco()));

        //Desenvolva uma classe Aluno com os atributos privados nome e notas.
        // Utilize métodos getters e setters para acessar e modificar esses atributos.
        // Adicione um metodo calcularMedia que retorna a média das notas do aluno.

        Aluno aluno = new Aluno();
        System.out.println("Digite a quantidade de notas que você quer digitar: ");
        byte quantidadeDeNotas =  input.nextByte();
            for (int i = 1; i <= quantidadeDeNotas; i++) {
                System.out.println(String.format("Digite sua %dº nota: ", i));
                double nota = input.nextDouble();
                aluno.notaTotalDoAluno(nota);
            }
        System.out.println(String.format("A média do aluno é: %.1f", aluno.calcularMediaDoAluro()));
        input.nextLine();
        //Desenvolva uma classe Livro com os atributos privados titulo e autor.
        // Utilize métodos getters e setters para acessar e modificar esses atributos.
        // Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.

        Livro livro = new Livro();
        System.out.println("Digite o título do livro: ");
        String tituloDoLivro = input.nextLine();
        livro.setTitulo(tituloDoLivro);
        System.out.println("Agora digite o nome do autor do livro: ");
        livro.setAutor(input.nextLine());
        livro.exibirInformacoesDetalhadasDoLivro();
    }
}