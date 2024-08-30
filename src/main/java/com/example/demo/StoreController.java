package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
    @GetMapping("/heghland")
    public Heghland heghland(@RequestParam(value = "id", defaultValue = "001") String id,
                             @RequestParam(value = "name", defaultValue = "heghland01") String name,
                             @RequestParam(value = "address", defaultValue = "Đồng nai ") String address
                             ) {
        return new Heghland(id, name, address);
    }
}
