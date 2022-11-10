package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
  
    public static void main(String[] args) {
        

        //Criando um dicionario

        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.1);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares);

        //Substituindo um elemento pela chave
        //Nesse caso HashMap nao permite chaves repetivas
        carrosPopulares.put("gol", 16.1);

        System.out.println(carrosPopulares);
        
        //Verificando a existencia de uma chave


        System.out.println(carrosPopulares.containsKey("tucson"));;


        //Exibindo um valor por chave

        System.out.println(carrosPopulares.get("uno"));

        //Não existe como exibir por posicao 

        //Exibindo os modelos(keys/chaves)

        System.out.println(carrosPopulares.keySet());

        // Exibindo valores 

        System.out.println(carrosPopulares.values());

        //Carro que tem menos consumo
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        System.out.println( consumoEficiente);
        //Conversao de um map oara um set
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente="";

        for( Map.Entry<String,Double> entry: entries){
            if(entry.getValue().equals(consumoEficiente)){
                modeloEficiente=entry.getKey();
                System.out.println(modeloEficiente+"-"+consumoEficiente);
            }
        }

        //Menor consumo

        Double consumoMenosEficiente =Collections.min(carrosPopulares.values());
        String menosEficient="";
        
        for(Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                menosEficient=entry.getKey();
                System.out.println(menosEficient+"-"+consumoMenosEficiente);
            }
        }

        //A soma dos consumos

        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma=0d;

        while (iterator.hasNext()) {
            soma+=iterator.next();
        }
        System.out.println(soma);
        System.out.println(soma/carrosPopulares.size());
        

        //Removendo consumos iguais a 15.6

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
    
        //Ordem em que foi informados, linkedhashmap
    
        Map<String,Double> carrosPopulares1= new LinkedHashMap<>(){{
            put("gol",14.1);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares1);

        //Ordenado pelo modelo, treemap
            
        Map<String,Double> carrosPopulares2= new TreeMap<>(){{
            put("gol",14.1);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares2);

        //apagando o dicionario

        carrosPopulares.clear();
        //verificando se esta vazio
        carrosPopulares.isEmpty();

    }


}
