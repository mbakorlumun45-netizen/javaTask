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
match (main_menu_choice)
	    case 1
		    print("Phonebook")
		    phonebook_menu = """		
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
"""

	print(phonebook_menu)
	print(phonebook_Menu)

		phonebook_menu_choice = int(input("Enter nummber")

		         match (phonebook_menu_choice):  
		                case 1:	println("Search")
		                case 2:	println("Service Nos")
		                case 3:	println("Add Name")
		         		case 4:	println("Erase")
		                case 5  :	println("Edit")
						case 6  :	println("Assign tone") 
		                case 7  :	println("Send b'card")
		                case 8  :	println("Options")
		                case 9  :	println("Speed dial")
		                case 10 :	println("Voice tags")    
		            	
		      

		case1: println("Message")
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
		println("select optio")
		Message_choice = int(input("Enter a number")

		match (Message_choice):

			case  1:
			println("Set1")
			set1_main_menu = """
			1 Message centre number
			2 Message sent as
			3 Message validity
	"""
				println("set1 Menu");
				println("Enter a nummber")

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

				match (common_choice):

				case 1 :	println("Delivery report")
				case 2 :	println("Reply via same centre")
				case 3 :	println("Character support")



			case 3 :	println("Chat")
			case 4 :	println("call register")

					call_register_main_menu = """
					1 Missed call
					2 Received call
					3 Dialled number
					4 Erase recent call list
					5 Show call duration
"""

						println("callregister Menu");
					println("Enter a number")

			call_register_choice = int(input())

			match (call_register_choice):

			case  1 :	println("Missed call")
			case  2 :	println("Received call")
			case  3 :	println("Dialled number")
			case  4 :	println("Erase recent call")

	case  5 :	println("Show call duration")


		show_call_duration_main_menu = """
		1 Last call duration
		2 All call duration 
		3 Received call duration
		4 Dialled call duration
		5 Clear timer
		""";  

    	println("show_call_duration_menu")
		System.out.println("Enter a number");

		show_call_duration_choice = inputCollector.nextInt();

		match (show_call_duration_choice):
			case 1 :	println("Last call duration")
			case 2 :	println("All call duration")
			case 3 :	println("Received call duration")
			case 4 :	println("Dialle: call duration")
			case 5 :	println("Clear timer")			

	case 6	println("Show call cost");


		show_call_cost_main_menu = """
		1 Last call cost
		2 All call cost  
		3 Clear counter
		""";

		println("showcallcost Menu");
		println("Enter a number");

		show_call_cost_choice = inputCollector.nextInt();

		match (show_call_cost_choice){

			case 1 :	println("last call cost")
			case 2 :	println("All call cost")
			case 3 :	println("Clear counter")


	case 7	println("Call cost setting")

    	call_cost_setting = """
    	1 Call cost limit
    	2 Show cost in
    	3 Clear counter
    	"""

    	println("callcostsetting Menu")
		println("Enter a number")

		call_cost_setting_choice = inputCollector.nextInt()

		match (call_cost_setting_choice)

			case 1  :	println("Call cost limit")				
			case 2  :	println("Show call in")
			case 3  :	println("Clear counter")
		
		case 8	println("Prepaid credit")
	            		

			case 3  :	println("Chat")
	    	case 4  :	println("call register")
	        		 
				call_register_menu = """
				1 Missed call
				2 Received call 
				3 Dialled number
				4 Erase recent call list 
				5 Show call duration
				6 Show call cost 
				7 Call cost setting 
				8 Prepaid credit
				"""
								 
				println("Callregister Menu")
				println("Enter a number")

				call_register_choice = inputCollector.nextInt()

				match(call_register_choice)

					case 1 :	println("Missed call")
					case 2 : 	print("Received call")
					case 3 :	println("Dialled number")
					case 4 :	println("Erase recent call list")
					case 5 :	println("Show call duration")
					case 6 :	println("Show call cost")
					case 7 :	println("call cost setting")
					case 8 :	println("Prepaid credit")
					
	       	case 5  :	println("Tones")

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
	        		""" 

	        		println("tone Menu")
					println("Choose your choice from the option above")

					toneChoice = inputCollector.nextInt()

					switch(tone_choice)

						case 1  :	println("Rington")
						case 2  :	println("Ringing volume")
						case 3  :	println("Incoming call alert")
						case 4  :	println("Composer")
						case 5  :	println("Message alert tone")
						case 6  :	println("Keypad tone")
						case 7  :	println("Warning and game tone")
						case 8  :	println("Vibrating alert")
						case 9  :	println("Screen saver")
		

	        case 6  :	println("Setting")

	    			setting_main_menu = """
	    			1 Call setting 
	    			2 Phone setting
	    			3 Security setting
	    			4 Restore factory setting
	    			"""

	        		
	    		println("setting Menu")
				println("Enter a number")

				setting_menu = input.Collector.nextInt()

				switch(settingChoice){

					case 1  :	println("Call setting")

						call_setting_menu = """
						1 Automatic redial
						2 Speed dialing
						3 Call waiting Option
						4 Own number sending
						5 Phone line in use  
						6 Automatic answer
						"""


		println("callsetting Menu")
		println("Choose your choice from the option above")

		int callsettingChoice = inputCollector.nextInt()

		switch(call_setting_choice)
			case 1 :	println("Automatic redial")
			case 2 :	println("Speed dialing")
			case 3 :	println("Call waiting option")
			case 4 :	println("Own number sending")
			case 5 :	println("Phone line in use")
			case 6 :	println("Automatic answer")


	case 2  :	println("Phone setting")

		phone_setting_menu = """
			1 Language
			2 Cell info display
			3 Wecome note  
			4 Network selection  
			5 Light
			"""


		println("phonesetting Menu")
		System.out.println("Choose your choice from the option above")

		phone_setting_choice = inputCollector.nextInt()

		match(phone_setting_choice)
			case 1 :	println("Language")
			case 2 :	println("Cell info display")
			case 3 :	println("Wecome note")
			case 4 :	println("Network selection")
			case 5 :	println("Light")
				

	case 3  :	println("Security setting")

		security_setting_menu = """
		1 PIN code request
		2 Call barring service
		3 Fixed dialling
		4 Losed user group  
		5 Phone security  
		6 Change access code  
		"""

		println("securitysetting Menu")
		println("Choose your choice from the option above")

		security_setting_choice = inputCollector.nextInt()

		match(securitysettingChoice):
			case 1 	:	println("PIN code request")
			case 2 	:	println("Call barring service")
			case 3 	:	println("Fixed dialling")
			case 4 	:	println("Losed user group")
			case 5 	:	println("Phone security")
			case 6 	:	println("Change access code")
		

	case 4  : System.out.println("Restore factory setting")
	
	

	  		case 7  :	println("Call divert")
	    	case 8  :	println("Game")
	       	case 9  :	println("Calculator")
	        case 10 :	println("Reminder")
	      	case 11 :	println("Clock")

		clock_menu = """
		1 Alarm clock 
		2 Clock setting
		3 Date setting
		4 Stopwatch
		5 Countdown timer 
		6 Auto update of date and time 
		"""

		println("clock Menu")
		println("Enter a number")

		matchclockChoice = inputCollector.nextInt()

		match(clockChoice):
			case 1 :	println("Alerm clock")
			case 2 :	println("Clock setting")
			case 3 :	println("Date setting")
			case 4 :	println("Stopwatch")
			case 5 :	println("Countdown timer")
			case 6 :	println("Auto update of date and time")
		
	       	case 12 :	println("Profile")
	      	case 13 :	println("SIM services")