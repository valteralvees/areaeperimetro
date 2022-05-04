package areaeperimetrodocirculo;
import java.util.Scanner;


public class AreaEPerimetrodoCirculo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double raio,perimetro, area;
        System.out.println("Digite o raio, em CM, desejado:");
        raio = teclado.nextDouble();
        perimetro =  2 * 3.14159 * raio;
        area = 3.14159 * raio * raio;
        System.out.println("O perimetro do círculo indicado é de "+perimetro+"cm e a area é de "+area+" cm");
    }
    
}
