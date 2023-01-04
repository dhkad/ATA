pipeline{

	agent any
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
