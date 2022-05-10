package lambda;

import java.util.*;

public class LambdaApp {

    private static double atributo1;
    private double atributo2;

    void ordenar(){
        List<String> list =  new ArrayList<>();
        list.add("nttdata");
        list.add("ntt");
        list.add("data");

        //imperativa
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        //declarativa -> lambda
        //Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));

        //forma mas abreviada
        list.sort((o1, o2) -> o1.compareTo(o2));

        for(String element : list){
            System.out.println(element);
        }
    }

    void calcular(){
        //imperativa
//        Operation operation = new Operation() {
//            @Override
//            public double calcularPromedio(double n1, double n2) {
//                return (n1 + n2)/2;
//            }
//        };

        //declarativo -> lambda
        Operation operation = (double x, double y) -> ( x + y ) / 2;

        System.out.println(operation.calcularPromedio(2,3));

    }

    void sintaxis(){
        Operation operation = (x, y) -> {
            double a = 2.0;
            return ( x + y ) / 2 + a;
        };
        System.out.println(operation.calcularPromedio(2,3));
    }

    void ambitoLocal() {
        double n3 = 3;

//        Operation operation = new Operation() {
//            @Override
//            public double calcularPromedio(double n1, double n2) {
//                return n1 +n2 + n3;
//            }
//        };

        Operation operation = (x,y) -> {
            return x + y + n3;
        };

        System.out.println(operation.calcularPromedio(1,2));
    }

    void ambitoGlobal() {

//        Operation operation = new Operation() {
//            @Override
//            public double calcularPromedio(double n1, double n2) {
//                atributo1 = n1 + n2;
//                atributo2 = atributo1;
//                return atributo2;
//            }
//        };

        Operation operation = (x,y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };

        System.out.println(operation.calcularPromedio(1,2));
    }

    public static void main(String[] args){
        LambdaApp app = new LambdaApp();

        app.ordenar();
        app.calcular();
        app.sintaxis();
        app.ambitoLocal();
        app.ambitoGlobal();
    }
}
