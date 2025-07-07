package model;

public class UserBossChecklist {
    private int id;
    private int userId;
    private int bossId;
    private boolean isDefeated;

    public UserBossChecklist(){
    }

    public UserBossChecklist(int id, int userId, int bossId, boolean isDefeated){
        this.id = id;
        this.userId = userId;
        this.bossId = bossId;
        this.isDefeated = isDefeated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    @Override
    public String toString() {
        return "UserBossChecklist{" +
                "id=" + id +
                ", userId=" + userId +
                ", bossId=" + bossId +
                ", isDefeated=" + isDefeated +
                '}';
    }
}