package com.novsky.funfacts;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Novsky on 09.06.2016.
 */
public class FactBook {
    String fact;

    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "It is impossible to lick your elbow (busted)",
            "A crocodile can't stick it's tongue out.",
            "A shrimp's heart is in it's head.",
            "A pregnant goldfish is called a twit. (busted?)",
            "More than 50% of the people in the world have never made or received a telephone call.",
            "Rats and horses can't vomit.",
            "If you sneeze too hard, you can fracture a rib.",
            "If you try to suppress a sneeze, you can rupture a blood vessel in your head or neck and die.",
            "If you keep your eyes open by force when you sneeze, you might pop an eyeball out.",
            "Rats multiply so quickly that in 18 months, two rats could have over a million descendants.",
            "Wearing headphones for just an hour will increase the bacteria in your ear by 700 times.",
            "In every episode of Seinfeld there is a Superman somewhere.",
            "The cigarette lighter was invented before the match.",
            "Thirty-five percent of the people who use personal ads for dating are already married.",
            "A duck's quack doesn't echo, and no one knows why.",
            "Most lipstick contains fish scales.",
            "Like fingerprints, everyone's tongue print is different.",
            "Over 75% of people who read this will try to lick their elbow.",
            "Figlet, an ASCII font converter program, stands for Frank, Ian and Glenn's LETters.",
            "Every human spent about half an hour as a single cell.",
            "Every year about 98% of atoms in your body are replaced.",
            "Hot water is heavier than cold.",
            "The radioactive substance, Americanium - 241 is used in many smoke detectors.",
            "Sound travels 15 times faster through steel than through the air.",
            "On average, half of all false teeth have some form of radioactivity.",
            "Seals used for their fur get extremely sick when taken aboard ships.",
            "Sloths take two weeks to digest their food.",
            "Guinea pigs and rabbits can't sweat.",
            "Skunks can accurately spray their smelly fluid as far as ten feet.",
            "Deer can't eat hay.",
            "On average, dogs have better eyesight than humans, although not as colorful.",
            "The lifespan of a squirrel is about nine years.",
            "North American oysters do not make pearls of any value.",
            "Human birth control pills work on gorillas.",
            "Gorillas sleep as much as fourteen hours per day.",
            "A biological reserve has been made for golden toads because they are so rare.",
            "There are more than fifty different kinds of kangaroos.",
            "The female lion does ninety percent of the hunting.",
            "A group of twelve or more cows is called a flink.",
            "Of all the words in the English language, the word ’set’ has the most definitions!",
            "\"Rhythm\" is the longest English word without a vowel.",
            "In 1386, a pig in France was executed by public hanging for the murder of a child",
            "Human thigh bones are stronger than concrete.",
            "You can’t kill yourself by holding your breath",
            "There is a city called Rome on every continent.",
            "It’s against the law to have a pet dog in Iceland.",
            "Your heart beats over 100,000 times a day.",
            "Right handed people live, on average, nine years longer than left-handed people",
            "Your ribs move about 5 million times a year, everytime you breathe!",
            "The elephant is the only mammal that can’t jump!",
            "One quarter of the bones in your body, are in your feet!",
            "Women blink nearly twice as much as men.",
            "Adolf Hitler was a vegetarian, and had only ONE testicle.",
            "Months that begin on a Sunday will always have a \"Friday the 13th.\"",
            "Coca-Cola would be green if colouring weren’t added to it.",
            "On average a hedgehog’s heart beats 300 times a minute.",
            "More people are killed each year from bees than from snakes.",
            "More people are allergic to cow’s milk than any other food.",
            "Camels have three eyelids to protect themselves from blowing sand.",
            "Earth is the only planet not named after a god.",
            "It’s against the law to burp, or sneeze in a church in Nebraska, USA.",
            "You’re born with 300 bones, but by the time you become an adult, you only have 206.",
            "Some worms will eat themselves if they can’t find any food!",
            "Dolphins sleep with one eye open!",
            "It is impossible to sneeze with your eyes open",
            "The worlds oldest piece of chewing gum is 9000 years old!",
            "The longest recorded flight of a chicken is 13 seconds",
            "Slugs have 4 noses.",
            "Owls are the only birds who can see the colour blue.",
            "A man named Charles Osborne had the hiccups for 69 years!",
            "A giraffe can clean its ears with its 21-inch tongue!",
            "The average person laughs 10 times a day!",
            "An ostrich’s eye is bigger than its brain",
            "A pig's orgasm lasts 30 minutes.",
            "A cockroach will live for weeks without its head before it starves to death",
            "Banging your head against a wall uses 150 calories a hour",
            "The catfish has over 27,000 taste buds.",
            "Some lions mate over 50 times a day.",
            "Butterflies taste with their feet.",
            "The strongest muscle in the body is the tongue.",
            "A cat's urine glows under a black light.",
            "Starfish have no brains.",
            "Polar bears are left-handed.",
            "Humans and dolphins are the only species that have sex for pleasure.",
            "In France, it is legal to marry a dead person (Contributed by Loes - 16 May 2015)"
    };

    public String getFact() {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
