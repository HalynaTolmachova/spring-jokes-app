package com.example.spring.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeAppServiceImpl implements JokeAppService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

        public JokeAppServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String jokeReturn() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
