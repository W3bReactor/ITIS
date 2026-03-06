package ru.itis.project.transport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransportService {
    private static final String FILENAME = "C:\\ITIS\\lab02_3\\src\\main\\resources\\transport.csv";
    private final Scanner scanner;

    public TransportService() throws FileNotFoundException {
        this.scanner = new Scanner(new File(FILENAME));
        scanner.nextLine();
    }

    public List<Transport> readAll() {
        System.out.println(scanner.nextLine());
        ArrayList<Transport> transports = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split(";");
            Transport transport = switch (elements[0]) {
                case "bus" -> new Bus(elements[1], elements[2], elements[3], elements[4]);
                case "tram" -> new Tram(elements[1], elements[2], elements[3], elements[4]);
                case "trolleybus" -> new Trolleybus(elements[1], elements[2], elements[3], elements[4]);
                default -> throw new IllegalArgumentException("Неизвестный тип транспорта: " + elements[0]);
            };
            transports.add(transport);
        }
        return transports;
    }
}
