package br.com.alura.commands;

import br.com.alura.client.HttpClient;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command {

    @Override
    public void execute() {
        HttpClient client = new HttpClient();
        AbrigoService abrigoService = new AbrigoService(client);
        try {
            abrigoService.listarAbrigos();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
