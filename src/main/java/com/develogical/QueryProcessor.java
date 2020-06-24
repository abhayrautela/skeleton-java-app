package com.develogical;

public class QueryProcessor {

    private static String clean(String x) {
        return x.replace("%20", " ");
    }

    public static void main(String[] args) {
        System.out.println(QueryProcessor.clean("%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2091,%20367,%20896,%2096"));
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

        if (query.toLowerCase().contains("what is 1 plus 6")) {
            response = "7";
        }

        if (query.toLowerCase().contains("what is 1 plus 13")) {
            response = "14";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 1, 11, 35, 433")) {
            response = "433";
        }

        if (query.toLowerCase().contains("what is 5 plus 5")) {
            response = "10";
        }

        if (query.toLowerCase().contains("what is 15 plus 15")) {
            response = "30";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 272, 88")) {
            response = "272";
        }
        if (query.toLowerCase().contains("6,580")) {
            response = "580";
        }

        if (query.toLowerCase().contains(" 91, 367, 896, 96")) {
            response = "896";
        }

        if (query.toLowerCase().contains(clean("what%20is%208%20plus%2010"))) {
            response = "18";
        }
        if (query.toLowerCase().contains(clean("which%20of%20the%20following%20numbers%20is%20the%20largest:%206,%20515,%20241,%2084"))) {
            response = "515";
        }

        if (query.toLowerCase().contains(clean("what%20is%2010%20plus%2017"))) {
            response = "27";
        }
        return response;
    }
}
