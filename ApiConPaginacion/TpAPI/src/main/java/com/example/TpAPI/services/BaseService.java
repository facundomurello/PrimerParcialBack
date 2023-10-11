package com.example.TpAPI.services;

import com.example.TpAPI.entities.Base;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {
    //Traer una lista de todas las entidades que se encuentran en nuestra base de datos
    public List<E> findAll() throws Exception;

    public  Page<E> findAll(Pageable pageable) throws Exception;


    //Buscar entidades por Id que le pasamos
    public E findById(ID id) throws Exception;
    //Crear nueva entidad
    public E save(E entity) throws Exception;
    //Actualizar entidades
    public E update(ID id, E entity) throws Exception;
    //Eliminar registros
    public  boolean delete(ID id) throws Exception;
}
