package Trabalho;
/*
    RESPOSTAS:
    1) se nenhuma classe reescrever a função emitirSom() da classe Animal, ela executará a mesma coisa que a classe super: a saída será "Seu animal fez um barulhinho"

    2) apos alterar os campos da classe animal para private precisaremos usar os getters e setters para acessá-los ou alterá-los nas classes filhas e precisaremos reescrever o metodo to string() com o getters e adicionando oas atributos específicos das classes
    
    3) para essa classe continuar funcionando normalmente nós vamos precisar atribuir valores aos atributos específicos de cada classe (ex: gato> raça,ovelha>lã )
    quando forem instanciadas  e utilizar os getters no lop for
    

 */
public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Bicho", 8);
        Vaca vaca = new Vaca("Mimosa", 4,"minas");
        Gato gato = new Gato("Garfield", 4,"siamês");
        Ovelha ovelha = new Ovelha("Dolly", 4,"rosa");

        Animal bichos[] = { animal, vaca, gato, ovelha };

        // Aqui, cada instancia eh de um tipo especializado
        if (vaca instanceof Animal)
            System.out.println("vaca eh Animal");
        if (gato instanceof Animal)
            System.out.println("gato eh Animal");
        if (ovelha instanceof Animal)
            System.out.println("ovelha eh Animal");
        System.out.println("-----------\n");
        for (int i = 0; i < bichos.length; i++) {
            System.out.print(bichos[i].getNome());
            if (bichos[i] instanceof Vaca)
                System.out.print(" eh uma vaca");
            if (bichos[i] instanceof Gato)
                System.out.print(" eh um gato");

            if (bichos[i] instanceof Ovelha)
                System.out.print(" eh uma ovelha");
                System.out.print(", tem " + bichos[i].getNumeroPatas()+ " patas e emite o som. ");
                bichos[i].emitirSom();
                System.out.println();

            
            if (bichos[i] instanceof Animal)
                System.out.println(bichos[i].getNome() + " eh um Animal.");

            
        }
        System.out.println(ovelha.toString());
        System.out.println(gato.toString());
        System.out.println(vaca.toString());
    }
}
