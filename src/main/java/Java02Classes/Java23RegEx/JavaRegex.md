# Java Regular Expressions

## What is a Regular Expression?

- `regular expression`: a sequence of characters that forms a search pattern
- can be a single character or a more complicated pattern
- can be used to perform `text search` and `text replace` operations
- the `regex` package includes these classes:
  - `Pattern`
  - `Matcher`
  - `PatternSyntaxException`

Find out if there are any occurrences of the word "w3schools" in a sentence:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
// Outputs Match found
```

## Example Explained

- `Pattern.compile()` creates the pattern
  - first parameter: which pattern is being searched for
  - second parameter: 
    - is optional
    - has a flag to indicate the search should be case-insensitive
- `matcher()` method:
  - is used to search for the pattern in a string
  - returns a Matcher object which contains information about the search that was performed
- `find()` method:
  - returns `true`/`false` if the pattern was/wasn't found in the string

## Flags

- `flag`s in the `compile()` method change how the search is performed:
  - `Patter.CASE_INSENSITIVE`: case will be ignored
  - `Pattern.LITERAL`: special characters will be treated as ordinary characters
  - `Pattern.UNICODE_CASE`: use with `CASE_INSENSITIVE` to ignore case of letters outside of English alphabet

## Regular Expression Patterns

- pattern is used in the first parameter of the `Pattern.compile()` method

| expression | description                            |
|------------|----------------------------------------|
| [abc]      | find one of the characters in brackets |
| [^abc]     | find one character not in brackets     |
| [0-9]      | find one character from 0-9            |

## Metacharacters

| metacharacter | description                                           |
|---------------|-------------------------------------------------------|
| &#124;        | match any one pattern between &#124;                  |
| .             | find one instance of any character                    |
| ^             | find a match as the beginning of a string             |
| $             | find a match at the end of a string                   |
| \\d           | find a digit                                          |
| \\s           | find a whitespace character                           |
| \\b           | find a match at the beginning or end of a word        |
| \\uxxxx       | find the unicode character if hexidecimal number xxxx |


## Quantifiers

| quantifier | description                                            |
|------------|--------------------------------------------------------|
| n+         | matches any string with at least one *n*               |
| n*         | matches any string with 0 or more *n*s                 |
| n?         | matches any string with 0 or more *n*s                 |
| n{x}       | matches any string with a sequence of `x` *n*s         |
| n{x,y}     | matches any string with a sequence of `x` to `y` *n*s  |
| n{x,}      | matches any string with a sequence of at least`x` *n*s |