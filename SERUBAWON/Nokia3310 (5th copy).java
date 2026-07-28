import java.util.Scanner;
public class Nokia3310{
	public static void main(String[] args){

	Scanner inputCollector = new Scanner(System.in);

	String mainMenu = """

1  Phone book
2  Messages
3  Chat 
4  Call register
5  Tones 
6  Settings
7  Call divert
8  Games
9  Calculator
10 Reminder
11 Clock
12 Profiles
13 SIM services
	""";

		System.out.print(mainMenu);
		int mainMenuChoice = inputCollector.nextInt();

		switch (mainMenuChoice){
		case 1 : System.out.println(Phonebook);
			String PhonebookMenu = """
1 Search
2 Service Nos
3 Add Name
4 Erase
5 Edit
6 Assign tone
7 Send b'card
8 Options
9 Speed dials
10 Voice tags
    """;				
    	System.out.println(phonebookMenu);
        int phonebookMenuChoice = inputCollector.nextInt();

        switch (phonebookMenuChoice) {

                   
                case 1: System.out.println("Search"); break;     
                case 2 : System.out.println("Service Nos"); break;
                case 3 :System.out.println("Add Name"); break;
         		case 4 :System.out.println("Erase"); break;
                case 5 :System.out.println("Edit"); break;
				case 6 : System.out.println("Assign tone"); break;
                case 7 : System.out.println("Send b'card"); break;
                case 8: System.out.println("Options");

                System.out.println("options  Menu");
			 	int optionsChoiceMenu  = inputCollector.nextInt();
                	String optionsChoiceMenu = """
1 Type of view
2 Memory status
    """;

                System.out.println("options Menu");
                int optionsMenuChoice = inputCollector.nextInt();

                switch (optionsMenuChoice) {
                case 1 : System.out.println("Type of view"); break;
                case 2 : System.out.println("Memory status"); break;
                default: System.out.println("Invalid input"); break;
                }
                break;

              	case 9  : System.out.println("Speed dials"); break;
              	case 10 : System.out.println("Voice tags"); break;
                default : System.out.println("Invalid input");
                }
             

        System.out.println("message Menu");
		int messageMenu  = inputCollector.nextInt();

			case 2 : System.out.println("message  Menu");

                String messageMenu = """
1 Write messages
2 Inbox
3 Outbox
4 Picture messages
5 Templates
6 Smileys
7 Message Settings
8 Info services
9 Voice mailbox number
10 Service command editor
    """;

    			System.out.println(messageMenu);
                int messageMenuChoice = inputCollector.nextInt();

                switch (messageMenuChoice) {

                case 1 : System.out.println("Write messages"); break;
                case 2 : System.out.println("Inbox"); break;
                case 3 : System.out.println("Outbox"); break;
                case 4 : System.out.println("Picture messages"); break;
                case 5 : System.out.println("Templates"); break;
                case 6 : System.out.println("Smileys"); break;
                case 7 : System.out.println("message Settings"); 
	             }

                System.out.println(messageSettingMenu);
				int messageSettingMenu  = inputCollector.nextInt();

                	String messageSettingMenu = """

1 Set1 
2 Common
3 Chat 
4 Call register 
	""";
									
				ystem.out.println(messageSettingMenu);
                int messageSettingMenuChoice = inputCollector.nextInt();

                switch (messageSettingMenuChoice) {

                case 1 : System.out.println("Set1"); break;
                case 2 : System.out.println("Common"); break;
                case 3 : System.out.println("Chat"); break;
                case 4 : System out println("Call register"); break;	

                }	
              


                System.out.println(messageSet1Menu);
				int messageSet1Menu  = inputCollector.nextInt();

                	String messageSet1Menu = """

1 Message center number
2 Message sent as
3 Message validity
    """;

                System.out.println(messageSet1Menu);
                int messageSet1Choice = inputCollector.nextInt();

                switch (messageSet1Choice) {
                
               	case 1: System.out.println("Message center number"); break;
               	case 2: System.out.println("Message sent as"); break;
                case 3 : System.out.println("Message validity"); break;
                default : System.out.println("Invalid input");
                }
                break;

                System.out.println(commonMenu);
				int commonMenu  = inputCollector.nextInt();

                    String messageCommonMenu = """
1 Delivery reports
2 Reply via same centre
3 Character support
    """;
				System.out.println(CommonMenu);
                int messageCommonChoice = inputCollector.nextInt();

                    switch (CommonChoice) {
                                  
                case 1 : System.out.println("Delivery reports"); break;
                case 2 : System.out.println("Reply via same centre"); break;
                case 3 : System.out.println("Character support"); break;
                default : System.out.println("Invalid input");
				}


				System.out.println("Call  register Menu");
				int callregisterMenu  = inputCollector.nextInt();

				case 2 : System.out.println("call callregisterMenu");

                	String callregisterMenu = """
1 Missed calls 
2 Received calls 
3 Dialled number
4 Erase recent calls list
5 Show call duration
6 Show call cost
7 Call cost setting
8 Prepaid credit
	""";
				System.out.println(callregisterMenu);
                int callregisterMenuChoice = inputCollector.nextInt();

                	switch (callregisterMenuChoice) {

                case 1 : System.out.println("Missed calls"); break;
                case 2 : System.out.println("Received calls"); break;
                case 3 : System.out.println("Dialled number"); break;
                case 4 : System.out.println("Erase recent call list"); break;
                case 5 : System.out.println("Show call duration"); break;
                case 6 : System.out.println("show call cost"); 


                System.out.println("Show call cost Menu");
				int showcallcostMenu  = inputCollector.nextInt();

				case 2 : System.out.println("call callregisterMenu");

                	String showcallcostMenu = """
1 Last call cost 
2 All calls cost 
3 Clear counters
	""";		

				System.out.println(showcallcostMenu);
                int showcallcostMenuChoice = inputCollector.nextInt();

                	switch (showcallcostMenuChoice) {

				case 1 : System.out.println("Last call cost"); break;
				case 2 : System.out.println("All calls cost"); break;
				case 3 : System.out.println("Clear counters"): break;
				default : System.out.println("Invalid input");
				}
                	break;
                case 7 ; System.out.println("Call cost setting");


                System.out.println("Show call cost setting Menu");
				int callcostsettingMenu  = inputCollector.nextInt();

				case 7 : System.out.println("call callregisterMenu");

                	String callcostsettingMenu = """

1 Call cost limit
2 Show cost Info
	""";	
                System.out.println(callcostsettingMenu);
                int callcostsettingMenuChoice = inputCollector.nextInt();

                	switch (callcostettingtMenuChoice) {

                case 1 : System.out.println("Call cost limit"); break;
                case 2 : System.out.println("Show cost info"); break;



                 break;
                case 8 : System.out.println("Prepaid credit"); break;
                default : System.out.println("Invalid input");

                	System.out.println("Show call duration Menu");
				int showcalldurationMenu  = inputCollector.nextInt();

				case 2 : System.out.println("call showcalldurationMenu");

                	String showcalldurationMenu = """

	1 Last call duration
	2 All calls duration
	3 Received calls duration
	4 Dialled calls duration
	5 Clear timers
		""";
				System.out.println(showcalldurationMenu);
                int showcalldurationMenuChoice = inputCollector.nextInt();

                	switch (showcalldurationMenuChoice) {

                case 1 : System.out.println("Last call duration"); break;
                case 2 : All calls duration ("All calls duration"); break;
                case 3 : System.out.println("Received calls duration"); break;
                case 4 : System.out.println("Dialled calls duration"); break;
                case 5 : System.out.println("Clear timers"); break;
                default : System.out.println("Invalid input");
                }

                System.out.println("Tones Menu");
				int tonesMenu  = inputCollector.nextInt();

				case 2 : System.out.println("tonesMenu");

                	String tonesMenu = """
1 Ringing tone 
2 Ringing volume
3 Incoming call alert
4 Composer
5 Message alert tone
6 Keypad tones
7 Warning and game tone
8 Vibrating alert
9 Screen saver
	""";

				System.out.println(tonesMenu);
                int tonesMenuChoice = inputCollector.nextInt();

                	switch (tonesMenuChoice) {

                case 1 : System.out.println("Ringing tones"); break;
                case 2 : System.out.println("Ringing volume"); break;
                case 3 : System.out.println("Incoming call alert"); break;
                case 4 : System.out.println("Composer"); break;
                case 5 : System.out.println("message alert tone"); break;
                case 6 : System.out.println("Keypad tones"); break;
                case 7 : System.out.println("Warning and game tone"); break;
                case 8 : System.out.println("Vibrating alert"); break;
                case 9 : System.out.println("Screen.saver"); break;
				}


				System.out.println("Settings Menu");
				int settingsMenu  = inputCollector.nextInt();

				case 2 : System.out.println("tonesMenu");

                	String settingsMenu = """

1 Call setting
2 Phone settings
3 Security settings
4 Restore factory settings
	""";
			
				System.out.println(settingsMenu);
                int settingsMenuChoice = inputCollector.nextInt();

                	switch (settingsMenuChoice) {

             case 1 : System.out.println("Call setting"); break;
             case 2 : System.out.println("Phone settings"); break;
             case 3 : System.out.println("Security settings"); break;
             case 4 : System.out.println("Restore factory settings"); break;
             }

             System.out.println("Call divert"); break;
             System.out.println("Games"); break;
             System.out.println("Calculator"); break;
             System.out.println("reminders"); break;


            System.out.println("clock Menu");
			int clockMenu  = inputCollector.nextInt();

				case 2 : System.out.println("clock Menu");

                	String clockMenu = """

1 Alarm clock
2 Clock settings
3 Date settings
4 Stopwatch
5 Countdown timer
6 Auto update of date and time 
	""";

			
			System.out.println(clockMenu);
            int clockMenuChoice = inputCollector.nextInt();

                	switch (clockMenuChoice) {

            case 1 : System.out.println("Alarm clock"); break;
            case 2 : System.out.println("Clock settings"); break;
            case 3 : System.out.println("Date settings"); break;
            case 4 : System.out.println("Stopwatch"); break;
            case 5 : System.out.println("Countdown timer"); break;
            case 6 : System.out.println("Auto update of date and time"); break;


            System.out.println("Profiles");
            System.out.println("SIM services");	
          	}


		}


  	}