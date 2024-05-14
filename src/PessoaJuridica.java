public class PessoaJuridica extends Cliente {
    // Atributo específico de PessoaJuridica
    private String cnpj;

    // Construtor da classe PessoaJuridica que inicializa os atributos
    public PessoaJuridica(String nome, String endereco, String cnpj, String telefone, String email) {
        // Chama o construtor da superclasse Cliente para inicializar os atributos
        // herdados
        super(nome, endereco, telefone, email, 0.0, 0.0, 0.0, 0.0);
        // Inicializa o atributo específico cnpj
        this.cnpj = cnpj;
    }

    // Método para calcular o desconto da compra para pessoas jurídicas
    public void descontoDaCompra() {
        // Obtém o valor da compra da superclasse Cliente
        double valorCompra = super.getValorCompra();
        double valorDesconto = 0;

        // Aplica diferentes percentuais de desconto com base no valor da compra
        if (valorCompra <= 200.0) {
            valorDesconto = valorCompra * 0.03;
        } else if (valorCompra > 200.0 && 500.0 >= valorCompra) {
            valorDesconto = valorCompra * 0.05;
        } else if (valorCompra > 500.0) {
            valorDesconto = valorCompra * 0.08;
        }

        // Define o valor do desconto usando o método setter da superclasse Cliente
        setValorDesconto(valorDesconto);
    }

    // Método getter para obter o CNPJ
    public String getCnpj() {
        return cnpj;
    }
}
