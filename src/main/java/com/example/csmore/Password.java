package com.example.csmore;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class Password {
    public String password = "0000";

    public Password() throws NoSuchAlgorithmException {
        String sh = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Mattias\\IdeaProjects\\csmore\\src\\main\\resources\\com\\example\\csmore\\password.txt"));
            sh = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.password = sh;
    }

    public boolean setPassword(String currentPass, String neuPass) throws NoSuchAlgorithmException {
        if(checkPass(currentPass) == true){
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(neuPass.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            password = neuPass;
            try {
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\Mattias\\IdeaProjects\\csmore\\src\\main\\resources\\com\\example\\csmore\\password.txt"));
                fileWriter.write(neuPass);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } return true;
        } return false;
    }

    public boolean checkPass(String pass) throws NoSuchAlgorithmException {
        MessageDigest md2 = MessageDigest.getInstance("MD5");
        md2.update(pass.getBytes());
        byte[] bytes = md2.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        if(pass.equals(password)){
            return true;
        }
        return false;
    }
}
