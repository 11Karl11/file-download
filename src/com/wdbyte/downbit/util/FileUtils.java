package com.wdbyte.downbit.util;

import java.io.File;


public class FileUtils {


    public static long getFileContentLength(String name) {
        File file = new File(name);
        return file.exists() && file.isFile() ? file.length() : 0;
    }

}
