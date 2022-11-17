public class ContaBanco {

    public int numero;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 00.00;
        this.status = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if (tipo == "CC") {
            setSaldo(50.00);
        } else if (tipo == "CP") {
            setSaldo(150.00);
        }
    }

    public void fecharConta() {
        if (saldo > 00.00) {
            System.out.println("Ainda há dinheiro na conta!");
        } else if (saldo < 00.00) {
            System.out.println("Conta vazia!");
        } else {
            setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (status == true) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Depósito negado!");
        }

        public void sacar () {
            if (getStatus() == true) {
                if (getSaldo() > valor) {
                    setSaldo(getSaldo() - valor);
            else if (getSaldo() < valor) {
                        System.out.println("Saldo Insuficiente!");
                    } else if (getStatus() == false) {
                        System.out.println("Impossivel sacar!");
                    }
                }
            }
        }
    }

        public void pagarMensal () {
            double v = 0;
            if (getTipo() == "CC") {
                v = 12.00;
            } else if (getTipo() == "CP") {
                v = 20.00;
            }
            if (getStatus() == true) {
                if (getSaldo() > v) {
                    setSaldo(getSaldo() - v);
                } else {
                    System.out.println("Saldo insuficiente!");
                } else{
                    System.out.println("Impossivel pagar!");
                }
            }
        }
    }


