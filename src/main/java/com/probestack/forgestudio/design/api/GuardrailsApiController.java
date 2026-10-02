package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AiPolicy;
import com.probestack.forgestudio.design.model.EvaluateAiRequestRequest;
import com.probestack.forgestudio.design.model.EvaluateAiResponseRequest;
import com.probestack.forgestudio.design.model.GuardrailDecision;
import com.probestack.forgestudio.design.model.UsageAnalytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.GuardrailsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-02T18:38:50.083318321Z[GMT]")
@Controller
@RequestMapping("${openapi.aIGuardrails.base-path:/v1}")
public class GuardrailsApiController implements GuardrailsApi {

    private static final Logger log = LoggerFactory.getLogger(GuardrailsApiController.class);

    private final GuardrailsService guardrailsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public GuardrailsApiController(GuardrailsService guardrailsService, GeneratedRequestValidator generatedRequestValidator) {
        this.guardrailsService = guardrailsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<GuardrailDecision> evaluateAiRequest(@RequestBody() EvaluateAiRequestRequest evaluateAiRequestRequest) {
        log.info("Processing evaluateAiRequest request");
        try {
            generatedRequestValidator.validate("evaluateAiRequest", evaluateAiRequestRequest);
            var response = guardrailsService.evaluateAiRequest(evaluateAiRequestRequest);
            log.info("evaluateAiRequest completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process evaluateAiRequest: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<GuardrailDecision> evaluateAiResponse(@RequestBody() EvaluateAiResponseRequest evaluateAiResponseRequest) {
        log.info("Processing evaluateAiResponse request");
        try {
            generatedRequestValidator.validate("evaluateAiResponse", evaluateAiResponseRequest);
            var response = guardrailsService.evaluateAiResponse(evaluateAiResponseRequest);
            log.info("evaluateAiResponse completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process evaluateAiResponse: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AiPolicy> getActorPolicy(@PathVariable() String actorId, @RequestParam(value = "team", required = false) String team) {
        log.info("Processing getActorPolicy request");
        try {
            var response = guardrailsService.getActorPolicy(actorId, team);
            log.info("getActorPolicy completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getActorPolicy: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<UsageAnalytics> getUsageAnalytics(@RequestParam(value = "scope", required = true) String scope, @RequestParam(value = "scopeId", required = false) String scopeId, @RequestParam(value = "window", required = false, defaultValue = "LAST_7_DAYS") String window, @RequestParam(value = "groupBy", required = false, defaultValue = "MODEL") String groupBy) {
        log.info("Processing getUsageAnalytics request");
        try {
            var response = guardrailsService.getUsageAnalytics(scope, scopeId, window, groupBy);
            log.info("getUsageAnalytics completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getUsageAnalytics: {}", e.getMessage(), e);
            throw e;
        }
    }
}
