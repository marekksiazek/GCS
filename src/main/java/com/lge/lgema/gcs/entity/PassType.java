package com.lge.lgema.gcs.entity;

public enum PassType {
    ALL_DAY("Całodniowa"),
    SHORT_TIME("Krótki czas"),
    EMERGENCY("Nagły wypadek"),
    NO_ENTRY("Zakaz wjazdu"),
    DONG_YANG("Dong Yang"),
    MA3("MA3"),
    SZYDLOWO("Szydłowo"),
    TRANSPORT("Transport");


    private String type;

    PassType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
