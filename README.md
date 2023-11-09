# SparkGitMicrochallenge

## INFO:
This is a Spark! microchallenge for getting familiar with git!  
This is called a repository. Repositories are used to store files and to store several different commits, or versions of your code. During development, you often want to commit your code to show your process from the ground up. You also might want to update working code into a new version, while still keeping a previous version.  
In our repository, we have a few files; our **README.md** file, which is the file you are reading right now, and our **Sort.java** file, which is a java file that sorts a given array. You are going to be using GitHub commands in VSCode to edit these files and create new files.  
### Commands you should know for this microchallenge:  
  ☆ **touch** -- touch <file> -- if <file> doesn't exist, it creates the file; if it does exist, it will update the timestamps of the file.  
  ☆ **append** -- echo <thing to append> > <file> -- appends <thing to append> to <file>; you can use single or double quotes.  
  ☆ **create new branch** -- git branch <branch name> -- creates a new branch called <branch name>
  ☆ **switch to a different branch** -- git checkout <branch name> -- switches into the branch called <branch name>


## Step 0: IMPORT the repository
instead of cloning, we're going to import our repository. To do this, first, click the green **Code** button, and copy the HTTPS key. Then, click the image of your profile in the top right -> Your repositories -> New -> Import a repository. Copy your URL key into the box, and name the repository; you can give it the same name or create a new one. Then, click begin import. This is the process you would use if you had a local repository.  
Now, in this repository, you can open a codespace (also under the green code button).

## Step 1: Create a "vars.java" file.  
Let's create a new file using our codespace. In the terminal, use the "touch" BASH command to create vars.java. Then, you can append the following to that file ->  
`public class vars { public static void main(String[] args) { } public static String getName() {String name = "__name__"; return name; } public static String welcome() { return "Welcome to the Spark! Git Microchallenge!"; } }`  
Remember that Java doesn't care about whitespace or indents, which is why we can append this all as one line. Also, notice that there are double-quotes in the above code, so you will have to use single quotes to append.  

## Step 2: Update our "name" variable in vars.java  
Use Bash command `sed -i -e 's/__name__/[your name here]/g' vars.java`

## Step 3: Create a branch  
Create a new branch called temp, and move into it.

## Step 4: Create a "decode.java" file 
Create the file and append this code:
`public class decode {public static void main(String[] args) {}public static String decoder(int[] arr) {String result = "";char curr; for (int i = 0; i < arr.length; i++) {result += String.valueOf( (char)arr[i] );}return result;}}`
