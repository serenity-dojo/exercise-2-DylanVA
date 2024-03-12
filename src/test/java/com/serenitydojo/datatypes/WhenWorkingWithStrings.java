package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable

        String lowerCaseTitle = bookTitle.toLowerCase();
        System.out.println(lowerCaseTitle);

        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));
    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable

        String upperCaseTitle = bookTitle.toUpperCase();
        System.out.println(upperCaseTitle);

        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

        // TODO: Trim the spaces before and after the title text

        String trimmedTitle = bookTitle.trim();
        System.out.println(trimmedTitle);

        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = 0;

        // TODO: Find the number of characters in the string

        length = bookTitle.length();
       System.out.println(length);

        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        // TODO: Replace the word "Cat" with "Dog

        String updatedTitle = bookTitle.replace("Cat","Dog");
        System.out.println(updatedTitle);

        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
