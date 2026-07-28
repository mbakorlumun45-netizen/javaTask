print("main menu")
print("select option")

main_menu = """
	1	Phone book
	2	Messages
	3	Chat 
	4	Call register
	5	Tones 
	6	Settings
	7	Call divert
	8	Games
	9	Calculator
	10	Reminder
	11	Clock
	12	Profiles
	13	SIM services
"""
	
print(main_menu)
main_menu_choice = int(input("Enter a number: "))

match main_menu_choice:		
	case 1:
		print("phonebook")
	
		phonebook_menu_choice = """	
			1	Search
			2	Service Nos
			3	Add Name
			4	Erase
			5	Edit
			6	Assign tone
			7	Send b'card
			8	Options
			9	Speed dials
			10	Voice tags
		"""
		print(phonebook_menu)
		main_menu_choice = int(input("Enter a number"))

		match main_menu_choice_option:		
			case 1:
				print("Search")
			case 2:
				print("Service Nos")
			case 3:
				print("Add Name")
			case 4: 
				print("Erase")
			case 5: 
				print("Edit")
			case 6:
			 	print("Assign tone")
			case 7:
			 	print("Send b'card")
			case 8:
			 	print("Options")
			case 9: 
				print("Speed dials")
			case 10:
			 	print("Voice tags")
			
 
	case 2 :
	 	print("message")
	massage_main_menu = int(input("Enter number"))
		
		message_menu = """
			1	Set1
			2	Common
			3	Chat
			4	Call register
			5	Show call duration
			6	Show call cost
			7	Call cost setting
			8	Prepaid setting
				"""
						
		print("messagemain menu")
		message_menu_choice = int(input(Enter number))
		match message_menu_option:
				
			case 1:
				print("set1")
			case 2:
				print("Common")
			case 3:
				print("Chat")
			case 4:
				print("Call register")
			case 5:
				print("Show call duration")
			case 6:
				print("Show call cost")
			case 7:
				print("Call cost setting")
			case 8:
				print("Prepaid setting")
			
		
			
