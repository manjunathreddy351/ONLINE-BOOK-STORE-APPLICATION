import java.util.*;

interface Fiction {
    static Scanner sc = new Scanner(System.in);

     default void fiction(Cart cart) 
      {
         final String reset = "\u001b[0m";
         final String blink = "\u001b[5m";
         final String purpe = "\u001b[35;1m";
	 final String yellow = "\u001b[33;1m";
	 final String skblue = "\u001b[36;1m";
	 final String red =  "\u001b[31;1m";

        System.out.println();
        System.out.println(blink+purpe+"*"+reset);
        System.out.println(yellow+"1) Thriller\n2) Horror\n3) Novel"+reset);
        System.out.println(blink+purpe+"*"+reset);
        System.out.println();
        System.out.println(blink+"Enter which type book you want in Fiction Category"+reset);
        int n = sc.nextInt();
        System.out.println();
        switch (n) 
            {
            case 1:
                System.out.println(skblue+"1) The Silent Coup - Written by(Anuksh Saikia) - 150rs \n2) The girl in Room 105 - Written by(Chetan Bhagat) - 200rs \n3) The vault of Vishnu - Written by(Ashwin Sanghi) - 170rs \n4) Cut like wound - Written by(Anita Nair) - 200rs \n5) Big Little Lies - Written by(Liane Moriarty) - 190rs \n6) Sharp Objects - Written by(Gillian Flynn) - 185rs"+reset);
                int Thrillerchoice = sc.nextInt();
                System.out.println();
                switch (Thrillerchoice) 
                          {
                             case 1:
                                    cart.addToCart("The Silent Coup", 150);
                                    break;
			     case 2:
                                  cart.addToCart("The girl Room 105", 200);
	                          break;
                             case 3:
                                   cart.addToCart("The girl Room 105", 170);
				   break;
                             case 4:
                                   cart.addToCart("Cut like wound", 200);
				   break;
                             case 5:
                                   cart.addToCart("Big Little Lies", 190);
				   break;
			     case 6:
                                   cart.addToCart("Sharp Objects ", 185);
				   break;
                            default:
                                 System.out.println("Invalid choice");
                           }
                    break;
                  case 2:
                System.out.println(skblue+"1) Enter at your own Risk - Written by(Anirban Bhattacharya) - 200rs \n2) Ghosts of the Silent Hills - Written by(Anita Krishan) - 189rs \n3) That Nights - Written by(Nidhi Upadhyay) - 150rs \n4) The Canterville Ghost - Written by(Oscar Wilde) - 115rs \n5) Dracula - Written by(Edward Gorey) - 473rs"+reset);

                int horrorChoice = sc.nextInt();
                System.out.println();
                switch (horrorChoice) 
                           {
                             case 1:
                                   cart.addToCart("Enter at your own Risk", 200);
				   break;
                             case 2:
                                   cart.addToCart("Ghosts of the Silent Hills", 189);
				   break;
                             case 3:
                                   cart.addToCart("That Nights", 150);
				   break;
                             case 4:
                                   cart.addToCart("The Canterville Ghost", 115);
				   break;
                             case 5:
                                   cart.addToCart("Dracula", 473);
				   break;
                    default:
                        System.out.println("Invalid choice");
                }
		System.out.println();

                break;
            case 3:
                System.out.println(skblue+"1) You only live once - Written by(Stuti Changle) - 173rs \n2) Amma Diarylo Konni Pageelu - Written By(Ravi Mantri) - 198rs \n3) Do It Today - Written by(Darius Foroux) - 145rs \n4) Believe in Yourself - Written by(Joseph Murphy) - 123rs \n5) Something I Never Told You - Written by(Shravya) - 157rs"+reset);

                int novelChoice = sc.nextInt();
                System.out.println();
                switch (novelChoice) 
                            {
                             case 1:
                                   cart.addToCart("You only live once", 173);
				   break;
			     case 2:
                                   cart.addToCart("Amma Diarylo Konni Pageelu", 198);
				   break;
                             case 3:
                                   cart.addToCart("Do It Today", 145);
				   break;
                             case 4:
                                   cart.addToCart("Believe in Yourself", 123);
				   break;
                             case 5:
                                   cart.addToCart("Something I Never Told You", 157);
				   break;
                            default:
                                   System.out.println("Invalid choice");
                           }
			System.out.println();

                       break;
                default:
                System.out.println(red+"Invalid fiction choice"+reset);
        }
    }
}

interface NonFiction 
   {
    static Scanner sc = new Scanner(System.in);

    default void nonfiction(Cart cart) 
      {
        final String reset = "\u001b[0m";
         final String blink = "\u001b[5m";
         final String purpe = "\u001b[35;1m";
	final String yellow = "\u001b[33;1m";
	final String skblue = "\u001b[36;1m";
	     final String red =  "\u001b[31;1m";

        System.out.println();
        System.out.println(blink+purpe+"*"+reset);
        System.out.println(yellow+"1) Biography\n2) History\n3) Travel"+reset);
        System.out.println(blink+purpe+"*"+reset);
        System.out.println();
        System.out.println(blink+"Enter which type book you want in Non-Fiction Category"+reset);
        int n1 = sc.nextInt();
        System.out.println();
        switch (n1) 
          {
            case 1:
                 System.out.println(skblue+"1) A Beautiful Mind - written by(Sylvia Nasar) - 250rs\n2) Churchill - written by(Martin Gilbert) - 200rs\n3) The Lost City of Z - written by(David Grann) - 300rs\n4) The Passage of Power: The Years of Lyndon Johnson IV - written by(Robert Allan Caro ) - 198rs"+reset);

                int bioChoice = sc.nextInt();
                System.out.println();
                switch (bioChoice)
                          {
                             case 1:
                                    cart.addToCart("A Beautiful Mind ", 250);
                                    break;
			     case 2:
                                  cart.addToCart("Churchill", 200);
	                          break;
                             case 3:
                                   cart.addToCart("The Lost City of Z", 300);
				   break;
                             case 4:
                                   cart.addToCart("The Passage of Power: The Years of Lyndon Johnson IV", 198);
				   break;
                             default:
                                 System.out.println("Invalid choice");
                   }
		System.out.println();
                  break;
            case 2:
                System.out.println(skblue+"1) The Communist Manifesto - written by(Karl Marx) - 123rs\n2) Orientalism - written by(Edward W. Said) - 142rs\n3) Lies My Teacher Told Me - written by(James W. Loewen) - 210rs\n4) The Decline and Fall of the Roman Empire, Vol. 1 - written by(Edward Gibbon) - 100rs\n5) Foundations of Chinese Civilization: The Yellow Emperor to the Han Dynasty - written by(Jing liu) - 110rs"+reset);

                int historyChoice = sc.nextInt();
                System.out.println();
                switch (historyChoice)
                       { 
                             case 1:
                                   cart.addToCart("The Communist Manifesto", 123);
				   break;
                             case 2:
                                   cart.addToCart("Orientalism", 142);
				   break;
                             case 3:
                                   cart.addToCart("Lies My Teacher Told Me ", 210);
				   break;
                             case 4:
                                   cart.addToCart("The Decline and Fall of the Roman Empire, Vol. 1", 100);
				   break;
                             case 5:
                                   cart.addToCart("Foundations of Chinese Civilization: The Yellow Emperor to the Han Dynasty", 110);
				   break;
                             default:
                                   System.out.println("Invalid choice");
                }
		System.out.println();

                break;
            case 3:
                System.out.println(skblue+"1) Travels With A Donkey In The Cévennes - written by(Robert Louis Stevenson) - 70rs\n2) Shantaram - written by(Gregory David Roberts) - 345rs\n3) World walk - written by(Steven Newman) - 130rs\n4) A Good Girl's guide to getting lost - written by(Rachel Friedman) - 145rs\n5) A Walk in the Woods - written by(Bill Bryson) - 234rs"+reset);

                int travelChoice = sc.nextInt();
                System.out.println();
                switch (travelChoice) 
                          {
                             case 1:
                                   cart.addToCart("Travels With A Donkey In The Cévennes", 70);
				   break;
                             case 2:
                                   cart.addToCart("Shantaram", 345);
				   break;
                             case 3:
                                   cart.addToCart("World walk", 130);
				   break;
			     case 4:
                                   cart.addToCart("A Good Girl's guide to getting lost", 145);
				   break;
                             case 5:
                                   cart.addToCart("A Walk in the Woods", 234);
				   break;
                             default:
                                    System.out.println("Invalid Choice");
                                    break;

                }
                break;
            default:
                System.out.println(red+"Invalid non-fiction choice"+reset);
        }
    }
}

interface ChildrenBooks 
   {
    static Scanner sc = new Scanner(System.in);
    default void childrenBooks(Cart cart)
      {
      final String reset = "\u001b[0m";
         final String blink = "\u001b[5m";
         final String purpe = "\u001b[35;1m";
	final String yellow = "\u001b[33;1m";
	final String skblue = "\u001b[36;1m";
     final String red =  "\u001b[31;1m";

        System.out.println();
        System.out.println(blink+purpe+"*"+reset);
        System.out.println(yellow+"1) Picture Books\n2) Comics\n3) Middle-Grade books"+reset);
        System.out.println(blink+purpe+"*"+reset);
        System.out.println();
        System.out.println(blink+"Enter which type book you want in Children Category"+reset);
        int n2 = sc.nextInt();
        System.out.println();
        switch (n2) 
           {
            case 1:
                 System.out.println(skblue+"1) Where The Wild Things Are - Written by(Maurice Sendak) - 324rs \n2) The Very Hungry Caterpillar - Written by(Eric Carle) - 256rs \n3) Goodnight Moon - Written by(Marget Wise Brown) - 250rs \n4) The Jungle Radio - Written by(Devangana Dash) - 170rs \n5) The Sweet Shop Wars - Written by(Chatura Rao) - 160rs"+reset);

                int picChoice = sc.nextInt();
                System.out.println();
                switch (picChoice)
                          {
                             case 1:
                                    cart.addToCart("Where The Wild Things Are " , 324);
                                    break;
			     case 2:
                                  cart.addToCart("The Very Hungry Caterpillar ", 256);
	                          break;
                             case 3:
                                   cart.addToCart("Goodnight Moon", 250);
				   break;
                             case 4:
                                   cart.addToCart("The Jungle Radio", 170);
				   break;
                             case 5:
                                   cart.addToCart("The Sweet Shop Wars", 160);
				   break;
                             default:
                                   System.out.println("Invalid choice");
                    }
                break;
            case 2:
                System.out.println(skblue+"1) The Dog Man - Written by(Dav Pilkey) - 350rs \n2) Big Nate - Written by(Lincoln Peirce) - 250rs \n3) Diary Of A Wimpy Kid - Written by(Jeff Kinney) - 400rs \n4) Tinkle - Written by(Anant Pai) - 250rs \n5) Hilo -Written by(Judd Winick) - 450rs"+reset);
                int comicChoice = sc.nextInt();
                System.out.println();
                switch (comicChoice)
                        {
                             case 1:
                                   cart.addToCart("The Dog Man ", 350);
				   break;
                             case 2:
                                   cart.addToCart("Big Nate", 250);
				   break;
                             case 3:
                                    cart.addToCart("Diary Of A Wimpy Kid", 400);
				   break;
                             case 4:
                                   cart.addToCart("Tinkle", 250);
				   break;
                             case 5:
                                   cart.addToCart("Hilo", 450);
				   break;
                             default:
                                 System.out.println("Invalid choice");
                       }
                break;
            case 3:
                System.out.println(skblue+"1) Wonder - Written by(R.J.Palacio) - 200rs \n2) Charlotte's Web - Written by(E.B.White) - 190rs \n3) The One And Only Ivan - Written by(Katherine Applogate) - 200rs \n4) The Hunger Games - Written by(Suzanne Collins) - 250rs \n5) A Series Of Unfortunate Events - Written by(Lemony Snicket) - 280rs"+reset);
                int mgChoice = sc.nextInt();
                System.out.println();
                switch (mgChoice) 
                       {
                             case 1:
                                   cart.addToCart("Wonder", 200);
				   break;
                             case 2:
                                   cart.addToCart("Charlotte's Web ", 190);
				   break;
			     case 3:
                                   cart.addToCart("The One And Only Ivan", 200);
				   break;
                             case 4:
                                   cart.addToCart("The Hunger Games", 250);
				   break;
                             case 5:
                                   cart.addToCart("A Series Of Unfortunate Events", 280);
				   break;
                             default:
                                   System.out.println("Invalid choice");
                       }
                break;
            default:
                System.out.println(red+"Invalid children books choice"+reset);
        }
    }
}

interface Education 
    {
    static Scanner sc = new Scanner(System.in);
    default void education(Cart cart) 
      {
        final String reset = "\u001b[0m";
         final String blink = "\u001b[5m";
         final String purpe = "\u001b[35;1m";
	final String yellow = "\u001b[33;1m";
	final String skblue = "\u001b[36;1m";
     final String red =  "\u001b[31;1m";

        System.out.println();
        System.out.println(blink+purpe+"*"+reset);
        System.out.println(yellow+"1) Entrance exams\n2) Competitive exams"+reset);
        System.out.println(blink+purpe+"*"+reset);
        System.out.println();
        System.out.println(blink+"Enter which type book you want in Education Category"+reset);
        int n3 = sc.nextInt();
        System.out.println();
        switch (n3)
           {
            case 1:
                System.out.println(skblue+"1) SBI Clerk Prelims & Mains\n2) Quantitative Aptitude, Reasoning Ability and English Language Combo Set of 3 Books For All Banking Exams\n3) PW Banking Drona Logical and Analytical Reasoning l Theory with Exercise l For IBPS PO, Clerk, SBI PO Clerk, IBPS RRB, Grade A/B, PO/SO, Nabard,Insurance\n4) KYC Reasoning Ability Book For All Banking Exams 2024 - 2025 with PYQs and New Pattern Questions\n5) Magical Book on Quicker Maths"+reset);

                int entranceChoice = sc.nextInt();
                System.out.println();
                switch (entranceChoice) 
                        {
                             case 1:
                                    cart.addToCart("SBI Clerk Prelims & Mains" , 150);
                                    break;
			     case 2:
                                  cart.addToCart("Quantitative Aptitude, Reasoning Ability and English Language Combo Set of 3 Books For All Banking Exams ", 200);
	                          break;
                             case 3:
                                   cart.addToCart("PW Banking Drona Logical and Analytical Reasoning l Theory with Exercise l For IBPS PO, Clerk, SBI PO Clerk, IBPS RRB, Grade A/B, PO/SO, Nabard,Insurance", 250);
				   break;
                             case 4:
                                   cart.addToCart("KYC Reasoning Ability Book For All Banking Exams 2024 - 2025 with PYQs and New Pattern Questions ", 300);
				   break;
                             case 5:
                                   cart.addToCart("Magical Book on Quicker Maths", 400);
				   break;
                             default:
                                   System.out.println("Invalid choice");
                      }
                break;
            case 2:
                System.out.println(skblue+"1) Problems In GENERAL PHYSICS - 544rs\n2) PLANE TRIGONOMETRY Part-1 - 234rs\n3) A Textbook of Organic Chemistry for JEE Main and Advanced - 165rs\n4) GKP Hand Book 2024 Mechanical Engineering for GATE, ESE, PSUs, ISRO, DRDO, UPSC, SSC-JE, RRB-JE, Central/State AE & JE and other competitive examinations (Includes Solved Paper GATE & ESE 2023) - 600rs\n5) AP EAMCET Engineering Exam Book 2024 (English Edition) | Andhra Pradesh Engineering, Agricultural and Medical Common Entrance Test - 590rs "+reset);
                int compChoice = sc.nextInt();
                switch (compChoice) 
                       {
                             case 1:
                                   cart.addToCart("Problems In GENERAL PHYSICS ", 544);
				   break;
                             case 2:
                                   cart.addToCart("PLANE TRIGONOMETRY Part-1 ", 234);
				   break;
                             case 3:
                                   cart.addToCart("A Textbook of Organic Chemistry for JEE Main and Advanced", 165);
				   break;
                             case 4:
                                   cart.addToCart("GKP Hand Book 2024 Mechanical Engineering for GATE, ESE, PSUs, ISRO, DRDO, UPSC, SSC-JE, RRB-JE, Central/State AE & JE and other competitive examinations (Includes Solved Paper GATE & ESE 2023)", 600);
				   break;
                             case 5:
                                   cart.addToCart("AP EAMCET Engineering Exam Book 2024 (English Edition) | Andhra Pradesh Engineering, Agricultural and Medical Common Entrance Test ", 590);
                            default:
                                 System.out.println("Invalid choice");
                      }
                break;
            default:
                System.out.println(red+"Invalid education choice"+reset);
        }
    }
}

interface Poetry 
    {
    static Scanner sc = new Scanner(System.in);
    default void poetry(Cart cart) 
       {
        final String reset = "\u001b[0m";
         final String blink = "\u001b[5m";
         final String purpe = "\u001b[35;1m";
	final String yellow = "\u001b[33;1m";
	final String skblue = "\u001b[36;1m";
     final String red =  "\u001b[31;1m";

        System.out.println();
        System.out.println(blink+purpe+"*"+reset);
        System.out.println(yellow+"1) Lyric Poetry\n2) Narrative Poetry\n3) Pastoral Poetry\n4) Dramatic Poetry"+reset);
        System.out.println(blink+purpe+"*"+reset);
        System.out.println();
        System.out.println(blink+"Enter which type book you want in Poetry Category"+reset);
        int n4 = sc.nextInt();
        System.out.println();
        switch (n4) 
           {
            case 1:
                System.out.println(skblue+"1) Fowls in the Frith - written by(Anonymous) - 345rs\n2) Whoso List to Hunt - written by(Sir Thomas Wyatt) - 180rs\n3) Upon Julia's Clothes- written by(Robert Herrick) - 50rs\n4) A Quoi bon Dire - wriiten by(Charlotte Mew) - 455rs"+reset);

                int lyricChoice = sc.nextInt();
                System.out.println();
                switch (lyricChoice) 
                         {
                             case 1:
                                    cart.addToCart("'Fowls in the Frith'", 345);
                                    break;
			     case 2:
                                  cart.addToCart("'Whoso List to Hunt'", 180);
	                          break;
                             case 3:
                                   cart.addToCart("'Upon Julia's Clothes'", 50);
				   break;
                             case 4:
                                   cart.addToCart("'A Quoi bon Dire'", 455);
				   break;
                             default:
                                   System.out.println("Invalid choice");
                      }
                break;
            case 2:
                System.out.println(skblue+"1) The Rape of Lucrece -  written by(William Shakespeare) - 210rs\n2) 'Tam o' Shanter' - written by(Robert Burns) - 150rs\n3) The Rime of the Ancient Mariner - written by(Samuel Taylor Coleridge) - 56rs\n4) 'The Eve of St. Agnes' - written by(John Keats) - 452rs\n5) 'The Raven' - written by(Edgar Allan Poe) -321rs "+reset);

                int narrativeChoice = sc.nextInt();
                switch (narrativeChoice) 
                         {
                             case 1:
                                   cart.addToCart("The Rape of Lucrece", 210);
				   break;
                             case 2:
                                   cart.addToCart("Tam o' Shanter", 150);
				   break;
                             case 3:
                                   cart.addToCart("The Rime of the Ancient Mariner", 56);
				   break;
                             case 4:
                                   cart.addToCart("The Eve of St. Agnes", 452);
				   break;
                             case 5:
                                   cart.addToCart("The Raven ", 321);
				   break;
                            default:
                                   System.out.println("Invalid choice");
                      }
                break;
            case 3:
               System.out.println(skblue+"1) The Death of the Hired Man - written by(Robert Frost) - 340rs\n2) The Spring - written by(Thomas Carew) - 124rs\n3) Imitation of Spenser - written by(John Keats) - 234rs\n4) The Four Ages of Man - written by(Anne Bradstreet's) - 56rs\n5) Maud Muller - written by(John Greenleaf Whittier) - 321rs"+reset);
                int pastoralChoice = sc.nextInt();
                switch (pastoralChoice) 
                         {
                             case 1:
                                   cart.addToCart("The Death of the Hired Man ", 340);
				   break;
                             case 2:
                                   cart.addToCart("The Spring", 124);
				   break;
                             case 3:
                                   cart.addToCart("Imitation of Spenser", 234);
				   break;
			     case 4:
                                   cart.addToCart("The Four Ages of Man", 56);
				   break;
                             case 5:
                                   cart.addToCart("Maud Muller ", 321);
				   break;                 
                             default:
                                  System.out.println("Invalid choice");
                      }
                break;
            case 4:
               System.out.println(skblue+"1) My Last Duchess -written by(Robert Browning) - 310rs\n2) The Love Song of J. Alfred Prufrock - written by(T.S. Eliot) - 23rs\n3) Rubble - written by(Jackie Kay) - 150rs\n4) Johannes Agricola in Meditation - written by(Robert Browning) - 45rs\n5) The Lost Mistress - written by(Robert Browning) - 120rs"+reset);

                int dramaticChoice = sc.nextInt();
                switch (dramaticChoice) 
                         {
                             case 1:
                                   cart.addToCart("My Last Duchess ", 310);
				   break;
                             case 2:
                                   cart.addToCart("The Love Song of J. Alfred Prufrock ", 23);
				   break;
			     case 3:
                                   cart.addToCart("Rubble ", 150);
				   break;
                             case 4:
                                   cart.addToCart("Johannes Agricola in Meditation ", 45);
				   break;
                             case 5:
                                   cart.addToCart("The Lost Mistress ", 120);
				   break;
                            default:
                                  System.out.println("Invalid choice");
                       }
                break;
             default:
                System.out.println(red+"Invalid poetry choice"+reset);
        }
    }
}



class register
{
	static Scanner sc=new Scanner(System.in);
	public String name;
	static long mobileno;
	public String password;
	/*register(String name1,long mobileno1,String password1)
	{
		name=name1;
		mobileno=mobileno1;
		password=password1;
	}
	register(register r)
	{
		name=r.name;
		mobileno=r.mobileno;
		password=r.password;
	}*/
	void setName(String name)
	{
		this.name=name;
	}
	void setMobileno(long mobileno)
	{
		this.mobileno=mobileno;
	}
	void setPassword(String password)
	{
		this.password=password;
	}
	String getName()
	{
		return name;
	}
	long getMobileno()
	{
		return mobileno;
	}
	String getpassword()
	{
		return password;
	}
}
class login extends register
{
	Scanner sc=new Scanner(System.in);
	private String email;
	public String password;
	void setEmail(String email)
	{
		this.email=email;
	}
	String getEmail()
	{
		return email;
	}
	void setPassword(String password)
	{
		this.password=password;
	}
	String getpassword()
	{
		return password;
	}

}



 class bank extends login
   {
    static Scanner sc = new Scanner(System.in);
    double balance=80000;
     final String reset = "\u001b[0m";
     final String blink = "\u001b[5m";
     final String bgpurpe = "\u001b[105;1m";
    }
class Paytm extends bank
   {
	 final String green = "\u001b[32;1m";
	 final String red =  "\u001b[31;1m";
	     final String skblue = "\u001b[36;1m";
final String bgskblue = "\u001b[106;1m";

      void paytm(Cart cart)
     {
       if(cart.totalCost<=balance)
       {
         }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
       if(cart.totalCost !=0)
       {
          if(cart.totalCost>300)
          {
            balance = balance+50;
             
             System.out.println(skblue+"Debited amount is "+(cart.totalCost-50));
		System.out.println(green+"Payment is Successful ");
		System.out.println("You got 50RS Cash back"+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
            System.out.println(blink + skblue + "Thank you for your purchase!" + reset);

         }
          else
            {
             System.out.println(skblue+"Debited amount is "+cart.totalCost+reset);
		System.out.println(green+"Payment is Successful "+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
            System.out.println(blink + skblue + "Thank you for your purchase!" + reset);
            }
              
       }
        else
         {
           System.out.println("Please add item for order");
          }
      }
   }
class Gpay extends bank
   {
	 final String green = "\u001b[32;1m";
	 final String red =  "\u001b[31;1m";
     final String skblue = "\u001b[36;1m";
	final String bgskblue = "\u001b[106;1m";

     void gpay(Cart cart)
     {
       if(cart.totalCost<=balance)
       {
        }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
         if(cart.totalCost !=0)
       {
         if(cart.totalCost>500)
           {
             
             System.out.println(skblue+"Debited amount is "+(cart.totalCost-100)+reset);
		System.out.println(green+"Payment is Successful ");
		System.out.println("You got a scratch card"+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
            System.out.println(blink + skblue + "Thank you for your purchase!" + reset);
           }
          else
          {
             System.out.println(skblue+"Debited amount is "+cart.totalCost+reset);
		 System.out.println(green+"Payment is Successful "+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
             System.out.println(blink + skblue + "Thank you for your purchase!" + reset);
           }
       }
        else
         {
           System.out.println("Please add item for order");
          }

      }
   }
class Phonepe extends bank
   {
	 final String green = "\u001b[32;1m";
	 final String red =  "\u001b[31;1m";
	 final String skblue = "\u001b[36;1m";
	final String bgskblue = "\u001b[106;1m";
	
     void phonepe(Cart cart)
     {
       if(cart.totalCost<=balance)
       {
        }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
          if(cart.totalCost !=0)
         {
             if(cart.totalCost>500)
           {
         
             System.out.println(skblue+"Debited amount is "+(cart.totalCost-30)+reset);
		   System.out.println(green+"Payment is Successful ");
             System.out.println("You got a scratch card"+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
            System.out.println(blink + skblue + "Thank you for your purchase!" + reset);
           }
          else
          { 
             System.out.println(skblue+"Debited amount is "+cart.totalCost+reset);
		System.out.println(green+"Payment is Successful "+reset);
             System.out.println(red+"Your Order is Delivered Soon...."+reset);
             System.out.println();
             System.out.println(blink + skblue + "Thank you for your purchase!" + reset);
           }

      }
   }

}
class Cart extends Phonepe
   {
    String[] cartItems = new String[20]; 
    double[] itemPrices = new double[20];
    double totalCost = 0;
    int itemCount = 0;

    void addToCart(String item, double price) 
      {
	final String yellow = "\u001b[33;1m";
     final String red =  "\u001b[31;1m";

        if (itemCount < cartItems.length)
           {
            cartItems[itemCount] = item;
            itemPrices[itemCount] = price;
            totalCost += price;
            System.out.println(yellow+item + " added to cart for " + price + "rs."+reset);
            itemCount++;
        } 
         else 
           {
            System.out.println(red+"Cart is full, cannot add more items."+reset);
        }

    }
      void ViewCart()
     {
        final String bgpurpe = "\u001b[105;1m";
        final String reset = "\u001b[0m";
        final String blink = "\u001b[5m";
        final String bgred =  "\u001b[101;1m";
	final String yellow = "\u001b[33;1m";
	     final String red =  "\u001b[31;1m";

        if (itemCount == 0) 
           {
            System.out.println(red+"Your cart is empty."+reset);
            } 
         else 
           {
            System.out.println(bgred + " Items in your cart " + reset);
            System.out.println();
            for (int i = 0; i < itemCount; i++)
             {
                System.out.println(cartItems[i] + " - " + itemPrices[i] + "rs");
            }
            System.out.println(yellow+"Total cost: " + totalCost + "rs"+reset);
           }
        }
         
        void clearCart()
        {
        itemCount = 0;
        totalCost = 0;
    }

    boolean isEmpty()
      {
        return itemCount == 0;
    }
  }

 class book extends Cart implements Fiction,NonFiction,ChildrenBooks,Education,Poetry{
    public static void main(String[] args)
       {
     final String reset = "\u001b[0m";
     final String def = "\u001b[0;1m";
     final String blink = "\u001b[5m";
     final String red =  "\u001b[31;1m";
     final String green = "\u001b[32;1m";
     final String yellow = "\u001b[33;1m";
     final String blue = "\u001b[34;1m";
     final String purpe = "\u001b[35;1m";
     final String skblue = "\u001b[36;1m";
     final String bgred =  "\u001b[101;1m";
     final String bggreen = "\u001b[102;1m";
     final String bgyellow = "\u001b[103;1m";
     final String bgblue = "\u001b[104;1m";
     final String bgpurpe = "\u001b[105;1m";
     final String bgskblue = "\u001b[106;1m";

  
      Cart cart = new Cart();
        book obj=new book();
         bank obj1 = new bank();
        Scanner sc = new Scanner(System.in);
System.out.println(red+"~*~*~*~*~*~*~**"+reset);
System.out.println();
System.out.println(blue+blink+"      WELCOME TO ONLINE BOOK STORE   "+reset);
System.out.println();

System.out.println(red+"~*~*~*~*~*~*~**"+reset);
System.out.println(skblue+"1) REGISTER\n2) LOGIN"+reset);
		int n=sc.nextInt();
		register obj2=new register();
		login obj3 =new login();
		switch(n)
		{
			case 1:
				{
					System.out.print(yellow+"ENTER YOUR NAME :"+reset);
					obj2.setName(sc.next()); 
					System.out.print(yellow+"ENTER YOUR MOBILE NUMBER :"+reset);
				
					obj2.setMobileno(sc.nextLong());
					if(String.valueOf(obj2.getMobileno()).length()!=10)
					{
						System.out.println("Invalid Mobile Number Please enter again");
						obj2.setMobileno(sc.nextLong());
					}
					boolean OTP=false;
    					while(!OTP)
    					{
       						System.out.print(yellow+"Enter Generated OTP : "+reset);
        					int randomotp=1001+(int)(Math.random()*8999);
         					System.out.println(randomotp);
						int otp = sc.nextInt();
        					if(otp==randomotp)
         					{
           						System.out.println(purpe+"Mobile Number is verified Successfully"+reset);
           						OTP=true;
         					}
          					else
         					{
         						System.out.println("Entered OTP is Invalid");
       						}
     					}
					//System.out.println("Mobile number verified successfully");
					System.out.print(yellow+"CREATE PASSWORD :"+reset);
					obj2.setPassword(sc.next());
					System.out.println(green+"Successfully registerd"+reset);
					System.out.print(yellow+"ENTER YOUR EMAIL  :"+reset);
							obj3.setEmail(sc.next());
							System.out.println(yellow+"ENTER PASSWORD :"+reset);
                                                        obj3.setPassword(sc.next());
							String checkPassword = obj2.getpassword();
							boolean check=false;
            						while(!check)
							{
								if (checkPassword.equals(obj3.getpassword())) 
            							{
                							System.out.println(green+"Login Successfully"+reset);
									check=true;
            							} 
								else
								{
									System.out.println("ENTER CORRECT PASSWORD");
									obj3.setPassword(sc.next());
								}
							}
				}
				break;
			case 2:
				{
					System.out.print(yellow+"ENTER YOUR EMAIL  :"+reset);
					obj3.setEmail(sc.next());
					System.out.print(yellow+"ENTER PASSWORD :"+reset);
					String check=sc.next();
					System.out.println(blink+"1) change password \n2) no need to change"+reset);
						int n1=sc.nextInt();
						if(n1==1)
						{
							obj3.setPassword(sc.next());
						}
					System.out.println(green+"Login Successfully"+reset);
					
				}
		}
				
	 while (true)
         {
            System.out.println();
            System.out.println(blink+purpe+"<<<<<<<<<<<<   TYPES OF  BOOKS  >>>>>>>>>>>>"+reset);
	System.out.println();
            System.out.println(blue+"1) Fiction\n2) Non-Fiction\n3) Children Books\n4) Education\n5) Poetry\n6) View Cart\n7) Clear cart\n8) Order \n9) Exit"+reset);
            System.out.println(green+"Enter your choice:"+reset);
            int choice = sc.nextInt();
            switch (choice)
              {
                case 1:
                    obj.fiction(cart);
                    break;
                case 2:
                    obj.nonfiction(cart);
                    break;
                case 3:
                     obj.childrenBooks(cart);
                    break;
                case 4:
                    obj.education(cart);
                    break;
                case 5:
                    obj.poetry(cart);
                    break;
                case 6:
                    cart.ViewCart();
                    break;
                case 7:
                     cart.clearCart();
                     break;
                case 8:
                   System.out.println(purpe+"Total amount to pay " +cart.totalCost+reset);
                  System.out.println(yellow+"1) Pay With Paytm\n2) Pay With Gpay\n3) Pay With Phonepe"+reset);
			//boolean paycheck=true;
                   while(true)
		{
			int pay=sc.nextInt();
                    switch(pay)
			{
				case 1:
                    		{
                       			Paytm acc = new Paytm();
                      			acc.paytm(cart);
					//paycheck=false;
					break;
                    		}
                     		case 2:
                    		{
                      			Gpay acc = new Gpay();
                      			acc.gpay(cart);
					//paycheck=false;
					break;
                    		}
                     		case 3:
                    		{
                      			Phonepe acc = new Phonepe();
                      			acc.phonepe(cart);
					//paycheck=false;
					break;
                    		}
			}
		}
                case 9: 
			System.out.println(); 
                      System.out.println(yellow+"1) Back\n2) Exit"+reset);
                      int exitchoice=sc.nextInt();
                     if(exitchoice==1)
                     {   
                     }
                     else{
                    System.out.println(purpe+blink+"#############  Thank you for visiting! #############"+reset);
		    System.out.println(purpe+blink+"~~~~~~~~~~~~~      Have A Nice Day     ~~~~~~~~~~~~~"+reset);
                    return;
                  }
            }
        }
    }
}