package br.com.cotiinformatica.dtos;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class FaturamentosRequest {

    private UUID id;
    private Date dataPedido;
    private Double valor;
    private String cliente;
    private String detalhes;
    private String status;
}
