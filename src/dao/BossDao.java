package dao;

import model.Boss;
import java.util.List;

public interface BossDao {

    Boss getBossById(int id);

    List<Boss> getAllBosses();

    List<Boss> getBossesByLocationId(int locationId);

    int createBoss(Boss boss);

    void updateBoss(Boss boss);

    void deleteBossById(int id);
}