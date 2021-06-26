# JavaTestProject

The project to Run junit5 Test cases using Command line.

To Compile Test class.

javac -cp "C:\Data\DEMO\JavaTestProject\libraires\*"  C*.java  

To run the Tests:

java -jar -Durl=https://amazon.com -DuserName=Kevin -Dpassword=dias123 C:\Data\DEMO\JavaTestProject\libraires\junit-platform-console-standalone-1.6.2.jar -cp . --scan-class-path --reports-dir=reports
