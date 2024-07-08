import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.*;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólares (USD): ");
        double valorEmDolares = scanner.nextDouble();

        if (valorEmDolares <= 0) {
            System.out.println("Por favor, insira um valor maior que zero.");
            return;
        }

        // Substitua "YOUR-API-KEY" pela sua chave de API
        String apiKey = "f8e5d74f814ad69c36bf4789";
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        HttpURLConnection request = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(urlStr);
            request = (HttpURLConnection) url.openConnection();
            request.connect();

            int responseCode = request.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.err.println("Erro na resposta da API: " + responseCode);
                return;
            }

            // Lê a resposta da API
            reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Analisa a resposta JSON
            JSONObject exchangeData = new JSONObject(response.toString());
            JSONObject rates = exchangeData.getJSONObject("conversion_rates");

            // Exibe as opções de conversão
            System.out.println("Escolha uma moeda para converter:");
            for (String currency : rates.keySet()) {
                System.out.println(currency);
            }

            System.out.print("Digite a moeda desejada: ");
            String moedaDestino = scanner.next().toUpperCase();

            if (rates.has(moedaDestino)) {
                double taxaDeCambio = rates.getDouble(moedaDestino);
                double valorConvertido = valorEmDolares * taxaDeCambio;
                System.out.println("Valor convertido para " + moedaDestino + ": " + valorConvertido);
            } else {
                System.out.println("Moeda não encontrada na lista de conversão.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao conectar à API: " + e.getMessage());
        } finally {
            if (request != null) {
                request.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Erro ao fechar o leitor: " + e.getMessage());
                }
            }
            scanner.close();
        }
    }
}
