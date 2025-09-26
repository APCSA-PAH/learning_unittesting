# Intro to JUnit Assignment

Welcome, coding Jedi! 

This assignment will introduce you to **unit testing** in Java using **JUnit** within a Maven project structure.

---
## 📖 What is Unit Testing?
- **Unit testing** is the process of testing small, individual pieces ("units") of code—including methods or class instances—to make sure they work as you intend them to!
- In Java, the most common framework for unit testing is called **JUnit**.
- Unit tests:
  - Help catch bugs early
  - Give you confidence that your code works correctly
  - Makes it safer to change or expand your code later on

---
## 🧪 Example: Testing an `absoluteVal(double num)` Method

Suppose you implement a method that returns the absolute value of a number:

    public double absoluteVal(double num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }

When writing unit tests, we don’t just check “does it work once?” — we think about the different scenarios the code might face. For the `absoluteVal` method, there are three important cases we must consider:

1. When num is positive
2. When num is 0
3. When num is negative

So, we’ll create three separate unit tests inside our test class:

```
// JUnit import statements 
// Also, assume that the absoluteVal method is already imported
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    /* This 1st test uses JUnit's assertEquals() method
    * and checks whether a call to absoluteVal(5.0) returns the expected value, 5.0
    */
    @Test
    public void testAbsoluteValPositive() {
        assertEquals(5.0, absoluteVal(5.0));
    }

    /* This 2nd test again uses JUnit's assertEquals() method
    * and checks whether a call to absoluteVal(0.0) returns the expected value, 0.0
    */
    @Test
    public void testAbsoluteValZero() {
        assertEquals(0.0, absoluteVal(0.0));
    }

    /* This last test also uses JUnit's assertEquals() method
    * and checks whether a call to absoluteVal(-5.0) returns our expected value, 5.0
    */
    @Test
    public void testAbsoluteValNegative() {
        assertEquals(5.0, absoluteVal(-5.0));
    }
}
```

This example shows how each test method focuses on a single case, making it easy to see what’s working and what’s broken.

---
## 🛠 What is JUnit?
- **JUnit** is a Java testing library that makes it much easier to write and run unit tests.
- With JUnit, you can:
  - Test whether your methods return the expected results
  - Verify that the attributes of the objects you design change as expected
  - Check that your entire program/applications behave properly, especially in edge cases

---
## 📝 Heads Up: Common JUnit Assertions

When writing your unit tests, you’ll be using **assertions**. Assertions are simple checks that confirm whether your code behaves the way you expect. If the assertion is true, the test passes ✅. If it’s false, the test fails ❌.

Here are the main assertions you’ll be expected to use:

1. `assertTrue(condition)`

Passes if the condition is true.

Example:

`assertTrue(tv.isOn());`

This test passes if the TV is on.

2. `assertEquals(expected, actual)`

Passes if the two values are equal.

Example:

`assertEquals(55.0, tv.getSize(), 0.001);`


This test passes if the TV’s size is 55.0.
(The extra 0.001 is for comparing doubles, since they’re not always exact.)

3. `assertNotNull(object)`

Passes if the object is not null.

Example:

`assertNotNull(tv.getBrand());`


This test passes if the brand has been set.

👉 For this assignment, you’ll mostly be using `assertEquals` and `assertTrue`, with `assertNotNull` coming in handy when checking that objects (like your `Television`) are created properly.

---
## 📺 Your Task: Build Television and RemoteControl objects

You will create two Java classes: `Television` and `RemoteControl` (note: the files already exist within the src/main directory; your job is to implement these classes according to the following instructions).

### 1. `Television` class
Navigate to the `src/main/java/apcsa/githubtrack/Television.java` file and implement the class to meet the following requirements:
- Attributes:
  - `name` → The name of the TV
  - `area` → A numerical variable representing the screen size
- Method:
  - `getChannels()` → return **3 channels of your choice** to the console as Strings
  - Appropriate getter/setter methods for each attribute of the TV object

### 2. `RemoteControl` class
Navigate to the `src/main/java/apcsa/githubtrack/RemoteControl.java` file and implement the class to meet the following requirements:
- Attributes:
  - `tv` → A `Television` object, representing which TV this remote controls
  - `charged` → A numerical variable representing the battery level (0 to 100)
  - `on` → A boolean variable representing whether the TV is on
- Constructor:
  - Accepts a `Television` object
- Methods:
  - `turnOn()`  
    - If `on` is `false` **and** `charged > 0`: sets `on = true`
    - Each call reduces `charged` by 10 (note: `charged` can never go below 0!)
  - `charge(int amount)`  
    - Accepts a **positive integer**
    - Increases `charged` but caps at `100`
  - `getChannels()`  
    - Calls the TV’s `getChannels()` method

---
## ✅ Unit Testing Instructions
You will write **JUnit tests** located in the `src/test/java/apcsa/githubtrack/AppTest.java` file.

### Tests to Implement:
- Test that a new `RemoteControl` starts with the correct TV reference
- Test that `charge()` correctly increases the battery by the amount specified in the parameters
- Test that `charge()` caps at 100
- Test that `turnOn()` only works if charged > 0
- Test that `turnOn()` reduces charge by 10
- Test that `getChannels()` returns the expected channels

---

If there aren't any problems or bugs, your code should compile and run smoothly! Once you're confident everything works (you are encouraged to play around with printing to the console), go ahead an push your code changes to the Git repo :) Good luck, coding Jedi!