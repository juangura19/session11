package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    private List<String> lista;
    private List<String> numeros;

    public StreamApp(){
        lista = new ArrayList<>();
        lista.add("ntt");
        lista.add("data");
        lista.add("nttdata");
        lista.add("session11");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    void filtrar(){
        System.out.println("========FILTRAR========");
        lista
                .stream()
                .filter(x -> x.startsWith("n"))
                .forEach(System.out::println);
    }

    void ordenar(){
        System.out.println("========ORDENAR========");
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    void transformar(){
        System.out.println("========TRANSFORMAR========");
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);

        /*for (String x : numeros){
            int num = Integer.parseInt(x);
            System.out.println(num);
        }*/

        numeros.stream().map(Integer::parseInt).forEach(System.out::println);
    }

    void limitar(){
        System.out.println("========LIMITAR========");
        lista.stream().limit(2).forEach(System.out::println);
    }

    void contar(){
        System.out.println("========CONTAR========");
        long count = lista.stream().count();
        System.out.println(count);
    }

    public static void main(String[] args){
        StreamApp app = new StreamApp();
        app.filtrar();
        app.ordenar();
        app.transformar();
        app.limitar();
        app.contar();
    }
}
