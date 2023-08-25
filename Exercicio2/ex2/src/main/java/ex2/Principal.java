package ex2;
import java.util.*;

public class Principal {
    
    public static Scanner jooj = new Scanner(System.in);
    public static DAO dao = new DAO();

    public static void main(String[] args) {

        dao.conectar();

        // Definir dado
        boolean continuar = true; // Definir variável com valor inicial

        while (continuar) {

            // Ler do teclado
            System.out.println("Opções:");
            System.out.println(" 1 - Listar ");
            System.out.println(" 2 - Inserir ");
            System.out.println(" 3 - Atualizar ");
            System.out.println(" 4 - Excluir ");
            System.out.println(" 5 - Sair ");
            System.out.println("Digite uma opção: ");
            int escolha = jooj.nextInt();
            jooj.nextLine(); // Limpar o buffer do teclado

            // Testar escolha
            switch (escolha) {
                case 1:
                    listarCarros();
                    break;
                case 2:
                    inserirCarro();
                    break;
                case 3:
                    atualizarCarro();
                    break;
                case 4:
                    excluirCarro();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("ERRO: Opção inválida.");
            } // fim escolher
        }
        dao.close();
        jooj.close();
    }

    public static void listarCarros() {
        // Mostrar carros da marca
        System.out.println("==== Mostrar carros da marca === ");
        Carro[] carros = dao.getCarros();
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].toString());
        }
        jooj.nextLine();
    }

    public static void inserirCarro() {
        // Inserir um elemento na tabela
        System.out.println("ID: ");
        int id = jooj.nextInt();
        jooj.nextLine();

        System.out.println("Marca: ");
        String marca = jooj.nextLine();

        System.out.println("Modelo: ");
        String modelo = jooj.nextLine();

        System.out.println("Motor: ");
        String pu = jooj.nextLine();

        System.out.println("Ano: ");
        int ano = jooj.nextInt();

        Carro carro = new Carro(id, marca, modelo, ano, pu);
        if (dao.inserirCarro(carro)) {
            System.out.println("Inserção com sucesso -> " + carro.toString());
        }
    }

    public static void atualizarCarro() {
        // Atualizar carro
        System.out.println("ID do carro a ser atualizado: ");
        int carroId = jooj.nextInt();
        jooj.nextLine();

        System.out.println("Novo modelo: ");
        String novoModelo = jooj.nextLine();

        dao.atualizarCarro(carroId, novoModelo);
    }

    public static void excluirCarro() {
        // Excluir carro
        System.out.println("ID do carro a ser excluído: ");
        int carroId = jooj.nextInt();
        jooj.nextLine();

        dao.excluirCarro(carroId);
    }
}
