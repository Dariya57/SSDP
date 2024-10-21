package com.example.ssdp.seventh;
import java.util.*;

public class VersionControl {
    private List<DocumentMemento> savedVersions = new ArrayList<>();

    public void saveVersion(DocumentMemento memento) {
        savedVersions.add(memento);
    }

    public DocumentMemento getVersion(int index) {
        return savedVersions.get(index);
    }
}
