package fon.bg.ac.rs.fpis.beocapra.controller;

import fon.bg.ac.rs.fpis.beocapra.dto.PrijemnicaDobavljacaDTO;
import fon.bg.ac.rs.fpis.beocapra.model.PrijemnicaDobavljacaEntity;
import fon.bg.ac.rs.fpis.beocapra.service.PrijemnicaDobavljacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/prijemnica")
public class PrijemnicaDobavljacaController {

    private final PrijemnicaDobavljacaService service;

    @PostMapping()
    public ResponseEntity<PrijemnicaDobavljacaDTO> create(@RequestBody PrijemnicaDobavljacaDTO prijemnicaDobavljacaDTO) {
        PrijemnicaDobavljacaEntity prijemnicaDobavljaca = prijemnicaDobavljacaDTO.fromDTO();
        PrijemnicaDobavljacaDTO dto_back = this.service.savePrijemnica(prijemnicaDobavljaca);
        URI uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/api/prijemnica")
                .toUriString());
        return ResponseEntity.created(uri).body(dto_back);
    }

}
