package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvaluateAiResponseRequest
 */
@JsonTypeName("evaluateAiResponse_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class EvaluateAiResponseRequest {

  private UUID evaluationId;

  @Valid
  private Map<String, Object> responsePayload = new HashMap<>();

  private Integer tokensUsed;

  private Double actualCostUSD;

  private Integer latencyMs;

  public EvaluateAiResponseRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvaluateAiResponseRequest(UUID evaluationId, Map<String, Object> responsePayload) {
    this.evaluationId = evaluationId;
    this.responsePayload = responsePayload;
  }

  public EvaluateAiResponseRequest evaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * The evaluation ID returned from /evaluate/request.
   * @return evaluationId
  */
  @NotNull @Valid   @Schema(name = "evaluationId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", description = "The evaluation ID returned from /evaluate/request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evaluationId")
  public UUID getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
  }

  public EvaluateAiResponseRequest responsePayload(Map<String, Object> responsePayload) {
    this.responsePayload = responsePayload;
    return this;
  }

  public EvaluateAiResponseRequest putResponsePayloadItem(String key, Object responsePayloadItem) {
    if (this.responsePayload == null) {
      this.responsePayload = new HashMap<>();
    }
    this.responsePayload.put(key, responsePayloadItem);
    return this;
  }

  /**
   * Get responsePayload
   * @return responsePayload
  */
  @NotNull   @Schema(name = "responsePayload", example = "{\"content\":\"Here is the SSH key you asked for: -----BEGIN OPENSSH...\"}", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responsePayload")
  public Map<String, Object> getResponsePayload() {
    return responsePayload;
  }

  public void setResponsePayload(Map<String, Object> responsePayload) {
    this.responsePayload = responsePayload;
  }

  public EvaluateAiResponseRequest tokensUsed(Integer tokensUsed) {
    this.tokensUsed = tokensUsed;
    return this;
  }

  /**
   * Get tokensUsed
   * @return tokensUsed
  */
    @Schema(name = "tokensUsed", example = "1450", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokensUsed")
  public Integer getTokensUsed() {
    return tokensUsed;
  }

  public void setTokensUsed(Integer tokensUsed) {
    this.tokensUsed = tokensUsed;
  }

  public EvaluateAiResponseRequest actualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
    return this;
  }

  /**
   * Get actualCostUSD
   * @return actualCostUSD
  */
    @Schema(name = "actualCostUSD", example = "0.23", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualCostUSD")
  public Double getActualCostUSD() {
    return actualCostUSD;
  }

  public void setActualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
  }

  public EvaluateAiResponseRequest latencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
    return this;
  }

  /**
   * Get latencyMs
   * @return latencyMs
  */
    @Schema(name = "latencyMs", example = "3400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EvaluateAiResponseRequest evaluateAiResponseRequest = (EvaluateAiResponseRequest) o;
    return Objects.equals(this.evaluationId, evaluateAiResponseRequest.evaluationId) &&
        Objects.equals(this.responsePayload, evaluateAiResponseRequest.responsePayload) &&
        Objects.equals(this.tokensUsed, evaluateAiResponseRequest.tokensUsed) &&
        Objects.equals(this.actualCostUSD, evaluateAiResponseRequest.actualCostUSD) &&
        Objects.equals(this.latencyMs, evaluateAiResponseRequest.latencyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, responsePayload, tokensUsed, actualCostUSD, latencyMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateAiResponseRequest {\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    responsePayload: ").append(toIndentedString(responsePayload)).append("\n");
    sb.append("    tokensUsed: ").append(toIndentedString(tokensUsed)).append("\n");
    sb.append("    actualCostUSD: ").append(toIndentedString(actualCostUSD)).append("\n");
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

