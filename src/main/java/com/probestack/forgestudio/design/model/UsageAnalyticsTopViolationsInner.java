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
 * UsageAnalyticsTopViolationsInner
 */
@JsonTypeName("UsageAnalytics_topViolations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class UsageAnalyticsTopViolationsInner {

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    PROMPT_INJECTION("PROMPT_INJECTION"),
    
    PII_DETECTED("PII_DETECTED"),
    
    SECRET_LEAKAGE("SECRET_LEAKAGE"),
    
    POLICY_VIOLATION("POLICY_VIOLATION"),
    
    COST_EXCEEDED("COST_EXCEEDED"),
    
    UNAUTHORIZED_TOOL("UNAUTHORIZED_TOOL"),
    
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

  private Integer count;

  private String topActor;

  public UsageAnalyticsTopViolationsInner category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
    @Schema(name = "category", example = "PROMPT_INJECTION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public UsageAnalyticsTopViolationsInner count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
    @Schema(name = "count", example = "87", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public UsageAnalyticsTopViolationsInner topActor(String topActor) {
    this.topActor = topActor;
    return this;
  }

  /**
   * Get topActor
   * @return topActor
  */
    @Schema(name = "topActor", example = "service.WORKSPACE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topActor")
  public String getTopActor() {
    return topActor;
  }

  public void setTopActor(String topActor) {
    this.topActor = topActor;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyticsTopViolationsInner usageAnalyticsTopViolationsInner = (UsageAnalyticsTopViolationsInner) o;
    return Objects.equals(this.category, usageAnalyticsTopViolationsInner.category) &&
        Objects.equals(this.count, usageAnalyticsTopViolationsInner.count) &&
        Objects.equals(this.topActor, usageAnalyticsTopViolationsInner.topActor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, count, topActor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyticsTopViolationsInner {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    topActor: ").append(toIndentedString(topActor)).append("\n");
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

