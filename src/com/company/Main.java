package com.company;

public class Main {

    public static void main(String[] args) {
        String[] supportedPhones = {"1,2,3,4,5", "6,7,8,4,5"};
        String sp1 = supportedPhones[0];
        String sp2 = supportedPhones[1];
        sp1=sp1.replaceAll(",","").trim();
        sp2=sp2.replaceAll(",","").trim();
        char[] ca1 = sp1.toCharArray();
        char[] ca2 = sp2.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ca1.length;i++){
            if (ca1[i] == ca2[i]) {
                result.append(ca1[i]).append(",");
            }
        }
        result.delete(result.length() - 1, result.length());

        System.out.println("data yang sama: " + result.toString());
    }
}
