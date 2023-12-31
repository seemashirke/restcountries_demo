REST Countries Demo
=======

**Demo 1** - Sorted list of countries by population using a RESTful API

**Demo 2** - Country in Asia containing the most bordering countries of a different region using a RESTful API

#  
Prerequisite
---------------
Get a laptop/desktop installed with Eclipse IDE, Java & Postman softwares.

#  

Import The Project
---------------
1) Clone the project from github URL - https://github.com/seemashirke/restcountries_demo.git
2) Unzip the file
3) Then Go to Eclipse IDE, import the existing maven project
4) Browse the directory to import the project
5) Let project to build

#  
Run The Project
---------------
1) Open Eclipse IDE
2) Go to the CountryService project
3) Right click on the CountryServiceApplication.java class
4) Click on run as "Java Application"
5) Verify application run successfully

#  
Test The Project
---------------
1) Open Postman
2) For the **Demo 1** - Sorted list of countries by population, hit the URL
   ``` html
   localhost:8080/countries
   ```
3) For the **Demo 2** - Country in Asia containing the most bordering countries of a different region, hit the URL
      ``` html
   localhost:8080/mostBorderedCountry
   ```
