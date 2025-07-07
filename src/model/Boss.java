package model;

import java.util.List;

public class Boss {
    private String name;
    private String location;
    private int baseHP;
    private int baseRunes;
    private List<String> weaknesses;

    public Boss(){
    }

    public Boss(String name, String location, int baseHP, int baseRunes, List<String> weaknesses){
        this.name = name;
        this.location = location;
        this.baseHP = baseHP;
        this.baseRunes = baseRunes;
        this.weaknesses = weaknesses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseRunes() {
        return baseRunes;
    }

    public void setBaseRunes(int baseRunes) {
        this.baseRunes = baseRunes;
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
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", baseHP=" + baseHP +
                ", baseRunes=" + baseRunes +
                ", weaknesses=" + weaknesses +
                '}';
    }
}