import java.util.Scanner;
public class ProgProdutos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantos produtos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Produtos[] produtos = new Produtos[n]; //array de classes (Produtos)

        for (int i = 0;i<n;i++)
        {
            System.out.print("Nome do " + (i+1) + "º Produto: ");
            String nome= sc.nextLine();
            System.out.print("Preço do " + (i+1) + "º Produto: ");
            double preço= sc.nextDouble();
            sc.nextLine();
            Produtos p = new Produtos(nome,preço);
            produtos[i]=p;
        }
        double total=0;
        for(int i =0; i<n;i++)
        {
            System.out.println("\nDados do " + (i+1) + "º Produto: (" + produtos[i].getNome() +
                    ", " + produtos[i].getPreço() + ")");
            total += produtos[i].getPreço();
        }
        double media=total/n;
        System.out.printf("Valor médio dos Produtos: %.2f%n", media);
    }
}
