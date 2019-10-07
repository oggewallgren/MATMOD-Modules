# Reflection module 4

## I. WEEKLY MEETING AND FOLLOW-UP LECTURE

### a) Did you have your compulsory weekly meeting with a supervisor?

We had a meeting with Robin during one of the supervisions. We mostly talked about the behaviour of expert systems and our interpretation.

### b) Did both of you attend the compulsory follow-up lecture? If you already talked to us about this, please explain.

We attended the follow-up lecture.

### c) If you were asked to talk to a supervisor about the main submission, who did you talk to?

We were not asked to talk to a supervisor.

## II. WHAT DID YOU EXPERIENCE AND LEARN?

For the first problem we learned the basics of AMPL, the fundamental idea and how it could be used to model linear programming problems. We also reasoned on when to use different tools to model a linear progrmamming problem, comparing tools we've used before with AMPL and standard formats.

Working with CLIPS Expert system we first learned to interpret CLIPS, basic sytax and structure. We also reasoned around the idea of CLIPS and how it is used to model knowledge of an expert. After understanding the basic idea of CLIPS we discussed how we could use the same IF-THEN structure and their answers to make the computer draw probabilistic conclusions. We discussed the complexity of both method and made the conclusion that a probabilistic approach is more complex but perhaps give a more realistic answer.

We started with the Life Expectancy problem discussion how 50 attributes from a sample with size 1000 would look linearly. We thought it reasonable that we had sufficint data to determine a model "good enough" based on the idea that we had to determine a coefficient for 50 attributes which seems possible considering we have 1000 different cases. For a quadratic model we though it possible and even better based on that a quadratic model can include coefficients for dependent variables while a linear doesn't. We learned this to be wrong because of the number of parameters a quadratic functions generates. We do not have enough deceased people for this.

We discussed how a normal distribution considering all 50 attributes and came to the conclusion that there is in fact a way to model a multivariate normal distribution in the case of several attribures. We reasoned that this would be a good approach and give a better representation of life expectancy that both previous models. This can partly be justified by that for an attribute like weight, we want to know if a person is overweight or underweight, this can easier be modeled with normal distribution.

Modeling this with machine learning seems at first like a good idea. But for a machine learning algoritm to be really good we might need more data than 1000 cases. This is because we would have to train the algoritm before we can actually use it. We reasoned that by using machine learning we could get a computer to define the relations between certain variables better than what we humans could.

In the expected information problem

The restaurant problem was at first difficult to approach, we spent a long time thinking about different strategies and broke the problem down to smaller parts. Like, what would happen over the course of four days? five days? We set up ideal cases for both person which led us to that person $A$ would prefer the regualar restaurant and person $B$ the other. Following we learned think of a "personal strategy" in a methematical way and model it accordingly.

## III. (HOW WELL DID YOU SOLVE THE PROBLEMS?)
