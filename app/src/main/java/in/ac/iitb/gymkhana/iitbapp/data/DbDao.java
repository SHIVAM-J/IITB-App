package in.ac.iitb.gymkhana.iitbapp.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by mrunz on 13/3/18.
 */
@Dao
public interface DbDao {
    @Query("SELECT * FROM events")
    List<Event> getAllEvents();

    @Query("SELECT * FROM bodies")
    List<Body> getAllBodies();

    @Query("SELECT * FROM venues")
    List<Venue> getAllVenues();

    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Query("SELECT * FROM roles")
    List<Role> getAllRoles();

    @Query("SELECT * FROM bodies WHERE id == :id")
    public Body[] getBody(String id);

    @Query("SELECT COUNT(*) from events")
    int countEvents();

    @Query("SELECT COUNT(*) from venues")
    int countVenues();

    @Query("SELECT COUNT(*) from bodies")
    int countBodies();

    @Query("SELECT COUNT(*) from users")
    int countUsers();

    @Query("SELECT COUNT(*) from roles")
    int countRoles();

    @Insert
    void insertEvents(List<Event> events);

    @Insert
    void insertEvent(Event event);

    @Insert
    void insertBodies(List<Body> bodies);

    @Insert
    void insertBody(Body body);

    @Insert
    void insertVenues(List<Venue> venues);

    @Insert
    void insertVenue(Venue venue);

    @Insert
    void insertUsers(List<User> users);

    @Insert
    void insertUser(User user);

    @Insert
    void insertRoles(List<Role> roles);

    @Insert
    void insertRole(Role role);

    @Delete
    void deleteEvent(Event event);

    @Delete
    void deleteVenue(Venue venue);

    @Delete
    void deleteBody(Body body);

    @Delete
    void deleteUser(User user);

    @Delete
    void deleteRole(Role role);

    @Query("DELETE from events")
    void deleteEvents();

    @Query("DELETE from venues")
    void deleteVenues();

    @Query("DELETE from bodies")
    void deleteBodies();

    @Query("DELETE from users")
    void deleteUsers();

    @Query("DELETE from roles")
    void deleteRoles();
}
