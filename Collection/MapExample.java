package com.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
       public static void main(String[] args) {
         // TODO Auto-generated method stub

             //you can not repeat key
        Map<String, String> map=new HashMap<String, String>();
        map.put("actor", "sunil");
        map.put("ceo", "sam");
        map.put("clerk", "raman");
        map.put("accountant", "raj");
        map.put("clerk", "raj");
        System.out.println(map.get ("doctor"));
        Set<String> designation=map.keySet();
    for (String key:designation)
      {

        System.out.println(map.get(key));
      }
   for(String key:designation)
     {System.out.println(key+" "+map.get(key));
   
     }
   }
}

