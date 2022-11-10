package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        
        //Ordem aleatoria é com hashset
        Set<Serie> minhasSeries= new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};

        for(Serie serie:minhasSeries){
            System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        //Ordem de insercao É COM LINKED HASSET
        Set<Serie> minhasSeries2= new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};
        for(Serie serie:minhasSeries2){
            System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        //Ordem natural usando o tempo de episodio, ->TreeSET
        Set<Serie> minhasSeries3= new TreeSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};
        for(Serie serie:minhasSeries3){
            System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        //Ordem natural por Nome/Genero e tempo Episodio
        Set<Serie> minhasSeries4= new TreeSet<>( new ComparatoNomeGeneroTempoEpisodio());
        
        minhasSeries4.addAll(minhasSeries);

        for(Serie serie:minhasSeries4){
            System.out.println(serie.getNome()+"-"+serie.getGenero()+"-"+serie.getTempoEpisodio());
        }
    }
} 

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie( String nome, String genero, Integer tempoEpisodio) {
        this.nome=nome;   
        this.genero=genero;   
        this.tempoEpisodio=tempoEpisodio;   
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{"+
        "nome='"+nome+'\''+
        ",genero="+genero+
        ",tempoEpisodio='"+tempoEpisodio +'\''+
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Serie serie=(Serie) o; 
        return nome.equals(serie.nome)&& genero.equals(serie.genero)&& tempoEpisodio.equals(serie.tempoEpisodio);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome,genero,tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        // TODO Auto-generated method stub
        int tempoEpisodio= Integer.compare(this.getTempoEpisodio(), o.tempoEpisodio);
        if(tempoEpisodio!=0)return tempoEpisodio;
        
        return this.getGenero().compareTo(o.getGenero());
        
    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        int nome= o1.getNome().compareTo(o2.getNome());
        if(nome!=0)return nome;
        
        int genero= o1.getGenero().compareTo(o2.getGenero());
        if(genero!=0)return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
        
        
        
  
    }
    
}