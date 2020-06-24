package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void knowsWhoWroteRomeoAndJuliet() throws Exception {
        assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
    }

    @Test
    public void knowsWhoWroteMerchantOfVenice() throws Exception {
        assertThat(queryProcessor.process("Who wrote Merchant of venice"), containsString("Shakespeare"));
    }

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void returnsLargest() throws Exception {
        assertThat(queryProcessor.process("which%20of%20the%20following%20numbers%20is%20the%20largest:%20965,%2027"), is("965"));
    }

    @Test
    public void returnsLargest1() throws Exception {
        assertThat(queryProcessor.process("ce60f900:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20461,%2074"), is("461"));
    }

    @Test
    public void cube() throws Exception {
        assertThat(queryProcessor.process("60385770:%20which%20of%20the%20following%20numbers%20is%20both%20a%20square%20and%20a%20cube:%202116,%20651"), is("2116"));
    }
}
