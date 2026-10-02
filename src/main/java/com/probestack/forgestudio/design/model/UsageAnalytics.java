package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.UsageAnalyticsBreakdownInner;
import com.probestack.forgestudio.design.model.UsageAnalyticsPiiDetections;
import com.probestack.forgestudio.design.model.UsageAnalyticsTopViolationsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UsageAnalytics
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class UsageAnalytics {

  /**
   * Gets or Sets scope
   */
  public enum ScopeEnum {
    TEAM("TEAM"),
    
    SERVICE("SERVICE"),
    
    MODEL("MODEL"),
    
    ORGANIZATION("ORGANIZATION");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ScopeEnum scope;

  private String scopeId;

  /**
   * Gets or Sets window
   */
  public enum WindowEnum {
    TODAY("TODAY"),
    
    LAST_7_DAYS("LAST_7_DAYS"),
    
    LAST_30_DAYS("LAST_30_DAYS"),
    
    MONTH_TO_DATE("MONTH_TO_DATE");

    private String value;

    WindowEnum(String value) {
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
    public static WindowEnum fromValue(String value) {
      for (WindowEnum b : WindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private WindowEnum window;

  private Integer totalRequests;

  private Integer totalTokens;

  private Double totalCostUSD;

  private Integer blockedRequests;

  private Integer modifiedRequests;

  private Integer flaggedRequests;

  @Valid
  private List<@Valid UsageAnalyticsBreakdownInner> breakdown;

  @Valid
  private List<@Valid UsageAnalyticsTopViolationsInner> topViolations;

  private UsageAnalyticsPiiDetections piiDetections;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  public UsageAnalytics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageAnalytics(ScopeEnum scope, String scopeId, WindowEnum window, Integer totalRequests, Double totalCostUSD, OffsetDateTime generatedAt) {
    this.scope = scope;
    this.scopeId = scopeId;
    this.window = window;
    this.totalRequests = totalRequests;
    this.totalCostUSD = totalCostUSD;
    this.generatedAt = generatedAt;
  }

  public UsageAnalytics scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @NotNull   @Schema(name = "scope", example = "TEAM", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public UsageAnalytics scopeId(String scopeId) {
    this.scopeId = scopeId;
    return this;
  }

  /**
   * Get scopeId
   * @return scopeId
  */
  @NotNull   @Schema(name = "scopeId", example = "payments-team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scopeId")
  public String getScopeId() {
    return scopeId;
  }

  public void setScopeId(String scopeId) {
    this.scopeId = scopeId;
  }

  public UsageAnalytics window(WindowEnum window) {
    this.window = window;
    return this;
  }

  /**
   * Get window
   * @return window
  */
  @NotNull   @Schema(name = "window", example = "LAST_7_DAYS", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("window")
  public WindowEnum getWindow() {
    return window;
  }

  public void setWindow(WindowEnum window) {
    this.window = window;
  }

  public UsageAnalytics totalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Get totalRequests
   * @return totalRequests
  */
  @NotNull   @Schema(name = "totalRequests", example = "125400", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalRequests")
  public Integer getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
  }

  public UsageAnalytics totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Get totalTokens
   * @return totalTokens
  */
    @Schema(name = "totalTokens", example = "45800000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public UsageAnalytics totalCostUSD(Double totalCostUSD) {
    this.totalCostUSD = totalCostUSD;
    return this;
  }

  /**
   * Get totalCostUSD
   * @return totalCostUSD
  */
  @NotNull   @Schema(name = "totalCostUSD", example = "1240.5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalCostUSD")
  public Double getTotalCostUSD() {
    return totalCostUSD;
  }

  public void setTotalCostUSD(Double totalCostUSD) {
    this.totalCostUSD = totalCostUSD;
  }

  public UsageAnalytics blockedRequests(Integer blockedRequests) {
    this.blockedRequests = blockedRequests;
    return this;
  }

  /**
   * Get blockedRequests
   * @return blockedRequests
  */
    @Schema(name = "blockedRequests", example = "142", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedRequests")
  public Integer getBlockedRequests() {
    return blockedRequests;
  }

  public void setBlockedRequests(Integer blockedRequests) {
    this.blockedRequests = blockedRequests;
  }

  public UsageAnalytics modifiedRequests(Integer modifiedRequests) {
    this.modifiedRequests = modifiedRequests;
    return this;
  }

  /**
   * Get modifiedRequests
   * @return modifiedRequests
  */
    @Schema(name = "modifiedRequests", example = "320", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedRequests")
  public Integer getModifiedRequests() {
    return modifiedRequests;
  }

  public void setModifiedRequests(Integer modifiedRequests) {
    this.modifiedRequests = modifiedRequests;
  }

  public UsageAnalytics flaggedRequests(Integer flaggedRequests) {
    this.flaggedRequests = flaggedRequests;
    return this;
  }

  /**
   * Get flaggedRequests
   * @return flaggedRequests
  */
    @Schema(name = "flaggedRequests", example = "45", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flaggedRequests")
  public Integer getFlaggedRequests() {
    return flaggedRequests;
  }

  public void setFlaggedRequests(Integer flaggedRequests) {
    this.flaggedRequests = flaggedRequests;
  }

  public UsageAnalytics breakdown(List<@Valid UsageAnalyticsBreakdownInner> breakdown) {
    this.breakdown = breakdown;
    return this;
  }

  public UsageAnalytics addBreakdownItem(UsageAnalyticsBreakdownInner breakdownItem) {
    if (this.breakdown == null) {
      this.breakdown = new ArrayList<>();
    }
    this.breakdown.add(breakdownItem);
    return this;
  }

  /**
   * Get breakdown
   * @return breakdown
  */
  @Valid   @Schema(name = "breakdown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("breakdown")
  public List<@Valid UsageAnalyticsBreakdownInner> getBreakdown() {
    return breakdown;
  }

  public void setBreakdown(List<@Valid UsageAnalyticsBreakdownInner> breakdown) {
    this.breakdown = breakdown;
  }

  public UsageAnalytics topViolations(List<@Valid UsageAnalyticsTopViolationsInner> topViolations) {
    this.topViolations = topViolations;
    return this;
  }

  public UsageAnalytics addTopViolationsItem(UsageAnalyticsTopViolationsInner topViolationsItem) {
    if (this.topViolations == null) {
      this.topViolations = new ArrayList<>();
    }
    this.topViolations.add(topViolationsItem);
    return this;
  }

  /**
   * Most common policy violations.
   * @return topViolations
  */
  @Valid   @Schema(name = "topViolations", description = "Most common policy violations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topViolations")
  public List<@Valid UsageAnalyticsTopViolationsInner> getTopViolations() {
    return topViolations;
  }

  public void setTopViolations(List<@Valid UsageAnalyticsTopViolationsInner> topViolations) {
    this.topViolations = topViolations;
  }

  public UsageAnalytics piiDetections(UsageAnalyticsPiiDetections piiDetections) {
    this.piiDetections = piiDetections;
    return this;
  }

  /**
   * Get piiDetections
   * @return piiDetections
  */
  @Valid   @Schema(name = "piiDetections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("piiDetections")
  public UsageAnalyticsPiiDetections getPiiDetections() {
    return piiDetections;
  }

  public void setPiiDetections(UsageAnalyticsPiiDetections piiDetections) {
    this.piiDetections = piiDetections;
  }

  public UsageAnalytics generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @NotNull @Valid   @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalytics usageAnalytics = (UsageAnalytics) o;
    return Objects.equals(this.scope, usageAnalytics.scope) &&
        Objects.equals(this.scopeId, usageAnalytics.scopeId) &&
        Objects.equals(this.window, usageAnalytics.window) &&
        Objects.equals(this.totalRequests, usageAnalytics.totalRequests) &&
        Objects.equals(this.totalTokens, usageAnalytics.totalTokens) &&
        Objects.equals(this.totalCostUSD, usageAnalytics.totalCostUSD) &&
        Objects.equals(this.blockedRequests, usageAnalytics.blockedRequests) &&
        Objects.equals(this.modifiedRequests, usageAnalytics.modifiedRequests) &&
        Objects.equals(this.flaggedRequests, usageAnalytics.flaggedRequests) &&
        Objects.equals(this.breakdown, usageAnalytics.breakdown) &&
        Objects.equals(this.topViolations, usageAnalytics.topViolations) &&
        Objects.equals(this.piiDetections, usageAnalytics.piiDetections) &&
        Objects.equals(this.generatedAt, usageAnalytics.generatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, scopeId, window, totalRequests, totalTokens, totalCostUSD, blockedRequests, modifiedRequests, flaggedRequests, breakdown, topViolations, piiDetections, generatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalytics {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    totalCostUSD: ").append(toIndentedString(totalCostUSD)).append("\n");
    sb.append("    blockedRequests: ").append(toIndentedString(blockedRequests)).append("\n");
    sb.append("    modifiedRequests: ").append(toIndentedString(modifiedRequests)).append("\n");
    sb.append("    flaggedRequests: ").append(toIndentedString(flaggedRequests)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    topViolations: ").append(toIndentedString(topViolations)).append("\n");
    sb.append("    piiDetections: ").append(toIndentedString(piiDetections)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
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

