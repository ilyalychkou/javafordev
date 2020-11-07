package com.javafordev.lesson8.task1;

import java.util.List;

public class TextReader {

    private List<String> dates;
    private List<String> names;

    public TextReader(List<String> dates, List<String> names) {
        this.dates = dates;
        this.names = names;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
