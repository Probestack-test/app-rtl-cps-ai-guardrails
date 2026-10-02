package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.EvaluateAiResponseRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for EvaluateAiResponseRequest domain operations.
 */
public interface EvaluateAiResponseRequestDomainRepository {
    EvaluateAiResponseRequest save(EvaluateAiResponseRequest evaluateAiResponseRequest);

    Optional<EvaluateAiResponseRequest> findById(String id);

    List<EvaluateAiResponseRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
