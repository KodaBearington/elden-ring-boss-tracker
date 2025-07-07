package model;

public class BossWeakness {
    private int bossId;
    private int weaknessId;

    public BossWeakness(){
    }

    public BossWeakness(int bossId, int weaknessId){
        this.bossId = bossId;
        this.weaknessId = weaknessId;
    }

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public int getWeaknessId() {
        return weaknessId;
    }

    public void setWeaknessId(int weaknessId) {
        this.weaknessId = weaknessId;
    }

    @Override
    public String toString() {
        return "BossWeakness{" +
                "bossId=" + bossId +
                ", weaknessId=" + weaknessId +
                '}';
    }
}