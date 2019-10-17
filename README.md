# Fundamentals of Software Engineering

The objective for this project is to understand the principle of information hiding, and learn how to write a template a class and understand the idea of representation invariants in the process.

#### Components Implementation
##### Prioritizer Interface

The interface is parameterized by the class T of items to be prioritized and a comparator(function or class) that compares two items of class T and returns a Boolean. Prioritizer provides operations to be used in two phases; an insertion phase and a removal phase.

* **insert:** An operation to insert an item
* **changePhase:** An operation to change to removal phase
* **removeNextInOrder:** An operation to remove an item, according to the specified ordering function
* **removeAny:** An operation to remove an arbitrary item
* **Size:** An operation to get the number of items
* **isInsertionPhase:** An operation to check if a prioritizer is in the insertion phase

##### Prioritizer Implementation Classes

There are three implementation template classes of prioritizer. Each group member implements one of the class. The three implementations holds same private data (an array or a queue to store contents and a Boolean flag to keep track of the phase), but the different implementations must follow the different representation invariants.


##### Prioritizer1

If not in insertion phase, the contents are kept sorted according to the order. 
This class is implemented by Harika Etha.

##### Prioritizer2

Contents are kept sorted according to the order at all times.
This class is implemented by Namitha.

##### Prioritizer3

No representation invariant.
This class is implemented by Poojitha.

#####  Main Class
Main class will instaniates the prioritizer with a suitable class and comparator to solve one or more prioritization problems in the prject.

#### Contributions

- **Poojitha:**
    * **Tasks**
        - Documentation
        - Prioritizer3
        - Noted down the changes required for the prioritizer as discussed in class 

    * **Strengths:**
        - Specification of the requirements.

    * **Communication:**
        - Communication 8 times out of 8.

      
- **Namitha:**
    * **Tasks**
        - Prioritizer2
        - combining of the code
        - Rechecked the changes required and made 

    * **Strengths:**
        - Makes sure things are done in order.

    * **Communication:**
        - Communicated 8 times out of 8.


- **Harika:**
    * **Tasks**
        - Prioritizer1
        - Pushed to GitHub
        - Made the required changes on the whole.

    * **Strengths:**
        - A good Java coder.

    * **Communication:**
        - Communicated 8 times out of 8.
