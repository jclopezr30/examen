package com.example.julissa;

import com.example.julissa.Modelo.Cliente;
import com.example.julissa.Modelo.dto.Categoria;
import com.example.julissa.Service.ApiService;
import com.example.julissa.Service.ClienteService;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Scope("session")
@Component
public class ClienteBackBean implements Serializable {

    private String nombre;
    private String apellido;
    private String telefono;
    private List<Cliente> lista;
    private List<Categoria> listaApi;


    private final ClienteService service;
    private final ApiService cliente;

    public ClienteBackBean(ClienteService service, ApiService cliente) {
        this.service = service;
        this.cliente = cliente;
    }

    @PostConstruct
    public void init() {
        cargarLista();
        listaApi = cliente.obtenerTodo();
    }

    private void cargarLista() {

        lista = service.obtenerTodo();
    }

    public void Guardar() {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        service.guardar(cliente);
        PrimeFaces.current().ajax().update("formLista");
        limpiar();
    }

    public void limpiar() {
        nombre = null;
        apellido = null;
        telefono = null;
    }


}

