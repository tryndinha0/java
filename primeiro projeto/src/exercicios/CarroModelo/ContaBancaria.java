package exercicios.CarroModelo;

class ContaBancaria{
    protected double saldo;
    
    public void depositar(double valor){
        if(valor>0){
            saldo+=valor;
            System.out.println("Saldo atualizado: "+saldo);
        }else{
            System.out.println("Valor inválido!");
        }
    }
    public void sacar(double valor){
        if(valor>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo-=valor;
            System.out.println("Saldo atualizado: "+saldo);
        }
    }

    // public double ConsultarSaldo() {
    //     return saldo;
    // }

    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }
}

class ContaCorrente extends ContaBancaria{
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.saldo = 1500;
        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
        contaCorrente.cobrarTarifaMensal(50);
    }
    public void cobrarTarifaMensal(double tarifa){
        System.out.println("Foi cobrado uma tarifa de "+tarifa+" reais.");
        this.saldo-=tarifa;
        System.out.println("Saldo atualizado: " + this.saldo);
    }
}
