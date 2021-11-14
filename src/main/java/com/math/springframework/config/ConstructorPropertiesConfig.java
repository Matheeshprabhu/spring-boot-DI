package com.math.springframework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("math")
public class ConstructorPropertiesConfig {

    private final String username;
    private final String password;
    private final String permission;

    public ConstructorPropertiesConfig(String username, String password, String permission) {
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPermission() {
        return permission;
    }
}
