import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs extends Random {

    private final Scanner userInput = new Scanner(System.in);

  /*  private final String[] verbs = {"lick", "sneak", "dive", "slay", "attack", "sprint"};
    private final String[] actionVerbs = {"throwing", "fighting", "rolling", "growing","swimming","galloping"};
    private final String[] adjectives = {"fierce", "smelly", "strange","feral", "magnificent", "appropriate" };
    private final String[] jobs = {"poet", "lion tamer", "artist", "developer", "firefighter", "sandwich artist" };
    private final String[] animals = {"aardvark", "dolphin", "snail", "lama", "sloth", "dodo bird"};
    private final String[] nouns = {"fire", "bottle", "podcast", "child", "toaster", "shovel"};*/


    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {
        MadLibs madLibs = new MadLibs();
        madLibs.run();

      // Random random = new Random();

    }

        public void run () {

            System.out.println(
                    "*******************\n" +
                    "WELCOME TO MADLIBS!\n" +
                    "*******************");
            System.out.println();
            System.out.println("Please respond to the prompts below, if you get stuck just hit enter and we'll help you out!");
            System.out.println();



            System.out.print("Please enter a verb >>> ");
           // if(userInput.equals("")){
              //  String firstVerb = random.nextInt(verbs.length);
          //  } else {
            String firstVerb = userInput.nextLine();


            System.out.print("Now, enter a verb ending in 'ing' >>> ");
            String ingVerb = userInput.nextLine();


            System.out.print("How about a noun? >>> ");
            String noun = userInput.nextLine();


            System.out.print("Let's have a nice, juicy adjective >>> ");
            String adjective = userInput.nextLine();


            System.out.print("What's your dream job? >>> ");
            String occupation = userInput.nextLine();


            System.out.print("Tell me about your inner animal >>> ");
            String animal = userInput.nextLine();


            System.out.print("One more adjective, please >>> ");
            String secondAdjective = userInput.nextLine();


            System.out.print("And another 'ing' verb >>> ");
            String actionVerb = userInput.nextLine();


            System.out.print("Big finish! One more noun >>> ");
            String lastNoun = userInput.nextLine();



            String quotes = "'My name is " + firstVerb + "; learn it well, for it`s the " + ingVerb + " sound of your " + noun + ".'\n" +
                    "'I told Killian I`d be " + adjective + ". I wouldn`t want to be a/an " + occupation + ".'\n" +
                    "'I`m a cybernetic " + animal + ": living tissue over a/an " + secondAdjective + " endoskeleton.'\n" +
                    "'If things have gone wrong, I`m " + actionVerb + " myself, and you`ve got a wet " + lastNoun + " wrapped around your head.'\n" +
                    "- Arnold Schwarzenegger";

           
            System.out.println(quotes);




            /*
             * EXTRA:
             * Create a random word generator to allow the user to let the program
             * select a random word.
             */
        }
    }

