package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args){
    
        //Forma mais generica de criar uma lista, tem outras formas
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        
        System.out.println(notas);
        System.out.println(notas.toString());


        //imprimindo 

        //Posicao de um elemento 
        System.out.println("pOSICAÇÃO DA NOTA 5.0: " +notas.indexOf(5d));
        
        //adicionando na posicao um valor
        notas.add(4,8d);
        System.out.println(notas);

        //Substituindo um valor
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        //conferindo um valor

        System.out.println("O numero 5 está na lista? "+notas.contains((5d)));
        //com foreach
        for (Double nota: notas) System.out.println(nota);

        //exibindo um valor a partir da posicao

        System.out.println(notas.get(2));

        //exibir a menor nota e a maior

        System.out.println("O menor valor é: " +Collections.min(notas));
        System.out.println("a maior valor é: " +Collections.max(notas));
    
        //soma dos valores de um list

        Iterator<Double> iterator=notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next=iterator.next();
            soma+=next;
        }
        System.out.println("A soma deu:"+soma);

        //A media da lista

        System.out.println("A média é: "+soma/notas.size());
        
        //Removendo a nota 0

        notas.remove(0d);

        //removendo a nota da posicao 0
        notas.remove(0);

        //Removendo as notas menores que 7

        Iterator<Double> iterator2=notas.iterator();
        while(iterator2.hasNext()){
            Double next=iterator2.next();
            if(next<7) iterator2.remove();
        }
        System.out.println(notas);

        //Apangando a lista
        notas.clear();//='c

        //Confira se a lista está vazia
        notas.isEmpty();

        //Ordenando a lista

        
    }
}
