package exercicio02;

public class Metodos {

    public static double calculaTotal(int dias) {
        double total;
        if (dias > 15) {
            total = dias*80.00;
        } else {
            total = dias*105.00;
        }

        return total;
    }

    public static double calculaINSS(double salario) {
        double desconto = 0;
        double porcentagem;
        if (salario <= 600) {
            desconto = 0;
        } else if (salario > 600 && salario <= 1200) {
            porcentagem = 20.0 / 100;
            desconto = salario - (salario * porcentagem);
        } else if (salario > 1200 && salario <= 2000) {
            porcentagem = 25.0 / 100;
            desconto = salario - (salario * porcentagem);
        } else if (salario > 2000) {
            porcentagem = 30.0 / 100;
            desconto = salario - (salario * porcentagem);
        }
        return desconto;

    }

    public static boolean ePar(int numero) {
        boolean resposta;
        if (numero % 2 == 0) {
            resposta = true;
        } else {
            resposta = false;
        }

        return resposta;
    }

    public static boolean eDivisivel(int numero1, int numero2) {
        boolean resposta;

        if (numero1 % numero2 == 0) {
            resposta = true;
        } else {
            resposta = false;
        }

        return resposta;
    }

    public static long fatorial(int numero) {
        int i = 1;
        long fatorial = 1;
        for (; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static long fatorial(long numero) {
        int i = 1;
        long fatorial = 1;
        for (; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static double precoTotal(int codigo, int quantidade) {
        double precoTotal = 0;
        switch (codigo) {
            case 1:
                precoTotal = quantidade * 7.00;
                break;
            case 2:
                precoTotal = quantidade * 10.00;
                break;
            case 3:
                precoTotal = quantidade * 15.00;
                break;

        }

        return precoTotal;
    }

}
