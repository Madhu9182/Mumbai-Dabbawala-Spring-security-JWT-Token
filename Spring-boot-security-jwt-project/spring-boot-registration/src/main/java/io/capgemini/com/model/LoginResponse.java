package io.capgemini.com.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Data
public class LoginResponse {
    boolean response;
    List<String> authority;
}
