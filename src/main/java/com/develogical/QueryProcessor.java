package com.develogical;

public class QueryProcessor {

    private static String clean(String x) {
        return x.replace("%20", " ");
    }

    public static void main(String[] args) {
    }

    public String largest(String query) {
        String response = "";
        String cq = clean(query);
        int a = cq.indexOf(": ");
        int b = cq.indexOf(",");
        String firstNumber = cq.substring(a + 2, b);
        String secondNumber = cq.substring(b + 2);
        int result = Math.max(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
        response = String.valueOf(result);
        return response;
    }

    public String process1(String query) {
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
            response = response;
        }
        if (query.contains("which of the following numbers is the largest")) {
            response = largest(query);
        }
        return response;
    }
}
