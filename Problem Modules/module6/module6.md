# Problem Module lv6

## General info

- FIRE group number 75
- module number 6
- By

  - Oskar Wallgren, 960107-2292, IT, oskarwallgren@icloud.com
  - Hugo Cliffordson, 970917-5799, IT, cliffords.contact@gmail.com

- "We hereby declare that we have both actively participated in solving every exercise. All solutions are entirely our own work, without having taken part of other solutions.
- Number of hours spent for each one of you
  - Both 12h
- Number of hours spent in supervision for this module
  - 4h

## 1. Whales and Krill Problem
### a)
### b)


We know we have an equilibrium when rate of change is zero, $k' \text{ and } w'= 0$. From the first equation $w'=(-m+nk)w=0$ Directly we can see that there is an equilibrium whem $w=0$. We can also simplify it. 
$$
(-m+nk)w=0 \\
-mw+nkw=0\\
-m+nk=0\\
k=\frac{m}{n}
$$
We see that there is an equilibrium when $k=\frac{m}{n}$. Let's do the same for the other equation $k'=(a-bw)k=0$. Just like the first equation we can see that there is an equilibrium when $k=0$. When we simplify we get:
$$
(a-bw)k=0 \\
ak-bwk=0 \\
a-bw=0 \\
w=\frac{a}{b}
$$
There's another equilibrium when $w=\frac{a}{b}$. 

Now that we have found the equilibrium points we analyze the stablility of each one. We do this by drawing a graph with the two populations in conjunction. Analyzing the first points when $w$ and $k$ are zero and moving along the axes we can see that it moves towards the equilibrium along the $w$-axis and away along the $k$-axis. This means that the equilibrium when $(k=0, w=0)$ is unstable. This is reasonable because considering a non-present whale population, krill population can grow unhindered. It is also reasonable that whale population decreases when there is no krill poopulation present. 

![](up1b.jpeg)

Next, we analyze the equilibrium when $w=\frac{a}{b}$ and $k=\frac{m}{n}$. Here we get that values circle around the equilibrium, we can describe this by giving a description of each numerated point in the graph.
1. This points represents when we have a large whale population and krill population is small. From this points it is going to move towards a point where whale population decreases until there is enough krill again.
2. This point represents when both whale and krill populations are small. Here krill is going to grow as there are few whales stopping the increase.
3. Here we have a large krill population but few whales. The large number of krill are going to stimulate whale population growth and it's going to move towards a larger whale population.
4. Here both whale and krill population is large. But more importantly the whale population has increased to a point where it's going to decelerate the krill population growth.

### c)
With values for the constants we get the equations:
$$
w'=(-0.5+0.000001k)w \\
k'=(0.2-0.0001w)k
$$
The equations for the current value of the population are then going to be
$$
k_{n+1}(t)=k_{n}+tk'_{n} \text{ and } w_{n+1}(t)=k_n+tk'_n 
$$
Simulating this with Euler's method in a table of the values looks like this:
| time | Approx $k$ | Approx $w$ |
|------|----------|----------|
| 0    | 700000   | 3000     |
| 0.3  | 679000   | 3180     |
| 0.6  | 654963   | 3351     |

This means that with starting values $3'000$ whales and $700'000$ krill, results changes to $654'963$ krill and $3'351$ whales after $0.6$ years.
### d)
To start of this analysis we use want to see what it looks like along both axises. $k=20000, w=0$. We can see that the krill population is going to start off at $20'000$ and then take off like shit! The opposite goes for the whales. It's going to start start high and then drop to zero, where it will stay.

Using the same values as in **c)** we get a completely different result. Both the values from $k$ and $w$ are pending from high to low, depending on eachother. We see that when the krill population is reaching its peak, the population of whales increses drastically and affects the krill population to decrease drastically. The same thing happens in reverse when whale population hits its peak. 

Another conclusion we can draw by picking diffrent starting points is that the values start to circle around the equilibrium. If the krill is low and whale is high the values are changing, meaning that krill starts increasing and whales decreasing. This justifies the equlibrium that we found in b. 
### e)
### f)

## 2. Signal Processing Problem

## 3. Drug Dosage Problem

## 4. Socratic Questioning
### a) 
 - *Question:* Have you done a plot of the data points in a graph?
  
 - *Question:* What can we say about the data points? Are they linnear or not?
 - *Question:* Can you guess the form of the function? *Discussion errupts*.
 - *Question:* Based on the form you guessed, can you use the values in the table to deffine the function more precisely to fit the data? Can it be justified?
  



### b)
 - *Question:* Have you plotted the function in combination with points? How well does your function fit with all the points?


 - *Qusetion:* What are your functions edge cases? Like when x goes to zero or infinity. Is it reasonable that the data should behave similarly for the problem?
 - *Question:* What other form of functions follows a similar pattern, try plotting!

### c)
- *Question:* What do we know? We start listing the values we know from the question.
  
- *Question:* Is there a relation between these values? Have you tried plotting them?
- *Question:* How do we know that the machine is worth buying? How do we know it's a good investment?
- *Question:* Is there anything else they can do to increase sales? What does the data say?

### d)
- *Question:* What do you think the question is asking for? (This starts a discussion where the group starts talking about the problem, which can lead to them understanding it more without a supervisor telling them anything. A classic *rubber duck* situation).
  
- *Question:* What part of the question are you having trouble with? (We can try to formulate it in another way)
- *Question:* Can we break it down to smaller parts?
- *Situation:* If they give suggestions that are not relevant, try to ask questions that disproves it. If they are on the right track, just let them continue and ask if they feel like they can move on. 