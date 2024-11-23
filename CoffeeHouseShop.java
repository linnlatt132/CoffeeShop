import javax.swing.*;
import java.awt.*;

class Coffee{
public String coffee;
public int price;
public int qty;
public int total;
public void set_coffee(String coffee)
{
this.coffee=coffee;
}
public String get_coffee()
{
return coffee;
}
public void set_cost(int price)
{
this.price=price;
}
public int get_cost()
{
return price;
}
public void totalamt()
{String s;
s=JOptionPane.showInputDialog("How Many Cups for "+coffee+"?");
qty=Integer.parseInt(s);
total=price*qty;
System.out.println(""+coffee+"      "+qty+"cups :"+total);
}
public int totalcost()
{
 return total;
}
}

class Noodle{
public String noodle;
public int price;
public int qty;
public int total;
public void set_noodle(String noodle)
{
this.noodle=noodle;
}
public String get_noodle()
{
return noodle;
}
public void set_cost(int price)
{
this.price=price;
}
public int get_cost()
{
return price;
}
public void totalamt()
{String s;

s=JOptionPane.showInputDialog("How Many Bowls for "+noodle+"?");
qty=Integer.parseInt(s);
total=price*qty;
System.out.println(""+noodle+"      "+qty+"bowls  :"+total);
}
public int totalcost()
{
 return total;
}
}

class Juice{
public String juice;
public int price;
public int qty;
public int total;
public void set_juice(String juice)
{
this.juice=juice;
}
public String get_juice()
{
return juice;
}
public void set_cost(int price)
{
this.price=price;
}
public int get_cost()
{
return price;
}
public void totalamt()
{String s;
s=JOptionPane.showInputDialog("How Many Cups for "+juice+"?");
qty=Integer.parseInt(s);
total=price*qty;
System.out.println(""+juice+"       "+qty+"cups  :"+total);
}
public int totalcost()
{
 return total;
}
}
class Customer
{public int totalcoffee=0;
public int totalnoodle=0;
public int totaljuice=0;
public int Total=0;
public void customerorder()
{ 

Coffee[] coffee=new Coffee[3];

coffee[0]=new Coffee();
coffee[0].set_coffee("Mocha");
coffee[0].set_cost(2500);
coffee[0].totalamt();
coffee[0].totalcost();

coffee[1]=new Coffee();
coffee[1].set_coffee("Espresso");
coffee[1].set_cost(1500);
coffee[1].totalamt();
coffee[1].totalcost();

coffee[2]=new Coffee();
coffee[2].set_coffee("Americano");
coffee[2].set_cost(2000);
coffee[2].totalamt();
coffee[2].totalcost();
totalcoffee=coffee[0].totalcost()+coffee[1].totalcost()+coffee[2].totalcost();


Noodle[] noodle=new Noodle[3];

noodle[0]=new Noodle();
noodle[0].set_noodle("Spicy");
noodle[0].set_cost(5000);
noodle[0].totalamt();
noodle[0].totalcost();

noodle[1]=new Noodle();
noodle[1].set_noodle("Tom Yum");
noodle[1].set_cost(5500);
noodle[1].totalamt();
noodle[1].totalcost();

noodle[2]=new Noodle();
noodle[2].set_noodle("Seafood");
noodle[2].set_cost(6000);
noodle[2].totalamt();
noodle[2].totalcost();
totalnoodle=noodle[0].totalcost()+noodle[1].totalcost()+noodle[2].totalcost();


Juice[] juice=new Juice[3];

juice[0]=new Juice();
juice[0].set_juice("Orange");
juice[0].set_cost(1700);
juice[0].totalamt();
juice[0].totalcost();

juice[1]=new Juice();
juice[1].set_juice("Lime");
juice[1].set_cost(1500);
juice[1].totalamt();
juice[1].totalcost();

juice[2]=new Juice();
juice[2].set_juice("Watermelon");
juice[2].set_cost(1800);
juice[2].totalamt();
juice[2].totalcost();
totaljuice=juice[0].totalcost()+juice[1].totalcost()+juice[2].totalcost();

Total=totalcoffee+totalnoodle+totaljuice;
System.out.println("\n\nTotal\t\t\t\t"+Total);
}
public int totalll()
{
return Total;
}
}
public class CoffeeHouseShop{
public static void main(String[] args)
{
System.out.println("\t\t\t\t  Welocome from My CoffeeHouse");
System.out.println("\t\t\t\t\t  Choose The Menu");
System.out.println("\t\t\t\t*===================================*");
System.out.println("\t\t\t\t||         Coffee Menu             ||");
System.out.println("\t\t\t\t||1.Mocha                2,500 mmk ||");
System.out.println("\t\t\t\t||2.Espresso             1,500 mmk ||");
System.out.println("\t\t\t\t||3.Americano            2,000 mmk ||");
System.out.println("\t\t\t\t*===================================*");
System.out.println("\t\t\t\t*===================================*");
System.out.println("\t\t\t\t||         Noodle Menu             ||");
System.out.println("\t\t\t\t||1.Spicy                5,000 mmk ||");
System.out.println("\t\t\t\t||2.Tom Yum              5,500 mmk ||");
System.out.println("\t\t\t\t||3.Seafood              6,000 mmk ||");
System.out.println("\t\t\t\t*===================================*");
System.out.println("\t\t\t\t*===================================*");
System.out.println("\t\t\t\t||         Juice  Menu             ||");
System.out.println("\t\t\t\t||1.Orange               1,700 mmk ||");
System.out.println("\t\t\t\t||2.Lime                 1,500 mmk ||");
System.out.println("\t\t\t\t||3.Watermelon           1,800 mmk ||");
System.out.println("\t\t\t\t*===================================*");
int more=1;
String s;

Customer c=new Customer();
do{
c.customerorder();
s=JOptionPane.showInputDialog("More Customer?\n yes for 1\n no for 2");
more=Integer.parseInt(s);

}while(more==1);

}
}
