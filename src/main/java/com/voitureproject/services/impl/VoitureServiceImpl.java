package com.voitureproject.services.impl;

import com.voitureproject.models.VoitureModel;
import com.voitureproject.repository.VoitureRepository;
import com.voitureproject.services.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureServiceImpl implements VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    @Override
    public void addVoiture(VoitureModel voiture) {
        voitureRepository.save(voiture);
    }

    @Override
    public List<VoitureModel> getAllVoiture() {
        return voitureRepository.findAll();
    }

    @Override
    public void deleteVoiture(Long id) {
        VoitureModel voiture = voitureRepository.findById(id).get();
        voitureRepository.delete(voiture);
    }

}
