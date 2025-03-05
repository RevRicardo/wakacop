package academy.wakanda.wakacop.pauta.appication.service;

import academy.wakanda.wakacop.pauta.appication.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.appication.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
