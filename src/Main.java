
import br.eu.com.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Henrique", 2000.0);
        ContaBancaria c2 = new ContaBancaria("poggers", 2.00);
        ContaBancaria c3 = new ContaBancaria("poggers2", 4.00);

        ArrayList<ContaBancaria> ola = new ArrayList<>();
        ola.add(c1);
        ola.add(c2);
        ola.add(c3);

        ContaBancaria maiorSaldo = ola.get(0);

        for (ContaBancaria conta : ola){
            if(conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + maiorSaldo.getNome() +
                ", Saldo: " + maiorSaldo.getSaldo());
    }

}