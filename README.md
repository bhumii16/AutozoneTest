
<h1># Cucumber-BDD-Automation-Framework</h1>
<h2>Selenium based automation framework including reports</h2>

<h2>This framework contains sample code containing:</h2>
	<ul><li> One feature (feature file)</li></ul>
	<ul><li>Two Scenarios</li>
	<li>Autozone Order successful flow</li>
	<li>Autozone Order un-successful flow</li></ul>
	  
<h2>Steps to run at your system:</h2>
	<ul>
	<li>Clone the repository using "git clone <https://github.com/bhumii16/AutozoneTest.git>"</li>
	<li>Run "mvn clean test"</li>
	<li>Run "mvn site"</li>
	</ul>
	<h2>
	OR
	</h2>
	<ul>
	<li>Clone the repository using "git clone <https://github.com/bhumii16/AutozoneTest.git>"</li>
	<li>Import project in eclipse or similar tools</li>
	<li>Update maven project to load dependencies</li>
	<li>Open "\src\main\java\com\cucumberFramework\testRunner\TestRunner.java" file</li>
	<li>Right click and Run</li>
	</ul>
	
	
<h2>Cucumber Reports: net.masterthought - This will generate two reports</h2>
	<ul>
	<li>Cucumber Pretty (folder - "target\cucumber-reports\cucumber-pretty"), file - "index.html"</li>
	<li>Cucumber Advance (folder - "target\cucumber-reports\advanced-reports\cucumber-html-reports"), file - "overview-features.html"	</li>
	</ul>
	<br>

<h2>See configuration in "pom.xml" file</h2>

	<plugin>
	<groupId>net.masterthought</groupId>
	<artifactId>maven-cucumber-reporting</artifactId>
	<version>3.8.0</version>
	<executions>
		<execution>
			<id>execution</id>
			<phase>verify</phase>
			<goals>
				<goal>generate</goal>
			</goals>
			<configuration>
				<projectName>MyProjectName</projectName>
				<!-- Replace with project name -->
				<outputDirectory>target/cucumber-reports/advanced-reports</outputDirectory>
				<cucumberOutput>target/cucumber-reports/CucumberTestReport.json</cucumberOutput>
				<buildNumber>1</buildNumber>
				<parallelTesting>false</parallelTesting>
				<enableFlashCharts>false</enableFlashCharts>
				<skippedFails>true</skippedFails>
			</configuration>
		</execution>
	</executions>
	</plugin>

				
				
				
<h2>Allure Report:</h2> Allure reports will be generated based on the testcases json files when you'll run "mvn site". 
<h3>Add this Allure dependency in pom.xml:</h3>

	<dependency>
		<groupId>ru.yandex.qatools.allure</groupId>
		<artifactId>allure-cucumber-jvm-adaptor</artifactId>
		<version>1.6.2</version>
	</dependency>

	
<h3>Add this under Maven Surefire plugin:</h3>

	<argLine>
		javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"                     -Dcucumber.options="--plugin ru.yandex.qatools.allure.cucumberjvm.AllureReporter"
	</argLine

	
<h3>And this under "project xml" tag</h3>	

	<reporting>
		<excludeDefaults>true</excludeDefaults>
		<plugins>
			<plugin>
				<groupId>ru.yandex.qatools.allure</groupId>
				<artifactId>allure-maven-plugin</artifactId>
				<version>2.5</version>
			</plugin>
		</plugins>
	</reporting>
	
<br><br>
<h3>You will be able to locate the report in folder : "target\site\allure-maven-plugin", the "Index.html" file. </h3>
