package lab_padroes_pojeto_spring.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab_padroes_pojeto_spring.model.Cliente;
import lab_padroes_pojeto_spring.model.ClienteRepository;
import lab_padroes_pojeto_spring.model.Endereco;
import lab_padroes_pojeto_spring.model.EnderecoRepository;
import lab_padroes_pojeto_spring.service.ClienteService;
import lab_padroes_pojeto_spring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    ViaCepService viaCepService;
    
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return  cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    
    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    private void salvarClienteComCep(Cliente cliente) {
        Endereco endereco = enderecoRepository.findById(cliente.getEndereco().getCep()).orElseGet(() ->{
            Endereco novoEndereco = viaCepService.consultarCep(cliente.getEndereco().getCep());
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
    }


    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
    
}
