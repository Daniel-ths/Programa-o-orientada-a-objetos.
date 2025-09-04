public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    void cadastrar() {
        System.out.println("O livro '" + titulo + "' foi cadastrado no sistema.");
    }

    double calcFrete(String cep) {
        double valorFrete = preco * 0.1; 
        System.out.println("Calculando frete para o CEP " + cep);
        return valorFrete;
    }

    void vender() {
        System.out.printf("Vendendo o livro '%s' por R$ %.2f\n", titulo, preco);
    }

    String trocar() {
        return "O livro '" + titulo + "' foi trocado com sucesso!";
    }
}



public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "O Senhor dos Anéis: A Sociedade do Anel";
        livro1.numeroPaginas = 576;
        livro1.anoPublicacao = 1954;
        livro1.preco = 59.90;

        livro2.titulo = "Java para Iniciantes";
        livro2.numeroPaginas = 350;
        livro2.anoPublicacao = 2022;
        livro2.preco = 89.90;

        System.out.println("--- Dados do Livro 1 ---");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Número de Páginas: " + livro1.numeroPaginas);
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
        System.out.printf("Preço: R$ %.2f\n", livro1.preco);

        System.out.println("\n--- Dados do Livro 2 ---");
        System.out.println("Título: " + livro2.titulo);
        System.out.println("Número de Páginas: " + livro2.numeroPaginas);
        System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
        System.out.printf("Preço: R$ %.2f\n", livro2.preco);

        System.out.println("\n--- Operações com o Livro 1 ---");
        livro1.cadastrar();
        livro1.vender();
        double frete = livro1.calcFrete("66000-123");
        System.out.printf("Valor do frete: R$ %.2f\n", frete);
        System.out.println(livro1.trocar());
    }
}