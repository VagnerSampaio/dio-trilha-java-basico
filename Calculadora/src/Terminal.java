import java.util.Scanner;

public class Terminal {

    //no CMD: "java Terminal Vagner Sampaio 39 183"
    
    //No VSCode: Executar > Adicionar Configuração > launch.json
    //{...
    //"mainClass": "Terminal", 
    //"args": ["Vagner","Sampaio","39","1.83"]
    //...} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        
        System.out.println("Olá, me chamo "+nome +" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+"m");

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.println(cidade);
    }
}
