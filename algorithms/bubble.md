

##Algorithm
[from here](https://en.wikipedia.org/wiki/Bubble_sort#Pseudocode_implementation)
```
procedure bubbleSort( A : list of sortable items )
   n = length(A)
   repeat 
     swapped = false
     for i = 1 to n-1 inclusive do
       /* if this pair is out of order */
       if A[i-1] > A[i] then
         /* swap them and remember something changed */
         swap( A[i-1], A[i] )
         swapped = true
       end if
     end for
   until not swapped
end procedure
```
Although bubble sort is one of the simplest sorting algorithms to understand and implement, its O(n2) complexity means that its efficiency decreases dramatically on lists of more than a small number of elements. Even among simple O(n2) sorting algorithms, algorithms like insertion sort are usually considerably more efficient.


