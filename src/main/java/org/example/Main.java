package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> keys = new ArrayList<>();
        Map<Integer, String> qest_map = new HashMap<>();
        Map<Integer, String> ans_map = new HashMap<>();
//кто прочитал тот гей
        try(BufferedReader in = new BufferedReader(new FileReader("file.txt"))) {
            String str;
            while((str = in.readLine()) != null){
                String[] spl = str.split("[ \n\t]+");

                keys.add(Integer.parseInt(spl[0]));

                qest_map.put(Integer.parseInt(spl[0]), spl[1]);
                ans_map.put(Integer.parseInt(spl[0]), spl[2]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Сыграем в игру???)))0)))0))\n");

        int key;
        while(true){
            key = new Random().nextInt(keys.size()+1);

            System.out.println("    "+qest_map.get(key));
            for (int n=0; n<3; ){
                System.out.println(")"+((key+1 > keys.size())? keys.size()%key+1:key+1)+"   ");
                System.out.println(")"+((key+2 > keys.size())? keys.size()%key+2:key+2)+"   ");
                System.out.println(")"+((key+3 > keys.size())? keys.size()%key+3:key+3)+"   ");
            }
        }
    }
}