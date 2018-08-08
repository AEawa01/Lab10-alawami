1. Discuss the differences among the results. Does the starting point make a difference?
Answer:
--------
Yes, Starting point makes difference in the result. 
Because, starting vertex is the vertex where the algorithm starts. 
Except random walk, all traversal algorithm prints the start vertex as its first visited vertex and then traverse all over the graph according to the algorithms.
But in the random walk, it always picks the random vertex among all vertices. It does not consider the start vertex at all.   


2. Give two or three examples of how/why a real-world map might require more than four colors?
Answer:
--------
To color any planar graph four colors are enough to color the graph.
But for conflict that are not possible to draw in a planar graph may need more than four colours.
Example 1:
if 5 vertex's of a graph are connected all other 4 vertices then we at least need 5 colors to draw.
Example 2:
Portuguese, French, Belgian, British, German are connected to each other. So we need at least 4 colors to draw.  


3. Discuss how ClosestFirstIterator and RandomWalkIterator work?
Answer:
--------
ClosestFirstIterator gives the vertexes in the order of the distance from the start vertex.
RandomWalkIterator selects the random edge out of the start vertex and then 
it select the random vertex from the current selected vertex and so on.