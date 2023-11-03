# GPCIt calculates the total number of houses in the neighborhood based on the number of blocks and houses per block.

It initializes an array route to represent the order in which you will visit the houses. Initially, route is filled with a sequential order of house numbers.

It shuffles the route to randomize the order of house visits. This is done by swapping the positions of houses randomly in the array.

It reverses the shuffled order to ensure that you visit the houses in reverse order, intending to be the last to finish. This is achieved by swapping the first and last elements, the second and second-to-last elements, and so on.

Finally, it prints the shuffled and reversed route to the console.
