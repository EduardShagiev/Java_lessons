package Lessons_sample.Lessons_3;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<String, String>();
        dic.put("1", "stop");
        dic.put("2", "start");
        System.out.println(dic.keySet());
        System.out.println(dic.values());

        for (Map.Entry<String, String> item : dic.entrySet()) {

            System.out.printf("Key: %S  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person {

    private String name;

    public Person(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}
