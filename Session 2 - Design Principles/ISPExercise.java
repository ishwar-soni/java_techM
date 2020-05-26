package com.upGrad;

public interface ISPExercise {
    public int totalBooksInStock();
    public int totalBooksInStocksForGivenBook(int bookId);
    public boolean addBookToCart(int bookId);
    public int totalCartValue(String username);
    public int totalCartItems(String username);
}
