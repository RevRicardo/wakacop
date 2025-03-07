package academy.wakanda.wakacop.pauta.appication.service;

import academy.wakanda.wakacop.pauta.appication.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.appication.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
    Pauta getPautaPorId(UUID idPauta);
}
