# risk-engine-jacoco

A sample springboot app with jacoco test cases to be integrated to risk-engine for risk assessment

Prepares a property pointing to the JaCoCo runtime agent that can be passed as a VM argument to the application under test

mvn jacoco:prepare-agent

VERIFY - run any checks on results of integration tests to ensure quality criteria are met. This also generates the java coverage report to found in target/site/jacoco/index.html. XML file in target/site/jacoco/jacoco.xml

mvn clean verify
