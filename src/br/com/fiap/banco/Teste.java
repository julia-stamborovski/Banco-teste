package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args)
    {
        Conta cc = new Conta();

        System.out.println("Bem-vindo ao seu banco! últimas atualizações:");
        //Acessando um atributo do obj Conta
        //double valor = cc.saldo;

        //System.out.println(cc.saldo);


        //Atribuindo valor ao atributo do objeto

        //cc.saldo = 1000;

        //System.out.println(cc.saldo);

        //Chamando método é semelhante a acessar um atributo -> utlizando notação de ponto(.)
        cc.depositar(100);
        cc.verificarSaldo();
        System.out.println(cc.verificarSaldo());

        cc.retirar(900);
        cc.verificarSaldo();
        System.out.println(cc.verificarSaldo());
    }
}
