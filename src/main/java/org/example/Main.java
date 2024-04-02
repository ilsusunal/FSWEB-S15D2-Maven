package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;

import java.util.Set;

import static org.example.entity.StringSet.findUniqueWords;

public class Main {
    public static void main(String[] args) {


        Set<String> uniqueWords = findUniqueWords();
        System.out.println("Unique words count: " + uniqueWords.size());
        System.out.println("Unique words: " + uniqueWords);

    }
}