package fon.bg.ac.rs.fpis.beocapra.controller;

import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;
import fon.bg.ac.rs.fpis.beocapra.service.RadnikService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/radnik")
@RequiredArgsConstructor
public class RadnikController {

    @Autowired
    private RadnikService service;

    @GetMapping()
    public ResponseEntity<Collection<RadnikDTO>> getAll() {
        Collection<RadnikDTO> radnici = service.getAll();
        return ResponseEntity.ok().body(radnici);
    }

    @PostMapping("/login")
    public ResponseEntity<RadnikDTO> login(@RequestBody(required = true) String username,
                                           @RequestBody(required = true) String password) {
        return null;
    }

}
