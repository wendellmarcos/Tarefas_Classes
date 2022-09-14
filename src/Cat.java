import java.util.Locale;
import java.util.Scanner;

public class Cat {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Animal cat = new Animal();
        Scanner sc = new Scanner(System.in);

        Boolean Sim = true;

        System.out.println("Olá, você tem um ou mais Cat ? Digite Sim ou Não: ");
        sc.next();

        if (Sim.equals("Sim")) {
            System.out.println("Qual o nome do seu Cat ? ");
            cat.setName(sc.next());


            System.out.println("Qual a cor do seu Cat? ");
            cat.setColor(sc.next());

            System.out.println("Qual a idade do seu Cat? ");
            cat.setYears(sc.nextInt());

            System.out.println("Qual o peso do seu Cat? ");
            cat.setPeso(sc.nextDouble());
            cat.setBarulho("Miauu");

            System.out.println("Nome: " + cat.getName());
            System.out.println("Cor: " + cat.getColor());
            System.out.println("Idade: " + cat.getYears());
            System.out.println("Peso: " + cat.getPeso()+" Kilos");
            System.out.println("Barulho: " + cat.getBarulho());

            sc.close();

        }
        else {
            System.out.println("Que pena você não tem um Cat! ");
        }
    }

}
