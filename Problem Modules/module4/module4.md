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
- `param amt {NUTR,FOOD} >= 0;`. Here we define a parameter
- `var Buy {j in FOOD} integer >= f_min[j], <= f_max[j];` defines an indexed collection of variables `Buy[j]`, each a member of the set `FOOD`. The part `>= 0` means that all variables `Buy[j]` cannot be assigned a value less than `f_min[j]`. The part `<= f_max[j];` means that each value given to `Buy[j]` may not be larger than `f_max[j]`. These variables are going to be integers in the interval representing how many of the item is bought. 
- `minimize Total_Cost:  sum {j in FOOD} cost[j] * Buy[j];` is the objective function which minimizes the cost of all the things we want to buy. It's going to loop through all items in `FOOD`, multiply how many is bought with its price and sum them all up to a total cost.

### b)

### c)

### d)

## 2. CLIPS EXPERT SYSTEM SHELL

## 3. LIFE EXPECTANCY PROBLEM

## 4. EXPECTED INFORMATION PROBLEM

## 5. RESTAURANT PROBLEM
