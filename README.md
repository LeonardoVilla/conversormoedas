Conversor de Moedas
Descrição
O Conversor de Moedas é uma aplicação em Java que permite a conversão de valores em dólares (USD) para diversas outras moedas. A aplicação utiliza a API da ExchangeRate-API para obter as taxas de câmbio mais recentes.

Funcionalidades
Conversão de valores de USD para outras moedas.
Exibição das opções de moedas disponíveis para conversão.
Validação de entrada para garantir valores positivos.
Requisitos
Java 8 ou superior.
Conexão com a internet para acessar a API de câmbio.
Uma chave de API válida da ExchangeRate-API.
Como Usar
Clone o repositório:

sh
Copiar código
git clone https://github.com/seuusuario/conversor-moedas.git
Navegue até o diretório do projeto:

sh
Copiar código
cd conversor-moedas
Abra o arquivo Conversor.java e substitua "YOUR-API-KEY" pela sua chave de API:

java
Copiar código
String apiKey = "YOUR-API-KEY";
Compile o código:

sh
Copiar código
javac Conversor.java
Execute a aplicação:

sh
Copiar código
java Conversor
Insira o valor em dólares que deseja converter e siga as instruções exibidas.

Exemplo de Uso
sh
Copiar código
Digite o valor em dólares (USD): 100
Escolha uma moeda para converter:
AUD
BRL
CAD
...
Digite a moeda desejada: BRL
Valor convertido para BRL: 530.25
Estrutura do Código
Conversor.java: O arquivo principal contendo a lógica de conversão de moeda, manipulação de API e interação com o usuário.
Tratamento de Erros
Conexão com a API: O código verifica o código de resposta HTTP e exibe uma mensagem de erro se a solicitação não for bem-sucedida.
Entrada do Usuário: O código valida se o valor inserido é positivo e se a moeda inserida está disponível na resposta da API.
Contribuindo
Faça um fork do repositório.
Crie uma branch para sua feature (git checkout -b feature/nova-feature).
Commit suas mudanças (git commit -am 'Adiciona nova feature').
Faça um push para a branch (git push origin feature/nova-feature).
Abra um Pull Request.
Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

Agradecimentos
ExchangeRate-API pela API gratuita de taxas de câmbio.
