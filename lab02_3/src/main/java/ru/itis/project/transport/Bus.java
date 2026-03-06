package ru.itis.project.transport;

public class Bus extends Transport {

    public Bus(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(TransportType.bus, number, routeNumber, workTimeBegin, workTimeEnd);
    }

}
