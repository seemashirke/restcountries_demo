REST Countries Demo
=======

**Demo 1** - Sorted list of countries by population using a RESTful API https://restcountries.eu

**Demo 2** - Country in Asia containing the most bordering countries of a different region using a RESTful API https://restcountries.eu

#  
Prerequisite
---------------
Get a laptop/desktop installed with STS IDE ,Java & Postman softwares.

#  

Import The Project
---------------
1) Clone the project from github URL
2) Unzip the file
3) Then Go to STS IDE, import the existing maven project
4) browse the directory to import the project
5) let project to build

#  
Run The Project
---------------
1) Open STS IDE
2) go to the CountryService project
3) right click on the project
4) click on run as "Spring boot project"
5) verify application run successfully

#  
Test The Project
---------------
1) Open STS Postman
2) For the **Demo 1** - Sorted list of countries by population, hit the URL
   ``` html
   localhost:8080/countries
   ```
3) For the **Demo 2** - Country in Asia containing the most bordering countries of a different region, hit the URL
      ``` html
   localhost:8080/mostBorderedCountry
   ```
