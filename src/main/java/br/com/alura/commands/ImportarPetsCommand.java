package br.com.alura.commands;

import br.com.alura.client.HttpClient;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsCommand implements Command{

    @Override
    public void execute() {
        HttpClient client = new HttpClient();
        PetService petService = new PetService(client);
        try {
            petService.importarPetsAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
