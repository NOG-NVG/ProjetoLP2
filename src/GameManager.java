public class GameManager {
/*
    boolean loadGame(File file) --> ir à loadFiles
        Mapa.getmap(file)
        nrlinhas,pecas
    int getBoardSize --> buscar a informacao à loadGame

    boolean move(int x1, int x2, int y1, int y2)
// Calcule a diferença nas coordenadas x e y
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);

        // Verifique se o movimento é válido para o rei (máximo 1 casa em qualquer direção)
        return dx <=1 && dy<=1;


    String[] getSquareInfo(int x, int y)--> vazio caso não exista peça naquelas coordenadas, else -> (0) id, (1) tipo,
    (2) equipa, (3) alcunha, (4) png (opcional) (nome da png/ peca1.png) (caso nao se queira ==NULL)
    caso coordenadas invalidas return null
    png costumizada detalhes:
    png 50x50
    fundo transparente
    src/images

    String[] getPieceInfo(int ID) da return --> id tipo equipa alcunha estado(em jogo/capturado) x y (chamada apenas pelos testes) igual à
    funcao de baixo mas em vez de vir numa unica string vem num array

    String getPieceInfoAsString(int ID)  da return tipo : 1 | 0 | 0 | Chefe @ (1,0) / ver ficheiro txt pa perceber o 1 0 0

    int getCurrentTeamID()--> vai buscar o nome de quem e a jogar , return 0 se for black 1 se for white
    pecas.getCapturas()
    getCapturas(){
    capturas++;

    }

    boolean gameOver() -> chamado apos toda a jogada (se so existe pecas de uma equipa/ so existir uma peca de cada uma
    das equipas/ ao fim de 10 jogadas nao houver nenhuma captura ) , quando true chama |
                                                                                       |
                                                                                       |
    ArrayList<String> getGameResults() -> vai dar o conjunto de estatisticas :

    JOGO DE CRAZY CHESS || linha 0 array
    RESULTADO: <RES> ("VENCERAM AS BRANCAS/PRETAS/EMPATE) || linha 1
    ---\n || ...
    Equipa das pretas || ...
    <nr Capturas> || ...
    <nr Jogadas Validas> || ...
    <nr Tentativas invalidas>
    Equipa das brancas
    <nr Capturas>
    <nr Jogadas Validas>
    <nr Tentativas invalidas> || linha 10 do array

    JPanel getAuthorsPanel()-> vai ser chamado quando se carrega nos créditos, e possivel costumizar extensivamente sendo
    que e algo da parte grafica

Parte grafica para o movimento da peça vai chamr o move ( peça de onde esta+ peca pa onde vai)
Confirmações necessarias:
ver se a jogada e valida->false se nao / else true
caso valida tem que alterar a estrutura interna

Em cada jogada vai percurrer um ciclo for e para cada coordenada vai chamar o getSquareInfo
 */



}
