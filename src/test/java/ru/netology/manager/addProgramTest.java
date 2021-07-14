package ru.netology.manager;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class addProgramTest {
    FileOpenManager manager = new FileOpenManager();

    @Test
    public void shouldAddIfEmpty(){
        manager.addProgram("html","Chrome");
        assertEquals(List.of("html"),manager.getExtensions());
    }

    @Test
    public void shouldAddIfNotEmpty(){
        manager.addProgram("exe","Explorer");
        manager.addProgram("txt","Note");
        assertEquals(List.of("exe","txt"),manager.getExtensions());
    }

    @Test
    public void shouldAddIfExist(){
        manager.addProgram("JPG","Photoshop");
        manager.addProgram("jpg","Windows Viewer");
        assertEquals(List.of("JPG"),manager.getExtensions());
    }
}
