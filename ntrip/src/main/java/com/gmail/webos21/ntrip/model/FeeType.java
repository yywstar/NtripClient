package com.gmail.webos21.ntrip.model;

public enum FeeType {
    UNKNOWN, N, Y;

    public static FeeType getFeeType(String id) {
        FeeType rc = UNKNOWN;

        FeeType[] vals = FeeType.values();
        for (FeeType v : vals) {
            if (v.name().equals(id)) {
                rc = v;
                break;
            }
        }

        return rc;
    }

}
