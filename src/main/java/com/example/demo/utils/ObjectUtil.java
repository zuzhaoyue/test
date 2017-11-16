package com.example.demo.utils;

import java.io.*;

/**
 * Created by zuzhaoyue on 17/11/13.
 */
public class ObjectUtil {
    /**
     * 8      * 对象转byte[]
     * 9      * @param obj
     * 10      * @return
     * 11      * @throws IOException
     * 12
     */
    public static byte[] object2Bytes(Object obj) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        byte[] bytes = bo.toByteArray();
        bo.close();
        oo.close();
        return bytes;
    }

    /**
     * 23      * byte[]转对象
     * 24      * @param bytes
     * 25      * @return
     * 26      * @throws Exception
     * 27
     */
    public static Object bytes2Object(byte[] bytes) throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        ObjectInputStream sIn = new ObjectInputStream(in);
        return sIn.readObject();
    }
}
