package com.kundan.incident;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class HealthService{
    public Map<String, String> getHealthStatus(){
        return Map.of(
            "status", "UP",
            "application", "AI Incident Intelligence",
            "message", "Application is running successfully"
        );
    }

    public Map<String, String> getApplicationName(){
        return Map.of(
            "message", "AI Incident Intelligence"
        );
    }
}