package br.com.alura.screenmatch.service;

import consumoApi.obterDados;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe );
}
