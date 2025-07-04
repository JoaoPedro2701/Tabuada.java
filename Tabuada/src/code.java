import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        // Tabuada 1 a 10
    	
        Scanner sc = new Scanner(System.in);

        int cap;

        System.out.print("Digite o número que deseja saber sua tabuada: ");
        cap = sc.nextInt();

        for (int resu = 1; resu <= 10; resu++) {
            int nuf = cap * resu;
            System.out.println(cap + " x " + resu + " = " + nuf);
        }

        sc.close();
    }
}
