package org.example;
import model.Pessoa;
import service.PessoaService;
/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PessoaService pessoaService = new PessoaService();
        Pessoa pessoa = pessoaService.criarPessoa();

        System.out.println("Dados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
    }
}
