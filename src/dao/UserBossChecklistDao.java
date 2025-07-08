package dao;

import model.UserBossChecklist;

import java.util.List;

public interface UserBossChecklistDao {

    List<UserBossChecklist> getChecklistForUser(int userId);

    void markBossAsDefeated(int userId, int bossId);

    void markBossAsNotDefeated(int userId, int bossId);

    void addBossToChecklist(int userId, int bossId);

    void removeBossFromChecklist(int userId, int bossId);
}