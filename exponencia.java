import java.util.Scanner;
public class exponencia{
    public static void main(String[] args) {
        class Exp {
            public void exponenciacao(){
                Scanner input = new Scanner(System.in);
                System.out.print("Digite um valor: ");
                double n = input.nextInt();
                double exp = 2;
                int resposta=  (int) Math.pow(n, exp);
                System.out.print("A exponenciação é: ");
                System.out.println(resposta);
            }
            
        }
        Exp num;
        num = new Exp();
        num.exponenciacao();
    }
}
