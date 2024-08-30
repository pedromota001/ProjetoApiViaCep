import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                        .setPrettyPrinting()
                        .create();
        List<CepViaCepApi> listaCeps = new ArrayList<>();
        int resp;
        do {
            System.out.println("""
                MENU DE OPCOES:
                1 - Buscar cep
                0 - sair
                """);
            System.out.println("Escolha: ");
            resp = scanner.nextInt();
            switch (resp){
                case 1:
                    System.out.println("Digite o CEP: ");
                    var cep = scanner.next();
                    try {
                        BuscadorCep buscadorCep = new BuscadorCep();
                        CepViaCepApi cepViaCepApi = buscadorCep.buscarCep(cep);
                        listaCeps.add(cepViaCepApi);
                        break;
                    }catch (ErroNoURL e){
                        System.out.println(e.getMensagem());
                    }
                case 0:
                    System.out.println("Gerando arquivo .json com ceps pesquisados...");
                    GeradorArquivoJson geradorArquivoJson = new GeradorArquivoJson();
                    FileWriter fileJson = geradorArquivoJson.geraJson(listaCeps);
                    System.out.println("Encerrando buscador de cep!");
                    break;
            }
        }while (resp != 0);
    }
}
