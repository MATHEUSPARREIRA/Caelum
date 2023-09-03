public class Conta {
    int numero;//atributo ou variável de objeto
    String dono;//atributo
    double saldo;//atributo
    double limite;//atributo
    double salario;
    void saca(double quantidade){//(double quantidade) é o argumento ou parâmetro
        /*void diz que, quando você pedir para a
        conta sacar uma quantia, nenhuma informação
        será enviada de volta a quem pediu.*/
        //double novoSaldo = this.saldo - quantidade;
        //this.saldo = novoSaldo;
    //poderia ser "this.saldo -= quantidade;"
        this.saldo -= quantidade;
    }

    void deposita(double quantidade){
       this.saldo += quantidade;/*+= soma quantidade ao valor
       antigo do saldo e guarda no próprio saldo, o valor resultante.*/

    }
}
