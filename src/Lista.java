import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> listaFuncionarios = new ArrayList <>();
        listaFuncionarios.add ("José");
        listaFuncionarios.add ("Josefa");
        listaFuncionarios.add ("Jefferson");
        listaFuncionarios.add ("Jroger");

        System.out.println(listaFuncionarios);

        System.out.println("Qual o funcionario que voce quer remover?");
        String nomeFuncionario = ler.nextLine();

        listaFuncionarios.remove("Jefferson");

        System.out.println(listaFuncionarios);

        ler.close();
    }
}
