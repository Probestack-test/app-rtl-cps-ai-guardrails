package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.EvaluateAiResponseRequestDomainRepository;
import com.probestack.forgestudio.design.model.EvaluateAiResponseRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.EvaluateAiResponseRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.EvaluateAiResponseRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EvaluateAiResponseRequestMongoPersistenceAdapter implements EvaluateAiResponseRequestDomainRepository {
    private final EvaluateAiResponseRequestMongoRepository repository;

    public EvaluateAiResponseRequestMongoPersistenceAdapter(
            EvaluateAiResponseRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public EvaluateAiResponseRequest save(EvaluateAiResponseRequest evaluateAiResponseRequest) {
        EvaluateAiResponseRequestDocument document = toDocument(evaluateAiResponseRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<EvaluateAiResponseRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<EvaluateAiResponseRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private EvaluateAiResponseRequestDocument toDocument(
            EvaluateAiResponseRequest evaluateAiResponseRequest) {
        EvaluateAiResponseRequestDocument document = new EvaluateAiResponseRequestDocument();
        BeanUtils.copyProperties(evaluateAiResponseRequest, document);
        return document;
    }

    private EvaluateAiResponseRequest toDomain(EvaluateAiResponseRequestDocument document) {
        EvaluateAiResponseRequest domain = new EvaluateAiResponseRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
