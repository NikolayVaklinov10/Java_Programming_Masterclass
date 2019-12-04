package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
        System.out.println("no-arg constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double OriginalX = 0;
        double OriginalY = 0;
        double ChangeInX = x-OriginalX;
        double ChangeInY = y-OriginalY;
        double Rawdistance = ((ChangeInX * ChangeInX) + (ChangeInY*ChangeInY));
        double distance = Math.sqrt(Rawdistance);
        return distance;
    }

    public double distance (int x, int y){
        int ChangeInX = this.x-x;
        int ChangeInY = this.y-y;
        int Rawdistance = (ChangeInX*ChangeInX) + (ChangeInY*ChangeInY);
        double distance = Math.sqrt(Rawdistance);
        return distance;
    }

    public double distance (Point another){
        double ChangeInX= this.x - another.getX();
        double ChangeInY = this.y - another.getY();
        double Rawdistance = (ChangeInX*ChangeInX) + (ChangeInY*ChangeInY);
        double distance = Math.sqrt(Rawdistance);
        return distance;
    }
}

























