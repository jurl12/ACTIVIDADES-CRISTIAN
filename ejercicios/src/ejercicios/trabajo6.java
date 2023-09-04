package ejercicios;

public class trabajo6 {

    public static void main(String[] args) {
        int[] arreglo1 = {3, 7, 9, 12, 15};
        int[] arreglo2 = {1, 4, 8, 10, 20};

        int[] resultado = sumarArrays(arreglo1, arreglo2);

        System.out.print("Resultado de la suma de los arreglos: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }

    public static int[] sumarArrays(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud.");
        }

        int[] resultado = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        return resultado;
    }
}
