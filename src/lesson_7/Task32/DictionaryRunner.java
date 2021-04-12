package lesson_7.Task32;

/*
Имеется текст. Следует составить для него частотный словарь.
*/

import lesson_7.Task32.engine.Dictionary;
import lesson_7.Task32.engine.DictionaryCreator;

public class DictionaryRunner {

    public static void main(String[] args) {

        Dictionary dictionary = DictionaryCreator.createFrequencyDictionaryFor(TextBase.childrenSong);
        dictionary.printFrequencyDictionary();

        System.out.println();

        Dictionary second_dictionary = DictionaryCreator.createFrequencyDictionaryFor(TextBase.yesterday);
        second_dictionary.printFrequencyDictionary();
    }
}