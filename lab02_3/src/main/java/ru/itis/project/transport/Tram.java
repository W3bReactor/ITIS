package ru.itis.project.transport;

public class Tram extends Transport {
    public Tram(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(TransportType.tram, number, routeNumber, workTimeBegin, workTimeEnd);
    }


}
