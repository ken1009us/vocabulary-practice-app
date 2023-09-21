package com.vocabularyapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private List<String> words;
    private HashMap<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();

        add("word", "文字");

    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        translations.put(word, translation);
    }

    public String getRandomWord() {
        Random rand = new Random();
        return this.words.get(rand.nextInt(this.words.size()));
    }
}
