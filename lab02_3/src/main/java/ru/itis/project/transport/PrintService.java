package ru.itis.project.transport;

import java.util.*;

public class PrintService {


    class CompareByNumber implements Comparator<Transport> {

        @Override
        public int compare(Transport o1, Transport o2) {
            return o1.getNumber().compareTo(o2.getNumber());
        }
    }

    public void sortedListByNumber(List<Transport> transports) {

        transports.sort(new CompareByNumber());


        for(Transport transport: transports) {
            System.out.println(transport.getNumber() + " " + transport.getWorkTimeBegin());
        }

    }

    public void sortedListByRouteNumber(List<Transport> transports) {

        transports.sort((o1, o2) -> {
            if(Integer.parseInt(o1.getRouteNumber()) > Integer.parseInt(o2.getRouteNumber())) {
                return 1;
            } else if (Integer.parseInt(o1.getRouteNumber()) < Integer.parseInt(o2.getRouteNumber())) {
                return -1;
            } else {
                return 0;
            }
        });



        for(Transport transport: transports) {
            System.out.println(transport.getNumber() + " " + transport.getWorkTimeBegin());
        }

    }


    public void routeCount(List<Transport> transports) {
        Set<String> transportDiffRoutes = new HashSet<>();
        for (int i = 0; i < transports.size(); i++) {
            transportDiffRoutes.add(transports.get(i).routeNumber);
        }

        System.out.println(transportDiffRoutes.size());
    }

    public void transportsCount(List<Transport> transports) {
        Map<TransportType, Integer> diffTransports = new HashMap<>();
        for (int i = 0; i < transports.size(); i++) {
            TransportType type = transports.get(i).type;
            if(diffTransports.containsKey(type)) {
                diffTransports.put(type, diffTransports.get(type) + 1);
            } else {
                diffTransports.put(type, 1);
            }

        }

        System.out.println(diffTransports);
    }

    public void routesTransportsCount(List<Transport> transports) {
        Map<String, Set<TransportType>> diffTransports = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < transports.size(); i++) {
            TransportType type = transports.get(i).type;
            String routeNumber = transports.get(i).routeNumber;
            if(diffTransports.containsKey(routeNumber)) {
                Set<TransportType> transportSet = diffTransports.get(routeNumber);
                transportSet.add(type);
                diffTransports.put(routeNumber, transportSet);
            } else {
                Set<TransportType> newTransportSet = new HashSet<>();
                newTransportSet.add(type);
                diffTransports.put(routeNumber, newTransportSet);
            }

        }
        for (String key: diffTransports.keySet()) {
            result.put(key, diffTransports.get(key).size());
        }


        System.out.println(result);
    }


}
