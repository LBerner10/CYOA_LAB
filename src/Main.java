import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RESET = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);

        String current_room;
        System.out.println("""
                \s
                            o x o x o x o . . .
                          o      _____            _______________ ___=====__T___
                        .][__n_n_|DD[  ====_____  |    |.\\/.|   | |   |_|     |_
                       >(________|__|_[_________]_|____|_/\\_|___|_|___________|_|
                       _/oo OOOOO oo`  ooo   ooo   o^o       o^o   o^o     o^o
                 -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-
                \s
                You missed your flight and are now on a train platform, there is a train that is allowing people to get on for free to your city. You may enter:
                1. Passenger Cabin
                State the name or the number of the room you wish to enter in the next line (the casing does not matter):""");

        current_room = scanner.nextLine();

        if ("Passenger Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
            System.out.println("""
                    \s
                    You are now in the passenger cabin, which has a door to the rear and front of the train, towards the front is
                    the conductor's cabin, and to the rear is the freight cabin. In the cabin theirs a bunch of rooms in which you can
                    go sit, which look very comfortable. You may enter or do:
                    1. Conductor's Cabin
                    2. Freight Cabin
                    3. Go find a seat
                    State the name or number of the room / action you wish to enter in the next line:""");
            current_room = scanner.nextLine();

            //conductor's Cabin//
            if ("Conductor's Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                System.out.println("""
                        \s
                        You entered the door to the front of the train and are now in the Conductor's Cabin. In the cabin theres a bunch of controls
                        that you don't know their function for. Fortunately, the conductor is allowing you to look around, and when you do there is a
                        door even further up allowing you to see the engine, or you can go look at the coal room inside the cabin. You may enter:
                        1. Engine Room
                        2. Coal Room
                        State the name or the number of the room you wish to enter in the next line:""");
                current_room = scanner.nextLine();

                //Engine Room//
                if ("Engine Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("""
                    \s
                    You entered the door to the front are now looking at the engine. There isn't much to do in here, so you look around
                    and see not much as most of it is blocked off, you walk back and just continue your day.""");

                    //Coal Room//
                } else if ("Coal Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println(ANSI_RED + """
                            \s
                                                                      ___    A
                                                                      | |   {*}
                                                                      | |  __V__
                                                                      |_|o_|%%%|0_
                                                                         |       |
                                                                         |       |
                                                                         |_______|""" + ANSI_RESET + """
                            \s
                            OH NO! You look around the cabin, and see where the coal is being stored. you pick up a piece of coal, and the
                            lighter in your pocket falls, lighting some of the coal. After a minute the cabin blows up, and the world
                            fades black.""");

                } else {
                    System.out.println(ANSI_RED + "\nThe room or number you inputted is incorrect, please try again!");
                }

                //Freight Cabin//
            } else if ("Freight Cabin".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                System.out.println("""
                        \s
                        You entered the door to the rear, and are now in the freight cabin. Theres a kitchen handing out snacks, and
                        farther to the rear of the train you see a door leading to the caboose. Besides that, there is not much in the
                        room. You may enter:
                        1. Kitchen room
                        2. Caboose
                        State the name or number of the room you wish to enter in the next line:""");
                current_room = scanner.nextLine();

                //Kitchen Room//
                if ("Kitchen Room".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("""
                    \s
                    You get in line to get some snacks, and are now in the kitchen room. After waiting for what seems like forever, watching
                    chefs make food for the ride with a bunch of steam filling up the room, you finally get snacks. You look at what you got\s
                    and it is saltine crackers and water. After that you go about your day.""");

                    //Caboose//
                } else if ("Caboose".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println("""
                        \s
                        OH NO! You go through the door to the rear, and cross over the coupling to get their. You manage to get on to the caboose, but
                        you broke the coupling with out knowing. After the train starts to move, you are left stranded somewhere you aren't familiar
                        with.""");

                } else {
                    System.out.println(ANSI_RED + "\nThe room or number you inputted is incorrect, please try again!");
                }

                //Go Find a seat//
            } else if ("Go find a seat".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 3) {
                System.out.println("""
                        \s
                        You are now sitting at a table with a window with a nice view, and really comfortable chairs. You may:
                        1. Take a nap
                        2. Enjoy the view
                        State the name of the room you wish to enter in the next line:""");
                current_room = scanner.nextLine();

                //Take a nap//
                if ("Take a nap".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 1) {
                    System.out.println("""
                    \s
                    You are really tired from the day, so you lie on your side on the cushion. You see the world fade away
                    and when you wake up, you missed your destination to get back home, and are now in a completely different country.""");

                    //Enjoy teh view//
                } else if ("Enjoy the view".equalsIgnoreCase(current_room) || Integer.parseInt(current_room) == 2) {
                    System.out.println(ANSI_GREEN + """
                            \s
                                .                  .-.    .  _   *     _   .
                                       *          /   \\     ((       _/ \\       *    .
                                     _    .   .--'\\/\\_ \\     `      /    \\  *    ___
                                 *  / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ *
                                   /    \\  /    .'   _/  /  \\  *' /    \\/  \\/ .`'\\_/\\   .
                              .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _
                                 /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\
                               /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\
                              /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.
                            @/        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\%""");
                    System.out.print(ANSI_BLUE + """
                            @&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%
                            @88:::&(&8&&8:::::%&`.~-_~~-~~_~-~_~-~~=.'@(&%::::%@8&8)::&#@8::::
                            `::::::8%@@%:::::@%&8:`.=~~-.~~-.~~=..~'8::::::::&@8:::::&8:::::'
                             `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'
                            """);
                    System.out.println(ANSI_RESET + """
                            Congratulations! You look outside the window, and enjoy the views of the lovely mountains, river,
                            and nature. You can't wait to see where you will end up, but you have a feeling its going to be good.""");

                } else {
                    System.out.println(ANSI_RED + "\nThe room or number you inputted is incorrect, please try again!");
                }

            } else {
                System.out.println(ANSI_RED + "\nThe room or number you inputted is incorrect, please try again!");
            }

        } else {
            System.out.println(ANSI_RED + "\nThe room or number you inputted is incorrect, please try again!");
        }
    }
}
