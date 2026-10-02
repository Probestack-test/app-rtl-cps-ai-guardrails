package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GuardrailDecisionMetadata
 */
@JsonTypeName("GuardrailDecision_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class GuardrailDecisionMetadata {

  private String actor;

  private String model;

  private Integer tokensEvaluated;

  private Integer rulesEvaluated;

  @Valid
  private List<String> redactedFields;

  public GuardrailDecisionMetadata actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
    @Schema(name = "actor", example = "service.WORKSPACE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public GuardrailDecisionMetadata model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
    @Schema(name = "model", example = "claude-3-5-sonnet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public GuardrailDecisionMetadata tokensEvaluated(Integer tokensEvaluated) {
    this.tokensEvaluated = tokensEvaluated;
    return this;
  }

  /**
   * Get tokensEvaluated
   * @return tokensEvaluated
  */
    @Schema(name = "tokensEvaluated", example = "342", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokensEvaluated")
  public Integer getTokensEvaluated() {
    return tokensEvaluated;
  }

  public void setTokensEvaluated(Integer tokensEvaluated) {
    this.tokensEvaluated = tokensEvaluated;
  }

  public GuardrailDecisionMetadata rulesEvaluated(Integer rulesEvaluated) {
    this.rulesEvaluated = rulesEvaluated;
    return this;
  }

  /**
   * Get rulesEvaluated
   * @return rulesEvaluated
  */
    @Schema(name = "rulesEvaluated", example = "24", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rulesEvaluated")
  public Integer getRulesEvaluated() {
    return rulesEvaluated;
  }

  public void setRulesEvaluated(Integer rulesEvaluated) {
    this.rulesEvaluated = rulesEvaluated;
  }

  public GuardrailDecisionMetadata redactedFields(List<String> redactedFields) {
    this.redactedFields = redactedFields;
    return this;
  }

  public GuardrailDecisionMetadata addRedactedFieldsItem(String redactedFieldsItem) {
    if (this.redactedFields == null) {
      this.redactedFields = new ArrayList<>();
    }
    this.redactedFields.add(redactedFieldsItem);
    return this;
  }

  /**
   * Get redactedFields
   * @return redactedFields
  */
    @Schema(name = "redactedFields", example = "[\"content.email\",\"content.ssn\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redactedFields")
  public List<String> getRedactedFields() {
    return redactedFields;
  }

  public void setRedactedFields(List<String> redactedFields) {
    this.redactedFields = redactedFields;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardrailDecisionMetadata guardrailDecisionMetadata = (GuardrailDecisionMetadata) o;
    return Objects.equals(this.actor, guardrailDecisionMetadata.actor) &&
        Objects.equals(this.model, guardrailDecisionMetadata.model) &&
        Objects.equals(this.tokensEvaluated, guardrailDecisionMetadata.tokensEvaluated) &&
        Objects.equals(this.rulesEvaluated, guardrailDecisionMetadata.rulesEvaluated) &&
        Objects.equals(this.redactedFields, guardrailDecisionMetadata.redactedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, model, tokensEvaluated, rulesEvaluated, redactedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardrailDecisionMetadata {\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    tokensEvaluated: ").append(toIndentedString(tokensEvaluated)).append("\n");
    sb.append("    rulesEvaluated: ").append(toIndentedString(rulesEvaluated)).append("\n");
    sb.append("    redactedFields: ").append(toIndentedString(redactedFields)).append("\n");
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

