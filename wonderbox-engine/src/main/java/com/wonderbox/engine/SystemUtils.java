package com.wonderbox.engine;

/**
 * @author Ge Mingjia
 */
public class SystemUtils {


    public static boolean isWindows() {
        String osName = getOsName();
        return osName != null && osName.toLowerCase().startsWith("windows");
    }

    public static boolean isLinux() {
        String osName = getOsName();
        return osName != null && osName.toLowerCase().startsWith("linux");
    }

    public static boolean isMac() {
        String osName = getOsName();
        return osName != null && osName.toLowerCase().startsWith("mac");
    }

    private static String getOsName() {
        return System.getProperty("os.name");
    }

    public static void main(String[] args) {
        System.out.println(isWindows());
    }
}