import java.util.Scanner;
import java.util.Locale;
public class Dog {


    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Animal dog = new Animal();
        Scanner sc = new Scanner(System.in);
        Boolean Sim = true;
        System.out.println("Olá, você tem um ou mais Dogs ? Digite Sim ou Não: ");
        sc.next();

        if (Sim.equals("Sim")) {
        System.out.println("Qual o nome do seu Dog? ");
        dog.setName(sc.next());


        System.out.println("Qual a cor do seu Dog? ");
        dog.setColor(sc.next());

        System.out.println("Qual a idade do seu Dog? ");
        dog.setYears(sc.nextInt());

        System.out.println("Qual o peso do seu Dog? ");
        dog.setPeso(sc.nextDouble());
        dog.setBarulho("Auau");

        System.out.println("Nome: " + dog.getName());
        System.out.println("Cor: " + dog.getColor());
        System.out.println("Idade: " + dog.getYears());
        System.out.println("Peso: " + dog.getPeso()+" Kilos");
        System.out.println("Barulho: " + dog.getBarulho());

        sc.close();

        }
       else {
            System.out.println("Que pena você não tem um Dog! ");
        }
    }


}
