package com.upGrad;

interface OnlineOrderService {
    public void acceptOnlineOrder();
    public void payOnline();

}

interface TelephoneOrderService {
    public void takeTelephoneOrder();
    public void payOnline();
}

interface WalkInOrderService{
    public void walkInCustomerOrder();
    public void payInPerson();
}
