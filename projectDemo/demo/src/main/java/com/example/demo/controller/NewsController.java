package com.example.demo.controller;

import com.example.demo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project demo
 * Created by @author Rahul Dev Gupta on 08/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */


@RestController
public class NewsController {


    @GetMapping("/fetchHeadlines")
    public List<String> getHeadLines(@RequestParam (value = "country") String country) {
        RestTemplate restTemplate = new RestTemplate();
        MasterArticles masterArticles = restTemplate.
                getForEntity("https://newsapi.org/v2/top-headlines?"+"country="+country+"&apiKey=4b2969f17ef343fdad1cf2c0a533e1ff",
                MasterArticles.class).getBody();

        List<String> headlines = masterArticles.getArticles().stream().map(Article::getTitle).collect(Collectors.toList());

        return headlines;
    }

    @GetMapping("/fetchNewsSources")
    public List<NewsSources> getNewsSources() {
        RestTemplate restTemplate = new RestTemplate();
        NewsSourcesResponse newsSourcesResponse = restTemplate.
                getForEntity("https://newsapi.org/v2/sources?apiKey=4b2969f17ef343fdad1cf2c0a533e1ff",
                        NewsSourcesResponse.class).getBody();

        List<NewsSources> newsSources = new ArrayList<>();

        for (Source source : newsSourcesResponse.getSources()) {
            newsSources.add(new NewsSources(source.getName(), source.getUrl(),source.getDescription()));
        }

        return newsSources;
    }


    @GetMapping("/fetchNewsSources/filter")
    public List<Article> getFilteredNewsSources(@RequestParam (value = "query") String query) {
        RestTemplate restTemplate = new RestTemplate();
        MasterArticles masterArticles = restTemplate.
                getForEntity("https://newsapi.org/v2/everything"+"?q="+query+"&apiKey=4b2969f17ef343fdad1cf2c0a533e1ff",
                        MasterArticles.class).getBody();

        return masterArticles.getArticles();

    }

}
