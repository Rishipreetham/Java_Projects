import java.util.Scanner;

public class ClassA {
	Scanner sc = new Scanner(System.in);
static int bill;
public void meth1()
{
	System.out.println("========== Welcome to Organic Store =========");
	System.out.println("--------------------------------");
	System.out.println("Available products in the store");
	System.out.println("1) Fruits");
	System.out.println("2) Vegetables");
	System.out.println("3) Cosmetics");
	System.out.println("4) Masala Powders");
	new ClassA().meth2();
}
public void meth2()
{
System.out.println(" ");
System.out.println("Please enter your choice ?");
System.out.println("--------------------------------");
int choice=sc.nextInt();
System.out.println("--------------------------------");
switch(choice)
{
case 1:System.out.println("125 -----Mangoes ------1 kg is 50");
       System.out.println("126-----Apples ------1 kg is 100");
       System.out.println("127 -----Bananans ------1 kg is 25");
	   System.out.println("128 -----Papaya ------1 kg is 44");
	   System.out.println("129 -----Grapes ------1 kg is 60");
       System.out.println("130 -----Oranges ------1 kg is 50");
       System.out.println(" ");
       System.out.print("please choose your product code-");
       int productcode=sc.nextInt();
       switch(productcode)
       {
       case 125:System.out.println("Mangoes is a good choice How many kgs you need ?");
                int a=sc.nextInt();
                bill=bill+a*50;
                System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
                System.out.println("if you want to exit press 2 ===>");
                int b=sc.nextInt();
                switch(b)
                {
                case 1:ClassA obj = new ClassA();
                	   obj.meth1();
                	   break;
                case 2:System.out.println("Total bill of your purchased items is -"+bill);
                	   break;
                default:System.out.println("please enter valid input");
                        b=sc.nextInt();
                
                }
       case 126:System.out.println("Apples is a good choice How many kgs you need ?");
        a=sc.nextInt();
        bill=bill+a*100;
       System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
       System.out.println("if you want to exit press 2 ===>");
       b=sc.nextInt();
       switch(b)
       {
       case 1:ClassA obj = new ClassA();
       	   obj.meth1();
       	   break;
       case 2:System.out.println("Total bill of your purchased items is -"+bill);
       	   break;
       default:System.out.println("please enter valid input");
               b=sc.nextInt();
       
       } 
       case 127:System.out.println("Bananas is a good choice How many kgs you need ?");
        a=sc.nextInt();
        bill=bill+a*25;
       System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
       System.out.println("if you want to exit press 2 ===>");
        b=sc.nextInt();
       switch(b)
       {
       case 1:ClassA obj = new ClassA();
       	   obj.meth1();
       	   break;
       case 2:System.out.println("Total bill of your purchased items is -"+bill);
       	   		break;
       default:System.out.println("please enter valid input");
               b=sc.nextInt();
       
       }
       case 128:System.out.println("Papaya is a good choice How many kgs you need ?");
        a=sc.nextInt();
        bill=bill+a*44;
       System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
       System.out.println("if you want to exit press 2 ===>");
       b=sc.nextInt();
       switch(b)
       {
       case 1:ClassA obj = new ClassA();
       	   obj.meth1();
       	   break;
       case 2:System.out.println("Total bill of your purchased items is -"+bill);
       	   break;
       default:System.out.println("please enter valid input");
               b=sc.nextInt();
       
       }
       case 129:System.out.println("Grapes is a good choice How many kgs you need ?");
        a=sc.nextInt();
        bill=bill+a*60;
       System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
       System.out.println("if you want to exit press 2 ===>");
        b=sc.nextInt();
       switch(b)
       {
       case 1:ClassA obj = new ClassA();
       	   obj.meth1();
       	   break;
       case 2:System.out.println("Total bill of your purchased items is -"+bill);
       	   break;
       default:System.out.println("please enter valid input");
               b=sc.nextInt();
       
       }
       case 130:System.out.println("Oranges is a good choice How many kgs you need ?");
        a=sc.nextInt();
        bill=bill+a*50;
       System.out.println("if you want to continue with shopping press 1  =====> Display all the products once again");
       System.out.println("if you want to exit press 2 ===>");
        b=sc.nextInt();
       switch(b)
       {
       case 1:ClassA obj = new ClassA();
       	   obj.meth1();
       	   break;
       case 2:System.out.println("Total bill of your purchased items is -"+bill);
       	   break;
       default:System.out.println("please enter valid input");
               b=sc.nextInt();
       
       }
       default:System.out.println("please enter valid product code");
       
       }
       break;
       
       
case 2:System.out.println("225 -----Potato ------1 kg is 41");
       System.out.println("226-----Brinjal ------1 kg is 35");
       System.out.println("227 -----Carrots ------1 kg is 60");
       System.out.println("228 -----Beetroot ------1 kg is 44");
       System.out.println("229 -----Drumstick ------1 kg is 60");
       System.out.println("230 -----Mushroom ------1 kg is 50");
       break;
       
case 3:System.out.println("325 -----kajal ------1  is 45");	
	   System.out.println("326-----powder ------1  is 50");
	   System.out.println("327 -----lipstick ------1  is 60");
	   System.out.println("328 -----bodylotion ------1  is 150");
	   System.out.println("329 -----perfume ------1  is 600");
	   System.out.println("330 -----nailpolish ------1  is 100");
	   break;

case 4:System.out.println("425 -----Red chilli powder ------1  is 145");	
       System.out.println("426-----Garam masala powder ------1  is 150");
       System.out.println("427 -----coriander powder ------1  is 160");
       System.out.println("428 -----jeera powder ------1  is 50");
       System.out.println("429 -----dry mango powder ------1  is 32");
       System.out.println("430 -----sambar powder ------1  is 28");
       break;
       
default:System.out.println("Enter valid input");
		new ClassA().meth1();

}

}

	public static void main(String[] args) {
ClassA obj = new ClassA();
obj.meth1();

	}

}
