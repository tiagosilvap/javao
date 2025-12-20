package com.project.utils.csv;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("java.version"));
        System.out.println("Diretório atual: " + System.getProperty("user.dir"));
        Path input = Path.of("input.csv");
        Path output = Path.of("output.csv");

        CSVHandle.convert(input, output);

        System.out.println("Arquivo convertido com sucesso!");
    }
}
