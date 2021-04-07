package lesson_7.Task32;

public class DictionaryCreator {

    public Dictionary createFrequencyDictionaryFor (String sourceText) {
        return new Dictionary()
                .getSeparateWords(sourceText)
                .buildFrequencyDictionary()
                .sortFrequencyDictionary();
    }
}
