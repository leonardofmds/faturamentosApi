package br.com.cotiinformatica.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "faturamentos")
public class Faturamento {
    private UUID id;
    private Date dataPedido;
    private Double valor;
    private String cliente;
    private String detalhes;
    private String status;
    private Date dataHoraCriacao;

}
