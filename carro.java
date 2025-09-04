public class Carro {
    String marca;
    String modelo;
    int ano;

    public void mostrarInformacoes() {
        System.out.println("--- Informações do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void ligar() {
        System.out.println("O carro " + this.modelo + " está ligando... Vrum vrum!");
    }
}