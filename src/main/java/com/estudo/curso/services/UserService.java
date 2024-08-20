package com.estudo.curso.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.estudo.curso.entidades.User;
import com.estudo.curso.repositories.UserRepository;
import com.estudo.curso.services.exceptions.DatabaseException;
import com.estudo.curso.services.exceptions.ResouseNotFoundException;

import jakarta.persistence.EntityExistsException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll(); 
    }

    public User findById(long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try { 
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ObjectNotFoundException("Id not found " + id, e);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        try {
        User entity = repository.getReferenceById(id);
        updadeData(entity, obj);
        return repository.save(entity);
        } catch (EntityExistsException e) {
            throw new ResouseNotFoundException(id);
        }
    }

    private void updadeData(User entity, User obj) {
       entity.setName(obj.getName());
       entity.setEmail(obj.getEmail());
       entity.setPhone(obj.getPhone());
       
        throw new UnsupportedOperationException("Unimplemented method 'updadeData'");
    }
}
