package io.goudai.commons.util;

/**
 * Created by freeman on 2016/1/15.
 */
public class Assert {

    public static void assertNotNull(String msg, Object o) {
        if (o == null || "".equals(o)) throw new NullPointerException(msg + "must be not null'");
    }

}
