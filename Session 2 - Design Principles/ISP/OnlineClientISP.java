package com.upGrad;

public class OnlineClientISP implements RestaurantOnlineISP {
    public void acceptOnlineOrder() {
        //logic for placing online order
    }
    public void takeTelephoneOrder() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }
    public void payOnline() {
        //logic for paying online
    }

}
class WalkInCustomerClient implements RestaurantInPersonISP{
    public void walkInCustomerOrder() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }
    public void payInPerson() {
        //Not Applicable for Online Order
        throw new UnsupportedOperationException();
    }
}
