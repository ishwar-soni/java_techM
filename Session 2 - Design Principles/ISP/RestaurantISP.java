package com.upGrad;

interface OnlineOrderService {
    public void acceptOnlineOrder();
    public void payOnline();
}

interface TelephoneOrderService {
    public void acceptTelephoneOrder();
    public void payOnline();
}

interface WalkInOrderService{
    public void acceptWalkInOrder();
    public void payInPerson();
}
