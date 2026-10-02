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
 * EvaluateAiRequestRequestActor
 */
@JsonTypeName("evaluateAiRequest_request_actor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class EvaluateAiRequestRequestActor {

  private String actorId;

  /**
   * Gets or Sets actorType
   */
  public enum ActorTypeEnum {
    USER("USER"),
    
    SERVICE("SERVICE"),
    
    API_KEY("API_KEY"),
    
    AI_AGENT("AI_AGENT");

    private String value;

    ActorTypeEnum(String value) {
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
    public static ActorTypeEnum fromValue(String value) {
      for (ActorTypeEnum b : ActorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActorTypeEnum actorType;

  private String team;

  public EvaluateAiRequestRequestActor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvaluateAiRequestRequestActor(String actorId, ActorTypeEnum actorType) {
    this.actorId = actorId;
    this.actorType = actorType;
  }

  public EvaluateAiRequestRequestActor actorId(String actorId) {
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

  public EvaluateAiRequestRequestActor actorType(ActorTypeEnum actorType) {
    this.actorType = actorType;
    return this;
  }

  /**
   * Get actorType
   * @return actorType
  */
  @NotNull   @Schema(name = "actorType", example = "AI_AGENT", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actorType")
  public ActorTypeEnum getActorType() {
    return actorType;
  }

  public void setActorType(ActorTypeEnum actorType) {
    this.actorType = actorType;
  }

  public EvaluateAiRequestRequestActor team(String team) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateAiRequestRequestActor evaluateAiRequestRequestActor = (EvaluateAiRequestRequestActor) o;
    return Objects.equals(this.actorId, evaluateAiRequestRequestActor.actorId) &&
        Objects.equals(this.actorType, evaluateAiRequestRequestActor.actorType) &&
        Objects.equals(this.team, evaluateAiRequestRequestActor.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId, actorType, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateAiRequestRequestActor {\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

