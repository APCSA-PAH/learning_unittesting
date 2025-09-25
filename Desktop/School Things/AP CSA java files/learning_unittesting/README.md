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
## 🛠 What is JUnit?
- **JUnit** is a Java testing library that makes it much easier to write and run unit tests.
- With JUnit, you can:
  - Test whether your methods return the expected results
  - Verify that the attributes of the objects you design change as expected
  - Check that your entire program/applications behave properly, especially in edge cases
---
## 📺 Your Task: Build Television and Remote objects

You will create two Java classes: `Television` and `Remote` (note: the files already exist within the src/main directory; your job is to implement these classes according to the following instructions).

### 1. `Television` class
- Attributes:
  - `String name` → the name of the TV
  - `double area` → screen size
- Method:
  - `getChannels()` → prints **3 channels of your choice** to the console

### 2. `Remote` class
- Attributes:
  - `Television tv` → the TV this remote controls
  - `int charged` → battery level (0 to 100)
  - `boolean on` → whether the TV is on
- Constructor:
  - Accepts a `Television` object
- Methods:
  - `turnOn()`  
    - If `on` is `false` **and** `charged > 0`: sets `on = true`
    - Each call reduces `charged` by 10 (can never go below 0)
  - `charge(int amount)`  
    - Accepts a **positive integer**
    - Increases `charged` but caps at `100`
  - `getChannels()`  
    - Calls the TV’s `getChannels()` method

---
## ✅ Unit Testing Instructions
You will write **JUnit tests** located in the `src/test/AppTest.java` file.

### Tests to Implement:
- Test that a new `Remote` starts with the correct TV reference
- Test that `charge()` correctly increases the battery by the amount specified in the parameters
- Test that `charge()` caps at 100
- Test that `turnOn()` only works if charged > 0
- Test that `turnOn()` reduces charge by 10
- Test that `getChannels()` prints the expected channels

---