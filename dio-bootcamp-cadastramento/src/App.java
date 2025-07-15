import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.model.MenuOption;
import br.model.UserModel;
import br.dao.UserDAO;
import br.exception.EmptyStorageException;
import br.exception.UserNotFoundException;
import br.exception.ValidatorException;
import br.validator.UserValidator;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private final static UserDAO dao = new UserDAO();

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Bem vindo ao cadastro de usuário, selecione a operação desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Deletar");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            var userInput = scanner.nextInt();

            var selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuário salvo %s", user);
                }
                case UPDATE -> {
                    try {
                        var user = dao.update(requestToUpdate());
                        System.out.printf("Usuário cadastrado %s", user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());

                    
                    }finally {
                        System.out.println("===============");
                    }
                    

                }
                case DELETE -> {
                    try {
                        dao.delete(requestID());
                        System.out.printf("Usuário deletado %s");
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());

                    } finally {
                        System.out.println("===============");
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestID();
                        var user = dao.findById(id);
                        System.out.printf("Usuários com id %s: ", id);
                        System.out.println(user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());

                    } finally {
                        System.out.println("===============");
                    }

                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.printf("Usuários cadastrados");
                    System.out.println("================");
                    users.forEach(System.out::println);
                    System.out.println("================");
                }
                case EXIT -> System.exit(0);
            }

        }
    }

    private static long requestID() {
        System.out.println("Informe o ID do usuário: ");
        return scanner.nextLong();
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o ID do usuário: ");
        var id = scanner.nextLong();
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.nextLine();
        System.out.println("Informe o email do usuário: ");
        var email = scanner.nextLine();
        System.out.println("Informe o data de nascimento do usuário: ");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        var birthday = OffsetDateTime.parse(birthdayString, formatter);
        
        return validateInputs(0, name, email, birthday);
    }

    private static UserModel validateInputs(final long id, final String nome, final String email, final OffsetDateTime birthday ){
        var user = new UserModel(0, nome, email, birthday);
        try{
           UserValidator.verifyModel(user);
           return user; 
        }catch(ValidatorException e){

        }
       
        return user;
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.nextLine();
        System.out.println("Informe o email do usuário: ");
        var email = scanner.nextLine();
        System.out.println("Informe o data de nascimento do usuário: ");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        var birthday = OffsetDateTime.parse(birthdayString, formatter);
        return validateInputs(0, name, email, birthday);

    }
}
