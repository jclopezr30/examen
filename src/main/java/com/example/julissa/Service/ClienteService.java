package com.example.julissa.Service;

import com.example.julissa.Modelo.Cliente;
import com.example.julissa.Repo.Crud.ClienteCrud;
import com.example.julissa.Repo.dao.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteCrud dao;

    @Autowired
    public ClienteService(ClienteCrud dao) {
        this.dao = dao;
    }

    public List<Cliente> obtenerTodo() {
        return (List<Cliente>)
                dao.findAll();
    }


    public void guardar(Cliente cliente) {
        dao.save(cliente);
    }


}
