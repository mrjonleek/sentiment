package com.redhat.hackfest.utils;

public class TagGenerator {

    // private static final Set<String> used = new HashSet<>();

    public static String generate() {
        int i = 0;
        String tag = null;
        while (i < 100) {
            int random2 = (int) Math.floor(Math.random() * 10); // NOUNS.length);
            tag = NOUNS[random2];

            return tag;

            // if (!used.add(tag)) {
            // i++;
            // } else {
            // return tag;
            // }
        }

        return tag;
    }

    private static final String[] NOUNS = {"head", "crest", "crown", "tooth", "fang", "horn",
            "frill", "skull", "bone", "tongue", "throat", "voice", "nose", "snout", "chin", "eye",
            "sight", "seer", "speaker", "singer", "song", "chanter", "howler", "chatter",
            "shrieker", "shriek", "jaw", "bite", "biter", "neck", "shoulder", "fin", "wing", "arm",
            "lifter", "grasp", "grabber", "hand", "paw", "foot", "finger", "toe", "thumb", "talon",
            "palm", "touch", "racer", "runner", "hoof", "fly", "flier", "swoop", "roar", "hiss",
            "hisser", "snarl", "dive", "diver", "rib", "chest", "back", "ridge", "leg", "legs",
            "tail", "beak", "walker", "lasher", "swisher", "carver", "kicker", "roarer", "crusher",
            "spike", "shaker", "charger", "hunter", "weaver", "crafter", "binder", "scribe", "muse",
            "snap", "snapper", "slayer", "stalker", "track", "tracker", "scar", "scarer", "fright",
            "killer", "death", "doom", "healer", "saver", "friend", "foe", "guardian", "thunder",
            "lightning", "cloud", "storm", "forger", "scale", "hair", "braid", "nape", "belly",
            "thief", "stealer", "reaper", "giver", "taker", "dancer", "player", "gambler",
            "twister", "turner", "painter", "dart", "drifter", "sting", "stinger", "venom", "spur",
            "ripper", "swallow", "devourer", "knight", "lord", "queen", "king", "master", "prince",
            "princess", "duke", "samurai", "ninja", "knave", "sage", "wizard", "witch", "warlock",
            "warrior", "jester", "paladin", "bard", "trader", "sword", "shield", "knife", "dagger",
            "arrow", "bow", "fighter", "bane", "follower", "leader", "scourge", "watcher", "cat",
            "panther", "tiger", "cougar", "puma", "jaguar", "ocelot", "lynx", "lion", "leopard",
            "ferret", "weasel", "wolverine", "bear", "raccoon", "dog", "wolf", "kitten", "puppy",
            "cub", "fox", "hound", "terrier", "coyote", "hyena", "jackal", "pig", "horse", "donkey",
            "stallion", "mare", "zebra", "antelope", "gazelle", "deer", "buffalo", "bison", "boar",
            "elk", "whale", "dolphin", "shark", "fish", "minnow", "salmon", "ray", "fisher",
            "otter", "gull", "duck", "goose", "crow", "raven", "bird", "eagle", "raptor", "hawk",
            "falcon", "moose", "heron", "owl", "stork", "crane", "sparrow", "robin", "parrot",
            "cockatoo", "carp", "lizard", "gecko", "iguana", "snake", "python", "viper", "boa",
            "condor", "vulture", "spider", "fly", "scorpion", "heron", "oriole", "toucan", "bee",
            "wasp", "hornet", "rabbit", "bunny", "hare", "brow", "mustang", "ox", "piper", "soarer",
            "flasher", "moth", "mask", "hide", "hero", "antler", "chill", "chiller", "gem", "ogre",
            "myth", "elf", "fairy", "pixie", "dragon", "griffin", "unicorn", "pegasus", "sprite",
            "fancier", "chopper", "slicer", "skinner", "butterfly", "legend", "wanderer", "rover",
            "raver", "loon", "lancer", "glass", "glazer", "flame", "crystal", "lantern", "lighter",
            "cloak", "bell", "ringer", "keeper", "centaur", "bolt", "catcher", "whimsey", "quester",
            "rat", "mouse", "serpent", "wyrm", "gargoyle", "thorn", "whip", "rider", "spirit",
            "sentry", "bat", "beetle", "burn", "cowl", "stone", "gem", "collar", "mark", "grin",
            "scowl", "spear", "razor", "edge", "seeker", "jay", "ape", "monkey", "gorilla", "koala",
            "kangaroo", "yak", "sloth", "ant", "roach", "weed", "seed", "eater", "razor", "shirt",
            "face", "goat", "mind", "shift", "rider", "face", "mole", "vole", "pirate", "llama",
            "stag", "bug", "cap", "boot", "drop", "hugger", "sargent", "snagglefoot", "carpet",
            "curtain"};


}

