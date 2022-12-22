package curs04.exception_and_io.challenge5;

import java.util.Objects;

public class Word implements Comparable<Word>{
    private String word;
    private int occurrence;

    public Word(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public String getWord() {
        return word;
    }

    public int getOccurrence() {
        return occurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public int compareTo(Word o) {
        return (-1) * Integer.compare(this.occurrence, o.occurrence);
    }

    public void incrementOccurrence() {
        occurrence++;
    }

    @Override
    public String toString() {
        return word + " - " + occurrence;
    }
}
