package com.upGrad;

interface RestaurantOnlineISP {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();

}

interface RestaurantInPersonISP{
    public void walkInCustomerOrder();
    public void payInPerson();
}
