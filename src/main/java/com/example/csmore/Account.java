package com.example.csmore;

import java.io.*;

public class Account {
    private int accountBalance;


    public boolean checkBalance(String num){
        int num1 = Integer.parseInt(num);
        if(num1<=getAccountBalance()){
            return true;
        }
        return false;
    }

    public  int getAccountBalance() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Mattias\\IdeaProjects\\csmore\\src\\main\\resources\\com\\example\\csmore\\account.txt"));
            String sh;
            while((sh = bufferedReader.readLine()) != null){
                int ba = Integer.parseInt(sh);
                return ba;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\Mattias\\IdeaProjects\\csmore\\src\\main\\resources\\com\\example\\csmore\\account.txt"));
            String ba = String.valueOf(accountBalance);
            fileWriter.write(ba);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileStuff(){

    }
    public String fileReader(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Mattias\\IdeaProjects\\csmore\\src\\main\\resources\\com\\example\\csmore\\account.txt"));
            String sh;
            while((sh = bufferedReader.readLine()) != null){
                return sh;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
