import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n1, n2, n3, n4, n5;
        double mayorIf, mayorMath;

        System.out.print("Ingrese el primer número: ");
        n1 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el segundo número: ");
        n2 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el tercer número: ");
        n3 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el cuarto número: ");
        n4 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el quinto número: ");
        n5 = Double.parseDouble(br.readLine());

        NumeroMayor numeros = new NumeroMayor(n1, n2, n3, n4, n5);

        mayorIf = numeros.mayorConIf();
        mayorMath = numeros.mayorConMath();

        System.out.println("\nEl número mayor (usando if) es: " + mayorIf);
        System.out.println("El número mayor (usando Math.max) es: " + mayorMath);
    }
}