import facade.Facade;
import one_digitalinnovation_gof.singleton.SingletonLazy;
import one_digitalinnovation_gof.strategy.Comportamento;
import one_digitalinnovation_gof.strategy.ComportamentoDefensivo;
import one_digitalinnovation_gof.strategy.ComportamentoNormal;
import one_digitalinnovation_gof.strategy.ComportamentoOfensivo;
import one_digitalinnovation_gof.strategy.Robo;


public class App {
    public static void main(String[] args) throws Exception {
    //  SINGLETON
    //    SingletonLazy lazy = SingletonLazy.getInstancia();
    //    System.out.println(lazy);
    //    lazy=SingletonLazy.getInstancia();
    //    System.out.println(lazy);

    //  Strategy
    // Comportamento normal = new ComportamentoNormal();
    // Comportamento defensivo = new ComportamentoDefensivo();
    // Comportamento agressivo = new ComportamentoOfensivo();

    // Robo robo = new Robo();
    // robo.setComportamento(normal);

    // robo.mover();
    // robo.mover();

    // Facade
    Facade facade = new Facade();
    facade.migrarCilente("venilton", "12312321");
    }
}
