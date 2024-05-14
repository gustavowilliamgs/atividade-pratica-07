public class PessoaFisica extends Cliente {
    // Atributo específico de PessoaFisica
    private String cpf;

    // Construtor da classe PessoaFisica que inicializa os atributos
    public PessoaFisica(String nome, String endereco, String cpf, String telefone, String email) {
        // Chama o construtor da superclasse Cliente para inicializar os atributos
        // herdados
        super(nome, endereco, telefone, email, 0.0, 0.0, 0.0, 0.0);
        // Inicializa o atributo específico cpf
        this.cpf = cpf;
    }

    // Método para calcular o desconto da compra para pessoas físicas
    public void descontoDaCompra() {
        // Obtém o valor da compra da superclasse Cliente
        double valorCompra = super.getValorCompra();
        double valorDesconto = 0;

        // Aplica diferentes percentuais de desconto com base no valor da compra
        if (valorCompra > 200.0 && 500.0 <= valorCompra) {
            valorDesconto = valorCompra * 0.05;
        } else if (valorCompra > 500.0) {
            valorDesconto = valorCompra * 0.08;
        }

        // Define o valor do desconto usando o método setter da superclasse Cliente
        setValorDesconto(valorDesconto);
    }

    // Método getter para obter o CPF
    public String getCpf() {
        return cpf;
    }
}
