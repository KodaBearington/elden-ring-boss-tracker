package model;

import java.util.List;

public class Boss {
    private int id;
    private String name;
    private int baseHp;
    private int baseRunes;
    private boolean isRequired;
    private int locationId;
    private List<String> weaknesses;

    public Boss() {
    }

    public Boss(int id, String name, int baseHp, int baseRunes, boolean isRequired, int locationId, List<String> weaknesses) {
        this.id = id;
        this.name = name;
        this.baseHp = baseHp;
        this.baseRunes = baseRunes;
        this.isRequired = isRequired;
        this.locationId = locationId;
        this.weaknesses = weaknesses;
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

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseRunes() {
        return baseRunes;
    }

    public void setBaseRunes(int baseRunes) {
        this.baseRunes = baseRunes;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseHp=" + baseHp +
                ", baseRunes=" + baseRunes +
                ", isRequired=" + isRequired +
                ", locationId=" + locationId +
                ", weaknesses=" + weaknesses +
                '}';
    }
}