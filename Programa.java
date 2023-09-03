public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        /*Através da variável minhaConta,
        podemos acessar o objeto recém criado (Conta)
        para alterar seu dono, seu saldo etc:*/
        minhaConta = new Conta();//objeto Conta

        minhaConta.dono = "Matheus";
        minhaConta.saldo = 1000.0;

        minhaConta.saca(200);
        minhaConta.deposita(500);

        System.out.println("Saldo atual: " + minhaConta.saldo);

    }
}
