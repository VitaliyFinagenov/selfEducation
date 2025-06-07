package org.example.homeworks.homework10.directory;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Directory {
    private Map<String, String> directory = new HashMap<>();

    public void add(String telephone, String surname) {
        directory.put(telephone, surname);
    }

    public List<String> getTelephonesBySurname(String surname) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            if (entry.getValue().equals(surname)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
