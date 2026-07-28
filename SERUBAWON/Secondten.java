import java.util.Scanner;

public class Secondten{
	public static void main(String[] args){
		int mainMenuChoice;
		do{
		Scanner inputCollector = new Scanner(System.in);
		System.out.println("Main Menu");
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
		99 Exit
		""";
		do{
		System.out.println(mainMenu);
		System.out.print("Choose your choice from the option above: " );

	    mainMenuChoice = inputCollector.nextInt();

	    switch (mainMenuChoice) {
		    case 1:  System.out.println("Phonebook");
		        String phonebookMenu = """		
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
				99 Exit
				""";

				System.out.println(phonebookMenu);
				System.out.print("Choose your choice from the option above or 99 to go back to main menu: " );

		        int phonebookMenuChoice = inputCollector.nextInt();

		            switch (phonebookMenuChoice){  
		                case 1  : System.out.println("Search");
		                case 2  : System.out.println("Service Nos"); break;
		                case 3  : System.out.println("Add Name"); break;
		         		case 4  : System.out.println("Erase"); break;
		                case 5  : System.out.println("Edit"); break;
						case 6  : System.out.println("Assign tone"); break; 
		                case 7  : System.out.println("Send b'card"); break;
		                case 8  : System.out.println("Options"); break;
		                case 9  : System.out.println("Speed dial"); break;
		                case 10 : System.out.println("Voice tags"); break;
		                default : System.out.println.("Invalid input");    
		            	}
		      			}while(mainMenuChoice != 99);
		    	break;

	   		case 2:  System.out.println("Message");
	    		String MessageMenu = """
	    		1 Set1 
	    		2 Common
	    		3 Chat 
	    		4 Call register
	    		5 Show call duration 
	    		6 Show call cost 
	    		7 Call cost setting 
	    		8 Prepaid credit
	    		99 Exit
	    		""";
	    		do{
	    	System.out.println(MessageMenu);
	    	System.out.println("Choose your choice from the option above:");
	    	int MessageChoice = inputCollector.nextInt();

	    		switch (MessageChoice){

	            	case  1: System.out.println("Set1");

	            		String set1mainMenu = """
	            		1 Message centre number
	            		2 Message sent as
	            		3 Message validity
	            		99 Exit
	            		""";
		            	System.out.println("set1 Menu");
						System.out.println("Choose your choice from the option above");

						int set1Choice = inputCollector.nextInt();

						switch(set1Choice){
			            	case 1 : System.out.println("Message centre number"); break;
			            	case 2 : System.out.println("Message sent as"); break;
			            	case 3 : System.out.println("Message validity"); break;
			            	default : System.out.println("Invalid input");
		            	}
		            	}while(mainMenuChoice != 99);
	            		break;
	            		do{
	            	case 2 : System.out.println("Common");

	            		String commonmainMenu = """
	            		1 Delivery report
	            		2 Reply via same centre
	            		3 Character support
	            		99 Exit  
	            		""";

		            	System.out.println("common Menu");
						System.out.println("Choose your choice from the option above");

						int commonChoice = inputCollector.nextInt();

						switch(commonChoice){

							case 1 : System.out.println("Delivery report"); break;
							case 2 : System.out.println("Reply via same centre"); break;
							case 3 : System.out.println("Character support"); break;
							default : System.out.println("Invalid input");
						}
						}while(mainMenuChoice);

						break;
						do{
	            	case 3 : System.out.println("Chat"); break;
	            	case 4 : System.out.println("call register");

	            		String callregistermainMenu = """
	            		1 Missed call
	            		2 Received call
	            		3 Dialled number
	            		4 Erase recent call list
	            		5 Show call duration
	            		99 Exit
	            		""";

		            	System.out.println("callregister Menu");
						System.out.println("Choose your choice from the option above");

						int callregisterChoice = inputCollector.nextInt();

						switch(callregisterChoice){

							case  1 : System.out.println("Missed call"); break;
							case  2 : System.out.println("Received call"); break;
							case  3 : System.out.println("Dialled number"); break;
							case  4 : System.out.println("Erase recent call"); break;
							case  5 : System.out.println("Show call duration"); break;
							default : System.out.println("Invalid input");
						}
						}while(mainMenuChoice != 99);

	            		break;
	            		do{
	            	case 5 : System.out.println("Show call duration");


	            		String showcalldurationmainMenu = """
	            		1 Last call duration
	            		2 All call duration 
	            		3 Received call duration
	            		4 Dialled call duration
	            		5 Clear timer
	            		99 Exit
	            		""";  

		            	System.out.println("showcallduration Menu");
						System.out.println("Choose your choice from the option above");

						int showcalldurationChoice = inputCollector.nextInt();

						switch(showcalldurationChoice){
							case 1 : System.out.println("Last call duration"); break;
							case 2 : System.out.println("All call duration"); break;
							case 3 : System.out.println("Received call duration"); break;
							case 4 : System.out.println("Dialle: call duration"); break;
							case 5 : System.out.println("Clear timer"); break;
							default : System.out.println("Invalid input");				
						}
						}while(mainMenuChoice != 99);

	            	break;
	            		do{
	            	case 6 : System.out.println("Show call cost");


	            		String showcallcostmainMenu = """
	            		1 Last call cost
	            		2 All call cost  
	            		3 Clear counter
	            		99 Exit
	            		""";

						System.out.println("showcallcost Menu");
						System.out.println("Choose your choice from the option above");

						int showcallcostChoice = inputCollector.nextInt();

						switch (showcallcostChoice){

							case 1 : System.out.println("last call cost"); break;
							case 2 : System.out.println("All call cost"); break;
							case 3 : System.out.println("Clear counter"); break;
							default: System.out.println("Invalid input");
						}
						}while(mainMenuChoice != 99);

	            		break;

	            		do{
	            	case 7 : System.out.println("Call cost setting");

		            	String callcostsetting = """
		            	1 Call cost limit
		            	2 Show cost in
		            	3 Clear counter
		            	99 Exit
		            	""";

		            	System.out.println("callcostsetting Menu");
						System.out.println("Choose your choice from the option above");

						int callcostsettingChoice = inputCollector.nextInt();

						switch(callcostsettingChoice){

							case 1  : System.out.println("Call cost limit"); break;				
							case 2  : System.out.println("Show call in"); break;
							case 3  : System.out.println("Clear counter"); break;
							default : System.out.println("Invalid input");
	            		}
	            		}while(mainMenuChoice != 99);

	            		break;
	            		do{
	            	case 8 :
	            		System.out.println("Prepaid credit"); break;
	            		default : System.out.println("Invalid input"); break;
	            }

	        	break;

			case 3  :  System.out.println("Chat"); break;
	    	case 4  :  System.out.println("call register");
	        		 
				String callregisterMenu = """
				1 Missed call
				2 Received call 
				3 Dialled number
				4 Erase recent call list 
				5 Show call duration
				6 Show call cost 
				7 Call cost setting 
				8 Prepaid credit
				99 Exit
				""";
								 
				System.out.println("Callregister Menu");
				System.out.println("Choose your choice from the option above");

				int callregisterChoice = inputCollector.nextInt();

				switch(callregisterChoice){

					case 1 : System.out.println("Missed call"); break;
					case 2 : System.out.println("Received call"); break;
					case 3 : System.out.println("Dialled number"); break;
					case 4 : System.out.println("Erase recent call list"); break;
					case 5 : System.out.println("Show call duration"); break;
					case 6 : System.out.println("Show call cost"); break;
					case 7 : System.out.println("call cost setting"); break;
					case 8 : System.out.println("Prepaid credit"); break; 
					default : System.out.println("Invalid input");
				}
				}while(mainMenuChoice != 99);
	        		 
	        	break;
				do{
	       	case 5  :  System.out.println("Tones");

	        		String toneMainManu = """
        			1 Ringtone
        			2 Ringing volume
        			3 Incoming call alert
        			4 Composer
        			5 Message alert tone 
        			6 Keypad tone
        			7 Warning and game tone
        			8 Vibrating alert
        			9 Screen saver
        			99 Exit
	        		""";  

	        		System.out.println("tone Menu");
					System.out.println("Choose your choice from the option above");

					int toneChoice = inputCollector.nextInt();

					switch(toneChoice){ 

						case 1  : System.out.println("Rington"); break;
						case 2  : System.out.println("Ringing volume"); break;
						case 3  : System.out.println("Incoming call alert"); break;
						case 4  : System.out.println("Composer"); break;
						case 5  : System.out.println("Message alert tone"); break;
						case 6  : System.out.println("Keypad tone"); break;
						case 7  : System.out.println("Warning and game tone"); break;
						case 8  : System.out.println("Vibrating alert"); break;
						case 9  : System.out.println("Screen saver"); break;
						default : System.out.println("Invalid input");
					}
					}while(mainMenuChoice != 99);

	        	break;
	        	do{
	        case 6  :  System.out.println("Setting");

	    		String settingmainMenu = """
	    			1 Call setting 
	    			2 Phone setting
	    			3 Security setting
	    			4 Restore factory setting
	    			99 Exit
	    			""";

	        		
	    		System.out.println("setting Menu");
				System.out.println("Choose your choice from the option above");

				int settingChoice = inputCollector.nextInt();

				switch(settingChoice){

					case 1  : System.out.println("Call setting");

						String callsettingMenu = """
						1 Automatic redial
						2 Speed dialing
						3 Call waiting Option
						4 Own number sending
						5 Phone line in use  
						6 Automatic answer
						99 Exit
						""";


						System.out.println("callsetting Menu");
						System.out.println("Choose your choice from the option above");

						int callsettingChoice = inputCollector.nextInt();

						switch(callsettingChoice){
							case 1 : System.out.println("Automatic redial"); break;
							case 2 : System.out.println("Speed dialing"); break;
							case 3 : System.out.println("Call waiting option"); break;
							case 4 : System.out.println("Own number sending"); break;
							case 5 : System.out.println("Phone line in use"); break;
							case 6 : System.out.println("Automatic answer"); break;
							default : System.out.println("Invalid input");
						}
				}while(mainMenuChoice != 99);
						
						break;

					case 2  : System.out.println("Phone setting");

						String phonesettingMenu = """
						1 Language
						2 Cell info display
						3 Wecome note  
						4 Network selection  
						5 Light
						99 Exit
						""";


						System.out.println("phonesetting Menu");
						System.out.println("Choose your choice from the option above");

						int phonesettingChoice = inputCollector.nextInt();

						switch(phonesettingChoice){
							case 1 : System.out.println("Language"); break;
							case 2 : System.out.println("Cell info display"); break;
							case 3 : System.out.println("Wecome note"); break;
							case 4 : System.out.println("Network selection"); break;
							case 5 : System.out.println("Light"); break;
							default : System.out.println("Invalid input");
						}

						
						break;
						do{
					case 3  : System.out.println("Security setting");

						String securitysettingMenu = """
						1 PIN code request
						2 Call barring service
						3 Fixed dialling
						4 Losed user group  
						5 Phone security  
						6 Change access code
						99 Exit  
						""";

						System.out.println("securitysetting Menu");
						System.out.println("Choose your choice from the option above");

						int securitysettingChoice = inputCollector.nextInt();

						switch(securitysettingChoice){
							case 1 	: System.out.println("PIN code request"); break;
							case 2 	: System.out.println("Call barring service"); break;
							case 3 	: System.out.println("Fixed dialling"); break;
							case 4 	: System.out.println("Losed user group"); break;
							case 5 	: System.out.println("Phone security"); break;
							case 6 	: System.out.println("Change access code"); break;
							default : System.out.println("Invalid input");
						}

						break;
						do{
					case 4  : System.out.println("Restore factory setting"); break;
					default : System.out.println("Invalid input");
					}
	        	
	        	  	break;
	  		case 7  :  System.out.println("Call divert"); break;
	    	case 8  :  System.out.println("Game"); break;
	       	case 9  :  System.out.println("Calculator"); break;
	        case 10 :  System.out.println("Reminder"); break;
	      	case 11 :  System.out.println("Clock");

	      		do{
					String clockMenu = """
					1 Alarm clock 
					2 Clock setting
					3 Date setting
					4 Stopwatch
					5 Countdown timer 
					6 Auto update of date and time
					99 Exit 
					""";

					System.out.println("clock Menu");
					System.out.println("Choose your choice from the option above");

					int clockChoice = inputCollector.nextInt();

					switch(clockChoice){
						case 1 : System.out.println("Alerm clock"); break;
						case 2 : System.out.println("Clock setting"); break;
						case 3 : System.out.println("Date setting"); break;
						case 4 : System.out.println("Stopwatch"); break;
						case 5 : System.out.println("Countdown timer"); break;
						case 6 : System.out.println("Auto update of date and time"); break;
						default: System.out.println("Invalid input");
						}		        			

	        	break;

	       	case 12 :  System.out.println("Profile"); break;
	      	case 13 :  System.out.println("SIM services"); break;
	        default : System.out.println("Invalid input");
	    	}

	        }while(mainMenuChoice != 99);
	    	    
	    	    
	}
}