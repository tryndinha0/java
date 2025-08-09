package one_digitalinnovation_gof.singleton;
/**
 * Singleton "apressado"
 */
public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstacia(){
        if(instancia == null){
            instancia = new SingletonEager();
        }
        return instancia;
    }
}
