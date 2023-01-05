pipeline{

	agent any
	tools { 
        maven 'Maven 3.4.8' 
        jdk 'jdk11.0.16.1' 
       }
	
	
	stages{
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/main']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/dhkad/ATA.git']]
    ])
           	checkout scm
        }
    }
		
	stage("Test stage"){
	steps{
	withMaven(maven: 'maven_3_8_0){
	sh'mvn test'}}}
	
			  
	
	stage("Cucumber Report"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/main']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/dhkad/ATA.git']]
			 ]) 
		cucumber buildStatus: "UNSTABLE",
		fileIncludePattern: "**/cucumber.json",
                jsonReportDirectory: 'target'}}

}

}
