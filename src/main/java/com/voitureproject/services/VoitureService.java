package com.voitureproject.services;

import com.voitureproject.models.VoitureModel;

import java.util.List;

public interface VoitureService {

    public void addVoiture(VoitureModel voiture);

    public List<VoitureModel> getAllVoiture();

    public void deleteVoiture (Long id);
}
