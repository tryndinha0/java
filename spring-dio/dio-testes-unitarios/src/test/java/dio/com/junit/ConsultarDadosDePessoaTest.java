package dio.com.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import dio.com.junit.model.BancoDeDados;
import dio.com.junit.model.Pessoa;

public class ConsultarDadosDePessoaTest {
    
    @BeforeAll
    void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    public void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Daniel", LocalDate.of(2005, 1, 1)));
    }

    @AfterEach
    public void removeDadosParaTeste(){
        BancoDeDados.remoteDados(new Pessoa("Daniel", LocalDate.of(2005, 1, 1)));
    }

    @Test
    public void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
     @Test
    public void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    public static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizar conexao");
    }
    
}
