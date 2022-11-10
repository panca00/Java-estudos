package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
   
        //Não tem idenx e não permitem numero repetitivos
        Set<Double> notas= new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());

        //Exibindo por posicao nao é possivel com os Sets

        //Não consigo adicionar pela posicao

        //Não  consigo substituir uma nota ja definida, por falta de meio de procurar

        //Verificando se a nota 5 esta no Set

        System.out.println(notas.contains(5d));

        //Nao consigo exibir uma nota por posicao

        //Exibindo a menor nota e a maior

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
   
        //Soma dos valores(sempre com iterator)  
        Iterator<Double> iterator=notas.iterator();

        Double soma=0d;
        while (iterator.hasNext()) {
            soma+=iterator.next();
        }

        System.out.println(soma);
        System.out.println(soma/notas.size());

        //Removendo a nota 0
        notas.remove(0.d);
        System.out.println(notas);
        //não rola remoção por posicao
        

        //Removendo notas menor que 7

        Iterator<Double> iterator1=notas.iterator();

        while(iterator1.hasNext()){
            if(iterator1.next()<7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        //Exibindo na forma que foram infomrados, para isso so a linkedHashSet

        Set<Double> notas2=new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        //Lembrand que nao aceita numeros repetidos
        System.out.println(notas2);

        //Ordenação natural dos elementos

        Set<Double> notas3= new TreeSet<>(notas2);
        System.out.println(notas3);

        //Apgando todo o conjunto
        notas.clear();
        notas2.clear();
        notas3.clear();
        //Verificando se esta vazio
        notas.isEmpty();
        notas2.isEmpty();
        notas3.isEmpty();
    }
}
