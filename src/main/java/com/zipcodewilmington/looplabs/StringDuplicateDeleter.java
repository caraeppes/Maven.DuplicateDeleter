package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String answerString = "";
        for (int i = 0; i < array.length; i++) {
            int counter = compareValues(i);

            if (counter < maxNumberOfDuplications) {
                answerString += array[i] + " ";
            }
        }
        String[] answer = answerString.split(" ");
        if ("".equals(answer[0])) {
            return new String[0];
        } else {
            return answer;
        }
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String answerString = "";
        for (int i = 0; i < array.length; i++) {
            int counter = compareValues(i);

            if (counter != exactNumberOfDuplications) {
                answerString += array[i] + " ";
            }
        }

        String[] answer = answerString.split(" ");

        return answer;

    }
}
