package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Questions {
    private ArrayList<Integer> keys = new ArrayList<>();
    private Map<Integer, String> qest_map = new HashMap<>();
    private Map<Integer, String> ans_map = new HashMap<>(); //who read it is gay
    private int trueAns;
    private void createQstBase(){
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
    } // Initializing Collections
    public void gameStart(){
        createQstBase();

        System.out.println("Выберите правильные варианты ответов:\n");

        for(Integer key:keys){
            System.out.print("Вопрос "+key+". "+qest_map.get(key)+" = ");

            System.out.println(qstGenerarion(key));

            Scanner sc = new Scanner(System.in);
            System.out.print("Ваш ответ: ");

            if(trueAns != sc.nextInt()){
                System.out.println("Неправильно! Учитесь лучше!");
                System.exit(1);
            }
            System.out.println("");
        }
        System.out.println("Вы молодцы!!!");
    }
    private String qstGenerarion(int key){
         Set<Integer> r = new HashSet<>();
         r.add(key);

         do{
             int num = new Random().nextInt(keys.size()+1);
             if(num!=0){
                 r.add(num);
             }
         }while(r.size()<4);
         int n=1;

         String qst="";
         for(int i:r){
             qst += "\n      "+n+")"+ans_map.get(i);
             if(ans_map.get(i).contains(ans_map.get(key))){
                 trueAns=n;
             }
             n++;
         }
         return qst;
    }
    private void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }

}
