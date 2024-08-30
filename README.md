## Projeto Buscador de CEP
# Objetivo
Este projeto é um estudo sobre o uso de APIs, gravação de arquivos e manejo de exceções em Java, baseado em conceitos aprendidos durante o curso: Java:consumindo API, gravando arquivos e lidando com erros, realizado no portal ALURA. O objetivo principal é interagir com a API de CEPs ViaCEP para buscar informações sobre endereços a partir de um código postal (CEP) e armazenar esses dados em um arquivo JSON.

# Funcionalidades
Busca de CEP: Permite ao usuário buscar informações sobre um CEP específico usando a API ViaCEP.
Gravação de Dados em Arquivo: Armazena os dados dos CEPs pesquisados em um arquivo JSON para futura referência.
Tratamento de Exceções: Inclui manejo de exceções personalizadas para lidar com erros durante a busca de CEPs.
## Estrutura do Projeto
# Classes

BuscadorCep: Responsável por fazer a requisição HTTP para a API ViaCEP e tratar as respostas. Implementa a lógica de busca e tratamento de exceções.

CepViaCepApi: Um record do Java que representa o modelo de dados retornado pela API ViaCEP. Inclui informações como CEP, logradouro, bairro, localidade, UF e DDD.

Main: Classe principal que oferece um menu interativo para o usuário. Permite buscar CEPs e gera um arquivo JSON com os dados pesquisados.

GeradorArquivoJson: Classe responsável por gerar e escrever o arquivo JSON contendo a lista de CEPs pesquisados.


# Menu Interativo:

1 - Buscar CEP: Digite um CEP para buscar informações. O sistema irá buscar o CEP na API ViaCEP e armazenar os dados.
0 - Sair: Finaliza o programa e gera um arquivo ceps.json com todas as informações de CEPs pesquisados.

# Arquivo de Saída:

O arquivo ceps.json será gerado na raiz do projeto e conterá os dados em formato JSON dos CEPs pesquisados. 

# Exceções:

ErroNoURL: Exceção personalizada lançada quando ocorre um erro específico relacionado à URL durante a requisição para a API ViaCEP.
Dependências
Gson: Biblioteca para manipulação de JSON em Java. Adicione o JAR do Gson ao seu classpath ou inclua-o no seu gerenciador de dependências.
