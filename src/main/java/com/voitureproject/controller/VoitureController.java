package com.voitureproject.controller;

import com.voitureproject.models.VoitureModel;
import com.voitureproject.services.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/voiture")
public class VoitureController {

    @Autowired
    private VoitureService voitureService;

    @GetMapping("/getAllVoiture")
    public List<VoitureModel> getAllVoiture(){
        return new ResponseEntity<>(voitureService.getAllVoiture(), HttpStatus.OK).getBody();
    }


    @PostMapping("/postVoiture")
    public void addVoiture(@RequestBody VoitureModel voiture){
        voitureService.addVoiture(voiture);
    }

    @DeleteMapping("/deleteVoiture")
    public void deleteVoiture (@RequestParam Long id){
        voitureService.deleteVoiture(id);
    }
}
