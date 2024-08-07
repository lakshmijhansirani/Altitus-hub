The rotating array takes 0(n) time complexity and O(1) space 
we are first checking is k>=n k=k%n to avoid cyclic array rotations
->first reversing an entire array 
-> reversing first k elemnts
the revrsing next elemnts from k to end of array
now the array is rotated


Contiguous maximum sum using kadens Algorithm

thes alogorithm takes O(n) time linear and O(1) space constant
we are itearting and checking each and evry elemnts and maintaining two variables cursum and maxsum whenever we added neagative elements the sum becomes -ve for that we are checking the condition like 
if(sum<0)
making sum=0;
