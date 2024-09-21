package br.com.alura.screenmatch.service;

import javax.management.RuntimeErrorException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.alura.screenmatch.model.DadosSerie;
import consumoApi.obterDados;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    // public DadosSerie obterDados(String json){

    // }

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
         
    }
}
