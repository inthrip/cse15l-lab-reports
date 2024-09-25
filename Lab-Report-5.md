# Lab Report 5 - Putting it all together
Derrick Burton

## Part 1: Debugging Scenario
### 1. The original post from a student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is.

**Question @312**

**Question Summary: Bug in Word Hunt solver**

**User: Derrick Burton**

**Question Description: I created a Word Hunt solver, but can not figure out why it is only giving me words that start with the first letter in the argument (it should be giving me words that start with all the letters). Can anyone tell me where my problem might lay? Also, ignore the code that has been commented out, that code was meant to search for longer words, but the runtime is simply too long when they are searched for.**

This is the code responsible for creating the words from the input letters: 
![image](Lab5_Code1)
![image](Lab5_Code2)

This is the terminal output, as you can see it is only giving me words that start with the first letter in the args.
![image](Lab5_Terminal)


### 2. A response from a TA asking a leading question or suggesting a command to try

**Instructors' Answer**

**User: William Hsu**

**Answer: After meticulously combing your code, I think your issue may lie with the paths variable. Are you adding all your path ids to the path variable? I see you already have a for loop to look through the all the ids in the paths variable, but as of now the paths variable only has one item in it.**

### 3. Another screenshot/terminal output showing what information the student got from trying that, and a clear description of what the bug is.

**Followup Discussions:**

**User: Derrick Burton**

Thanks for the advice, you were right about where the bug came from. Previously, I wasn't adding all the path ids to the paths variable, so the for loops were only creating words from the first letter. To fix it, I added all the ids to the paths variable one by one and now the for loop to look at each one and then search for words is working as intended. As you can see from the terminal output, it is now giving me the biggest words starting from all the letters, instead of just the first letter.
![image](Lab5_Terminal2)


### 4. At the end, all the information needed about the setup:

- The file and directory structure:
  ![image](Lab5_Directory)

- The java file before fixing the bug:
  ![image](Lab5_Code1)
  
  

