package com.teachmeskills.lesson7HW.task1.runner;

import com.teachmeskills.lesson7HW.task1.credit_card.CreditCard;
import com.teachmeskills.lesson7HW.task1.credit_card_services.Services;

public class Runner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("#3748394", 0);
        CreditCard card2 = new CreditCard("#2412424", 1000);
        CreditCard card3 = new CreditCard("#2549789", 2000);

        Services services = new Services();
        services.checkout(card1);
        System.out.println();
        services.checkout(card2);
        System.out.println();
        services.checkout(card3);
        System.out.println();
        services.replenish(100, card1);
        System.out.println();
        services.replenish(100, card2);
        System.out.println();
        services.withdraw(400, card3);
        System.out.println();
        services.checkout(card1);
        System.out.println();
        services.checkout(card2);
        System.out.println();
        services.checkout(card3);

    }
}
