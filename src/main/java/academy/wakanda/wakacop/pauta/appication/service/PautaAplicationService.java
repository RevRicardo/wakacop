package academy.wakanda.wakacop.pauta.appication.service;

import academy.wakanda.wakacop.pauta.appication.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.appication.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaAplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaCadastradaResponse --> cadastraPauta");
        log.info("[novaPauta] {}",novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finaliza] PautaCadastradaResponse --> cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {
        log.info("[inicia] PautaAplicationService - getPautaPorId");
        Pauta pautaPorId = pautaRepository.buscaPautaPorId(idPauta);
        log.info("[finaliza] PautaAplicationService - getPautaPorId");
        return null;
    }
}
