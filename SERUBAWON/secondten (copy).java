print("main menu")
print("select option")

main_Menu = """
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
"""

print("main_menu")
print("select option")

main_menu_choice = int(input("Enter a number"))
match (mainMenuChoice)
	case1:
	    match (mainMenuChoice) {
		    print("Phonebook");
		    phonebook_Menu = """		
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

	print(phonebook_menu);
	print("phonebook_Menu):

		phonebook_menu_choice = int(input("Enter nummber")

		         match (phonebookMenuChoice):  
		                case 1  :	println("Search")
		                case 2  :	println("Service Nos")
		                case 3  :	println("Add Name")
		         		case 4  :	println("Erase")
		                case 5  :	println("Edit")
						case 6  :	println("Assign tone") 
		                case 7  :	println("Send b'card")
		                case 8  :	println("Options")
		                case 9  :	println("Speed dial")
		                case 10 :	println("Voice tags")    
		            	}
		      

	   				case 1 println("Message");
	    			Message_menu = """
	    				1 Set1 
	    				2 Common
	    				3 Chat 
	    				4 Call register
	    				5 Show call duration 
	    				6 Show call cost 
	    				7 Call cost setting 
	    				8 Prepaid credit
	"""

	    					println(MessageMenu);
	    					println("");
	    					Message_choice = int(input("Enter a number")

	    					match (MessageChoice):

	            				case  1:
	            				println("Set1")
	            				set1mainMenu = """
	            				1 Message centre number
	            				2 Message sent as
	            				3 Message validity
	 """
		            				println("set1 Menu");
									println("Choose your choice from the option above");

									set1_Choice = int(input(Enter a number))

									match (set1Choice):
			            				case 1 :	println("Message centre number")
			            				case 2 :	println("Message sent as")
			            				case 3 :	println("Message validity")
			            
		            		

	            		

	            						case 2 : println("Common")

	            							common_main_menu = """
	            							1 Delivery report
	            							2 Reply via same centre
	            							3 Character support  
	       	"""

		            							println("common Menu");
												println("Choose your choice from the option above");

												common_choice = int(input(Enter a number))

													match (commonChoice):

													case 1 :	println("Delivery report")
													case 2 :	println("Reply via same centre")
													case 3 :	println("Character support")
							
					

	            								case 3 :	println("Chat")
	            								case 4 :	println("call register");

	            										call_register_main_menu = """
	            										1 Missed call
	            										2 Received call
	            										3 Dialled number
	            										4 Erase recent call list
	            										5 Show call duration
	        """

		            										println("callregister Menu");
														println("Choose your choice from the option above");

									call_register_choice = int(input())

									match (callregisterChoice):

									case  1 :	println("Missed call")
									case  2 :	println("Received call")
									case  3 :	println("Dialled number")
									case  4 :	println("Erase recent call")

							case  5 :	println("Show call duration")


	            		showcalldurationmainMenu = """
	            		1 Last call duration
	            		2 All call duration 
	            		3 Received call duration
	            		4 Dialled call duration
	            		5 Clear timer
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

	            	break;

	            	case 6 : System.out.println("Show call cost");


	            		String showcallcostmainMenu = """
	            		1 Last call cost
	            		2 All call cost  
	            		3 Clear counter
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

	            		break;

	            	case 7 : System.out.println("Call cost setting");

		            	String callcostsetting = """
		            	1 Call cost limit
		            	2 Show cost in
		            	3 Clear counter
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

	            		break;

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
	        		 
	        	break;
					
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

	        	break;

	        case 6  :  System.out.println("Setting");

	    		String settingmainMenu = """
	    			1 Call setting 
	    			2 Phone setting
	    			3 Security setting
	    			4 Restore factory setting
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
						
						break;

					case 2  : System.out.println("Phone setting");

						String phonesettingMenu = """
						1 Language
						2 Cell info display
						3 Wecome note  
						4 Network selection  
						5 Light
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

					case 3  : System.out.println("Security setting");

						String securitysettingMenu = """
						1 PIN code request
						2 Call barring service
						3 Fixed dialling
						4 Losed user group  
						5 Phone security  
						6 Change access code  
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

					case 4  : System.out.println("Restore factory setting"); break;
					default : System.out.println("Invalid input");
					
				}
	        	
	        	break;

	  		case 7  :  System.out.println("Call divert"); break;
	    	case 8  :  System.out.println("Game"); break;
	       	case 9  :  System.out.println("Calculator"); break;
	        case 10 :  System.out.println("Reminder"); break;
	      	case 11 :  System.out.println("Clock");

					String clockMenu = """
					1 Alarm clock 
					2 Clock setting
					3 Date setting
					4 Stopwatch
					5 Countdown timer 
					6 Auto update of date and time 
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
					}		        			

	        	break;

	       	case 12 :  System.out.println("Profile"); break;
	      	case 13 :  System.out.println("SIM services"); break;
	        default : System.out.println("Invalid input");
	    }

	        }while(mainMenuChoice != 99);
	    	    
	    	    
	}
}