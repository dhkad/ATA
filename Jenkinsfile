pipeline{

	agent any
	stages{
	stage('Checkout code') {
        	steps {
           	checkout scm
        }
    }
	stage("Compile stage"){
		steps{
		 withMaven(maven: 'maven_3_8_6') {
                    sh 'mvn clean install'
		 }}}
	stage("Test stage"){
		steps{
		withMaven(maven: 'maven_3_8_6'){
		sh'mvn test'}}}
	stage("Cucumber Report"){
		steps{
			cucumber buildStatus: "UNSTABLE",
			fileIncludePatern:"**/cucumber.json",
			jsonReportDirectory:'target'}}

}

}
