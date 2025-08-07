package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.my_first_web_api.handler.CampoObrigatorioException;
import dio.my_first_web_api.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null){
            throw new CampoObrigatorioException("login");
        }
        if(usuario.getPassword()==null){
            throw new CampoObrigatorioException("senha");
        }
        if(usuario.getId() == null){
            System.out.println("SAVE - recebendo o usuario na camada de repositorio");
        }else{
            System.out.println("UPDATE - recebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.printf("Delete/id - Recebendo o id %d para deletar um usuario",id);
    }

    public List<Usuario> findAll(){
        System.out.println("Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("daniel", "daasd"));
        usuarios.add(new Usuario("maria", "rosse"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf("Find/id  recebendo o id %d para encontrar o usuario",id);
        return new Usuario("Daniel", "asda");
    }
    public Usuario findByUsername(String username){
        System.out.printf("Find/name  recebendo o username %s para encontrar o usuario",username);
        return new Usuario("Daniel", "asda");
    }
}
