package com.example.spotfinder.Service;

import com.example.spotfinder.Model.Confirmation;
import com.example.spotfinder.Repository.ConfirmationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfirmationArea2Service {

    @Autowired
    private ConfirmationRepository confirmationRepository;

    public Confirmation saveConfirmation(Confirmation con) {
        return confirmationRepository.save(con);
    }

    public void deleteConfirmation(Long id) {
        confirmationRepository.deleteById(id);
    }

    public List<Confirmation> listAll() {
        return confirmationRepository.findAll();
    }

    public void saveOrUpdateConfirmation(Confirmation con) {
        confirmationRepository.save(con);
    }

    public Confirmation getConfirmation(Long id) {
        Optional<Confirmation> confirmation = confirmationRepository.findById(id);
        return confirmation.orElse(null); // or throw exception if preferred
    }

    public void saveConfirmation(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'saveConfirmation'");
    }
}
