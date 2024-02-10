package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* tengo un arreglo por ejemplo:
*
* a = "este", "mundo", "es", "hermoso"
*
* y quiero retornar la lista de  caracteres unicos de toda la lista?
* *
        //la salida seria: " ["e", "s", "t", "m", "u", "n"; "d"; "o", "h", "r"]
* */
public class flat {

    public static void main(String[] args) {

        List<String> lst = Arrays.asList("este", "mundo", "es", "hermoso");
        String strAll = lst.stream()
                .collect(Collectors.joining());

        List<Character> result1 = new ArrayList<>();
        for(Character c: strAll.toCharArray()){
            if (result1.indexOf(c)==-1){
                result1.add(c);
            }
        }
        System.out.println(result1);

        //alternativa 2

        List<String[]> result2 = lst.stream()
                .map(w -> w.split(""))
                .distinct()
                .collect(Collectors.toList());

        //System.out.println("result 2 "+ result2.get(0));

        //alternativa 3

        String[] nombres = {"tavo", "jorge"};

        Stream<String> streamNombres = Arrays.stream(nombres);

        List<Integer> out = streamNombres.map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println("out "+out);


        // del libro
        List<String> names = Arrays.asList("tavo", "jorge");

        List<Stream<String>> a = names.stream()
                .map(word -> word.split(""))
                .map(Arrays:: stream)
                .distinct()
                .collect(Collectors.toList());
        //usando flatmap
        System.out.println(" a "+a);

        List<String> b = names.stream()
                .map(word ->word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("b "+b);

    }

}
