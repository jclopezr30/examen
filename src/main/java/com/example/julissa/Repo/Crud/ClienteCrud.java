package com.example.julissa.Repo.Crud;

import com.example.julissa.Modelo.Cliente;
import com.example.julissa.Repo.dao.ClienteDAO;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrud extends CrudRepository<Cliente, Integer>, ClienteDAO {

}
