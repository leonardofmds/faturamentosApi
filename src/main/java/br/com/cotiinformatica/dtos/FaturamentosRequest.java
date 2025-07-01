package br.com.cotiinformatica.dtos;

import lombok.Data;
import java.util.UUID;

@Data
public class FaturamentosRequest {

    private UUID id;
    private String dataPedido;
    private Double valor;
    private String cliente;
    private String detalhes;
    private String status;
}
