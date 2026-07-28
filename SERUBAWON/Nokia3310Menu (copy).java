package nokia;

import java.util.Scanner;

public class Nokia3310Menu {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        String mainMenu = """
                1  Phone book
                2  Message
                3  Chat
                4  Call register
                5  Tones
                6  Settings
                7  Call divert
                8  Games
                9  Calculator
                10 Reminder
                11 Clock
                12 Profile
                13 Sim services
                """;

        System.out.println(mainMenu);
        int mainMenuChoice = inputCollector.nextInt();

        switch (mainMenuChoice) {

            
           case 1:System.out.println("Phone book");

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
                case 8: System.out.println("Options"); break;
                default : System.out.println("Invalid input");
                }
                break
                        String optionsMenu = """
                                1 Type of view
                                2 Memory status
                                """;

                        System.out.println(optionsMenu);
                        int optionsMenuChoice = inputCollector.nextInt();

                        switch (optionsMenuChoice) {
                        case 1 : System.out.println("Type of view"); break;
                        case 2 : System.out.println("Memory status"); break;
                        default: System.out.println("Invalid input"); break;
                        }
                        break;

                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;

            case 2:
                System.out.println("Message Menu");

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

                    case 1:
                        System.out.println("Write messages");
                        break;

                    case 2:
                        System.out.println("Inbox");
                        break;

                    case 3:
                        System.out.println("Outbox");
                        break;

                    case 4:
                        System.out.println("Picture messages");
                        break;

                    case 5:
                        System.out.println("Templates");
                        break;

                    case 6:
                        System.out.println("Smileys");
                        break;

                    case 7:
                        System.out.println("Message Settings");

                        String messageSettingsMenu = """
                                1 Set 1
                                2 Common
                                3 Call
                                4 Call register
                                """;

                        System.out.println(messageSettingsMenu);
                        int messageSettingsChoice = inputCollector.nextInt();

                        switch (messageSettingsChoice) {

                        case 1 : System.out.println("Set 1"); break;
                        case 2 : System.out.println("Common"); break;
                        case 3 : System.out.println("Call"); break;
                        case 4 : System.out.println("Call register")
                        }
                        
                        

                        	 String messageSet1Menu = """
                                        1 Message center number
                                        2 Message sent as
                                        3 Message validity
                                        """;

                                System.out.println(messageSet1Menu);
                                int messageSet1Choice = inputCollector.nextInt();

                                switch (messageSet1Choice) {
                                    case 1:
                                        System.out.println("Message center number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                }
                                break;

                            case 2:
                                System.out.println("Common");

                                String messageCommonMenu = """
                                        1 Delivery reports
                                        2 Reply via same centre
                                        3 Character support
                                        """;

                                System.out.println(messageCommonMenu);
                                int messageCommonChoice = inputCollector.nextInt();

                                switch (messageCommonChoice) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                }
                                break;

                            default:
                                System.out.println("Invalid input");
                        }
                        break;

                    case 8:
                        System.out.println("Info services");
                        break;

                    case 9:
                        System.out.println("Voice mailbox number");
                        break;

                    case 10:
                        System.out.println("Service command editor");
                        break;

                    default:
                        System.out.println("Invalid input");
                }
                break;

            case 3:
                System.out.println("Chat");
                break;

            case 4:
                System.out.println("Call register");
                break;

            case 5:
                System.out.println("Tones");
                break;

            case 6:
                System.out.println("Settings");
                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Reminder");
                break;

            case 11:
                System.out.println("Clock");
                break;

            case 12:
                System.out.println("Profile");
                break;

            case 13:
                System.out.println("Sim services");
                break;

            default:
                System.out.println("Invalid input");

                
			}
			case 8 : System.out.println("Info services"); break;
			case 9 : System.out.println("Voice mailbox number"); break;
			case 10 : System.out.println("Service command editor");
			default : System.out.println("Invalid input");
		}
			System.out.println(Show call duration Menu);
			int showcalldurationChoiceMenu  = inputCollector.nextInt();

			case 2 : System.out.println("show call duration Menu");
			String showcalldurationMenu = """
		 	
		 	1 Last call duration
		 	2 All call duration 
		 	3 Received call duration 
		 	4 Dialled call duration
		 	5 Clear timers  
		 		""";
		 	System.out.println("showcalldurationMenu");
			int showcalldurationMenu = inputCollector.nextInt();
				switch (showcalldurationMenu){

			case 1 : System.out.println("Last call duration"); break;
			case 2 : System.out.println("All call duration"); break;
			case 3 : System.out.println("Received call duration"); break;
			case 4 : System.out.println("Dialled call duration"); break;
			case % : System.out.println("Clear timers"); break;
			default : System.out.println("Invalid input");
				}


			System.out.println(Show call cost Menu);
			int showcallcostChoiceMenu  = inputCollector.nextInt();

			case 2 : System.out.println("show call cost Menu");
			String showcallcostMenu = """ 

			1 Last call Cost  
			2 All call cost  
			3 Clear counter
				""";
			System.out.println("showcallcostMenu");
			int showcallcostMenu = inputCollector.nextInt();
				switch (showcallcostMenu){

			case 1 : System.out.println("Last call cost"); break;
			case 2 : System.out.println("All call cost"); break;
			case 3 : System.out.println("Clear counter"); break;
			default: System.out.println("Invalid input");
				}

			System.out.println(Show call cost setting Menu);
			int showcallcostsettingChoiceMenu  = inputCollector.nextInt();

			case 2 : System.out.println("show call cost setting Menu");
			String showcallcostsettingMenu = """ 

			1 Call cost limit
			2 Show cost in
				""";

			System.out.println("showcallcostsettingMenu");
			int showcallcostsettingMenu = inputCollector.nextInt();
				switch (showcallcostsettingMenu){

			case 1 : System.out.println("Call cost limit"); break;
			case 2 : System.out.println("Show cost in"); break;
				}
			System.out.println(Show call cost setting Menu);
			int showcallcostsettingChoiceMenu  = inputCollector.nextInt();

			case 2 : System.out.println("show call cost setting Menu");
			String showcallcostsettingMenu = """ 



			case 3  : System.out.println("Chat"); break;
			case 4  : System.out.print("Call register"); break;
			case 5  : System.out.print("Tones"); break;
			case 6  : System.out.println("Settings"); break;
			case 7  : System.out.println("Call divert"); break;
			case 8  : System.out.println("Games"); break;
			case 9  : System.out.println("Calculator"); break;
			case 10 : System.out.println("Reminder"); break; 
			case 11 : System.out.println("Clock"); break;
			case 12 : System.out.println("Profile"); break;
			case 13 : System.out.println("Sim services"); break;
			default : System.out.println("Invalid input");
		}
		

	}

}
        }
    }
}