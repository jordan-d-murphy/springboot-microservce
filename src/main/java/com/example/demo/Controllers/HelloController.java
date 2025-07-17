package com.example.demo.Controllers;

import com.example.demo.HelloResponse;
import com.example.demo.FunFactResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@RestController
public class HelloController {

    private final List<String> greetings = List.of(
        "Hello world!",
        "Hey there, developer!",
        "Spring Boot says hi!",
        "You're doing great!",
        "Keep pushing forward!"
    );

    private final Random random = new Random();

    @GetMapping("/api/hello")
    public HelloResponse sayHello() {
        String message = greetings.get(random.nextInt(greetings.size()));
        String hostname = "unknown";
        String ip = "unknown";
        String error = null;

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            hostname = inetAddress.getHostName();
            ip = inetAddress.getHostAddress();
        } catch (Exception e) {
            error = e.getMessage();
        }

        return new HelloResponse(message, LocalDateTime.now(), hostname, ip, error);
    }

    @GetMapping("/api/funFact")
    public FunFactResponse funFact() {
        String[] facts = {
            "Java was released in 1995.",
            "Spring Boot makes dev life easier.",
            "Docker containers are lightweight and fast.",
            "Your code is running in a container!",
            "Microservices scale independently!"
        };
        String hostname = "unknown";
        String ip = "unknown";
        String error = null;

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            hostname = inetAddress.getHostName();
            ip = inetAddress.getHostAddress();
        } catch (Exception e) {
            error = e.getMessage();
        }

        String fact = facts[random.nextInt(facts.length)];
        return new FunFactResponse(fact, LocalDateTime.now(), hostname, ip, error);
    }


}
