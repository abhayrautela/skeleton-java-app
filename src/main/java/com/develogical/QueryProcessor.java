package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("merchant of venice")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "Abhay Rautela";
        }
        return "";
    }
}
