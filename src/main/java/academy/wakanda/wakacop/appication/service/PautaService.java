package academy.wakanda.wakacop.appication.service;

import academy.wakanda.wakacop.appication.api.NovaPautaRequest;
import academy.wakanda.wakacop.appication.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);

}
