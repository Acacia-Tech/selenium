set projectLocation=D:\Jefferson\Full_Stack_Java_Development\Testing\Projects\Automation_Coding\AutomationFramework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestNG_Packages.xml