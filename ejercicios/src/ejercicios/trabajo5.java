package ejercicios;
import java.util.ArrayList;
import java.util.List;

public class trabajo5 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(12);
        lista.add(7);
        lista.add(28);
        lista.add(9);
        lista.add(14);

        int maximo = encontrarMaximo(lista);
        System.out.println("El valor máximo en la lista es: " + maximo);
    }

    public static int encontrarMaximo(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía.");
        }

        int maximo = lista.get(0);

        for (int elemento : lista) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }

        return maximo;
    }
}