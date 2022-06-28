package br.com.hmslima.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hmslima.backend.entity.Recado;
import br.com.hmslima.backend.service.RecadosService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RecadosController {

    private RecadosService recadosService;

    public RecadosController(RecadosService recadosService) {
        this.recadosService = recadosService;
    }

    @GetMapping("/recados")
    public List<Recado> findAll() {
        return recadosService.findAll();
    }

    @GetMapping("/recados/{recadoId}")
    public Recado findById(@PathVariable int recadoId) {
        Recado recado = recadosService.findById(recadoId);

        if (recado == null) {
            throw new RuntimeException("recado não encontrado: " + recadoId);
        }

        return recado;
    }

    @PostMapping("/recados")
    public Recado save(@RequestBody Recado recado) {

        recado.setId(0);

        recadosService.save(recado);

        return recado;
    }
    

}
