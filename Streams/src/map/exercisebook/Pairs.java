package map.exercisebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pairs {

    public static void main(String[] args){


        List<Integer> lA = Arrays.asList(1, 2, 3);
        List<Integer> lB = Arrays.asList(3, 4);


        List<Integer[]> out = lA.stream()
                  .map(n -> {
                      List<Integer[]> lstPairs = new ArrayList<>();
                      Integer[] pair = new Integer[2];
                      for (Integer i: lB){
                          pair[0]=n;
                          pair[1]=i;
                          System.out.println("["+pair[0] + ","+ pair[1]+"]");
                      }
                      lstPairs.add(pair);
                      return lstPairs;})
                .flatMap(List::stream)
                .collect(Collectors.toList());


        //Solución del libro
        List<Integer[]> pairs =
                    lA.stream()
                        .flatMap(i -> lB.stream()
                                          .map(j -> new Integer[]{i,j})
                        )
                         .filter(arr -> (arr[0] + arr[1])%3==0) //la suma de los pares es divisible entre 3
                        .collect(Collectors.toList());



        for (Integer[] arr: pairs){

            System.out.println(" pair ("+arr[0] + ","+arr[1]+")");
        }


    }

    public class Pair{
        Integer a;
        Integer b;

        public Pair (Integer a, Integer b){
            this.a = a;
            this.b = b;
        }

    }
}
