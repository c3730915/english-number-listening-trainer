### English Number Listening Trainer
### Detailed [instructions](https://pricezhang42.github.io/2022/01/18/Number-Listening-Trainer.html) and [notes](https://pricezhang42.github.io/2022/01/18/Number-Listening-Trainer-Notes.html)
This is a small software based on Java Swing designed to train proficiency for listening of English numbers. The basic idea is to make 10 random numbers or dates and your mission is to follow and write them down. You can set formats of the generated numbers and it also provides function of dictation.

**Run the program by `run/mainFrame.java`**

<img src="https://github.com/pricezhang42/pricezhang42.github.io/blob/master/img/in-post/2022-01-18-Number-Listening-Trainer/mainFrame.jpg?raw=true" width="60%" />

Functions:
- Generate random numbers with specified number of digits.
- Generate random numbers with specified range of random number of digits. Image bellow shows 10 generated random numbers with random number integer digits ranged from 1 to 3 and random number decimal digits ranged from 1 to 2.
- Generate random phone numbers. Can choose digits from 3, 4, 9 and 11.
- Generates a specified range of random dates. 
- Generates random days of a week, months, directions and times.
- Make generated numbers invisible for dictation.
- Provides a dictation function. Separating each number with a space. If the number is correct, the corresponding background turns to green. If error turns red.

Check video demo [here](https://www.youtube.com/watch?v=tUFpgp3q3RQ).

# Attention external dependency is needed:
you must download jacob-1.19-x64 at https://github.com/freemansoft/jacob-project/releases, and add the file into your JDK's bin dictionary.
I've added this file into src/externalFile.
