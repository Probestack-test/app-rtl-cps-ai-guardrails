package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.EvaluateAiResponseRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for EvaluateAiResponseRequest documents.
 */
public interface EvaluateAiResponseRequestMongoRepository extends MongoRepository<EvaluateAiResponseRequestDocument, String> {
}
