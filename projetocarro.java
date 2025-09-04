public class ProjetoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2021;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2020;

        System.out.println("--- Dados Iniciais do Carro 1 ---");
        carro1.mostrarInformacoes();

        System.out.println("\n--- Alterando atributos do Carro 1 ---");
        carro1.modelo = "Corolla Cross";
        carro1.ano = 2023;
        
        System.out.println("\n--- Dados Modificados do Carro 1 ---");
        carro1.mostrarInformacoes();

        System.out.println("\n--- Ações dos Carros ---");
        carro1.ligar();
        carro2.ligar();
    }
}