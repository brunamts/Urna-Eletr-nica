# Urna-Eletr-nica
Projeto para a disciplina de Programação Orientada a Objetos, feito por Bruna Matos e Leticia Cavalcanti.
Descrição: 
Aplicação de Urna eletrônica para votação da categoria Melhor Anime.

Objetivo:
Eleger o melhor anime dentre as opções apresentadas: Kimetsu no Yaba, Shingeki no Kyojin, Dragon Ball e One Piece (e ganhar 9 pontos do professor Kalil).

Tecnologias:
- Java 11
- IDE Netbeans
- Swing para Interfaces gráficas

Regras de Negócio:
- Urna sem login, com o registro de eleitores apenas baseado em um nome e um username, que acontece na tela direcionada após a opção "Votar" na tela inicial for selecionada.
- Método de autenticação, para verificar se esse eleitor já está registrado com voto no banco de dados.
- Método de registro de eleitor direciona para a tela de votação, caso seu registro seja válido (caso não tenha votado) ou direciona novamente para a tela inicial caso o registro seja inválido.
- Todos os dados recebidos durante o período de votação ficam em memória.
- Ao clicar no botão "Finalizar Votação", os dados que estão sendo manipulados em memória são jogados para dentro dos arquivos txt para serem armazenados.
- Quando finalizada a votação, o botão "Votar" é desabilitado, de forma que não pode haver mais votos, e o botão "Mostrar Resultado" é habilitado para fazer a contagem de votos e direcionar para a tela final de resultado, onde mostrará o nome do candidato vencedor e a quantidade de votos recebido.
- Cada linha de arquivo e cada arquivo tem uma Hash correspondente, que ao ser modificada é lançada uma janela de aviso e o botão "Votar" é desabilitado até que o dado modificado seja restaurado.
