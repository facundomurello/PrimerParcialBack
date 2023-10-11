package com.example.TpAPI.controllers;

import com.example.TpAPI.entities.Autor;
import com.example.TpAPI.services.AutorServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}