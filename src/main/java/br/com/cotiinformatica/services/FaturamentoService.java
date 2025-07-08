package br.com.cotiinformatica.services;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cotiinformatica.dtos.FaturamentosRequest;
import br.com.cotiinformatica.dtos.FaturamentosResponse;
import br.com.cotiinformatica.entities.Faturamento;
import br.com.cotiinformatica.repositories.FaturamentoRepository;
@Service
public class FaturamentoService {

    @Autowired FaturamentoRepository faturamentoRepository;

    public FaturamentosResponse criarFaturamento(FaturamentosRequest request) {

        var mapper = new ModelMapper();
        var faturamento = mapper.map(request, Faturamento.class);
        //faturamento.setDataPedido(request.getDataPedido() != null ? LocalDate.parse(request.getDataPedido()) : null);
        faturamento.setDataHoraCriacao(Date.from(Instant.now()));

        faturamentoRepository.save(faturamento);
        return mapper.map(faturamento, FaturamentosResponse.class);
    }
    public List<FaturamentosResponse> consultarFaturamentos() {
        var mapper = new ModelMapper();
        var faturamentos = faturamentoRepository.findAll();

        return faturamentos
                .stream()
                .map(faturamento -> mapper.map(faturamento, FaturamentosResponse.class))
                .collect(Collectors.toList());
    }
}



