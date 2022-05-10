package Optional;

import java.util.Optional;

public class OptionalApp {

    void probar (String valor){
        System.out.println(valor.contains("nttdata"));
    }

    void orElse(String valor){
        //Optional<String> op = Optional.of(valor);
        //String x = op.get();

        Optional<String> op = Optional.ofNullable(valor);
        String x = op.orElse("default");

        System.out.println(x);
    }

    void orElseThrow(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
    }

    void isPresent(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }

    public static void main(String[] args){
        OptionalApp app=new OptionalApp();
        //app.probar(null);
        //app.orElse(null);
        //app.orElseThrow(null);
        //app.isPresent(null);
    }
}
