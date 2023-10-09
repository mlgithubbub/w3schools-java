# Java How To Count Words

## Count Number of Words in a String

- easily count the number of words in a string like this:

```java
String words = "One Two Three Four";
int countWords = words.split("\\s").length;
System.out.println(countWords);
```