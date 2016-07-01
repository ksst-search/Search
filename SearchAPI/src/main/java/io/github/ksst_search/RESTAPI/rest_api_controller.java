package io.github.ksst_search.RESTAPI;

import io.github.ksst_search.Search.tree.restapi.SearchAPI.src.main.javamain.io.github.ksst_search.RESTAPI;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class rest_api_controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/get")
    public GET get(@RequestParam(value="request", required=false, defaultValue="Enter request") String name) {
        return new GET(counter.incrementAndGet(),
                String.format(template, name));
    }
}