package classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Event {
    private int id;
    private String name;
    private Location location;

    public Event(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static List<Event> getFiveEventsOrderedById(List<Event> list){
        return list = list.stream().sorted(Comparator.comparing(Event::getId)).limit(5).collect(Collectors.toList());
    }

    public static List<Event> getOrderedAlph(List<Event> list){
        list.sort(Comparator.comparing(Event::getName));
        return list;
    }

    @Override
    public String toString() {
        return "\n----------------\n Id: " + this.getId() + "\n Nombre: " + this.getName() + "\n Location: " + this.getLocation();
    }


}
