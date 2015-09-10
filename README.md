# example_roulette
Program to refactor that plays a game of roulette

Edited by Elsie Ling and Henry Yuen

1.In what ways is the refactored code simpler?

It requires none of the if statements that were refactored out and all the code that is called is relevant to the specific option that the user chooses. The Game class is smaller and easier to understand, and the decision-making is done by the new classes as opposed to just the Game class.

2.In what ways is the refactored code more complex?

It involves creating an array of the three objects, which initialises three separate objects. It has a hierarchy of classes that depends on the Bet superclass.

3.What trade-offs did you make when refactoring your old code?

One tradeoff with dividing each logic into separate classes is increasing the complexity of the methods that are called, as opposed to the original code that calls just one method. If trees are intuitive to understand and are readable inline, as opposed to the Bet array of objects. 

4.Which code do you prefer and why?

The refactored code, as the Game class is more concise as the Bet methods and oeprations are extracted to individual classes.
