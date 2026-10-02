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
 * UsageAnalyticsBreakdownInner
 */
@JsonTypeName("UsageAnalytics_breakdown_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class UsageAnalyticsBreakdownInner {

  private String groupKey;

  /**
   * Gets or Sets groupType
   */
  public enum GroupTypeEnum {
    MODEL("MODEL"),
    
    TOOL("TOOL"),
    
    ACTOR("ACTOR"),
    
    DAY("DAY");

    private String value;

    GroupTypeEnum(String value) {
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
    public static GroupTypeEnum fromValue(String value) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private GroupTypeEnum groupType;

  private Integer requests;

  private Integer tokens;

  private Double costUSD;

  private Integer blockedCount;

  public UsageAnalyticsBreakdownInner groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Get groupKey
   * @return groupKey
  */
    @Schema(name = "groupKey", example = "claude-3-5-sonnet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupKey")
  public String getGroupKey() {
    return groupKey;
  }

  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  public UsageAnalyticsBreakdownInner groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
  */
    @Schema(name = "groupType", example = "MODEL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupType")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public UsageAnalyticsBreakdownInner requests(Integer requests) {
    this.requests = requests;
    return this;
  }

  /**
   * Get requests
   * @return requests
  */
    @Schema(name = "requests", example = "45200", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requests")
  public Integer getRequests() {
    return requests;
  }

  public void setRequests(Integer requests) {
    this.requests = requests;
  }

  public UsageAnalyticsBreakdownInner tokens(Integer tokens) {
    this.tokens = tokens;
    return this;
  }

  /**
   * Get tokens
   * @return tokens
  */
    @Schema(name = "tokens", example = "18500000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokens")
  public Integer getTokens() {
    return tokens;
  }

  public void setTokens(Integer tokens) {
    this.tokens = tokens;
  }

  public UsageAnalyticsBreakdownInner costUSD(Double costUSD) {
    this.costUSD = costUSD;
    return this;
  }

  /**
   * Get costUSD
   * @return costUSD
  */
    @Schema(name = "costUSD", example = "620.3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costUSD")
  public Double getCostUSD() {
    return costUSD;
  }

  public void setCostUSD(Double costUSD) {
    this.costUSD = costUSD;
  }

  public UsageAnalyticsBreakdownInner blockedCount(Integer blockedCount) {
    this.blockedCount = blockedCount;
    return this;
  }

  /**
   * Get blockedCount
   * @return blockedCount
  */
    @Schema(name = "blockedCount", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedCount")
  public Integer getBlockedCount() {
    return blockedCount;
  }

  public void setBlockedCount(Integer blockedCount) {
    this.blockedCount = blockedCount;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyticsBreakdownInner usageAnalyticsBreakdownInner = (UsageAnalyticsBreakdownInner) o;
    return Objects.equals(this.groupKey, usageAnalyticsBreakdownInner.groupKey) &&
        Objects.equals(this.groupType, usageAnalyticsBreakdownInner.groupType) &&
        Objects.equals(this.requests, usageAnalyticsBreakdownInner.requests) &&
        Objects.equals(this.tokens, usageAnalyticsBreakdownInner.tokens) &&
        Objects.equals(this.costUSD, usageAnalyticsBreakdownInner.costUSD) &&
        Objects.equals(this.blockedCount, usageAnalyticsBreakdownInner.blockedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupKey, groupType, requests, tokens, costUSD, blockedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyticsBreakdownInner {\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    costUSD: ").append(toIndentedString(costUSD)).append("\n");
    sb.append("    blockedCount: ").append(toIndentedString(blockedCount)).append("\n");
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

