package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic {

    public static void main(String[] args){

        List<String> lst = Arrays.asList("este", "es", "us", "test");

        List<Integer> lst_2 = lst.stream()
                //.map(s -> s.length())
                .map(String::length)
                .collect(Collectors.toList());

        for(int a:lst_2){
            System.out.println("elemento "+ a);
        }

    }

}
