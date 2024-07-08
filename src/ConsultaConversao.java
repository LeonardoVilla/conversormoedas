import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversao {

    public Conversao buscarConversao (String base, String target, float AMOUNT){

        URI caminho = URI.create("https://v6.exchangerate-api.com/v6/f8e5d74f814ad69c36bf4789/pair/"+base+"/"+target+"/"+AMOUNT);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(caminho)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversao.class);
        } catch (Exception e) {
            throw new RuntimeException("Moeda não encontrada.");
        }

    }
}