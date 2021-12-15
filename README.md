# Final Assignment MSCI-240 Carter Ibach

## How to clone and run code/tests from eclipse

### 0. Pre-requisites:

For this to work properly, eclipse should be used. This may work with other
code editors; however, these instructions are intended for use with eclipse.

As well, Junit 4 must be installed and ready to use in eclipse. The test 
cases use Junit 4, and it must exist for them to run properly.

### 1. Cloning the git repository:
	
To clone the git repository, go to 
[this website](https://github.com/cwibach/afinal-cwibach-MSCI240)
 although if you're reading this you are likely already there,
 and copy the link in "Code -> Clone -> SSH". 

Once the link has been copied, open eclipse and go to the git view. In the
git view, choose to clone a git repository. Past the link in the URI field
and the rest of the information should auto fill. Hit next and then finish.
Now there should be a local copy of the repository.

### 2. Importing the repository to be a local java project

Once the local repository exists, go back to the java view, and right click
then choose "Import..". In the menu, choose Git-> Projects from Git and click
next. Then choose "Existing Local Repository" and click next. Select the 
appropriate repository and click next. On this menu, ensure "Import using the 
New Project Wizard" is selected and click finish. 

Next, choose Java -> Java project from Existing Ant Buildfile and click next.
Click browse, and find the build file in the git project folder. It will likely
be in the location of "C:\Users\[username]\git\a3-cwibach\build.xml" where
[username] is replaced with the local username in the local C: drive. Then
type in the appropriate name and click finish. If an error arises, close it and
close all windows for importing it. Ensure it now exists with the chosen name
in the package explorer.

### 3. Running the java project sample

This step can be skipped if only the test cases are being run.

Once the project is in the package explorer, open the folder, go to 
"code -> (default package)" and select the "SampleRun" file. Once this is open
click "Run SampleRun" at the top and a sample showing the capabilities of the 
program will run and display in the console.

### 4. Running the test cases

With the project in the package explorer, go to "tests -> (default package)" 
and choose a testing file to open. Click "Run [name of testing file]" at the 
top to see the results of the test cases in that file. 


