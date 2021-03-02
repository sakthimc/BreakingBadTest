# Breakign Bad Mobile Automation
This test automation project is implenmeted using custom Maven-Java-Appium framework using page objects.
This test project is to develop and 
execute automated tests against mobile applications for android and ios. This test project establish remote connection
between the tests and targeted device platforms.


### Purpose (Why):
* To automate against Breaking Bad mobile app
* To automate and validate functionality across android and iOs

## Getting Started

### Prerequisites
1. JAVA should be [installed](http://www.oracle.com/technetwork/java/javase/downloads/ on host platform and JAVA_HOME environment variable must be set host platform.
2. IDE of your choice
3. Maven
4. Appium desktop app for inspecting elements
5. Android Studio (if running test on emulator)#
6. Android SDK

### Quick Start
1. Create directory for project if running on local instance
2. Git clone the project from repo

### Notes / Caveats
*  As of now this test only runs the features on an Android device. This can be modified or change to include any capabilities under 
src\test\java\setups\Capabilities

### Emulator config
1. Start the emulator via Android Studio 
2. Then change following capabilities 

capabilities.setCapability("platformName", "Android");
capabilities.setCapability("platformVersion", "9");
### capabilities.setCapability("deviceName", "emulator-4445");
capabilities.setCapability("appPackage", "com.github.fatihsokmen.breakingbad");
capabilities.setCapability("appActivity", "com.github.fatihsokmen.breakingbad.home.HomeActivity");

### Executing Tests Using IDEs or Command Line Arguments
1. Open command line or terminal and navigate to the directory project is cloned to
2. Run: `maven clean test` from command line [OR]
3. Right click feature file tag and hit run when using inteliJ
