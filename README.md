# Jogo da Velha - Tic-Tac-Toe

Este projeto é uma implementação do clássico jogo da velha (Tic-Tac-Toe) em Java, onde dois jogadores podem jogar em um tabuleiro 3x3. O jogo alterna entre os jogadores, permitindo que eles escolham suas posições no tabuleiro até que haja um vencedor ou um empate.

## Funcionalidade

O programa permite que dois jogadores joguem o jogo da velha no terminal. Cada jogador escolhe um nome e um símbolo (`X` ou `O`), e o jogo alterna entre as jogadas de cada um. O jogo termina quando um dos jogadores vence ou quando o tabuleiro está cheio (empate).

### Características principais:
1. **Tabuleiro 3x3**: O jogo é jogado em um tabuleiro de 3x3.
2. **Entrada do Jogador**: Os jogadores escolhem as linhas e colunas onde desejam colocar seu símbolo.
3. **Verificação de Vitória e Empate**: O jogo verifica se há um vencedor após cada jogada e se o jogo terminou em empate.

## Como Usar

### Passo 1: Compilar e Executar o Código

Se você está utilizando uma IDE, como **IntelliJ IDEA** ou **Eclipse**, basta importar o projeto e executar a classe `TicTacToeGame`.

Se preferir usar o terminal, siga os seguintes passos:

1. Compile o código com o comando:
    ```bash
    javac TicTacToeGame.java
    ```

2. Execute o código com o comando:
    ```bash
    java TicTacToeGame
    ```

### Passo 2: Interação com o Usuário

Ao executar o programa, o usuário será solicitado a:

1. **Informar o nome dos dois jogadores**.
2. **Escolher as posições no tabuleiro**: Jogadores devem inserir as coordenadas de linha e coluna (valores entre 0 e 2).

O jogo alterna entre os jogadores após cada movimento, e o vencedor ou empate será mostrado ao final.

## Exemplo de Execução

```plaintext
Welcome to Tic-Tac-Toe!
Enter the name of Player 1: Alice
Enter the name of Player 2: Bob
Current Board:
- | - | -
- | - | -
- | - | -

Alice's turn (X)
Enter row (0, 1, or 2): 1
Enter column (0, 1, or 2): 1
Current Board:
- | - | -
- | X | -
- | - | -

Bob's turn (O)
Enter row (0, 1, or 2): 0
Enter column (0, 1, or 2): 0
Current Board:
O | - | -
- | X | -
- | - | -

Alice's turn (X)
Enter row (0, 1, or 2): 2
Enter column (0, 1, or 2): 2
Current Board:
O | - | -
- | X | -
X | - | -

...

Alice wins!
```

## Funcionalidade do Código

O código é composto pelas seguintes partes principais:

- **Classe `Player`**: Representa um jogador com um nome e um símbolo (X ou O).
  
  - **Métodos**:
    - `getName()`: Retorna o nome do jogador.
    - `getSymbol()`: Retorna o símbolo (X ou O) do jogador.

- **Classe `TicTacToe`**: Representa o jogo e o tabuleiro de 3x3.

  - **Métodos**:
    - `printBoard()`: Imprime o estado atual do tabuleiro.
    - `makeMove(int row, int col, Player player)`: Realiza a jogada do jogador no tabuleiro, se a posição estiver disponível.
    - `checkWin(Player player)`: Verifica se o jogador venceu.
    - `isDraw()`: Verifica se o jogo terminou em empate.

- **Classe `TicTacToeGame`**: Controla o fluxo principal do jogo, incluindo a interação com os jogadores, alternância de turnos, e verificação de vitórias ou empates.

## Dependências

Este projeto não possui dependências externas, apenas utiliza a biblioteca padrão do Java.

## Contribuições

Contribuições são bem-vindas! Caso queira melhorar o jogo ou adicionar novas funcionalidades, fique à vontade para abrir issues ou pull requests.
