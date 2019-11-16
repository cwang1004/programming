# What is this?
 - Github repo for Susie, George, Neil and Mike's Java programming class.

## PvsPLN homework instructions (9/7):
 - mutiple prints vs mutiple printlns in your code.
 - go online and figure out how to make print do the same thing as println.

## Loopy loop homework instructions (9/14):
 - use for loop to loop 110 times.
 - in the loop, print out incrementing even numbers starting from 0.
 - ex. 0, 2, 4, 6, 8, 10, etc.

## What a tough day! (9/21):
### First Part
 - Create a new file named Funnnnction
 - write a block comment and explain the following
 	- What is public?
 	- What is private?
 	- What is the opposite of static?
 	- What return types do you know? 
 	- What does void mean?
 	- Where do parameters go?

### Second Part
 - Create a static method that anybody can use, name it whatever you want
 - The return type of this method is float
 - This method has 3 int parameters, you can name them whatever you want
 - Return the value of the first parameter multiplied by the second parameter then divided by the third. 
 - ('\*' and '/' symbols do multiplication and division respectively)
 - Call this method with any 3 integers of your choice and print out the result in your main program.
 
### Third Part
 - Do a brief review of all the things we've learned (types, loops, prints, methods, +, -, *, /)
 - Experiment with different combinations of these things, mess around a little bit, make educated guesses.
 - You have learned enough about java to experiment on you own now. Time to let loose your curiosity.
 - P.S: you guys are more than welcomed to visit https://github.com/cwang1004/programming You can get a pretty neat look on all the files 
	```
	Question (From Susie)
	So * is multiplication and / is divide?
	Yes!
	```

## Starting Our First Game! (10/05):
### Time to Digest
 - We went over a lot of materials in class, including Scanner, conditional statements, while loops, and so on. So it is important that you take time to go over these materials time and time again. Start out by going over the program we wrote together in class. When you think you understand everything, write the program from scratch on your own. The most you are allowed to copy is the printPaper, printRock, and printScissors methods.
 - Pay attention to the 'nested while loops', think about what each while loop does? Why is our programming running forever? Why is input sanitization possible?
	```
	 Question(From Susie)
	 You mean scrach? Make it on scrach? That orange cat? Or write the program again? Ummmmm,,, I don't have scrach... By the way...
	 
	 Answer: From scratch means from nothing haha. So create a new program. Good question!
	```

### Answer the Following Questioins By Block Commenting in Your Program
- Neil, if you don't know how to comment, create a 'answer.txt' file and push that
- 1. Is Scanner a data type? Is it a primitive type or an object type?
- 2. What's the difference between a primitive type and an object type?
- 3. List 2-3 functions from the Scanner type.
- 4. List out as many conditional statements as possible.

## Greetings! Construction Workers! (10/12):
### Nothing Goes Under the Rug
- Yup, most of you didn't do the previous homwork. So please go do it now. :)
- Create a file named RPSCOPY.java, add your number at the end. For example, susie is RPSCOPY2.java, neil is RPSCOPY3.java, mike is RPSCOPY4.java.
- Remember the class name needs to be the same as the file name! So figure your class names out.
- Mike, please copy line by line from RPS.java. Type character by character, no copy pasting. Try to understand as much as possible. Some things are impossible for you understand now so that's fine.
- George, you can skip this part.

### Answer the Following Questioins By Block Commenting in Your Program
- If you don't know how to block comment, go do some research online. It's very easy
- i. What is a class?
- ii. What do we mean when we write
	```
	Scanner newScanner = new Scanner(System.in); 
	```
	explain in terms of blueprints
- iii. What roles do parameters play in all this?
- iv. Come up with a blueprint and some possible parameters
- v. Create a new object from your blueprint, use java syntax
- vi. Come up with some reasonable parameters for your blueprint

## Using What You've Learned (10/19):
### Scanner Object and If-Else
- Create a file named StudentProfile.java. As always, add your number at the end
- Use a scanner to ask for a student's information including name(String), age(int), gender(int), and height(double).
- Print out student's profile at the end using the following format
	```
	Name: Charles
	Age: 28
	Gender: Male
	Height: 1.83m
	```
- Hint1: double is just the same as float
- Hint2: you need to prompt for each input and store the input in variables
- Hint3: how would you prompt for gender? Since you want input to be of type int
- Hint4: use nextLine() for String inputs
- Hint5: use nextDouble() for double inputs
- Hint6: when you're printing the profile, i don't wanna see gender:0 or gender:1. Maybe use....if?
- Hint7: when printing, think about String concatenation. If you don't know or forgot, checkout programs called concat in your folder. Or check out this example below
	```
	int a = 50;
	System.out.println("Age: " + a);
	//You can concat variables with Strings. In this case int a is automatically converted into String by Java
	```
- Hint8: slow your mind down. Be logical, my friends
- Hint9: do your best, comment in your program if you have questions. Push it if you're absolutely stuck. I'll use comments to answer your questions in your programs ASAP. So you can pull it back and give it another shot.
- Mike, I'll contact you on wechat about how to run java files

## Mike and Neil's Catchup Class (10/26):
### Covering the Bases
- Please finish the homework for (9/7)
- Please finish the first part of the homework for (9/21)
- Mike, what makes a Java program is the syntax. Meaning you need to have a class, a main method, and using the right symbols at the right places.

## Opening the Door (11/2):
### Warm Up
- File name: PlayGround.java plus your number
- Answer the following with block comment in the beginning of the file
- Please run the snippets in your head or on paper. Thank you.
- What is foo after running the following code snippet?
	```
	int foo = 1;
	foo += 1;
	```
- What is foo after running the following code snippet?
	```
	int foo = 0;
	foo++;
	foo++;
	```
- What is foo and bar after running the following code snippet?
	```
	int foo = 1;
	int bar = 2;
	foo += bar;
	bar = 0;
	foo += bar;
	```
- What is foo and bar after running the following code snippet?
	```
	int foo = 15;
	int bar = 0;
	while(bar < 3)
	{
		bar ++;
	}
	foo += bar;
	bar += foo;
	foo++;
	bar--;
	```
- What is j after running the following code snippet?
	```
	int i = 0;
	int j = 0;
	while(i < 5)
	{
		j += i;
		i++;
	}
	```
### Randomness
- Continue answering the following questions
- i. How would you describe randomness?
- ii. What's a real life example of randomness?
- iii. Why is randomness important? Especially in game design
- iv. Is the result of flipping a fair coin random?
- v. Is the result of flipping a rigged coin (30% heads, 70% tails) random? If not, why?
- In the same file, write a program that prints out 20 lines of randomly generated integers in the range of 11 to 100
- Hint: Please use a while loop

### World of APIs
- Please bookmark this website in your browswer: https://docs.oracle.com/en/java/javase/13/docs/api/index.html
- Go back to the block comment section and continue answering the following questions
- i. What is API?
- ii. Do you think it's an important tool for programmers? If so, why?
- iii. Go to the Java API website and write down the name of the method that randomly generate doubles
- iv. Read, copy, then paste the method description here
- v. Does this method take any parameters?
- In the same file, write a program that prints out 10 lines of randomly generated doubles in the range of 0.0 to 1.0
- Write another section of code that prints of 10 lines of randomly generated doubles in the range of 10.0 to 20.0
- Requirement: use while loops, and in both while loops you must use the same counter variable
- Hint: In Java, math rules and syntax applies:
	```
	(1+2)*10 equals 30 while 1+2*10 equals 21
	```
- Example output:
 	```
	0.16128877662404295
	0.35300401869031106
	0.04765696214116133
	0.18876692612554924
	0.4152335383045661
	0.7408838404386539
	0.6935446828357802
	0.1616275098823059
	0.047064440604428714
	0.6900623692245837
	-------------------------------
	16.864629590093784
	19.933918412626817
	14.089897725742397
	14.9792075093087
	15.565249736172756
	16.477165203228132
	18.848567316535267
	19.260296526255406
	12.800398988511965
	11.909072353292895
	```
