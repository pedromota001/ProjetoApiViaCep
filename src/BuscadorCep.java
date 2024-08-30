import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscadorCep {

    CepViaCepApi buscarCep(String cep) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 400){
                throw new ErroNoURL("Erro no URL! ");
            }
            return new Gson().fromJson(response.body(), CepViaCepApi.class);
        } catch (ErroNoURL erroNoURL){
            System.out.println(erroNoURL.getMensagem());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
