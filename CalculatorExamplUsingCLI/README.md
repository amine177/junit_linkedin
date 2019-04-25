A project illustrating running junit tests from CLI


make sure that the junit and hamcrest jars are in the classpath environment variable

first compile with : javac  -cp ".;/junit-4.12.jar;hamcrest-core-1.3.jar"  CalculatorTest.java  Calculator.java

then: java -cp ".;/junit-4.12.jar;hamcrest-core-1.3.jar" CalculatorTest
