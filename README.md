Conversor de Moedas

Descrição
O Conversor de Moedas é um aplicativo em Java que facilita a conversão de valores em dólares (USD) para várias outras moedas. Ele utiliza a API da ExchangeRate-API para obter as taxas de câmbio mais atualizadas.

Funcionalidades
Converte valores de USD para outras moedas.
Mostra as opções de moedas disponíveis para conversão.
Valida a entrada para garantir que os valores sejam positivos.
Requisitos
Java 8 ou superior.
Conexão com a internet para acessar a API de câmbio.
Uma chave de API válida da ExchangeRate-API.
Como Usar
Clone o repositório:
sh
Copy code
git clone https://github.com/seuusuario/conversor-moedas.git
Navegue até o diretório do projeto:
sh
Copy code
cd conversor-moedas
Abra o arquivo Conversor.java e substitua "YOUR-API-KEY" pela sua chave de API:
java
Copy code
String apiKey = "YOUR-API-KEY";
Compile o código:
sh
Copy code
javac Conversor.java
Execute o aplicativo:
sh
Copy code
java Conversor
Insira o valor em dólares que deseja converter e siga as instruções apresentadas.
Exemplo de Uso
sh
Copy code
Digite o valor em dólares (USD): 100
Escolha uma moeda para converter:
AUD
BRL
CAD
...
Digite a moeda desejada: BRL
Valor convertido para BRL: 530.25
Estrutura do Código
Conversor.java: O arquivo principal que contém a lógica de conversão de moeda, manipulação da API e interação com o usuário.
Tratamento de Erros
Conexão com a API: O código verifica o código de resposta HTTP e exibe uma mensagem de erro se a solicitação não for bem-sucedida.
Entrada do Usuário: O código valida se o valor inserido é positivo e se a moeda inserida está disponível na resposta da API.
Contribuindo
Faça um fork do repositório.
Crie uma branch para sua nova funcionalidade:
sh
Copy code
git checkout -b feature/nova-feature
Commit suas mudanças:
sh
Copy code
git commit -am 'Adiciona nova feature'
Faça um push para a branch:
sh
Copy code
git push origin feature/nova-feature
Abra um Pull Request.
Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

Agradecimentos
Agradecimentos à ExchangeRate-API pela API gratuita de taxas de câmbio.
