package br.com.cotiinformatica.controllers;

import br.com.cotiinformatica.dtos.FaturamentosRequest;
import br.com.cotiinformatica.dtos.FaturamentosResponse;
import br.com.cotiinformatica.services.FaturamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/faturamentos")
public class FaturamentosController {

    @Autowired FaturamentoService pedidoService;
    @Autowired
    private FaturamentoService faturamentoService;

    @PostMapping
    public ResponseEntity<FaturamentosResponse> post(@RequestBody FaturamentosRequest request) {
        return ResponseEntity.ok(faturamentoService.criarFaturamento(request));
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(faturamentoService.consultarFaturamentos());
    }


}
