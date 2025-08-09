package lab_padroes_pojeto_spring.service;

import org.springframework.stereotype.Service;

import lab_padroes_pojeto_spring.model.Cliente;

@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    
    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
