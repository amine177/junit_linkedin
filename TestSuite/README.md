This project illustrates using test suites with Suite's @RunWith
in order to test a group of classes in on go.

The SuiteTest1.testPrintMessage and StuiteTest2.testPrintMessage test methods
will be executed as part of a single inovaction of TestSuiteTest relying on @RunWith and specifying the classes to run
using @Suite.SuitClasses .


Test using : mvn test  (or righ click on TestSuiteTest on an IDE that supports JUnit)
