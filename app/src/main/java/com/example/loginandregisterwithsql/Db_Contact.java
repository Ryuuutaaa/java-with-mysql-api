package com.example.loginandregisterwithsql;

public class Db_Contact {

    public static String ip = "192.168.21.1";
    public static String folderName = "android-api";
    public static String fileNameRegister = "api-register.php";
    public static String fileNameLogin = "api-login.php";


    public static final String urlRegister = "http://" + ip + "/" + folderName + "/" + fileNameRegister;
    public static final String urlLogin = "http://" + ip + "/" + folderName + "/" + fileNameLogin;

}