package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.GuardrailDecisionMetadata;
import com.probestack.forgestudio.design.model.GuardrailDecisionReasonsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GuardrailDecision
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class GuardrailDecision {

  private UUID evaluationId;

  /**
   * Final decision for this request/response.
   */
  public enum DecisionEnum {
    ALLOW("ALLOW"),
    
    MODIFY("MODIFY"),
    
    BLOCK("BLOCK"),
    
    FLAG("FLAG");

    private String value;

    DecisionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DecisionEnum decision;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    WARNING("WARNING"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  @Valid
  private List<@Valid GuardrailDecisionReasonsInner> reasons;

  @Valid
  private Map<String, Object> modifiedPayload = new HashMap<>();

  private GuardrailDecisionMetadata metadata;

  private String auditReference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAt;

  private Integer latencyMs;

  public GuardrailDecision() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GuardrailDecision(UUID evaluationId, DecisionEnum decision, OffsetDateTime evaluatedAt, Integer latencyMs) {
    this.evaluationId = evaluationId;
    this.decision = decision;
    this.evaluatedAt = evaluatedAt;
    this.latencyMs = latencyMs;
  }

  public GuardrailDecision evaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * Get evaluationId
   * @return evaluationId
  */
  @NotNull @Valid   @Schema(name = "evaluationId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evaluationId")
  public UUID getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
  }

  public GuardrailDecision decision(DecisionEnum decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Final decision for this request/response.
   * @return decision
  */
  @NotNull   @Schema(name = "decision", example = "BLOCK", description = "Final decision for this request/response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decision")
  public DecisionEnum getDecision() {
    return decision;
  }

  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }

  public GuardrailDecision severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
    @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public GuardrailDecision reasons(List<@Valid GuardrailDecisionReasonsInner> reasons) {
    this.reasons = reasons;
    return this;
  }

  public GuardrailDecision addReasonsItem(GuardrailDecisionReasonsInner reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

  /**
   * Why this decision was made.
   * @return reasons
  */
  @Valid   @Schema(name = "reasons", description = "Why this decision was made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasons")
  public List<@Valid GuardrailDecisionReasonsInner> getReasons() {
    return reasons;
  }

  public void setReasons(List<@Valid GuardrailDecisionReasonsInner> reasons) {
    this.reasons = reasons;
  }

  public GuardrailDecision modifiedPayload(Map<String, Object> modifiedPayload) {
    this.modifiedPayload = modifiedPayload;
    return this;
  }

  public GuardrailDecision putModifiedPayloadItem(String key, Object modifiedPayloadItem) {
    if (this.modifiedPayload == null) {
      this.modifiedPayload = new HashMap<>();
    }
    this.modifiedPayload.put(key, modifiedPayloadItem);
    return this;
  }

  /**
   * If decision = MODIFY, the sanitized payload.
   * @return modifiedPayload
  */
    @Schema(name = "modifiedPayload", example = "{\"messages\":[{\"role\":\"user\",\"content\":\"[REDACTED — prompt injection detected]\"}]}", description = "If decision = MODIFY, the sanitized payload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedPayload")
  public Map<String, Object> getModifiedPayload() {
    return modifiedPayload;
  }

  public void setModifiedPayload(Map<String, Object> modifiedPayload) {
    this.modifiedPayload = modifiedPayload;
  }

  public GuardrailDecision metadata(GuardrailDecisionMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid   @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public GuardrailDecisionMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(GuardrailDecisionMetadata metadata) {
    this.metadata = metadata;
  }

  public GuardrailDecision auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://guardrails/a1b2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }

  public GuardrailDecision evaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
    return this;
  }

  /**
   * Get evaluatedAt
   * @return evaluatedAt
  */
  @NotNull @Valid   @Schema(name = "evaluatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evaluatedAt")
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }

  public GuardrailDecision latencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
    return this;
  }

  /**
   * Get latencyMs
   * @return latencyMs
  */
  @NotNull   @Schema(name = "latencyMs", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latencyMs")
  public Integer getLatencyMs() {
    return latencyMs;
  }

  public void setLatencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardrailDecision guardrailDecision = (GuardrailDecision) o;
    return Objects.equals(this.evaluationId, guardrailDecision.evaluationId) &&
        Objects.equals(this.decision, guardrailDecision.decision) &&
        Objects.equals(this.severity, guardrailDecision.severity) &&
        Objects.equals(this.reasons, guardrailDecision.reasons) &&
        Objects.equals(this.modifiedPayload, guardrailDecision.modifiedPayload) &&
        Objects.equals(this.metadata, guardrailDecision.metadata) &&
        Objects.equals(this.auditReference, guardrailDecision.auditReference) &&
        Objects.equals(this.evaluatedAt, guardrailDecision.evaluatedAt) &&
        Objects.equals(this.latencyMs, guardrailDecision.latencyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, decision, severity, reasons, modifiedPayload, metadata, auditReference, evaluatedAt, latencyMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardrailDecision {\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    modifiedPayload: ").append(toIndentedString(modifiedPayload)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
    sb.append("    latencyMs: ").append(toIndentedString(latencyMs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

