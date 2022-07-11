<h2>Shopping Basket of Books</h2>
There is a series of books about software development that have been read by a lot of developers who want to improve their development skills. Let’s say an editor, in a gesture of immense generosity to mankind (and to increase sales as well), is willing to set up a pricing model where you can get discounts when you buy these books. The available books are :

- Clean Code (Robert Martin, 2008)
- The Clean Coder (Robert Martin, 2011)
- Clean Architecture (Robert Martin, 2017)
- Test Driven Development by Example (Kent Beck, 2003)
- Working Effectively With Legacy Code (Michael C. Feathers, 2004)


<h3>Rules</h3> 

- One copy of the five books costs 50 EUR.

- If, however, you buy two different books from the series, you get a 5% discount on those two books.

- If you buy 3 different books, you get a 10% discount.

- With 4 different books, you get a 20% discount.

- If you go for the whole hog, and buy all 5, you get a huge 25% discount.

- Note that if you buy, say, 4 books, of which 3 are different titles, you get a 10% discount on the 3 that form part of a set, but the 4th book still costs 50 EUR.

- Developers seeking to deliver quality products are queuing up with shopping baskets overflowing with these books. Your mission is to write a piece of code to calculate the price of any conceivable shopping basket.

<h3>Example</h3>

- 2 copies of the “Clean Code” book

- 2 copies of the “Clean Coder” book

- 2 copies of the “Clean Architecture” book

- 1 copy of the “Test Driven Development by Example” book

- 1 copy of the “Working effectively with Legacy Code” book

<h3>Answer :</h3>

(4 * 50 EUR) - 20% [first book, second book, third book, fourth book]

(4 * 50 EUR) - 20% [first book, second book, third book, fifth book]

= 160 EUR + 160 EUR

= 320 EUR (knowledge is priceless but has a cost)


<h3>Prerequisites</h3>


- Java - Version 1.8 

- Maven - Dependency management

- JUnit - Version 4.11

- IDE - Eclipse or any other IDE which supports Java


<h3>Set up application</h3>

<h4>IDE</h4>

1. Clone the repository https://github.com/2022-DEV1-045/DevelopmentBooks.git
2. Add as Maven project
3. Select Project SDK as JDK 1.8 or higher

<h4>Command Prompt</h4>

1. Clone repository from GIT 'git clone https://github.com/2022-DEV1-045/DevelopmentBooks.git'
2. Run `mvn clean install`

<h3>Run Test Cases</h3>

<h4>IDE</h4>

1. Navigate to Maven Toolbar
2. Select `test` under lifecycle menu and click on play symbol

<h4>Command Prompt</h4>

1. Go to the directory where you have cloned the Tennis program (C:\Bnpp\Workspace\DevelopmentBooks)
2. Run `mvn test
