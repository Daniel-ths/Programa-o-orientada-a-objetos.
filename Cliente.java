public class Cliente {
    String nome;
    String cpf;
    String email;

    public void cadastrarCliente() {
        System.out.println("Cliente " + nome + " cadastrado com sucesso!");
    }

    public void buscarLivro(String tituloLivro) {
        System.out.println("O cliente " + nome + " está buscando pelo livro: " + tituloLivro);
    }
}