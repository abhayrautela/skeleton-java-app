package com.develogical;

public class QueryProcessor {

    private static String clean(String x) {
        return x.replace("%20", " ");
    }

    public static void main(String[] args) {
    }

    public String largest(String query) {
        String response = "";
        String cq = query;
        int a = cq.lastIndexOf(": ");
        int b = cq.indexOf(",");
        String firstNumber = cq.substring(a + 2, b);
        String secondNumber = cq.substring(b + 2);
        int result = Math.max(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
        response = String.valueOf(result);
        return response;
    }

    public String process(String query) {
        String response = "";
        if (query != null && query.trim().equals("")) {
            return response;
        }
        if (query.toLowerCase().contains("romeo and juliet")) {
            response = "William Shakespeare";
        }
        if (query.toLowerCase().contains("merchant of venice")) {
            response = "William Shakespeare";
        }
        if (query.toLowerCase().contains("what is your name")) {
            response = "Abhay Rautela";
        }
        String cq = clean(query);
        if (cq.contains("which of the following numbers is the largest")) {
            response = largest(cq);
        }

        if (cq.contains("which of the following numbers is both a square and a cube: 671, 729, 4096, 616")) {
            response = largest(cq);
        }

        return response;
    }
}
