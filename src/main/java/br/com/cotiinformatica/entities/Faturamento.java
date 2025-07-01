package br.com.cotiinformatica.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "faturamentos")
public class Faturamento {
    private UUID id;
    private LocalDate dataPedido;
    private Double valor;
    private String cliente;
    private String detalhes;
    private String status;
    private LocalDateTime dataHoraCriacao;

}
