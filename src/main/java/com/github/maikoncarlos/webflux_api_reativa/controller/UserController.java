package com.github.maikoncarlos.webflux_api_reativa.controller;

import com.github.maikoncarlos.webflux_api_reativa.controller.model.UserRequest;
import com.github.maikoncarlos.webflux_api_reativa.controller.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/v1")
public class UserController implements IUserController {
    @Override
    public ResponseEntity<Mono<Void>> created(UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> findById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Flux<UserResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> updateById(String id, UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> deleteById(String id) {
        return null;
    }
}
