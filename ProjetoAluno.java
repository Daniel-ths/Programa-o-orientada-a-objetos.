public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João da Silva";
        aluno1.matricula = 123456;
        aluno1.notaAv1 = 8.5;
        aluno1.notaAv2 = 9.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria Oliveira";
        aluno2.matricula = 654321;
        aluno2.notaAv1 = 5.0;
        aluno2.notaAv2 = 6.5;

        System.out.println("--- Dados Iniciais do Aluno 2 ---");
        aluno2.mostrarDados();
        System.out.println();

        System.out.println("--- Atualizando a nota AV2 do Aluno 2 ---");
        aluno2.notaAv2 = 8.0;

        System.out.println("--- Dados Atualizados do Aluno 2 ---");
        aluno2.mostrarDados();
        System.out.println();
        
        System.out.println("--- Verificando Aprovação do Aluno 1 ---");
        aluno1.verificarAprovacao();

        System.out.println("\n--- Verificando Aprovação do Aluno 2 (Após atualização) ---");
        aluno2.verificarAprovacao();
    }
}