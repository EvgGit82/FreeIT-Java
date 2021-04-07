package lesson_7.Task32.engine;

public class DictionaryCreator {

    public static Dictionary createFrequencyDictionaryFor (String sourceText) {
        return new Dictionary()
                .getSeparateWords(sourceText)
                .buildFrequencyDictionary()
                .sortFrequencyDictionary();
    }
}
