package MethodRefences;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

    static void referenciaMetodoStatic(){
        System.out.println("Metodo Referido Static");
    }

    void referenciaMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"nttdata", "data", "ntt"};

        //imperativa
//        Arrays.sort(nombres, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        //lambda
        //Arrays.sort(nombres, (o1, o2) -> o1.compareToIgnoreCase(o2));

        //meteodo de referencia
        Arrays.sort(nombres, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(nombres));
    }

    void referenciaMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo referido Instancia de Clase");
    }

    void refenciaContructor(){
        //imperativa
//        IPersona iper = new IPersona() {
//            @Override
//            public Persona crear(int id, String nombre) {
//                return new Persona(id, nombre);
//            }
//        };

        //lambda
        //IPersona iper = (id, nombre) -> (new Persona(id, nombre)) ;

        //metodo de referencia
        IPersona iper = Persona::new;

        Persona p = iper.crear(1, "nttdata");
        System.out.println("ID: " +p.getId() + "\nnombre: "+p.getNombre());
    }

    void operar(){
        //Operation op = () -> MeRefApp.referenciaMetodoStatic();
        Operation op = MeRefApp::referenciaMetodoStatic;
        op.saludar();
    }

    public static void main(String[] arg){
        MeRefApp app = new MeRefApp();
        app.operar();
        app.referenciaMetodoInstanciaObjetoArbitrario();

        Operation op =  app::referenciaMetodoInstanciaObjetoParticular;
        op.saludar();

        app.refenciaContructor();

    }
}
