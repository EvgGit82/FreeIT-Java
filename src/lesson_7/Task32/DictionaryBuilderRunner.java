package lesson_7.Task32;

/*
Имеется текст. Следует составить для него частотный словарь.
*/

public class DictionaryBuilderRunner {

    public static void main(String[] args) {

        DictionaryBuilder db = new DictionaryBuilder();

        db.getSeparateWords(TextBase.childrenSong); //Change text from the TextBase

        db.buildFrequencyDictionary();

        db.sortFrequencyDictionary();

        db.printSortedDictionary();
    }
}