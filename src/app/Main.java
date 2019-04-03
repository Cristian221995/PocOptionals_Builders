package app;

import classes.City;
import classes.Event;
import classes.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Traer los 5 primeros por id y get ordenados alfabeticamente
        List<Event> events = Arrays.asList(new Event(10,"LollaPalooza", new Location(1,"Buenos Aires", new City(5, "Mar del plata"))),
                new Event(22,"Ultra", new Location(1,"Santa Fe", new City(5, "Rosario"))),
                new Event(5,"Cosquin Rock", new Location(1,"Chaco", new City(5, "Resistencia"))),
                new Event(3,"Freestyle Master Series", new Location(1,"Buenos Aires", new City(5, "La Plata"))),
                new Event(48,"Red Bull Argentina", new Location(1,"Buenos Aires", new City(5, "Quilmes"))),
                new Event(6,"TomorrowLand", new Location(1,"Rio Negro", new City(5, "Bariloche"))),
                new Event(18,"Personal Music", new Location(1,"Entre Rios", new City(5, "Parana"))));

        System.out.println(events);

        List<Event> aux = new ArrayList<>();

        System.out.println("\n----------------\nPrimeros 5 eventos ordenados por ID:");
        aux = Event.getFiveEventsOrderedById(events);
        System.out.println(aux);

        System.out.println("\n----------------\nEventos ordenados alfabeticamente");
        aux = Event.getOrderedAlph(events);
        System.out.println(aux);
    }
}
