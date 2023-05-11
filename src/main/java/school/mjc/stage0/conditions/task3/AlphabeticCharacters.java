package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (Character.isLetter(character)) {
            // Converts the character to lowercase
            char lowercaseChar = Character.toLowerCase(character);
            // Checks if the lowercase character is a vowel
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Wrong alphabet!");
        }
       
}
}
