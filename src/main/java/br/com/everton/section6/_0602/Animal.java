package br.com.everton.section6._0602;

public class Animal {
    private final String name;
    private final String king;
    private Integer weight;

    public Animal(String name, String king, Integer weight) {
        this.name = name;
        this.king = king;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getKing() {
        return king;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String show(){
        return name + " is a " + king + " and weighs " + weight + "kg!";
    }
}
