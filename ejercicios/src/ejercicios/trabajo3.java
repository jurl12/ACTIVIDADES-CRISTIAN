package ejercicios;
import javax.swing.JOptionPane;
import java.util.Random;


public class trabajo3 {
	
		public static void main(String[] args) {
	        int numeroAleatorio = generarNumeroAleatorio();
	        mostrarNumeroAleatorio(numeroAleatorio);
	    }

	    public static int generarNumeroAleatorio() {
	        Random random = new Random();
	        int numeroAleatorio = random.nextInt(100) + 1; 
	        return numeroAleatorio;
	    }

	    public static void mostrarNumeroAleatorio(int numero) {
	        String mensaje = "Número aleatorio entre 1 y 100: " + numero;
	        JOptionPane.showMessageDialog(null, mensaje);
	    }
}
