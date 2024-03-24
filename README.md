# Projeto Áudio
Este projeto em Java simula um sistema de reprodução de músicas e podcasts, permitindo que os usuários adicionem músicas aos favoritos, as reproduzam e classifiquem-nas com base no número de vezes que foram reproduzidas ou curtidas.

# Visão Geral
O projeto consiste em várias classes:

Main: Classe principal que contém o método main e demonstra a utilização das outras classes.

Audio: Classe base que representa áudio genérico com propriedades como título, duração, número de reproduções e curtidas.

Musica: Classe que estende Audio e representa uma música, permitindo classificá-la com base no número de curtidas recebidas.

Podcast: Classe que estende Audio e representa um podcast, também permitindo classificá-lo com base no número de vezes reproduzidas.

LikedSongs: Classe que gerencia uma lista de músicas favoritas e permite reproduzi-las.

## Pré-requisitos
Java Development Kit (JDK) instalado
Ambiente de desenvolvimento Java, como Eclipse, IntelliJ IDEA, ou qualquer IDE de sua preferência
Instruções de Uso
Clone o repositório para o seu ambiente local.
Abra o projeto em sua IDE.
Execute o arquivo Main.java.
