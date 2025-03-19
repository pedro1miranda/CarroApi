package sevice;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.CarrosString;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsomeApi {
    CarrosString carrosDTO = new CarrosString();
    public CarrosString obterDado(int id, String modelo, String ano) throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + id + "/modelos/" + modelo + "/anos/" + ano))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper napper = new ObjectMapper();
            carrosDTO = napper.readValue(response.body(), CarrosString.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return carrosDTO;
    }
}
