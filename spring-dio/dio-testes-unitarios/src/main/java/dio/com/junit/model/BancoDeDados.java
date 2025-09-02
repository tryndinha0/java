package dio.com.junit.model;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("inicou a conexao");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("finalizou a conexao");
    }
    
    public static void insereDados(Pessoa pessoa){
        //inserir no db
        LOGGER.info("inseriu no db");
    }
    public static void remoteDados(Pessoa pessoa){
        //remove no db
        LOGGER.info("removeu do db");
    }
}
