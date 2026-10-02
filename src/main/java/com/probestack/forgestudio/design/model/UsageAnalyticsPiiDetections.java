package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UsageAnalyticsPiiDetections
 */
@JsonTypeName("UsageAnalytics_piiDetections")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class UsageAnalyticsPiiDetections {

  private Integer emailsDetected;

  private Integer creditCardsDetected;

  private Integer ssnDetected;

  private Integer apiKeysDetected;

  public UsageAnalyticsPiiDetections emailsDetected(Integer emailsDetected) {
    this.emailsDetected = emailsDetected;
    return this;
  }

  /**
   * Get emailsDetected
   * @return emailsDetected
  */
    @Schema(name = "emailsDetected", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailsDetected")
  public Integer getEmailsDetected() {
    return emailsDetected;
  }

  public void setEmailsDetected(Integer emailsDetected) {
    this.emailsDetected = emailsDetected;
  }

  public UsageAnalyticsPiiDetections creditCardsDetected(Integer creditCardsDetected) {
    this.creditCardsDetected = creditCardsDetected;
    return this;
  }

  /**
   * Get creditCardsDetected
   * @return creditCardsDetected
  */
    @Schema(name = "creditCardsDetected", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCardsDetected")
  public Integer getCreditCardsDetected() {
    return creditCardsDetected;
  }

  public void setCreditCardsDetected(Integer creditCardsDetected) {
    this.creditCardsDetected = creditCardsDetected;
  }

  public UsageAnalyticsPiiDetections ssnDetected(Integer ssnDetected) {
    this.ssnDetected = ssnDetected;
    return this;
  }

  /**
   * Get ssnDetected
   * @return ssnDetected
  */
    @Schema(name = "ssnDetected", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssnDetected")
  public Integer getSsnDetected() {
    return ssnDetected;
  }

  public void setSsnDetected(Integer ssnDetected) {
    this.ssnDetected = ssnDetected;
  }

  public UsageAnalyticsPiiDetections apiKeysDetected(Integer apiKeysDetected) {
    this.apiKeysDetected = apiKeysDetected;
    return this;
  }

  /**
   * Get apiKeysDetected
   * @return apiKeysDetected
  */
    @Schema(name = "apiKeysDetected", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiKeysDetected")
  public Integer getApiKeysDetected() {
    return apiKeysDetected;
  }

  public void setApiKeysDetected(Integer apiKeysDetected) {
    this.apiKeysDetected = apiKeysDetected;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyticsPiiDetections usageAnalyticsPiiDetections = (UsageAnalyticsPiiDetections) o;
    return Objects.equals(this.emailsDetected, usageAnalyticsPiiDetections.emailsDetected) &&
        Objects.equals(this.creditCardsDetected, usageAnalyticsPiiDetections.creditCardsDetected) &&
        Objects.equals(this.ssnDetected, usageAnalyticsPiiDetections.ssnDetected) &&
        Objects.equals(this.apiKeysDetected, usageAnalyticsPiiDetections.apiKeysDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailsDetected, creditCardsDetected, ssnDetected, apiKeysDetected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyticsPiiDetections {\n");
    sb.append("    emailsDetected: ").append(toIndentedString(emailsDetected)).append("\n");
    sb.append("    creditCardsDetected: ").append(toIndentedString(creditCardsDetected)).append("\n");
    sb.append("    ssnDetected: ").append(toIndentedString(ssnDetected)).append("\n");
    sb.append("    apiKeysDetected: ").append(toIndentedString(apiKeysDetected)).append("\n");
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

