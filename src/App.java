import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler entrada do usuário a partir do console
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe (1) se você é uma pessoa física ou (2) se você for uma pessoa jurídica: ");
            // Lê a opção escolhida pelo usuário
            byte fisicaOuJuridica = Byte.parseByte(scanner.nextLine());

            if (fisicaOuJuridica == 1) {
                // Se a opção for pessoa física, solicita informações adicionais e cria um
                // objeto PessoaFisica
                System.out.println("Informe seu nome: ");
                String nome = scanner.nextLine();
                System.out.println("Informe seu endereço: ");
                String endereco = scanner.nextLine();
                System.out.println("Informe seu CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Informe seu telefone: ");
                String telefone = scanner.nextLine();
                System.out.println("Informe seu e-mail: ");
                String email = scanner.nextLine();

                PessoaFisica pessoa = new PessoaFisica(nome, endereco, cpf, telefone, email);

                // Solicita e lê o valor da compra e as horas utilizadas no estacionamento
                System.out.print("Informe o valor da compra: ");
                Double valorDaCompra = Double.parseDouble(scanner.nextLine());
                System.out.print("Horas utilizadas no estacionamento: ");
                int horas = Integer.parseInt(scanner.nextLine());

                // Define o valor da compra e calcula o valor do estacionamento e o valor total
                pessoa.setValorCompra(valorDaCompra);
                pessoa.calcularValorEstacionamento(horas);
                pessoa.calcularValorTotal();

                // Imprime o valor total sem desconto e com desconto
                System.out.println("Valor total sem o desconto: " + pessoa.getValorFinal());
                pessoa.descontoDaCompra();
                pessoa.calcularValorTotal();
                System.out.println("Valor total com o desconto: " + pessoa.getValorFinal());
            } else {
                // Se a opção for pessoa jurídica, solicita informações adicionais e cria um
                // objeto PessoaJuridica
                System.out.print("Informe seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Informe seu endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Informe seu CNPJ: ");
                String cnpj = scanner.nextLine();
                System.out.print("Informe seu telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Informe seu e-mail: ");
                String email = scanner.nextLine();

                PessoaJuridica pessoa = new PessoaJuridica(nome, endereco, cnpj, telefone, email);

                // Solicita e lê o valor da compra e as horas utilizadas no estacionamento
                System.out.print("Informe o valor da compra: ");
                Double valorDaCompra = Double.parseDouble(scanner.nextLine());
                System.out.print("Horas utilizadas no estacionamento: ");
                int horas = Integer.parseInt(scanner.nextLine());

                // Define o valor da compra e calcula o valor do estacionamento e o valor total
                pessoa.setValorCompra(valorDaCompra);
                pessoa.calcularValorEstacionamento(horas);
                pessoa.calcularValorTotal();

                // Imprime o valor total sem desconto e com desconto
                System.out.println("Valor total sem o desconto: " + pessoa.getValorFinal());
                pessoa.descontoDaCompra();
                pessoa.calcularValorTotal();
                System.out.println("Valor total com o desconto: " + pessoa.getValorFinal());
            }
        }
    }
}
