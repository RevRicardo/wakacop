package academy.wakanda.wakacop.appication.service;

import academy.wakanda.wakacop.appication.api.NovaPautaRequest;
import academy.wakanda.wakacop.appication.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaAplicationService implements PautaService {
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaCadastradaResponse --> cadastraPauta");
        log.info("[novaPauta] {}",novaPauta);
        log.info("[finaliza] PautaCadastradaResponse --> cadastraPauta");
        return null;
    }
}
