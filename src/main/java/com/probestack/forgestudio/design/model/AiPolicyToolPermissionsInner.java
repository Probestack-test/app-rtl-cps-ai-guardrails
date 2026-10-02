package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AiPolicyToolPermissionsInner
 */
@JsonTypeName("AiPolicy_toolPermissions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class AiPolicyToolPermissionsInner {

  private String toolName;

  private Boolean allowed;

  private Boolean requiresApproval;

  private Integer rateLimitPerHour;

  public AiPolicyToolPermissionsInner toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }

  /**
   * Get toolName
   * @return toolName
  */
    @Schema(name = "toolName", example = "enhancement.start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toolName")
  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

  public AiPolicyToolPermissionsInner allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Get allowed
   * @return allowed
  */
    @Schema(name = "allowed", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public AiPolicyToolPermissionsInner requiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
    return this;
  }

  /**
   * Get requiresApproval
   * @return requiresApproval
  */
    @Schema(name = "requiresApproval", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiresApproval")
  public Boolean getRequiresApproval() {
    return requiresApproval;
  }

  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }

  public AiPolicyToolPermissionsInner rateLimitPerHour(Integer rateLimitPerHour) {
    this.rateLimitPerHour = rateLimitPerHour;
    return this;
  }

  /**
   * Get rateLimitPerHour
   * @return rateLimitPerHour
  */
    @Schema(name = "rateLimitPerHour", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimitPerHour")
  public Integer getRateLimitPerHour() {
    return rateLimitPerHour;
  }

  public void setRateLimitPerHour(Integer rateLimitPerHour) {
    this.rateLimitPerHour = rateLimitPerHour;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPolicyToolPermissionsInner aiPolicyToolPermissionsInner = (AiPolicyToolPermissionsInner) o;
    return Objects.equals(this.toolName, aiPolicyToolPermissionsInner.toolName) &&
        Objects.equals(this.allowed, aiPolicyToolPermissionsInner.allowed) &&
        Objects.equals(this.requiresApproval, aiPolicyToolPermissionsInner.requiresApproval) &&
        Objects.equals(this.rateLimitPerHour, aiPolicyToolPermissionsInner.rateLimitPerHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolName, allowed, requiresApproval, rateLimitPerHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPolicyToolPermissionsInner {\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    rateLimitPerHour: ").append(toIndentedString(rateLimitPerHour)).append("\n");
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

