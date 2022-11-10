package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {
    public static void main(String[] args) {
        


        //Ordem aleatória

        Map<String, Livros> meusLivros= new HashMap<>(){{
            put("HawKing,Stephen", new Livros("Uma breve historia do tempo",256));
            put("Duhigg,Charles", new Livros("O Poder do Hábito",408));
            put("Harari,Yuval Noah", new Livros("21 Lições para o Seculo 21",432));
        }};

        for(Map.Entry<String, Livros> livro:meusLivros.entrySet()){

            System.out.println(livro.getKey()+"-"+livro.getValue().getNome());
        }

        //Ordem de inserção

        Map<String, Livros> meusLivros1= new LinkedHashMap<>(){{
            put("HawKing,Stephen", new Livros("Uma breve historia do tempo",256));
            put("Duhigg,Charles", new Livros("O Poder do Hábito",408));
            put("Harari,Yuval Noah", new Livros("21 Lições para o Seculo 21",432));
        }};

        for(Map.Entry<String, Livros> livro:meusLivros1.entrySet()){

            System.out.println(livro.getKey()+"-"+livro.getValue().getNome());
        }

        //Ordem alfabetica natural dos autores
        Map<String, Livros> meusLivros2= new TreeMap<>(){{
            put("HawKing,Stephen", new Livros("Uma breve historia do tempo",256));
            put("Duhigg,Charles", new Livros("O Poder do Hábito",408));
            put("Harari,Yuval Noah", new Livros("21 Lições para o Seculo 21",432));
        }};
        for(Map.Entry<String, Livros> livro:meusLivros2.entrySet()){

            System.out.println(livro.getKey()+"-"+livro.getValue().getNome());
        }

        //Ordem alfabetica dos nomes do livros

        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livro:meusLivros3){

            System.out.println(livro.getKey()+"-"+livro.getValue().getNome());
        }


    }
}

class Livros {

    private String nome;
    private Integer paginas;
    
    public Livros(String nome, Integer paginas){
        this.nome=nome;
        this.paginas=paginas;
    }

    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
       return "{"+
        "nome='"+nome+'\''+
        ",paginas="+paginas+
        '}';
    }


}

/**
 * ComparatorNome
 */
 class ComparatorNome implements Comparator<Map.Entry<String,Livros>>{

    @Override
    public int compare(Entry<String, Livros> l1, Entry<String, Livros> l2) {
       
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }


    
}