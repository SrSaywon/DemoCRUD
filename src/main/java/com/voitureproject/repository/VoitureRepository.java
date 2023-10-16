package com.voitureproject.repository;

import com.voitureproject.models.VoitureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<VoitureModel, Long> {

}
