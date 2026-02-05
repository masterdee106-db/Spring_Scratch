package com.spring.ci;

public class Processor {
    String processorName;

    public Processor(String processorName) {
        this.processorName = processorName;
    }
    public Processor(){
        super();
    }

    @Override
    public String toString() {
        return this.processorName;
    }
}
