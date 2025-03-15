package com.juaracoding.ujiantestng;

public class App {
    public static void main(String[] args) {

        ATM atm = new ATM(1000);

        System.out.println("Saldo awal: " + atm.lihatSaldo());

        atm.setorUang(1000);
        System.out.println("Saldo setelah setor: " + atm.lihatSaldo());

        atm.tarikUang(500);
        System.out.println("Saldo setelah tarik: " + atm.lihatSaldo());
    }
}
