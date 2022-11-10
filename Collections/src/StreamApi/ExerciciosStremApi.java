package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStremApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios=Arrays.asList("1","0","4","1","2","3","9","9","6","5");
    

    //Imprimindo todos os elementos de uma lista
    //numerosAleatorios.forEach(s->System.out.println(s));
    //usando metodo de referencia
    numerosAleatorios.forEach(System.out::println);

    //Pegando os 5 primeiros numeros e colocando num set

    numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);


    //Transformando a lista de string em uma lista e números de inteiros

    List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
    

    //Pegando numeros pares e maior que 2 e colocando numa lista

    List<Integer> ListPares=numerosAleatorios.stream().map(Integer::parseInt).filter(t->t%2==0 && t>2).collect(Collectors.toList());

    System.out.println(ListPares);

    //A media dos numeros

    numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
    

    //Remova os valores impares
    List<Integer> ListaInteger = numerosAleatorios.stream().
    map(Integer::parseInt).
    collect(Collectors.toList());
    ListaInteger.removeIf(Integer->(Integer%2!=0));
    
    
}
}
