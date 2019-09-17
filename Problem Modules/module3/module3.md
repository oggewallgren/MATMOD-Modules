# Problem Module lv3
## General info
* FIRE group number 75
* module number 2
* By
  - Oskar Wallgren, 960107-2292, IT, oskarwallgren@icloud.com
  - Hugo Cliffordson, 970917-5799, IT, cliffords.contact@gmail.com

* "We hereby declare that we have both actively participated in solving every exercise. All solutions are entirely our own work, without having taken part of other solutions.
* Number of hours spent for each one of you
  - Both X
* Number of hours spent in supervision for this module
  - Xh 

## 1. Using Basic Discrete Structures
- Set: unordered collection of items. $\\$ 
When we have several persons signed up for a trip and we need to sort them into rooms according to accomodation preferences.


- Sequence: sequentially ordered collection of items. $\\$ 
  Movies sorted based on genre where one movie can appear under more than one genre
- Tree: branching structure with a root. $\\$ 
  When we have a file system on a computer with a root and several folder connected as children
- Graph: Structure with vertices and edges $\\$
  Social relations with individuals as vertices and their connection as edges
- Directed graph: graph where links are directed (usually represented with arrows) $\\$
  The predator-prey example where the predator is in one end an goes along. 
- Weighted graph: graph with a single number for each edge (can be undirected or directed) $\\$ The tram network in Gothenburg with the stations as vertices and connecting rails as edges.

## 2. Project Planning Problem
We know:
- the duration: how long the task T will take; and
- its dependencies: which tasks must be finished before T can be started.

![](up1fig1.jpeg).

### a) 
We can use a directed graph to model this problem. The first thing we did was to model a graph as the one in the figure above. In this graph the nodes are tasks, the weight of the edges are the time the task takes and the amount of in edges are constraints. The constraints describe that in the tasks that has be completed before moving on to the next task. Here we ran into our first problem. We have no clear representation of where we start and where we end. This problem exists because we might have a graph with many nodes that have zero *in edges* or zero *out edges*. 
We solved this by adding a starting node (task) that connects to all the nodes that have zero in edges with a edge that has weight zero and also an ending node (task) that connects to all the nodes with that has zero out edges with an edge of weight zero.
![](up2agraph.jpeg)
### b)
Assuming that we got a program that provides a genereic solution to the shortest path problem in a graph, then we can use this to solve the planning problem. 

Similar to $a)$ we add a start and an end node to represent starting and finishing the project. Then we negate all edges to the cost.
![](up2bgraph.jpeg)

