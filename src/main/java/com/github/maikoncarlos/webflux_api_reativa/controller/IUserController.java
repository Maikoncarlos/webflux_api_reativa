package com.github.maikoncarlos.webflux_api_reativa.controller;

import com.github.maikoncarlos.webflux_api_reativa.controller.model.UserRequest;
import com.github.maikoncarlos.webflux_api_reativa.controller.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserController {

    @PostMapping
    ResponseEntity<Mono<Void>> created(@RequestBody UserRequest request);

    @GetMapping(value = "/{id}")
    ResponseEntity<Mono<UserResponse>> findById(@PathVariable String id);

    @GetMapping
    ResponseEntity<Flux<UserResponse>> findAll();

    @PatchMapping(value = "/{id}")
    ResponseEntity<Mono<UserResponse>> updateById(@PathVariable String id, @RequestBody UserRequest request);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Mono<Void>> deleteById(@PathVariable String id);
}
