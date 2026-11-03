package com.kundan.incident;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {
    
    public final HealthService healthService;

    public HealthController(HealthService healthService){
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public Map<String, String> checkHealth() {
        return healthService.getHealthStatus();
    }

    @GetMapping("/application-name")
    public Map<String, String> getApplicationName() {
        return healthService.getApplicationName();
    }

}
