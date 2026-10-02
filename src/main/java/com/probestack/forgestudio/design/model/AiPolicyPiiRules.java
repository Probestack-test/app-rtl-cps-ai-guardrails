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
 * AiPolicyPiiRules
 */
@JsonTypeName("AiPolicy_piiRules")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class AiPolicyPiiRules {

  private Boolean allowPiiInPrompt;

  private Boolean allowPiiInResponse;

  /**
   * Gets or Sets maskingStrategy
   */
  public enum MaskingStrategyEnum {
    REDACT("REDACT"),
    
    TOKENIZE("TOKENIZE"),
    
    HASH("HASH"),
    
    PARTIAL_MASK("PARTIAL_MASK"),
    
    BLOCK("BLOCK");

    private String value;

    MaskingStrategyEnum(String value) {
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
    public static MaskingStrategyEnum fromValue(String value) {
      for (MaskingStrategyEnum b : MaskingStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private MaskingStrategyEnum maskingStrategy;

  public AiPolicyPiiRules allowPiiInPrompt(Boolean allowPiiInPrompt) {
    this.allowPiiInPrompt = allowPiiInPrompt;
    return this;
  }

  /**
   * Get allowPiiInPrompt
   * @return allowPiiInPrompt
  */
    @Schema(name = "allowPiiInPrompt", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowPiiInPrompt")
  public Boolean getAllowPiiInPrompt() {
    return allowPiiInPrompt;
  }

  public void setAllowPiiInPrompt(Boolean allowPiiInPrompt) {
    this.allowPiiInPrompt = allowPiiInPrompt;
  }

  public AiPolicyPiiRules allowPiiInResponse(Boolean allowPiiInResponse) {
    this.allowPiiInResponse = allowPiiInResponse;
    return this;
  }

  /**
   * Get allowPiiInResponse
   * @return allowPiiInResponse
  */
    @Schema(name = "allowPiiInResponse", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowPiiInResponse")
  public Boolean getAllowPiiInResponse() {
    return allowPiiInResponse;
  }

  public void setAllowPiiInResponse(Boolean allowPiiInResponse) {
    this.allowPiiInResponse = allowPiiInResponse;
  }

  public AiPolicyPiiRules maskingStrategy(MaskingStrategyEnum maskingStrategy) {
    this.maskingStrategy = maskingStrategy;
    return this;
  }

  /**
   * Get maskingStrategy
   * @return maskingStrategy
  */
    @Schema(name = "maskingStrategy", example = "TOKENIZE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maskingStrategy")
  public MaskingStrategyEnum getMaskingStrategy() {
    return maskingStrategy;
  }

  public void setMaskingStrategy(MaskingStrategyEnum maskingStrategy) {
    this.maskingStrategy = maskingStrategy;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPolicyPiiRules aiPolicyPiiRules = (AiPolicyPiiRules) o;
    return Objects.equals(this.allowPiiInPrompt, aiPolicyPiiRules.allowPiiInPrompt) &&
        Objects.equals(this.allowPiiInResponse, aiPolicyPiiRules.allowPiiInResponse) &&
        Objects.equals(this.maskingStrategy, aiPolicyPiiRules.maskingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPiiInPrompt, allowPiiInResponse, maskingStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPolicyPiiRules {\n");
    sb.append("    allowPiiInPrompt: ").append(toIndentedString(allowPiiInPrompt)).append("\n");
    sb.append("    allowPiiInResponse: ").append(toIndentedString(allowPiiInResponse)).append("\n");
    sb.append("    maskingStrategy: ").append(toIndentedString(maskingStrategy)).append("\n");
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

