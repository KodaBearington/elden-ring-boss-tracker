package dao;

import model.Location;
import java.util.List;

public interface LocationDao {

    Location getLocationById(int id);

    List<Location> getAllLocations();

    int createLocation(Location location);

    void updateLocation(Location location);

    void deleteLocationById(int id);
}