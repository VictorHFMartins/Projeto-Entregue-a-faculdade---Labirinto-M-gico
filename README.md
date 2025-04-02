Labirinto Mágico é um jogo 2D desenvolvido em Java utilizando as bibliotecas Graphics e Graphics2D. O projeto nasceu como atividade final para o primeiro semestre do curso de Análise e Desenvolvimento de Sistemas e tem como objetivo combinar lógica de programação, estrutura de dados, leitura de arquivos, e conceitos básicos de jogos.

Mecânica do Jogo
O jogador deve navegar por um labirinto cheio de obstáculos, portas e itens interativos. A movimentação é gerenciada por uma classe Movimentacao, que trata de colisões com o ambiente e objetos.

Estrutura do Labirinto
O labirinto é carregado dinamicamente a partir de arquivos .txt, utilizando uma abordagem com matrizes tridimensionais para representar o terreno e objetos separadamente:

map[][]: representa o terreno base (chão, parede)

mapObj[][]: representa os objetos interativos (portas, chaves, monstros)

A geração é feita por uma classe chamada GeradorMapa, que interpreta os valores e instancia os objetos correspondentes a partir de um TileManager.

Objetos Especiais e Interações
Os objetos possuem uma variável booleana colisao que define se podem ser atravessados. Quando o jogador interage com objetos, a classe Iteracao determina o comportamento esperado (abrir uma porta, coletar uma chave, etc).

Sprites e Estética
Todos os objetos e personagens são desenhados com sprites, substituindo desenhos básicos por imagens visuais representativas para uma experiência mais imersiva.

Organização
O projeto é modular e segue o princípio de composição de responsabilidades. O uso de classes especializadas (como Labirinto, MapIndex, SuperObjects, Movimentacao, GeradorMapa, Iteracao e Interseccao) garante organização e expansão futura.
