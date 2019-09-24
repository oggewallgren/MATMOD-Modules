# Problem Module lv4

## General info

- FIRE group number 75
- module number 4
- By

  - Oskar Wallgren, 960107-2292, IT, oskarwallgren@icloud.com
  - Hugo Cliffordson, 970917-5799, IT, cliffords.contact@gmail.com

- "We hereby declare that we have both actively participated in solving every exercise. All solutions are entirely our own work, without having taken part of other solutions.
- Number of hours spent for each one of you
  - Both 12h
- Number of hours spent in supervision for this module
  - 4h

## 1. AMPL MODELLING LANGUAGE

### a)

We have two _set_ which are declarations of an unordered collection of objects. In this example, _FOOD_ is a collection of objects on a menu with a name, cost, and **\_**. _NUTR_ is also a collection of objects specifying nutrition values.

- `param cost {FOOD} >= 0;` says that for all objects in FOOD, the parameter `cost` has to be greater or equal to zero. A menu item cannot have a negative cost.
- `param f_min {FOOD} >= 0 , default 0;` says that for all objects in FOOD, the parameter `f_min` has to be greater or equal to zero and if no value is given, will be set to zero. It is not possible to buy a negative number of items
- `param f_max {j in FOOD} >= f_min[j], default 2;` says that for all objects `j` in FOOD, the parameter `f_max` has to be greater or equal to what `f_min` is for the same object. If the object doesn't have a value for `f_max` it will be set default to two.
- `param n_min {NUTR} >= 0, default 0;` says that for all objects in `NUTR` the parameter `n_min` has to be greater or equal to zero. If no value given, will be set to zero. An object cannot have a negative nutrition value.
- `param n_max {i in NUTR} >= n_min[i], default Infinity;` says that for all objects `i` in NUTR, the parameter `n_max` has to be greater or equal to what `n_min` is for the same object. If the object doesn't have a value for `n_max` it will be set default to infinity. An object's maximum nutrition value must exceed its minimum nutrition value.
- `param amt {NUTR,FOOD} >= 0;`. Here we define a parameter as a matrix with the relationship between FOOD and its nutrition values.
- `var Buy {j in FOOD} integer >= f_min[j], <= f_max[j];` defines an indexed collection of variables `Buy[j]`, each a member of the set `FOOD`. The part `>= f_min` means that all variables `Buy[j]` cannot be assigned a value less than `f_min[j]`. The part `<= f_max[j];` means that each value given to `Buy[j]` may not be larger than `f_max[j]`. These variables are going to be integers in the interval representing how many of the item is bought.
- `minimize Total_Cost: sum {j in FOOD} cost[j] * Buy[j];` is the objective function which minimizes the cost of all the things we want to buy. It's going to loop through all items in `FOOD`, multiply how many is bought with its price and sum them all up to a total cost.
- `subject to Diet {i in NUTR}: n_min[i] <= sum {j in FOOD} amt[i,j] * Buy[j] <= n_max[i];`. The first line `subject to Diet` specifies that this is a constraint with a name `Diet` in this case. After this it says that the constraint is in a form of an indexed collection, therefore one constraint for every item in NUTR. The next part says that the sum of nutrition values for the objects in FOOD that have a value for `Buy[j]` has to be in the interval between `n_min[i]` and `n_max[i]`.
- The constraint `McNuggetsSauces` says that the number of sauces one can buy is limited by how many nuggets one buys. For example, if we get one 20pcs McNuggets we cannot have more than 6 sauces.

### b)

The problem has the same number of variables as there are objects in `FOOD`, 63. This is because we declare one variable every loop through the set. A few different techniques are used when defining constraints. We have 16 constraints describing relation and 63 constraints describing bounds. We see $0 \le \text{C0003} \le 2$ as one constraint.

### c)

We are going to consider two situations. One where we have a many data points and lots of constraints needed. The other with few data points and constraints.

- optimization in standard format
  - For a problem with many data points, these techniques seem very ineffective as we cannot loop to create neither variables or constraints. This means that it will require many lines of code to model it.
  - For a problem with few data points, modelling it with the standard formats _lp_ and _mps_ feels reasonable. LP looks similar to mathematica which we know is effective in simple situations. MPS looks like it required more lines of code than LP as it is column orientet and is therefore less effective to program manually than LP.
- Using AMPL
  - For large data sets AMPL seems like the best choice. That i because we can loop and declare many variables and constraints on just one line of code. AMPL also seems realistic as it looks easy to use existing data from E.g a database to create sets in which you can perform calculations on.
  - Even for a problem with a small amount of data points it seems reasonable to use AMPL. The syntax of AMPL feels similiar to the mathematical notation of optimization problems.

We also feel like it is a good tool to use if you dont know the dimension of the model you are suppose to define. No matter the size of the problem. This is because you can define groups of constraints that really dont care about the model dimensions. We also feel like it would be rather easy to make "big" changes quickly to your model, without much of an effort, which is a good thing.

- Using Mathematica
  - Matimatica us good to use for simpler problem as it is easy to understand and fairly quick to set up. But as it also feels more like a multi purpose tool, it is better to use AMPL specifically for linear programming problems.
- Standard programming (Java, Python)
  - To use native Java feels pretty tedious to use if you want to solve large linear programming problems since there so many options of data structures and techniques that could be used. We found out that it exists a number of libraries that are to be used for linnear programming in Java, but it still feels like alot of code for doing something that, for instance, AMPL could do in one or two lines. The strengths of Java or python could be the individual expertise in either of these programming languages.

## 2. CLIPS EXPERT SYSTEM SHELL

### a)

We find that there are three parts of the program, deffunctions, engine start rules and query rules.

The deffunctions seems like the part running the program. This is where we draw out the questions and collect answers from the user. The answers are then sent to evaluted by the rules.

The engine state rules defines the states we conclude to based on answers from the query rules. These defines satisfactory states and unsatisfactory states.

The query rules defines what questions to ask and how to interpret the answers from the user. These rules are based on yes/no answers and are the core part of the knowledge base. The collection of answers from all questions results in a conclusion of the engine state.

Last we have the tartup and repair rules which defines what to be done after the questions have been answered.

#### i) Information Represented

#### ii)

#### iii)

## 3. LIFE EXPECTANCY PROBLEM

## 4. EXPECTED INFORMATION PROBLEM

## 5. RESTAURANT PROBLEM
