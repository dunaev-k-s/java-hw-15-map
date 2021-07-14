package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadUpdateDeleteTest {
    FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    public void setUp(){
        manager.addProgram("html","Chrome");
        manager.addProgram("exe","Explorer");
        manager.addProgram("txt","Note");
        manager.addProgram("jpg","Windows Viewer");
        manager.addProgram("pdf","Adobe Reader");
        manager.addProgram("xls","Microsoft Excel");
        manager.addProgram("doc","Microsoft Word");
        manager.addProgram("bat","Notepad++");
        manager.addProgram("mp3","AIMP2");
        manager.addProgram("avi","VLC");
        manager.addProgram("mpeg","VLC");
    }

    @Test
    public void shouldDeleteBinding(){
        manager.deleteBinding("xls");
        assertEquals(List.of("avi",
                            "bat",
                            "doc",
                            "exe",
                            "html",
                            "jpg",
                            "mp3",
                            "mpeg",
                            "pdf",
                            "txt"),manager.getExtensions());
    }

    @Test
    public void shouldGetPrograms(){
        assertEquals(Set.of(    "AIMP2",
                                "Adobe Reader",
                                "Chrome",
                                "Explorer",
                                "Microsoft Excel",
                                "Microsoft Word",
                                "Note",
                                "Notepad++",
                                "VLC",
                                "Windows Viewer"),manager.getPrograms());
    }
}
