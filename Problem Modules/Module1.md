# Problem Module lv1
## 1. Formulas Problem
- How do we know it's reasonable? 
- How well can it be expected to fit with reality? (exact or aprox)


* Pythagoras theorem: $a^2+b^2=c^2$

  - Pytharogas theorem gets me thinking about distance between objects
  - If either $a$ or $b$ is $0$, we end up with $a^2 = c^2$ (the same line are equal lengths) which we know to be true. 
  - If we sum the quadrat of both cathetus $3^2+4^2=5^2$

* Stock index = $2045 +0.0034t$
  - since this is made up index we don't bother about the $2045$ or $0.0034$. What we know is that it is an approximation because we cannot predict the future. There's one unrealistic part of the equation. A stock index cannot be linear since a percental increase every year results in a exponetial curve.
* Population = $C*a^t$ where $t =$ time in years
  - This is also an approximation since we're trying to predict the future.
  - It is realistic since it's an exponential equation and population has a percental increase every year. 
* Gravity between bodies: $F = \frac{Gm_1m_2}{r^2}$
  - What this equation is telling us is that when distance increases ($r^2$), $F$ decreases, when $m_1$ or $m_2$ increases, $F$ increases. It seems realistic that the force between objects should decrease when the distance between them increases. It also seems right that the force between objects should increase as the mass increases. We can only assume that it is exact since it's based on experiements by experienced proffessors and backed up by a science community.
* Newton's force: $F=ma$
    - This is an equation with existing measurable parameters that exists in time and space. Therefore we can assume it's exact. Reasonably the $F$ should increase as both mass ($m$) and acceleration ($a$) increases. Considering the example of me pushing something. If I want it to accelerate, it's going need more force applied if it's heavier. 
* Parcel max size: $100*weight+length < 320$
  - We know the equation is reasonable as a parcel has a measurable weight and a length. The constant multiplier also seems reasonable as we then exclude something with extreme low weigth and then large length.
  - It's an exact equation as the parameters are measurable.   
  - This is a linear equation.
* presentStudents + absentStudents = allStudents
  - We know this is true as students can only exist in two states, present or absent. The sum of these are all students.
  - It's an exact equation as we can count the number in each group.
* Electric current: $I_1 + I_2 + I_3 = 0$ in a circuit knot
    - This feels reasonable as we assume current are preserved and that the input are constants. Since the current entering is positive and the current leaving is negative and we know that the parameters are constant. The sum of all current will be equal to zero.
    - ![](circuit.png)
    - An exact equation as long as we assume that it's preserved
* Insurance rebate in percentage $=\text{insurances}*2 + 0.2*min(7, \text{years customer)}$
    - Given the standard case with one insurance and 7 as a multiplier we get $3.4$% rebate. As the description says, a good customer should get a lower rate. But a one year customer gets a lower rate than a 30 year old customer according to this equation, which seems wrong.
    - It's an exact equation as we're working with measurable parameters.
    - Linear equation
* $(a+b)^2=a^2+2ab+b^2$
  - This is realistic with this image as proof and if one or both of the parameters are zero. The corresponding expression remains true.
  - ![](ab2.png)
  - It's an exact equation as parameters are measurable
  - this is a quadratic equation
* $A>=0.8L*I$ (dimensioning requirement for 12V cables if you have a current $I[A]$, cable length $L[m]$ and cable area $A[mm^2]$
  - It's reasonable that we need more cable area if length of the cable increases. It's also reasonable that we need a thicker cable if current increases and therfore more cable area.
  - We feels it's more of an apporximation than an exact equation because to get the area of a cylinder, we would need to involve $π$. $0.8$ is an approximation.
  - This equation is linear because we have two unknown
* air drag force $= C* v^2 * A$
  - it's reasonable that drag increases as both velocity and cross section area increases. The same as feeling more air force drag with hand opened than closed. It's also reasonable that we would need a constant as shape of the object has an inpact on the air force drag. 
  - This seems like an approximate equation as the equation is very simple and a calculation like this should be more advanced. Especially considering the shape of the object.
  - this is a quadratic equation.
* $weight = C* length^3$  (the constant C should be chosen depending on type of object e.g. persons, dogs, cars)
  - Feels like a weak estimate of a weigth. Especially considering the constant $C$. For example. compare a chihuahua and a pug. THey are both the same length but obviously not the same weight.
  - Since the length is cubed, the weigth will have a large variance for change in length.
* $P[\text{getting heads when tossing a coin}] = 1/2$
  - This we know to be true as long it is a fair coin. It has two sides with equal chance of getting chosen. Since we're dealing with probability, testing this out would probably not result in a 50/50 result. But as sample size increases we would get closes to $1/2$.

## 2 
Plotting the points in a graph we get: 
![](graph2.png)
- We could find a linear regression for the points by calculating $\beta_0$ and $\beta_1$ in the equation $y=\beta_0+\beta_1x$.$$
