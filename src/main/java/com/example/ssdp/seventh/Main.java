package com.example.ssdp.seventh;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1");
        versionControl.saveVersion(document.save());

        document.setContent("Version 2");
        versionControl.saveVersion(document.save());

        document.restore(versionControl.getVersion(0));
        System.out.println("Restored to: " + document.getContent());
    }
}
