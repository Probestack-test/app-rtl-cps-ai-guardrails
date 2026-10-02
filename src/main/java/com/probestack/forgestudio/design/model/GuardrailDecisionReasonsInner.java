package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GuardrailDecisionReasonsInner
 */
@JsonTypeName("GuardrailDecision_reasons_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class GuardrailDecisionReasonsInner {

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    PROMPT_INJECTION("PROMPT_INJECTION"),
    
    PII_DETECTED("PII_DETECTED"),
    
    SECRET_LEAKAGE("SECRET_LEAKAGE"),
    
    POLICY_VIOLATION("POLICY_VIOLATION"),
    
    COST_EXCEEDED("COST_EXCEEDED"),
    
    RATE_LIMIT_EXCEEDED("RATE_LIMIT_EXCEEDED"),
    
    UNAUTHORIZED_TOOL("UNAUTHORIZED_TOOL"),
    
    UNAUTHORIZED_MODEL("UNAUTHORIZED_MODEL"),
    
    HARMFUL_CONTENT("HARMFUL_CONTENT"),
    
    HALLUCINATED_PII("HALLUCINATED_PII"),
    
    TOXICITY("TOXICITY"),
    
    JAILBREAK_ATTEMPT("JAILBREAK_ATTEMPT");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CategoryEnum category;

  private String detail;

  private Double confidence;

  public GuardrailDecisionReasonsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GuardrailDecisionReasonsInner(CategoryEnum category, String detail) {
    this.category = category;
    this.detail = detail;
  }

  public GuardrailDecisionReasonsInner category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull   @Schema(name = "category", example = "PROMPT_INJECTION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public GuardrailDecisionReasonsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @NotNull   @Schema(name = "detail", example = "Detected 'ignore previous instructions' pattern.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public GuardrailDecisionReasonsInner confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  */
    @Schema(name = "confidence", example = "0.98", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardrailDecisionReasonsInner guardrailDecisionReasonsInner = (GuardrailDecisionReasonsInner) o;
    return Objects.equals(this.category, guardrailDecisionReasonsInner.category) &&
        Objects.equals(this.detail, guardrailDecisionReasonsInner.detail) &&
        Objects.equals(this.confidence, guardrailDecisionReasonsInner.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, detail, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardrailDecisionReasonsInner {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

