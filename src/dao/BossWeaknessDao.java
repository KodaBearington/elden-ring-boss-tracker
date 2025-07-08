package dao;

import model.BossWeakness;
import java.util.List;

public interface BossWeaknessDao {

    List<BossWeakness> getAllBossWeaknesses();

    List<BossWeakness> getWeaknessMappingsForBoss(int bossId);

    void addWeaknessToBoss(int bossId, int weaknessId);

    void removeWeaknessFromBoss(int bossId, int weaknessId);
}