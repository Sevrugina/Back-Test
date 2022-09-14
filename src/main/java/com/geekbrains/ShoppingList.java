package com.geekbrains;
import java.io.*;
import java.util.Properties;
public class ShoppingList {
    String user;
    String hash;
    File file = new File("property.dat");

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void putProperties(String username, String hash) throws IOException {
        Properties properties_in = new Properties();
        properties_in.setProperty("username", username);
        properties_in.setProperty("hash", hash);
        FileOutputStream fr = new FileOutputStream(file);
        properties_in.store(fr, "Properties");
        fr.close();
    }

    public void getProperties() throws IOException {
        FileInputStream fi = new FileInputStream(file);
        Properties properties_out = new Properties();
        properties_out.load(fi);
        fi.close();
        this.user = properties_out.getProperty("username");
        this.hash = properties_out.getProperty("hash");
        System.out.println(user);
        System.out.println(hash);
    }
}
