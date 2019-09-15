package com.lesson9;

public class FinalEx {
    public static final int iAmCount;
    public final int iAmCount2;

//    {
//        iAmCount2 = 1;
//    }

    static {
        iAmCount = 10;
    }

    public FinalEx() {
       iAmCount2 = 2;
    }

    private native int getCount();
}
