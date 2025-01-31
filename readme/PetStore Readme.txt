
FrameWork Devlopment
-----------------------
Framework -Maintain all project related files.

Objective 
------------------------
1)Re-Usability 
2)Manitanibility 
3)Readability 

Hybrid Driven 
-------------
Phses
-------------
1) Understand requirements 
-Functional Specification(static)
-Swagger(use for reference)

2)Chose automation tool 
-Rest Assured (library)
3)Design
-refere flow dia
4) Framework  Devlopment

After Project Creation 
Step 1: Create Maven Project
Step 2:Update pom.xml with required dependencies.
Step3.Create Folder structure .
____________
Step 4: Create Route.java----Contains url's

Step 5: Create User End Pint ------ CURD methods implementation 
along with create class for all end points 

Step 6: Create POJO class (User,Pet,Store)

Step 7: Create Test class for (User ,Pet ,Store)

Step 8: Create data driven test 
excel sheet data
ExcelUtility
Dataproviders

Step 9: Generate extend reports 
Extent reportutility 
testng.xml file

Steps 10: Add logs
log4j2 dependency
log4j2.xml -->src/test/resources

Step 11)user property file ro get URL's optional 


5)Exection +CI/CD
1) Execute tests using pom.xml within eclipse
Step 1) apache maven surefire plugin and cofig it in pom.xml file
2)Execute tests using pom.xml in commond prompt 
Step 2) Install Maven on Windows 
https://maven.apache.org/download.cgi
Download zip file https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip
once downloaded ,added to it in path  and check available using cmd mvn -version,and also check java is installed 

3)Commit code in local repository(git)
4)push your code to remote repository(github)

5) run project in jenkins(from git github
 


CI Process
-----------
1)install git s/w
2)Create gihub empoty repository (if not created yet)
Repo URL:https://github.com/manosdet/RestAssuredAPI-PetStore.git
Working Project location:C:\Users\premk\eclipse-workspace\PetStoreAutomationRestAssured

1) git init --->create local repository 

2)git config --global user.name "username"
git config --global user.email "email@gmail.com" 

3)git status 

4)git add -
git add filename.ext
  git add*.ext
  git add foldername

5)commit -m "Commit massage"

6) push code to remote repository 
$- git remote add origin "https://github.com/manosdet/RestAssuredAPI-PetStore.git"    --->local repository connected with remote repository (need to do it for first time)
7Final push to remote repo
$- git push -u origin master

