package ru.netology.manager;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class FileOpenManager {
    Map<String, String> extensions = new LinkedHashMap<>();

    public void addProgram(String extension,String program){
        if(extensions.keySet().stream().filter(key -> key.equalsIgnoreCase(extension)).toArray().length != 0){
            return;
        }
        extensions.put(extension,program);
    }

    public String getProgram(String extension){
        return extensions.get(extension);
    }

    public void deleteBinding(String extension){
        extensions.remove(extension);
    }

    public ArrayList<String> getExtensions(){
        ArrayList<String> sorted = new ArrayList<>(extensions.keySet());
        Collections.sort(sorted);
        return sorted;
    }

    public TreeSet<String> getPrograms(){
        ArrayList<String> sorted = new ArrayList<>(extensions.values());
        Collections.sort(sorted);
        return new TreeSet<String>(sorted);
    }
}
