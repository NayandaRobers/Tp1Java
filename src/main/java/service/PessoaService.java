package service;

import model.Pessoa;
import java.util.Scanner;
public class PessoaService {
    public Pessoa criarPessoa() {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Digite a idade da pessoa: ");
        pessoa.setIdade(Integer.parseInt(scanner.nextLine()));

        while (true) {
            System.out.print("Digite o email da pessoa: ");
            String email = scanner.nextLine();
            if (validarEmail(email)) {
                pessoa.setEmail(email);
                break;
            } else {
                System.out.println("Email inválido. Tente novamente.");
            }
        }

        return pessoa;
    }

    private boolean validarEmail(String email) {

        return email.contains("@") && email.contains(".");
    }

}