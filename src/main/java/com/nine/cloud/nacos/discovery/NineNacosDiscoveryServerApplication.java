package com.nine.cloud.nacos.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by Jarvis.wang on Jarvis's device
 *
 * @author Jarvis.wang  Jarvis
 * @date 2019-02-15 14:34
 */
@SpringBootApplication
public class NineNacosDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NineNacosDiscoveryServerApplication.class, args);
    }

    @Slf4j
    @RestController
    static class TestController {
        @GetMapping("/hello")
        public String hello(@RequestParam String name) {
            log.info("invoked name = " + name);
            return "hello " + name;
        }
    }
}
