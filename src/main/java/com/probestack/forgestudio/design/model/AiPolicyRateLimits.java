package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AiPolicyRateLimits
 */
@JsonTypeName("AiPolicy_rateLimits")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class AiPolicyRateLimits {

  private Integer requestsPerMinute;

  private Integer tokensPerMinute;

  public AiPolicyRateLimits requestsPerMinute(Integer requestsPerMinute) {
    this.requestsPerMinute = requestsPerMinute;
    return this;
  }

  /**
   * Get requestsPerMinute
   * @return requestsPerMinute
  */
    @Schema(name = "requestsPerMinute", example = "60", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestsPerMinute")
  public Integer getRequestsPerMinute() {
    return requestsPerMinute;
  }

  public void setRequestsPerMinute(Integer requestsPerMinute) {
    this.requestsPerMinute = requestsPerMinute;
  }

  public AiPolicyRateLimits tokensPerMinute(Integer tokensPerMinute) {
    this.tokensPerMinute = tokensPerMinute;
    return this;
  }

  /**
   * Get tokensPerMinute
   * @return tokensPerMinute
  */
    @Schema(name = "tokensPerMinute", example = "100000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokensPerMinute")
  public Integer getTokensPerMinute() {
    return tokensPerMinute;
  }

  public void setTokensPerMinute(Integer tokensPerMinute) {
    this.tokensPerMinute = tokensPerMinute;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPolicyRateLimits aiPolicyRateLimits = (AiPolicyRateLimits) o;
    return Objects.equals(this.requestsPerMinute, aiPolicyRateLimits.requestsPerMinute) &&
        Objects.equals(this.tokensPerMinute, aiPolicyRateLimits.tokensPerMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestsPerMinute, tokensPerMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPolicyRateLimits {\n");
    sb.append("    requestsPerMinute: ").append(toIndentedString(requestsPerMinute)).append("\n");
    sb.append("    tokensPerMinute: ").append(toIndentedString(tokensPerMinute)).append("\n");
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

