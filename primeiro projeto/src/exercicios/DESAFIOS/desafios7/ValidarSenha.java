package exercicios.DESAFIOS.desafios7;

import java.util.Scanner;

class ValidarSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();
        try{
            ValidarSenha(senha);
            System.out.println("Senha válida");
        }catch( SenhaInvalida e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    private static void ValidarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalida("A senha precisa ter mais de 8 caracteres");
        }
    }
}
