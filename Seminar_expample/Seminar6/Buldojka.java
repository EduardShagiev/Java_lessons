package Seminar_expample.Seminar6;

import java.util.ArrayList;

public class Buldojka {
    public String name;
    public String typeb;
    public String Nameowner;
    public int age;
    public int weight;
    public ArrayList<String> exhebition = new ArrayList<String>();

    public Buldojka(int age, int weight, String typeb, String name, String Nameowner) {
        this.age = age;
        this.weight = weight;
        this.typeb = typeb;
        this.name = name;
        this.Nameowner = Nameowner;
    }

    void Gladit() {
        System.out.println("RRRR");
    }

    String getname() {
        return name;
    }

    void newVystavka(String callname) {

        exhebition.add(callname);
    }

    void getexhebitons() {

        System.out.println(exhebition);

    }

    void somem() {
        getexhebitons();
    }
}
