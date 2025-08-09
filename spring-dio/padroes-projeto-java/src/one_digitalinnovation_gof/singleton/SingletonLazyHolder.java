package one_digitalinnovation_gof.singleton;
/**
 * Singleton "apressado"
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
