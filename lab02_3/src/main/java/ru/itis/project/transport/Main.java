package ru.itis.project.transport;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TransportService transportService = new TransportService();
        List<Transport> transports = transportService.readAll();
        for (Transport transport: transports) {
            System.out.println(transport);
        }
        PrintService printService = new PrintService();
        printService.routeCount(transports);
        printService.transportsCount(transports);
        printService.routesTransportsCount(transports);
    }
}
