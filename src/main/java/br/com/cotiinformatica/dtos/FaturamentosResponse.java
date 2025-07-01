package br.com.cotiinformatica.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class FaturamentosResponse {

    private UUID id;
    private LocalDate dataPedido;
    private Double valor;
    private String cliente;
    private String detalhes;
    private String status;
    private LocalDateTime dataHoraCriacao;
}
