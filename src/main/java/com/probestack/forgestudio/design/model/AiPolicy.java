package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.AiPolicyCostBudget;
import com.probestack.forgestudio.design.model.AiPolicyPiiRules;
import com.probestack.forgestudio.design.model.AiPolicyRateLimits;
import com.probestack.forgestudio.design.model.AiPolicyToolPermissionsInner;
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
 * AiPolicy
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class AiPolicy {

  private String actorId;

  private String team;

  @Valid
  private List<String> allowedModels = new ArrayList<>();

  @Valid
  private List<String> blockedModels;

  private AiPolicyCostBudget costBudget;

  private AiPolicyRateLimits rateLimits;

  @Valid
  private List<@Valid AiPolicyToolPermissionsInner> toolPermissions = new ArrayList<>();

  private AiPolicyPiiRules piiRules;

  /**
   * Gets or Sets enforcementMode
   */
  public enum EnforcementModeEnum {
    STRICT("STRICT"),
    
    PERMISSIVE("PERMISSIVE"),
    
    MONITOR_ONLY("MONITOR_ONLY");

    private String value;

    EnforcementModeEnum(String value) {
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
    public static EnforcementModeEnum fromValue(String value) {
      for (EnforcementModeEnum b : EnforcementModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnforcementModeEnum enforcementMode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveFrom;

  public AiPolicy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AiPolicy(String actorId, List<String> allowedModels, AiPolicyCostBudget costBudget, List<@Valid AiPolicyToolPermissionsInner> toolPermissions, AiPolicyPiiRules piiRules) {
    this.actorId = actorId;
    this.allowedModels = allowedModels;
    this.costBudget = costBudget;
    this.toolPermissions = toolPermissions;
    this.piiRules = piiRules;
  }

  public AiPolicy actorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  /**
   * Get actorId
   * @return actorId
  */
  @NotNull   @Schema(name = "actorId", example = "service.WORKSPACE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actorId")
  public String getActorId() {
    return actorId;
  }

  public void setActorId(String actorId) {
    this.actorId = actorId;
  }

  public AiPolicy team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
    @Schema(name = "team", example = "payments-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public AiPolicy allowedModels(List<String> allowedModels) {
    this.allowedModels = allowedModels;
    return this;
  }

  public AiPolicy addAllowedModelsItem(String allowedModelsItem) {
    if (this.allowedModels == null) {
      this.allowedModels = new ArrayList<>();
    }
    this.allowedModels.add(allowedModelsItem);
    return this;
  }

  /**
   * LLM models this actor may use.
   * @return allowedModels
  */
  @NotNull   @Schema(name = "allowedModels", example = "[\"claude-3-5-sonnet\",\"claude-3-5-haiku\",\"gpt-4o-mini\"]", description = "LLM models this actor may use.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allowedModels")
  public List<String> getAllowedModels() {
    return allowedModels;
  }

  public void setAllowedModels(List<String> allowedModels) {
    this.allowedModels = allowedModels;
  }

  public AiPolicy blockedModels(List<String> blockedModels) {
    this.blockedModels = blockedModels;
    return this;
  }

  public AiPolicy addBlockedModelsItem(String blockedModelsItem) {
    if (this.blockedModels == null) {
      this.blockedModels = new ArrayList<>();
    }
    this.blockedModels.add(blockedModelsItem);
    return this;
  }

  /**
   * Get blockedModels
   * @return blockedModels
  */
    @Schema(name = "blockedModels", example = "[\"gpt-4-turbo\",\"gemini-ultra\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedModels")
  public List<String> getBlockedModels() {
    return blockedModels;
  }

  public void setBlockedModels(List<String> blockedModels) {
    this.blockedModels = blockedModels;
  }

  public AiPolicy costBudget(AiPolicyCostBudget costBudget) {
    this.costBudget = costBudget;
    return this;
  }

  /**
   * Get costBudget
   * @return costBudget
  */
  @NotNull @Valid   @Schema(name = "costBudget", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("costBudget")
  public AiPolicyCostBudget getCostBudget() {
    return costBudget;
  }

  public void setCostBudget(AiPolicyCostBudget costBudget) {
    this.costBudget = costBudget;
  }

  public AiPolicy rateLimits(AiPolicyRateLimits rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  /**
   * Get rateLimits
   * @return rateLimits
  */
  @Valid   @Schema(name = "rateLimits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLimits")
  public AiPolicyRateLimits getRateLimits() {
    return rateLimits;
  }

  public void setRateLimits(AiPolicyRateLimits rateLimits) {
    this.rateLimits = rateLimits;
  }

  public AiPolicy toolPermissions(List<@Valid AiPolicyToolPermissionsInner> toolPermissions) {
    this.toolPermissions = toolPermissions;
    return this;
  }

  public AiPolicy addToolPermissionsItem(AiPolicyToolPermissionsInner toolPermissionsItem) {
    if (this.toolPermissions == null) {
      this.toolPermissions = new ArrayList<>();
    }
    this.toolPermissions.add(toolPermissionsItem);
    return this;
  }

  /**
   * MCP tools this actor may invoke.
   * @return toolPermissions
  */
  @NotNull @Valid   @Schema(name = "toolPermissions", description = "MCP tools this actor may invoke.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toolPermissions")
  public List<@Valid AiPolicyToolPermissionsInner> getToolPermissions() {
    return toolPermissions;
  }

  public void setToolPermissions(List<@Valid AiPolicyToolPermissionsInner> toolPermissions) {
    this.toolPermissions = toolPermissions;
  }

  public AiPolicy piiRules(AiPolicyPiiRules piiRules) {
    this.piiRules = piiRules;
    return this;
  }

  /**
   * Get piiRules
   * @return piiRules
  */
  @NotNull @Valid   @Schema(name = "piiRules", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("piiRules")
  public AiPolicyPiiRules getPiiRules() {
    return piiRules;
  }

  public void setPiiRules(AiPolicyPiiRules piiRules) {
    this.piiRules = piiRules;
  }

  public AiPolicy enforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * Get enforcementMode
   * @return enforcementMode
  */
    @Schema(name = "enforcementMode", example = "STRICT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enforcementMode")
  public EnforcementModeEnum getEnforcementMode() {
    return enforcementMode;
  }

  public void setEnforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
  }

  public AiPolicy effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * Get effectiveFrom
   * @return effectiveFrom
  */
  @Valid   @Schema(name = "effectiveFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveFrom")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPolicy aiPolicy = (AiPolicy) o;
    return Objects.equals(this.actorId, aiPolicy.actorId) &&
        Objects.equals(this.team, aiPolicy.team) &&
        Objects.equals(this.allowedModels, aiPolicy.allowedModels) &&
        Objects.equals(this.blockedModels, aiPolicy.blockedModels) &&
        Objects.equals(this.costBudget, aiPolicy.costBudget) &&
        Objects.equals(this.rateLimits, aiPolicy.rateLimits) &&
        Objects.equals(this.toolPermissions, aiPolicy.toolPermissions) &&
        Objects.equals(this.piiRules, aiPolicy.piiRules) &&
        Objects.equals(this.enforcementMode, aiPolicy.enforcementMode) &&
        Objects.equals(this.effectiveFrom, aiPolicy.effectiveFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId, team, allowedModels, blockedModels, costBudget, rateLimits, toolPermissions, piiRules, enforcementMode, effectiveFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPolicy {\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    allowedModels: ").append(toIndentedString(allowedModels)).append("\n");
    sb.append("    blockedModels: ").append(toIndentedString(blockedModels)).append("\n");
    sb.append("    costBudget: ").append(toIndentedString(costBudget)).append("\n");
    sb.append("    rateLimits: ").append(toIndentedString(rateLimits)).append("\n");
    sb.append("    toolPermissions: ").append(toIndentedString(toolPermissions)).append("\n");
    sb.append("    piiRules: ").append(toIndentedString(piiRules)).append("\n");
    sb.append("    enforcementMode: ").append(toIndentedString(enforcementMode)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
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

