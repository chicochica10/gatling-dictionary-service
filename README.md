gatling-dictionary-service
==========================

respository file for gatling simulations

Instructions:
1.- Download gatling load test tool from: 

  http://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/2.0.3/gatling-charts-highcharts-2.0.3-bundle.zip
  
2.- Unzip gatling

3.- At least JDK7u6 is needed

4.- Clone repository and copy "dictionaryService" directory from the cloned repo inside of:
  
  <path where gatling is installed>/gatling-charts-highcharts-2.0.3/user-files/

5.- copy "users.csv" file from cloned repo inside of:

  <path where gatling is installed>/gatling-charts-highcharts-2.0.3/user-files/data/

6.- From:

  <path where gatling is installed>/gatling-charts-highcharts-2.0.3/bin/

  run ./gatling.sh (linux) or batling.bat (windows)

  and select DictionaryServiceSimulation from the menu and write an optional description
  
7.- Results of simulation are in a path similar to:

  <path where gatling is installed>/gatling-charts-highcharts-2.0.3/results/dictionaryservicesimulation-xxxxxxxxx/index.html

//DOING:
creating a more realistic test