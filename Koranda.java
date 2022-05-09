import java.util.Random;

public class Koranda implements FinalProject
{
    public Koranda()
    {
	
    }

    public void begin()
    {
	PrintInto();
    }
	
	    public void PrintInto()
    {
        System.out.println("            _______  _______  _       _________ _______  _______ ");
        System.out.println("           / ___   )(  ___  )( \\      \\__   __/(  ___  )(  ____ )");
        System.out.println("           \\/   )  || (   ) || (         ) (   | (   ) || (    )|");
		System.out.println("               /   )| |   | || |         | |   | (___) || (____)|");
        System.out.println("              /   / | |   | || |         | |   |  ___  ||     __)");
        System.out.println("             /   /  | |   | || |         | |   | (   ) || (\\ (   ");
        System.out.println("            /   (_/\\| (___) || (____/\\   | |   | )   ( || ) \\ \\__");
        System.out.println("           (_______/(_______)(_______/   )_(   |/     \\||/   \\__/");
        System.out.println();
        System.out.println("  __  __         _   _      ___        _                   _____    _ _         ");
        System.out.println(" |  \\/  |_  _ __| |_(_)__  | __|__ _ _| |_ _  _ _ _  ___  |_   _|__| | |___ _ _ ");
		System.out.println(" | |\\/| | || (_-<  _| / _| | _/ _ \\ '_|  _| || | ' \\/ -_)   | |/ -_) | / -_) '_|");
        System.out.println(" |_|  |_|\\_, /__/\\__|_\\__| |_|\\___/_|  \\__|\\_,_|_||_\\___|   |_|\\___|_|_\\___|_|  ");
		System.out.println("         |__/                                                                   ");
        System.out.println();
		fortuneMenu();
    }
	
	    public void fortuneMenu()
    {
	 System.out.println("Ask a Question  -   Z");
	 System.out.println("Get a Horoscope -   X");
	 System.out.println("Fortune Cookie  -   C");
	 System.out.println("Quit -              Q");
	 
	 char userChoice = Itse2417Main.myScan.next().charAt(0);
	 Itse2417Main.myScan.nextLine(); //throws away the \n not consumed by .next
	 
	 if( userChoice == 'z' || userChoice == 'Z'){
		 askQuestion();
	 }
	 	 else if ( userChoice == 'c' || userChoice == 'C'){
		 fortuneCookie();
	 }
	 	 else if ( userChoice == 'x' || userChoice == 'X'){
		 getHoroscope();
	 }	 
	 else if ( userChoice == 'q' || userChoice == 'Q'){
		 
	 }
	 else{
		System.out.println("Unkown Input");
		System.out.println();
		fortuneMenu();
	 }
	}
	public void askQuestion(){
	String question;
	 System.out.println("Ask a Question:");
	 Random rand = new Random();
	 
	 String[] answers = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.","Most likely.","Outlook good.","Signs point to yes.","Yes",
	 "Reply hazy, try again.","Ask again later.","Better not tell you now.","Concentrate and ask again.","Don't count on it.","My reply is no.","My sources say no.","Outlook not so good.",
	 "Very doubtful.","No"};
	 
	 question = Itse2417Main.myScan.nextLine();
	 System.out.println();
	 System.out.println(question + '?');
	 System.out.println(answers[rand.nextInt(answers.length)]);
	 System.out.println();
	 
	 fortuneMenu();
    }
	
		public void fortuneCookie(){
	 Random rand = new Random();
	 
	 String[] fortunes = {"You will travel to many exotic places in your lifetime.","Keep your eye out for someone special.","You will give a good grade to a random fortune cookie program",
	 "You will soon meet a new friend","Money will come your way","An exciting opportunity awaits you","be wary of new business opportunities","What is dark? What is not dark"};
	 // The "what is dark" one makes no sense to me either, but I got chinese while working on this and that was my fortune cookie
	 
	 System.out.println(fortunes[rand.nextInt(fortunes.length)]);
	 System.out.println("Your lucky numbers are: " + rand.nextInt(100) + ", " + rand.nextInt(100) + ", and " + rand.nextInt(100));
	 System.out.println();
	 
	 fortuneMenu();
    }
	
		public void getHoroscope(){
		System.out.println("Todays Horoscopes: ");
		System.out.println("-------------------------------");
		System.out.println("Aries: March 21 - April 19");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Taurus: April 20 - May 20");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Gemini: May 21 - June 21");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Cancer: June 22 - July 22");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Leo: July 23 - August 22");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Virgo: August 23 - September 22");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Libra: September 23 - October 23");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Scorpio: October 24 - November 21");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Sagittarius: November 22 - December 21");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Capricorn: December 22 - January 19");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Aquarius: January 20 - February 18");
		System.out.println(createHoroscope());
		System.out.println();
		System.out.println("Pisces: February 19 - March 20");
		System.out.println(createHoroscope());
		System.out.println();

	 fortuneMenu();
    }
	
	public String createHoroscope(){
	 Random rand = new Random();
	 
	 String[] things = {"family","work","money","love","friendships"};
	 String[] planets = {"mercury","venus","mars","jupiter","saturn","neptune"};
	 String[] Statements = {"mercury","venus","mars","jupiter","saturn","neptune"};

	 String horoscope = " " + planets[rand.nextInt(planets.length)] + " and " + planets[rand.nextInt(planets.length)] + " influence you today \n It is a time for focusing on "
	 + things[rand.nextInt(things.length)] + ", but be wary of problems "  + planets[rand.nextInt(planets.length)] + " may cause with " + things[rand.nextInt(things.length)];
	 

	 return horoscope;
    }
	
	
}