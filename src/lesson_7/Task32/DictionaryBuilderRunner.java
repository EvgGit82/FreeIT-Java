package lesson_7.Task32;

/*
Имеется текст. Следует составить для него частотный словарь.
*/

public class DictionaryBuilderRunner {

    public static void main(String[] args) {

        new DictionaryBuilder()
                .getSeparateWords(TextBase.childrenSong) //Change text from TextBase here
                .buildFrequencyDictionary()
                .sortFrequencyDictionary()
                .printSortedDictionary();
    }
}