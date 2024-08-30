import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorArquivoJson {
    FileWriter geraJson(List<CepViaCepApi> list){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            FileWriter fileWriter = new FileWriter("ceps.json");
            fileWriter.write(gson.toJson(list));
            fileWriter.close();
            return fileWriter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
