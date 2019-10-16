# Problem Module lv7
 
## General info
 
- FIRE group number 75
- module number 7
- By
 
  - Oskar Wallgren, 960107-2292, IT, oskarwallgren@icloud.com
  - Hugo Cliffordson, 970917-5799, IT, cliffords.contact@gmail.com
 
- "We hereby declare that we have both actively participated in solving every exercise. All solutions are entirely our own work, without having taken part of other solutions.
- Number of hours spent for each one of you
  - Both 18h
- Number of hours spent in supervision for this module
  - 5h

## 0. SCHEDULING OF FINAL MEETING
- We are available wednesday October 30th. If possible, we would rather meet morning than afternoon.
## 1. STOCHASTIC TRAFFIC SIMULATION

We know that a determinstic model is a model where the material properties are deterministic and the applied load are determinstic aswell. This means that we can caluculate them exactly, they are not random. In a stochastic model the propoerties are random, i.e they are described with random variables that follow a distribution. The applied load is also random variable. What this means is that a stochastic model has the capacity to handle uncertainty in the inputs built into it. For a determinstic model the uncertainties are external to the model. 

Knowing this we believe that diffrence in the prediction we can draw is that in a stochastic model we can make predictions that are broad and not very specific. We can study the effects of something to understand it better and find relations that might be lost in analytical or numerical treatment. We can make predictions and analyze the predictions performance with a loss function that can desscribe how bad it is to make errors of given size. An example of this is weather forecast, we can draw predictions about tomorrows weather and we can analyze the performance of the prediction, e.g that it has a 70% chance of raining at noon. With deterministic models we can calculate things exactly which means that predictions becomes more of a fact. We could for example draw a prediction about the position of the earth in a astronomical model of planetary motion, but since we could calculate it exactly with the model, the prediction would not vary.
 
## 2.CAR RENTAL PROBLEM
### a)
We have two sites $A$ and $B$. We know that the probability for a car rented at $A$ also left at $A$ is $0.6$. The probability that a car rented at $A$ left at $B$ is $0.4$. Summarized we have these probabilities:
- $A->A=0.6$
- $A->B=0.4$
- $B->B=0.7$
- $B->A=0.3$

From this we can see that we are looking for the probability that we are at one state give that we started at a state. The probability of going towards a state $i$ after being in a state gets us thinking of a markov chain. With this knowledge we can model the transitionmatrix for the probabilties as:
$$
P=
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}
$$

To calculate the probability of going to state $A$ after n steps given that we started in state $A$ we have the following function:

$$
P(X_n=A | X_0=A) = (P^n)_{AA}
$$
This describes the probability that a single car rented in $A$ is in $A$ after $n$ rentals.
### b)

To find out what proportion of cars will be in $A$ and $B$ after a long time we need find an equlibrium. This means that after a long time the proportion of cars will be the same and we have found a steady state. 

To do this we need to find the probability vector in stable state for our tranistion matrix: 
$$
P=
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}
$$

We do this by solving: 
$$
\begin{bmatrix}
    X & Y 
\end{bmatrix}*
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}=
\begin{bmatrix}
    X & Y 
\end{bmatrix}
$$
We know that $X + Y = 1$ so the calculation for the probability vector in stable state will be:

![](markov1.jpeg)

This tells us that we have found the point where the proportion of cars starts to stabalize after a long time. The proportion of cars will be $43\%$  in $A$ and $57\%$ in $B$.

We can control this by checking against our transition matrix after a large number of steps to see the probability of where cars will move depending on state:

$$
P^{1000}=
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}^{1000}\approx

\begin{bmatrix}
    0.43 & 0.57 \\ 0.43 & 0.57
\end{bmatrix}
$$

This tells us we have found our equlibrium and that the proprtion of cars will be: $43\%$  in $A$ and $57\%$ in $B$ in the long run.

### c)
We cannot find a way to determine the expected number of cars as a function of time with the given model in the first parts. This is because we need a correlation between time and rentals.

There are a number of ways to extend the model and get a solution. 
One way is to define time $t$ as directly correlated to number of rentals $n$: ($t=n$). Let's say we have the variables:
- $I_A$: initial number of cars in $A$.
- $I_B$: initial number of cars in $B$.
- $A_C \text{ and }A_B$ number of cars in $A$ and $B$
$$
\begin{bmatrix}
    I_A & I_B
\end{bmatrix}
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}^{t} 
= 
\begin{bmatrix}
    A_C & B_C
\end{bmatrix}
$$
Another extension could be to assume an average number of rentals per day $avg_c$. This would give us the model:
$$
\begin{bmatrix}
    I_A & I_B
\end{bmatrix}
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}^{t*avg_c} 
= 
\begin{bmatrix}
    A_C & B_C
\end{bmatrix}
$$
Both these models does not consider the variation over time in rentals. Reasonably, number of rentals changes for day to day correlated to e.g. vacations etc. This could be described rentals as a function of time, which takes this into consideration $n(t)$.
$$
\begin{bmatrix}
    I_A & I_B
\end{bmatrix}
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}^{n(t)} 
= 
\begin{bmatrix}
    A_C & B_C
\end{bmatrix}
$$
We could improve this model even further by taking the frequency of rentals from both sites $A$ and $B$ into consideration. This added to the model would look like this:
$$
\begin{bmatrix}
    I_A*f_A(t) & I_B*f_B(t)
\end{bmatrix}
\begin{bmatrix}
    0.6 & 0.4 \\ 0.3 & 0.7
\end{bmatrix}^{n(t)} 
= 
\begin{bmatrix}
    A_C & B_C
\end{bmatrix}
$$

This is important because the site's location could affect the number of rentals made in each of the sites. Imagine that one of the sites is located at the airport and the other at a random place outside of a city. Since the probability of where the car is returned varies between the sites, we need to take the frequency of rentals at a site at a time into consideration. 
## 3. TEXT GENERATION 
## 4
## 5
## 6