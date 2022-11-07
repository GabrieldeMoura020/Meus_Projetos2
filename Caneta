public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.tampar();
//        this.cor = "Azul";
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void status() {

        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
//        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada?: "+ this.tampada);
    }

    public void rabiscar() {
            if (this.tampada == true){
                System.out.println("A caneta está tampada!");
            } else {
                System.out.println("Pode utilizar!");
            }
        }

            public void tampar() {
                this.tampada = true;
            }

                public void destampar() {
                    this.tampada = false;
                }
}
