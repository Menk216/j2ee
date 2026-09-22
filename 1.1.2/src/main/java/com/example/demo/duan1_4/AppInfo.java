package com.example.demo.duan1_4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    public void printInfo() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}
