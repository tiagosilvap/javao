package com.project.utils.csv;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class CSVHandle {

    private static final String INPUT_SEPARATOR = ",";
    private static final String OUTPUT_SEPARATOR = ";";

    private static final DateTimeFormatter INPUT_DATE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final DateTimeFormatter OUTPUT_DATE_FORMAT =
            DateTimeFormatter.ofPattern("dd/MM/yy");

    public static void convert(Path inputPath, Path outputPath) throws IOException {

        List<String> lines = Files.readAllLines(inputPath);

        List<String> processedLines = lines.stream()
                .skip(1) // pula cabeçalho original
                .map(CSVHandle::processLine)
                .collect(Collectors.toList());

        // Novo cabeçalho
        processedLines.add(0, "date;title;amount");

        Files.write(outputPath, processedLines);
    }

    private static String processLine(String line) {

        String[] columns = line.split(INPUT_SEPARATOR);

        String formattedDate = formatDate(columns[0]);
        String title = columns[1];
        String formattedAmount = formatAmount(columns[2]);

        return String.join(OUTPUT_SEPARATOR, formattedDate, title, formattedAmount);
    }

    private static String formatDate(String date) {
        LocalDate parsedDate = LocalDate.parse(date, INPUT_DATE_FORMAT);
        return parsedDate.format(OUTPUT_DATE_FORMAT);
    }

    private static String formatAmount(String amount) {
        BigDecimal value = new BigDecimal(amount)
                .setScale(2, RoundingMode.HALF_UP);

        // Garante que o valor seja sempre negativo
        value = value.abs().negate();

        return value.toString().replace(".", ",");
    }
}