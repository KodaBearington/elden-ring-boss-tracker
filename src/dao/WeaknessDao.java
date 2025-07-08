package dao;

import model.Weakness;
import java.util.List;

public interface WeaknessDao {

    Weakness getWeaknessById(int id);

    List<Weakness> getAllWeaknesses();

    int createWeakness(Weakness weakness);

    void updateWeakness(Weakness weakness);

    void deleteWeaknessById(int id);
}