package com.teachmeskills.lesson7HW.task1.credit_card_services;

import com.teachmeskills.lesson7HW.task1.credit_card.CreditCard;

public class Services {

    //replenish the card
    public int replenish(int amount, CreditCard CreditCard) {
        if (amount < 0) {
            System.out.println("Invalid amount!");
            return -1;
        } else {
            CreditCard.billCurrentAmount += amount;
            System.out.println("Your current bill " + CreditCard.billNumber + " is replenished by " + amount);
            System.out.println("Your current amount: " + CreditCard.billCurrentAmount);
            return CreditCard.billCurrentAmount;
        }
    }

    //withdraw cash from the card
    public int withdraw(int amount, CreditCard CreditCard) {
        if (CreditCard.billCurrentAmount < amount) {
            System.out.println("Invalid amount!");
            return -1;
        } else {
            CreditCard.billCurrentAmount -= amount;
            System.out.println("Successful withdraw " + amount + " from bill " + CreditCard.billNumber);
            System.out.println("Your current amount: " + CreditCard.billCurrentAmount);
            return CreditCard.billCurrentAmount;
        }
    }

    //check information about the card
    public void checkout(CreditCard CreditCard) {
        System.out.println("Your bill number: " + CreditCard.billNumber);
        System.out.println("Your current amount: " + CreditCard.billCurrentAmount);
    }
}



