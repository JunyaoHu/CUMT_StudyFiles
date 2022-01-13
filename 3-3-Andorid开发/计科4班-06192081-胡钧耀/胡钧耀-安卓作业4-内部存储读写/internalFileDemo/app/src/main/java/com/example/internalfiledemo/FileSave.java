package com.example.internalfiledemo;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSave {
    public static boolean writeData(Context context, String data, boolean flag){
        try {
            if (flag) {
                FileOutputStream fos = context.openFileOutput("data.txt", Context.MODE_APPEND);
                fos.write(data.getBytes());
                fos.close();
                return true;
            } else {
                FileOutputStream fos = context.openFileOutput("data.txt", Context.MODE_PRIVATE);
                fos.write(data.getBytes());
                fos.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String readData(Context context) {
        String data = "";
        try {
            FileInputStream fis = context.openFileInput("data.txt");
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            data = new String(buffer);
            fis.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
