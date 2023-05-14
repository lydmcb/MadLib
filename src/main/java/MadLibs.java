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

  private final String[] verbs = {"lick", "sneak", "dive", "slay", "attack", "sprint"};
    private final String[] actionVerbs = {"throwing", "fighting", "rolling", "growing","swimming","galloping"};
    private final String[] adjectives = {"fierce", "smelly", "strange","feral", "magnificent", "appropriate" };
    private final String[] jobs = {"poet", "lion tamer", "artist", "developer", "firefighter", "sandwich artist" };
    private final String[] animals = {"aardvark", "dolphin", "snail", "lama", "sloth", "dodo bird"};
    private final String[] nouns = {"fire", "bottle", "podcast", "child", "toaster", "shovel"};


    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {
        MadLibs madLibs = new MadLibs();
        madLibs.run();


    }

        public void run () {

            System.out.println(
                    "*******************\n" +
                    "WELCOME TO MADLIBS!\n" +
                    "*******************");
            System.out.println();
            System.out.println("Please respond to the prompts below, if you get stuck just type 'random' and we'll help you out!");
            System.out.println();



            System.out.print("Please enter a verb >>> ");
            String firstVerb = "";
            firstVerb = userInput.nextLine();
            if (firstVerb.equals("random")){
                int choice =((new Random().nextInt(verbs.length)));
                firstVerb = verbs[choice];
            } else {
                firstVerb = firstVerb;
            }


            System.out.print("Now, enter a verb ending in 'ing' >>> ");
            String ingVerb = "";
            ingVerb = userInput.nextLine();
            if (ingVerb.equals("random")){
                int choice = (new Random().nextInt(actionVerbs.length));
                ingVerb = actionVerbs[choice];

            } else {
                ingVerb = ingVerb;
            }


            System.out.print("How about a noun? >>> ");

            String noun = "";
            noun  = userInput.nextLine();
            if (noun.equals("random")){
                int choice = (new Random().nextInt(nouns.length));
                noun = nouns[choice];

            } else {
                noun = noun;
            }



            System.out.print("Let's have a nice, juicy adjective >>> ");
            String adjective = "";
                adjective = userInput.nextLine();
            if (adjective.equals("random")){
                int choice = (new Random().nextInt(adjectives.length));
                adjective = adjectives[choice];
            } else {
                adjective = adjective;
            }



            System.out.print("What's your dream job? >>> ");
            String occupation = "";
                occupation = userInput.nextLine();
            if (jobs.equals("random")){
                int choice = (new Random().nextInt(jobs.length));
                occupation = jobs[choice];

            } else {
                occupation = occupation;
            }



            System.out.print("Tell me about your inner animal >>> ");
            String animal = "";
                animal = userInput.nextLine();
            if (animal.equals("random")){
                int choice = (new Random().nextInt(animals.length));
                animal = animals[choice];

            } else {
                animal = animal;
            }



            System.out.print("One more adjective, please >>> ");
            String secondAdjective = "";
                secondAdjective = userInput.nextLine();
            if (secondAdjective.equals("random")){
                int choice = (new Random().nextInt(adjectives.length));
                secondAdjective = adjectives[choice];

            } else {
                secondAdjective = secondAdjective;
            }



            System.out.print("And another 'ing' verb >>> ");
            String actionVerb = "";
            actionVerb  = userInput.nextLine();
            if (actionVerb.equals("random")){
                int choice = (new Random().nextInt(actionVerbs.length));
                actionVerb = actionVerbs[choice];

            } else {
                actionVerb = actionVerb;
            }



            System.out.print("Big finish! One more noun >>> ");
            String lastNoun = "";
            lastNoun = userInput.nextLine();
            if (lastNoun.equals("random")){
                int choice = (new Random().nextInt(nouns.length));
                lastNoun = nouns[choice];

            } else {
                lastNoun = lastNoun;
            }




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

