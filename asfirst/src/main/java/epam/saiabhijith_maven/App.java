package epam.saiabhijith_maven;
import epam.saiabhijith_maven.cholocates.Chocolate;
import epam.saiabhijith_maven.cholocates.Barone;
import epam.saiabhijith_maven.cholocates.Cadbury;
import epam.saiabhijith_maven.cholocates.Galaxy;
import epam.saiabhijith_maven.gift.Gift;
import epam.saiabhijith_maven.sweets.Sweets;
import epam.saiabhijith_maven.sweets.Gulabjamun;
import epam.saiabhijith_maven.sweets.Kajukatli;
import epam.saiabhijith_maven.sweets.Kheer;
import epam.saiabhijith_maven.sweets.Rasgulla;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("chocolates....");
        Chocolate chocolate1=new Cadbury("Dairy Milk",60,20);
        Chocolate chocolate2=new Barone("Bar one",30,20);
        Chocolate chocolate3=new Galaxy("Galaxy creme",50,20);
        System.out.println("*********************Sweets*******************");
        Sweets sweets1=new Gulabjamun("Gulabjamun",300,200);
        Sweets sweets2=new Kheer("Bhadam Kheer",300,100);
        Sweets sweets3=new Kajukatli("Kajukatli",300,100);
        Sweets sweets4=new Rasgulla("Rasgulla",400,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("printing all the thing in acending order");
        gift.sort();
        System.out.println("Total Weight of goodies : "+gift.findTotalWeight());
        do
        {
        	System.out.println("<********************Happy New Year Gifts*****************> ");
            System.out.println("Press '1' to view all candies  ");
            System.out.println("Press '2' to view all sweets  ");
            System.out.println("Press '3' to know most expensive chocolate and sweets ");
            System.out.println("******************************************************");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("costliest Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("costliest Sweet : "+mostExpensive(gift.getSweets()));
                default:
                System.out.println("Please reenter a valid option*******************");
                break;
            }
        }
        while(choice < 4);
        io.close();
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}
