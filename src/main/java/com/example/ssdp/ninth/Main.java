package com.example.ssdp.ninth;
public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        ReportGenerator htmlReport = new HTMLReportGenerator();

        pdfReport.generateReport();
        htmlReport.generateReport();
    }
}
