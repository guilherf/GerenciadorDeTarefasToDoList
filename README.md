# Gerenciador de Tarefas (To-Do List)

Lista de tarefas em **Java** que roda no terminal. Permite criar, listar, concluir, editar e remover tarefas por meio de um menu simples.

## Para que serve

É um exercício prático de programação orientada a objetos e de manipulação de coleções em Java: o programa representa cada tarefa como um objeto e mantém todas elas em uma lista.

## Funcionalidades

Menu principal:

1. **Adicionar tarefa**: pede a descrição e cria a tarefa com um ID automático.
2. **Listar tarefas**: mostra todas no formato `1. Estudar Java [X]` (`[X]` = concluída, `[]` = pendente).
3. **Alternar status**: marca como concluída ou desmarca, a partir do ID.
4. **Editar descrição**: troca o texto de uma tarefa existente.
5. **Deletar tarefa**: remove a tarefa pelo ID.
6. **Sair**.

> As tarefas ficam **apenas na memória**: ao encerrar o programa, a lista é perdida.

## Como funciona o código

| Arquivo | Papel |
|---|---|
| `Main.java` | Ponto de entrada; chama o menu. |
| `GerenciadorDeTarefas.java` | Menu, leitura do teclado e operações sobre a lista (`ArrayList`), incluindo a busca de tarefa por ID. |
| `AplicarTarefas.java` | Modelo da tarefa: `id`, `descricao` e `status` (concluída ou não). |

## Como executar

Pré-requisito: um **JDK** instalado (testado com Java 21). O projeto não usa Maven, então basta o `javac`.

```bash
git clone https://github.com/guilherf/GerenciadorDeTarefasToDoList.git
cd GerenciadorDeTarefasToDoList
javac -d out src/main/java/net/bifewagyu/*.java
java -cp out net.bifewagyu.Main
```

## Autor

Guilherme Ferreira — [@guilherf](https://github.com/guilherf)
