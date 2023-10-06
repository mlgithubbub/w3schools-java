package Java02Classes.Java23RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Create a RegEx pattern
        Pattern myRegexPattern = Pattern.compile("me", Pattern.CASE_INSENSITIVE);

        //Search for the pattern with the matcher method in a string
        Matcher myMatcher = myRegexPattern.matcher("Hi, there! It's me, Bob.");

        //Return a boolean value for the pattern's presence
        boolean matchFound = myMatcher.find();

        if (matchFound){
            System.out.println("Bob is me.");
        } else {
            System.out.println("Bob is someone else.");
        }

        //Use RegEx patterns

        //Find one of several characters
        Pattern myRegex1 = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE );
        Matcher myMatcher1 = myRegex1.matcher("Hmpf!");
        boolean matchFound1 = myMatcher1.find();
        if (matchFound1){
            System.out.println("This word has at least one vowel.");
        } else {
            System.out.println("This word, strangely, has no vowels.");
        }

        //Find one of NOT several characters
        Pattern myRegex2 = Pattern.compile("[^aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher2 = myRegex2.matcher("Hmpf!");
        boolean matchFound2 = myMatcher2.find();
        String result = matchFound2? "This word, strangely, has no vowels.": "This word has at least one vowel.";
        System.out.println(result);

        //Find one character in a range
        Pattern myRegex3 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher3 = myRegex3.matcher("12462718462178064104");
        boolean matchFound3 = myMatcher3.find();
        String result1 = matchFound3? "This string has letters in it" : "This string has no letters in it";
        System.out.println(result1);

        //Use metacharacters

        //Use |
        Pattern myRegex4 = Pattern.compile("dog|cat|hamster");
        Matcher myMatcher4 = myRegex4.matcher("I have a pet dog.");
        String result2 = myMatcher4.find()? "You have a dog, cat or hamster." : "You don't have a dog, cat or hamster.";
        System.out.println(result2);

        //Use .
        Pattern myRegex5 = Pattern.compile(".");
        String result3 = myRegex5.matcher("").find()? "This string contains a character" : "This string " +
                "doesn't contain a character";
        System.out.println(result3);

        //Use ^
        Pattern myRegex6 = Pattern.compile("^Hi");
        String result4 = myRegex6.matcher("Hi, I'm Susie.").find()? "Susie said hi": "Susie didn't say hi";
        System.out.println(result4);

        //Use $
        Pattern myRegex7 = Pattern.compile("$.");
        String result5 = myRegex7.matcher("This is a sentence.").find()? "The sentence ended with a period": "You " +
                "forgot to put a period at the end of your sentence";
        System.out.println(result5);

        //Use \d"
        Pattern myRegex8 = Pattern.compile("\\d");
        String result6 = myRegex8.matcher("abcdefghijklmnop1").find()? "There is a digit in this string.": "There are" +
                " " +
                "no digits in this string";
        System.out.println(result6);

        //Use \s
        Pattern myRegex9 = Pattern.compile("\\s");
        String result7 = myRegex9.matcher("fhsflheif fiehrei").find()? "The string has spaces": "The string has no " +
                "spaces";
        System.out.println(result7);

        //Use \b
        Pattern myRegex10 = Pattern.compile("boop\\b");
        String result8 = myRegex10.matcher("boop....boop").find()? "Boop at beginning or end":"Boop not at beginning " +
                "or end";
        System.out.println(result8);

        //Use \\uxxxx
        Pattern myRegex11 = Pattern.compile("\\u1345");
        System.out.println("\u1345");
        String result9 = myRegex11.matcher("String contains ፅ").find()? "String contains ፅ":"String doesn't contain ፅ";
        System.out.println(result9);

        //Use quantifiers

        //Use n+
        Pattern myRegex12 = Pattern.compile("5+");
        String result10 = myRegex12.matcher("hsjfkheo5").find()? "At least one 5": "No 5's";
        System.out.println(result10);

        //Use n*
        Pattern myRegex13 = Pattern.compile("5*");
        String result11 = myRegex13.matcher("There zero fives here").find()? "There are zero or more 5's": "There are" +
                " not zero or more fives";
        System.out.println(result11);

        //Use n{x}
        Pattern myRegex14 = Pattern.compile("5{5}");
        String result12 = myRegex14.matcher("5555").find()? "Yay, 5 fives in a row!": "Aw, man, not enough fives in a" +
                " row";
        System.out.println(result12);

        //Use n{x-y}
        Pattern myRegex15 = Pattern.compile("z{10,20}");
        String result13 = myRegex15.matcher("zzzzzzzz").find()? "Yeah, got enough sleep": "Yawn, still sleepy";
        System.out.println(result13);

        //Use n{x,}
        Pattern myRegex16 = Pattern.compile("m{10,}");
        String result14 = myRegex16.matcher("mmmmmmmm").find()? "Mmm, yummy": "Bleh, yuck";
        System.out.println(result14);


    }
}
