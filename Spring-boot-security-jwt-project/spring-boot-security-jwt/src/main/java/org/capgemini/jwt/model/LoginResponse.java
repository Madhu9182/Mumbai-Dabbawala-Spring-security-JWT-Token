package org.capgemini.jwt.model;

import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {
    boolean response;
    List<String> authority;
}
