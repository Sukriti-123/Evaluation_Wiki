The code and the JAR file is in the Evaluation_Wiki folder.

The code can be executed by copying TestWikipedia.jar in C:\Selenium or any other direcotry and executing the commandline command
C:\Selenium>java -jar TestWikipedia.jar.

The output will be like below :
Starting ChromeDriver 2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb) on port 24063
Only local connections are allowed.
Apr 29, 2018 9:18:25 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Title Matched
'Did you mean' suggestion present
20 results displayed
The search page has a Title !!!!
Contents Present
Third ELement of Slider present

For each of the checkpoint the messages will indicate either the success or the failure of the test criteria.

There are some sleep timers of few seconds to compensate for slower internet speeds which might give negative results,
hence please wait until all of the script has executed.

The desicion to use Java with selenium is as both are open source and efficient and has multiple browser support which helps
in website testing (as people tend to use multiple browsers to access websites).
The code is written in simple manner so as to be easily replicated to add multiple test scenarios as required.
