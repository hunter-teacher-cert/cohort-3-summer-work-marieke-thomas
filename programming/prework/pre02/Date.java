import java.io.*;
import java.util.*;

public class Date{
  public static void main(String[] args){
    String day;
    int date;
    String month;
    int year;
    day = "Sunday";
    date = 26;
    month = "June";
    year = 2022;
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format: ");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}


