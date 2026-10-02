package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AiPolicyCostBudget
 */
@JsonTypeName("AiPolicy_costBudget")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")public class AiPolicyCostBudget {

  private BigDecimal dailyLimitUSD;

  private BigDecimal monthlyLimitUSD;

  private BigDecimal perRequestLimitUSD;

  private BigDecimal currentDailySpendUSD;

  private BigDecimal currentMonthlySpendUSD;

  public AiPolicyCostBudget dailyLimitUSD(BigDecimal dailyLimitUSD) {
    this.dailyLimitUSD = dailyLimitUSD;
    return this;
  }

  /**
   * Get dailyLimitUSD
   * @return dailyLimitUSD
  */
  @Valid   @Schema(name = "dailyLimitUSD", example = "500.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailyLimitUSD")
  public BigDecimal getDailyLimitUSD() {
    return dailyLimitUSD;
  }

  public void setDailyLimitUSD(BigDecimal dailyLimitUSD) {
    this.dailyLimitUSD = dailyLimitUSD;
  }

  public AiPolicyCostBudget monthlyLimitUSD(BigDecimal monthlyLimitUSD) {
    this.monthlyLimitUSD = monthlyLimitUSD;
    return this;
  }

  /**
   * Get monthlyLimitUSD
   * @return monthlyLimitUSD
  */
  @Valid   @Schema(name = "monthlyLimitUSD", example = "10000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthlyLimitUSD")
  public BigDecimal getMonthlyLimitUSD() {
    return monthlyLimitUSD;
  }

  public void setMonthlyLimitUSD(BigDecimal monthlyLimitUSD) {
    this.monthlyLimitUSD = monthlyLimitUSD;
  }

  public AiPolicyCostBudget perRequestLimitUSD(BigDecimal perRequestLimitUSD) {
    this.perRequestLimitUSD = perRequestLimitUSD;
    return this;
  }

  /**
   * Get perRequestLimitUSD
   * @return perRequestLimitUSD
  */
  @Valid   @Schema(name = "perRequestLimitUSD", example = "5.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("perRequestLimitUSD")
  public BigDecimal getPerRequestLimitUSD() {
    return perRequestLimitUSD;
  }

  public void setPerRequestLimitUSD(BigDecimal perRequestLimitUSD) {
    this.perRequestLimitUSD = perRequestLimitUSD;
  }

  public AiPolicyCostBudget currentDailySpendUSD(BigDecimal currentDailySpendUSD) {
    this.currentDailySpendUSD = currentDailySpendUSD;
    return this;
  }

  /**
   * Get currentDailySpendUSD
   * @return currentDailySpendUSD
  */
  @Valid   @Schema(name = "currentDailySpendUSD", example = "342.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentDailySpendUSD")
  public BigDecimal getCurrentDailySpendUSD() {
    return currentDailySpendUSD;
  }

  public void setCurrentDailySpendUSD(BigDecimal currentDailySpendUSD) {
    this.currentDailySpendUSD = currentDailySpendUSD;
  }

  public AiPolicyCostBudget currentMonthlySpendUSD(BigDecimal currentMonthlySpendUSD) {
    this.currentMonthlySpendUSD = currentMonthlySpendUSD;
    return this;
  }

  /**
   * Get currentMonthlySpendUSD
   * @return currentMonthlySpendUSD
  */
  @Valid   @Schema(name = "currentMonthlySpendUSD", example = "4870.2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentMonthlySpendUSD")
  public BigDecimal getCurrentMonthlySpendUSD() {
    return currentMonthlySpendUSD;
  }

  public void setCurrentMonthlySpendUSD(BigDecimal currentMonthlySpendUSD) {
    this.currentMonthlySpendUSD = currentMonthlySpendUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPolicyCostBudget aiPolicyCostBudget = (AiPolicyCostBudget) o;
    return Objects.equals(this.dailyLimitUSD, aiPolicyCostBudget.dailyLimitUSD) &&
        Objects.equals(this.monthlyLimitUSD, aiPolicyCostBudget.monthlyLimitUSD) &&
        Objects.equals(this.perRequestLimitUSD, aiPolicyCostBudget.perRequestLimitUSD) &&
        Objects.equals(this.currentDailySpendUSD, aiPolicyCostBudget.currentDailySpendUSD) &&
        Objects.equals(this.currentMonthlySpendUSD, aiPolicyCostBudget.currentMonthlySpendUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyLimitUSD, monthlyLimitUSD, perRequestLimitUSD, currentDailySpendUSD, currentMonthlySpendUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPolicyCostBudget {\n");
    sb.append("    dailyLimitUSD: ").append(toIndentedString(dailyLimitUSD)).append("\n");
    sb.append("    monthlyLimitUSD: ").append(toIndentedString(monthlyLimitUSD)).append("\n");
    sb.append("    perRequestLimitUSD: ").append(toIndentedString(perRequestLimitUSD)).append("\n");
    sb.append("    currentDailySpendUSD: ").append(toIndentedString(currentDailySpendUSD)).append("\n");
    sb.append("    currentMonthlySpendUSD: ").append(toIndentedString(currentMonthlySpendUSD)).append("\n");
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

