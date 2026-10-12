package net.bifewagyu;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorDeTarefas {

   private static ArrayList<AplicarTarefas> lista = new ArrayList<>();
    private static int contatodorID = 1;


   static final Scanner sc = new Scanner(System.in);
    static int opcao = 0;


    public static void tarefas() {

         do {
             System.out.println("=============Gerenciador de Tarefas===============");

        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Alternar Status (Concluir/Desmarcar)");
        System.out.println("4. Editar Descrição");
        System.out.println("5. Deletar Tarefa");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");

        try {
            opcao = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Selecione um numero valido");
            continue;
        }

        switch (opcao) {
            case 1:
                System.out.println("Digite a descrição da tarefa: ");
                String descricao = sc.nextLine();
                lista.add(new AplicarTarefas(descricao, contatodorID++));
                System.out.println("Tarefa adicionada com sucesso!");
                System.out.println("Aperte qualquer tecla para voltar para o inicio..... ");
                sc.nextLine();
                break;
            case 2:
                if (lista.isEmpty()) {
                    System.out.println("Nenhuma Tarefa foi adicionada!");
                } else {
                    System.out.println("\n--- Suas Tarefas ---");
                    for (AplicarTarefas aplicarTarefas : lista) {
                        System.out.println(aplicarTarefas);
                    }
                }
                System.out.println("Aperte qualquer tecla para voltar para o inicio..... ");
                sc.nextLine();
                break;
            case 3:
                System.out.println("Digite o id da tarefa para fazer a alteração: ");
                int alterarId = sc.nextInt();
                AplicarTarefas alterarTarefas = buscarTarefas(alterarId);
                assert alterarTarefas != null;
                alterarTarefas.setStatus(!alterarTarefas.isStatus());
                System.out.println("Tarefa alterada com sucesso!");
                System.out.println("Aperte qualquer tecla para voltar para o inicio..... ");
                sc.nextLine();
                break;

            case 4:
                System.out.println("Informe o id para editar a descrição: ");
                int editarId = sc.nextInt();
                sc.nextLine();
               AplicarTarefas mudarDescicao = buscarTarefas(editarId);
                if (mudarDescicao != null) {
                    System.out.println("Atualizar a descrição da tarefa: ");
                    String mudarDesc = sc.nextLine();
                    mudarDescicao.setDescricao(mudarDesc);
                    System.out.println("Tarefa alterada com sucesso!");
                    System.out.println(mudarDescicao);
                }
                System.out.println("Aperte qualquer tecla para voltar para o inicio..... ");
                sc.nextLine();
                break;
            case 5:
                System.out.println("Digite o Id para deletar");
                int deletarId = sc.nextInt();
                AplicarTarefas deletarTarefas = buscarTarefas(deletarId);
                sc.nextLine();
                lista.remove(deletarTarefas);
                System.out.println("Tarefa removida com sucesso!");
                System.out.println("Aperte qualquer tecla para voltar para o inicio..... ");
                sc.nextLine();
                break;

        }

    } while (opcao != 6);
        sc.close();

    }



    public static AplicarTarefas buscarTarefas(int id) {
        for (AplicarTarefas aplicarTarefas : lista) {
            if (aplicarTarefas.getId() == id) {
                return aplicarTarefas;
            }
        }
        return null;
    }
}
