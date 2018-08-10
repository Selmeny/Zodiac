package com.dicoding.paul.zodiac;

import java.util.ArrayList;

public class ZodiacData {
    public static String [][] data = new String[][] {
            {"Aquarius", "January 20 - February 18", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Aquarius.svg/350px-Aquarius.svg.png",
                            "Aquarius, the Water Bearer, comes from the story of the Deucalion Flood. " +
                            "Zeus poured all the waters from the heavens out onto the Earth to wash away and " +
                            "destroy the wicked and evil men. This brought forth a fresh start for Deucalion " +
                            "and his wife Pyrrha, who threw stones over their shoulders to create a new race " +
                            "of men and women. This sign is also associated with Ganymede, the cupbearer of Olympus.",
                            "Water Bearer", "Air","Saturn (ancient), Uranus (modern)"},
            {"Pisces", "February 19 - March 20", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Pisces.svg/189px-Pisces.svg.png",
                            "Pisces is the fishes. In Greek Mythology, these two fish were Aphrodite and Eros. " +
                            "They were walking along the Euphrates River when Typhon appeared. They were scared and " +
                            "unable to run, so they called upon Zeus for help. He turned them into two fish, and they " +
                            "jumped in the river and escaped. Athena placed the fish among the stars and they became the constellation of Pisces.",
                            "Fish", "Water", "Jupiter (ancient), Neptune (modern)"},
            {"Aries", "March 21 - April 19", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Aries.svg/248px-Aries.svg.png",
                            "King Athamas of Boeotia married the nymph Nephele at Hera's command. She was a nymph made " +
                            "from a cloud in Hera's image to trap the centaur, Ixion. The couple had two children; " +
                            "a son named Phrixus and a daughter named Helle. After a while, Athamas grew tired of " +
                            "Nephele and left her. Athamas then remarried, and his second wife was Ino, the daughter of Cadmus. " +
                            "She also gave him children -- two sons named Learches and Melicertes. Nephele was angry and asked " +
                            "Hera to assist in avenging Athamas' desertion. While this was going on, Zeus asked Ino and Athamas " +
                            "to care for Dionysus, as he wanted to keep him a secret from Hera. Hera eventually punished them for " +
                            "this by making them go mad. Ino was terribly jealous of Athamas and Nephele's children and plotted their deaths. " +
                            "Ino tricked Athamas into attempting to sacrifice Phrixus, but he was saved by Heracles who sent a golden " +
                            "ram to carry him to Colchis. Helle grabbed hold of the winged ram, but fell to her death between the " +
                            "Mediterranean and Black Sea when she lost her hold. The strait, to this day, " +
                            "is named after her -- the Hellespont (Dardanelles). Upon reaching Colchis, Phrixus sacrificed the " +
                            "golden ram to Zeus, who in turn placed the ram's image among the stars in honor of it's heroism.",
                            "Ram", "Fire", "Mars"},
            {"Taurus", "April 20 - May 20", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Taurus.svg/225px-Taurus.svg.png",
                            "Taurus, comes from the story of Europa. She was the daughter of King Agenor of Phoenicia and Telephassa. " +
                            "Europa became the object of Zeus' affections, and he appeared to her as a beautiful, white bull at " +
                            "the Phoenician waterside. The princess was awestruck by the beauty of the bull and walked over to pet it. " +
                            "She then climbed upon his back at which Zeus jumped into the water and carried her across the sea to Crete. " +
                            "He took the form of an eagle there and ravished her. She eventually bore him three sons whose names were Minos, " +
                            "Rhadamanthus, and Sarpedon. Zeus placed the image of the bull in the heavens. A group of stars called the " +
                            "Hyades make up Taurus' head, and another group of stars called the Pleiades make up part of the bull, as well. " +
                            "The Pleiades are a bright galactic cluster and the brightest seven make up their own constellation.",
                            "Bull", "Earth", "Venus (ancient), Earth (modern)"},
            {"Gemini", "May 21 - June 20", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Gemini.svg/229px-Gemini.svg.png",
                            "The twins were Castor and Polydeuces (Pollux). Together, they were known as the Dioscuri. " +
                            "Their sisters were Helen and Clytemnestra. They were the sons of Leda and Zeus and Tyndareus. " +
                            "Castor and Pollux were half-brothers. Leda was married to King Tyndareus of Sparta. " +
                            "At this time, she was also seduced by Zeus, so the father's of both children were uncertain. " +
                            "The Discouri were inseperable and grew closer with age. Castor was a famous horsetamer and Pollux, a superb boxer." +
                            " When Castor was killed during a battle, Pollux was inconsolable and gave up his own life to be with his brother. " +
                            "Zeus rewarded their love by placing their images among the stars, where they shine side by side. " +
                            "Two lines of stars makes up this constellation, and two bright stars at the top of each line represent Castor and Pollux's heads.",
                            "Twins", "Air", "Mercury"},
            {"Cancer", "June 21 - July 22", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Cancer.svg/300px-Cancer.svg.png",
                            "Cancer was a creature sent by Hera to destroy Heracles, one of Zeus' illegitimate children whom she hated the most. " +
                            "This giant crab latched on to Heracles foot as he was battling the Hydra. He already had his hands full " +
                            "as everytime he cut off one of the Hydra's heads, two more grew in it's place. Before finishing off the Hydra, " +
                            "he turned his attention to the crab and crushed it. As a reward for the crab's obedience and sacrifice, Hera placed it's image among the stars.",
                            "Crab", "Water", "Moon"},
            {"Leo", "July 23 - August 22", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Leo.svg/184px-Leo.svg.png",
                            "Leo had to do with the labors of Heracles. On his first task, he was sent to kill the Nemean Lion. " +
                            "This lion was savage and fearless as he couldn't be harmed by weapons. After attempting to " +
                            "kill the lion with arrows, which just bounced right off, Heracles wrestled the lion and strangled " +
                            "it to death. He didn't go away unharmed, though; the lion managed to bite off one of Heracles' fingers. " +
                            "After the lion was dead, Heracles skinned it with it's own claws and made some wonderful armor from the pelt and jaw. " +
                            "The constellation Leo is said to honor the bravery of battle between the Nemean Lion and Heracles.",
                            "Lion", "Fire", "Sun"},
            {"Virgo", "August 23 - September 22", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Virgo.svg/194px-Virgo.svg.png",
                            "Virgo is the Goddess of Innocence and Purity, Astraea. According to the creation myth, Zeus sent Pandora " +
                            "down to Earth as a punishment to man. Because of her curiosity, she opened the box the gods had warned " +
                            "her not to, and let the plagues of hate, envy, sickness, etc. out into the world. Of course, Hope did not " +
                            "escape, but the Earth was just unbearable. One by one, the gods returned to the heavens to live. Astraea was the " +
                            "last to leave. She became the constellation Virgo, and according to legend, when the Golden Age comes again, Astraea will return to the Earth.",
                            "Virgin", "Earth", "Mercury (ancient), Ceres (modern)"},
            {"Libra", "September 23 - October 22", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Libra.svg/281px-Libra.svg.png",
                            "Libra represent balance and justice, harmony and equilibrium. In Greek Mythology, the Goddess of Justice is Themis. " +
                            "She is usually seen as a woman who is blindfolded holding the scale in her hands. She is the mother of Astraea. " +
                            "The constellations of Virgo and Libra shine side by side in the celestial sky. She is also said to return with her daughter when the Golden Age comes again.",
                            "Scales", "Air", "Venus"},
            {"Scorpio", "October 23 - November 21", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Scorpio.svg/214px-Scorpio.svg.png",
                            "Scorpio, in Greek Mythology, comes from the story of Orion. This giant of a man was the son of Poseidon and Euryale, " +
                            "and was also said to be the most handsome man alive. He and Artemis were hunting partners. " +
                            "This made her brother, Apollo, jealous. He went to Mother Earth and asked her to create a giant scorpion, " +
                            "which then stung and killed Orion. Zeus placed both of them in the heavens as a constellation." +
                            " Scorpion is a pretty big constellation. The bright star, Antares, is the Scorpion's heart.",
                            "Scorpio", "Water", "Mars (ancient), Pluto (modern)"},
            {"Sagittarius", "November 22 - December 21", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Sagittarius.svg/235px-Sagittarius.svg.png",
                            "Sagittarius is the centaur, Chiron. Chiron was unlike the other brutal Centaurs. " +
                            "He was kind and taught medicine, hunting, music and prophecy. He was a wonderful teacher to many great heroes, " +
                            "such as Jason and Achilles, and a friend to Heracles. The latter was the one who accidentally killed the Chiron. " +
                            "While hunting a boar, Heracles shot Chiron in the knee with one of his poisoned arrows. Being an immortal, " +
                            "Chiron could not die, but Heracles promised that he would help him. This is were Prometheus comes in. " +
                            "Heracles happened upon him and discovered that he couldn't be freed unless someone took his place. " +
                            "Chiron agreed and Prometheus was set free. Chiron was allowed to die and Zeus placed his image among the stars as reward of his noble character.",
                            "Archer", "Fire", "Jupiter"},
            {"Capricorn", "December 22 - January 19", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Capricorn.svg/246px-Capricorn.svg.png",
                            "Capricorn is usually depicted as a goat or sea-goat, but in Greek Mythology he is the God Pan. " +
                            "Pan ruled over forests and woodlands, flocks and shepherds. From the waist down he was a " +
                            "goat and also had the ears and horns of a goat, and from the waist up he was a man. " +
                            "He was a horny little guy and was always trying to catch a nymph, who would flee because of his appearance. " +
                            "He, eventually, became the God of Nature, and some of his qualities, such as sexuality and love of nature " +
                            "have become part of the character of people born under this sign. Another story is that the goat nymph, Amalthea, " +
                            "who suckled Zeus as an infant, was placed among the stars as the constellation Capricorn by Zeus in gratitude.",
                            "Fish-Goat", "Earth", "Saturn"}
    };

    public static ArrayList<Zodiac> getListData() {
        Zodiac zodiac;
        ArrayList<Zodiac> list = new ArrayList<>();
        for (String[] aData : data) {
            zodiac = new Zodiac();
            zodiac.setName(aData[0]);
            zodiac.setRemarks(aData[1]);
            zodiac.setPhoto(aData[2]);
            zodiac.setMyth(aData[3]);
            zodiac.setSymbol(aData[4]);
            zodiac.setElement(aData[5]);
            zodiac.setRuler(aData[6]);

            list.add(zodiac);
        }
        return list;
    }
}
