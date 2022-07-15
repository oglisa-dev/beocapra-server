package fon.bg.ac.rs.fpis.beocapra.controller;

import fon.bg.ac.rs.fpis.beocapra.dto.DobavljacDTO;
import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;
import fon.bg.ac.rs.fpis.beocapra.service.DobavljacServiceImpl;
import fon.bg.ac.rs.fpis.beocapra.service.RadnikServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/dobavljaci")
@RequiredArgsConstructor
public class DobavljacController {

    @Autowired
    private DobavljacServiceImpl service;

    @GetMapping()
    public ResponseEntity<Collection<DobavljacDTO>> getAll() {
        Collection<DobavljacDTO> dobavljacDTOS = service.findAll();
        return ResponseEntity.ok().body(dobavljacDTOS);
    }

}
