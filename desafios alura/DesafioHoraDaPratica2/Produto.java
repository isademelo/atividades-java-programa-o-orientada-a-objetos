package DesafioHoraDaPratica2;
//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class Produto {
    private String nome = "Shampoo";
    private double preco = 19.9;

    public double  getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void calcularPrecoProdutoComDesconto (){
        preco =  preco - (preco * 0.2);
    }
}
