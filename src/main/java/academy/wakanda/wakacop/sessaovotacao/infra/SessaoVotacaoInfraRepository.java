package academy.wakanda.wakacop.sessaovotacao.infra;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaoVotacaoSpringDataSPARepository sessaoVotacaoSpringDataSPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[inicia] SessaoVotacaoInfraRepository  --> salva");
        sessaoVotacaoSpringDataSPARepository.save(sessaoVotacao);
        log.info("[finaliza] SessaoVotacaoInfraRepository  --> salva");
        return sessaoVotacao;
    }
}
