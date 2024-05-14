public class Cliente {
    // Declaração dos atributos da classe
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private double valorCompra;
    private double valorDesconto;
    private double valorEstacionamento;
    private double valorFinal;

    // Construtor da classe Cliente para inicializar os atributos
    public Cliente(String nome, String endereço, String telefone, String email, double valorCompra,
            double valorDesconto, double valorEstacionamento, double valorFinal) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.valorCompra = valorCompra;
        this.valorDesconto = valorDesconto;
        this.valorEstacionamento = valorEstacionamento;
        this.valorFinal = valorFinal;
    }

    // Método para calcular o valor do estacionamento com base no número de horas
    public void calcularValorEstacionamento(int horas) {
        this.valorEstacionamento = 5.0 * horas;
    }

    // Método para calcular o valor total da compra
    public void calcularValorTotal() {
        if (this.valorCompra != 0.0 && this.valorEstacionamento != 0.0) {
            this.valorFinal = (this.valorCompra + this.valorEstacionamento) - this.valorDesconto;
        } else {
            System.out.println("Você deve fazer uma compra antes de calcular o valor total!");
        }
    }

    // Métodos de acesso (getters) para os atributos da classe Cliente
    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public double getValorEstacionamento() {
        return valorEstacionamento;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    // Métodos de modificação (setters) para os atributos da classe Cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorEstacionamento(double valorEstacionamento) {
        this.valorEstacionamento = valorEstacionamento;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
