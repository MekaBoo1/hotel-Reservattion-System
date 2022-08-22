package model;

public interface IRoom {
    public String getRoomNumber();
    public double getRoomPrice();
    public roomType getRoomType();
    public boolean isFree();
}