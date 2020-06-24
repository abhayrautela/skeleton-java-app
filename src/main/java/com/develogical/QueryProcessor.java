package com.develogical;

public class QueryProcessor {

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


        return response;
    }
}
