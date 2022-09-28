# ImprovedBubbleSort

During a class session, I had an idea for optimizing Bubble Sort. While watching annimations of the sort, I noticed that the largest element was being swapped along until a larger element was found. The previous largest element would be left behind. So I thought, what if you take the next largest with you.

As it turns out, by shifting the group of largest elements, what I had actually created was an Insertion Sort. 

While there are likley many more optimizations to be made, this is the result of my idea and testing. There is a breif comparision driver that creates an identical array and times the sorting of each sort. 

I conducted a manual sort confirmation. However, if I were to continue, I would create detailed unit tests for each algorithm to ensure they are actually sorting corretly.
