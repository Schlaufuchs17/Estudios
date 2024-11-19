import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClienteREST {
    private final HttpClient cliente = HttpClient.newHttpClient();
    private final String baseUrl = "http://localhost:8080/api/videojuegos";

    public String listarTodos() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(baseUrl))
                .GET()
                .build();
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
