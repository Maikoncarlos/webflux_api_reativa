package com.github.maikoncarlos.webflux_api_reativa.controller.model;

import lombok.Builder;

@Builder
public record UserRequest(String id,
                          String user,
                          String password,
                          String email) {
}
