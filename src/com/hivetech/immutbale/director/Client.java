package com.hivetech.immutbale.director;

import com.hivetech.immutbale.builder.BankAccount;

public class Client {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Hieu", "0123456789")
                .withEmail("hieupv@hivetech.vn")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}