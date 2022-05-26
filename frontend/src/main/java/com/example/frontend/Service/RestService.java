package com.example.frontend.Service;

import com.example.frontend.Models.Produkt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@Service
public class RestService {

    @Value("${api_base_url:http://localhost:8080/}")
    private String apiBaseUrl;

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Produkt[] getProducts(){
        return restTemplate.getForObject(apiBaseUrl + "produkt", Produkt[].class);
    }

    @RequestMapping("/produkt")
    public String test(Model model) {
        Produkt[] p = getProducts();
        model.addAttribute("rubrik", "Alla Våra Produkter");
        model.addAttribute("allProducts", p);

        return "products";
    }

    @RequestMapping("")
    public String viewHomePage() {
        return "index";
    }
}

