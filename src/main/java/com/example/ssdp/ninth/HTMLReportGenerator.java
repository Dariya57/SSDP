package com.example.ssdp.ninth;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("HTML Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("HTML Body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("HTML Footer");
    }
}