import com.dio.filas.Fila;
import com.dio.filas.No;
import com.dio.lista.List;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new List<>();

        myList.add("peimeiro");
        myList.add("segundo");
        myList.add("terceiro");
        myList.add("quarto");

        System.out.println(myList.get(0));

        //Estudo de implementação de filas
        Fila fila = new Fila();

        fila.enqueue(new No("peimeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));


        System.out.println(fila);

        System.out.println(fila.dequeue())
        ;
        System.out.println(fila);

        fila.enqueue(new No("ultimo"));

        System.out.println(fila);

        System.out.println(fila.first());
        
        System.out.println(fila);


    }
}