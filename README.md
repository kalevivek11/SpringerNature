# SpringerNature

this is a sbt project

To Build: 
go to project root-> sbt clean compile

To Run:
go to project root-> sbt run

To Test:
go to project root-> sbt test


Problem statement:
EXPECTATIONS
● You are required to write the software that works similar to the sample inputs given and generates output as
shown in the Input-Output section.
● You should demonstrate the working software by building a console application or writing test program that
exercises the sample inputs. For this purpose, you may use JUnit or any other testing framework.
● Maturity of your solution will be judged on your object oriented programming (or functional programming) and
design skills.
NOT REQUIRED
● Solution to this assignment DO NOT REQUIRE any knowledge of relational database or OS / platform underlying.
● Use of any standard development kit (like JDK) should suffice to write solution to this problem. Usage of
additional libraries or frameworks (like Spring) is NOT EXPECTED in this assignment.
Story#1 Itemized Bill generation for Cafe
Café has following beverages on its menu (including prices in INR):

Tea Price Coffee Price Cold Drinks Price
Masala 10 Cold 15 Coke 20
Ice 15 Latte 30 Pepsi 20
Lemon 15 Mocha 40 Sprite 15

If total bill > 100, then put flat 10% discount on total amount,
If total bill > 200 then 10% discount on 200 INR and 20% discount on the amount exceeding 200.
You can keep item code for each like (TM, TI, TL, CC, CL, CM, CDC, CDP, CDS) which helps to give input to the bill
generation code.
Input (can be given from main program or from a Test, But not from console)
List of Items code and its quantities
Output:
Print an itemized bill on the console. (**Proper formatting or indentation not required**)
Sample bill below:
Item Name Count Price (INR)
Coffee - Latte 1 30
Tea - Ice 3 45
Cold Drinks - Pepsi 2 40
Total 115
Discount – 10% 11.5
Final Amount 103.5 INR
