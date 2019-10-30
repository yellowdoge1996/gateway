package com.example.getway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2019/10/28 ： NWT)hxl ： 新規作成
 * @date 2019/10/28 15:52
 */
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Mono<String> fallback(){
        return Mono.just("fallback");
    }
}
