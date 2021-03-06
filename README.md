# coding_challenges

## Challenge 1
You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each 
of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Example:
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

Here is the function signature as a starting point (in Python):
```
# Definition for singly-linked list.
class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None

class Solution:
  def addTwoNumbers(self, l1, l2, c = 0):
    # Fill this in.

l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

result = Solution().addTwoNumbers(l1, l2)
while result:
  print result.val,
  result = result.next
# 7 0 8
```

## Challenge 2
Given a grid find the maximum number of connected colors.
The colors are:
'r' - red
'g' - green
'b' - blue

```
g, g, b, r
g, b, r, b
r, b, b, b
```

## Challenge 3
Given a string, find the length of the longest substring without repeating characters.

Here is an example solution in Python language. (Any language is OK to use in an interview, though we'd recommend 
Python as a generalist language utilized by companies like Google, Facebook, Netflix, Dropbox, Pinterest, Uber, etc.,)

```
class Solution:
  def lengthOfLongestSubstring(self, s):
    # Fill this in.

print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
# 10
```


Can you find a solution in linear time?

## Challenge 4
A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the 
longest palindromic substring in s.

Example:
```
Input: "banana"
Output: "anana"

Input: "million"
Output: "illi"
```

```
class Solution: 
    def longestPalindrome(self, s):
      # Fill this in.
        
# Test program
s = "tracecars"
print(str(Solution().longestPalindrome(s)))
# racecar
```

## Challenge 5
Autocompletion. Given a prefix and a list of words find the potential words that match the prefix.

Example:
```
Input: ["dog", "dark", "cat", "door", "dodge"]
       prefix: "do"
Output: ["dog", "door", "dodge"]
```

## Challenge 6
Find k'th largest number in a list of numbers.

Example:
```
Input: [5, 7, 2, 5, 4, 1, 6]
       k = 3
Output: 4
```

## Challenge 7
Given the array of unique numbers find the unique combination of two numbers that add up to 8.

Example:
```
Input: [7, 5, 8, 6, 2, 3, 1]
Output: [[7,1], [5, 3], [6, 2]]
```

## Challenge 8
Concatenation of words. Given an array of words find the words that are concatenation of other words from the array.

Example:
```
Input: ["cat", "cats", "dog", "catsdog"]
Output: ["catsdog"]
```

## Challenge 9
Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the
program are balanced. Every opening bracket must have a corresponding closing bracket. We can approximate this using
strings.

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Note that an empty string is also considered valid.

Example:
```
Input: "((()))"
Output: True

Input: "[()]{}"
Output: True

Input: "({[)]"
Output: False
```
```
class Solution:
  def isValid(self, s):
    # Fill this in.

# Test Program
s = "()(){(())" 
# should return False
print(Solution().isValid(s))

s = ""
# should return True
print(Solution().isValid(s))

s = "([{}])()"
# should return True
print(Solution().isValid(s))
```

## Challenge 10
Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a 
target element, x. Return -1 if the target is not found.

Example:
```
Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
Output: [6,8]

Input: A = [100, 150, 150, 153], target = 150
Output: [1,2]

Input: A = [1,2,3,4,5,6,10], target = 9
Output: [-1, -1]
```
Here is a function signature example:
```
class Solution: 
  def getRange(self, arr, target):
    # Fill this in.
  
# Test program 
arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8] 
x = 2
print(Solution().getRange(arr, x))
# [1, 4]
```

## Challenge 11
Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?

Example:
```
Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
```

Code:
```
class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None
  
  # Function to print the list
  def printList(self):
    node = self
    output = '' 
    while node != None:
      output += str(node.val)
      output += " "
      node = node.next
    print(output)

  # Iterative Solution
  def reverseIteratively(self, head):
    # Implement this.

  # Recursive Solution      
  def reverseRecursively(self, head):
    # Implement this.

# Test Program
# Initialize the test list: 
testHead = ListNode(4)
node1 = ListNode(3)
testHead.next = node1
node2 = ListNode(2)
node1.next = node2
node3 = ListNode(1)
node2.next = node3
testTail = ListNode(0)
node3.next = testTail

print("Initial list: ")
testHead.printList()
# 4 3 2 1 0
testHead.reverseIteratively(testHead)
#testHead.reverseRecursively(testHead)
print("List after reversal: ")
testTail.printList()
# 0 1 2 3 4
```

## Challenge 12
Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.

Example:
```
Input: [3, 3, 2, 1, 3, 2, 1]
Output: [1, 1, 2, 2, 3, 3, 3]

def sortNums(nums):
  # Fill this in.

print sortNums([3, 3, 2, 1, 3, 2, 1])
# [1, 1, 2, 2, 3, 3, 3]
```

Challenge: Try sorting the list using constant space.

## Challenge 13
You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that 
add up to k.

Example:
```
Given [4, 7, 1 , -3, 2] and k = 5,
return true since 4 + 1 = 5.

def two_sum(list, k):
  # Fill this in.

print two_sum([4,7,1,-3,2], 5)
# True

Try to do it in a single pass of the list.
```

## Challenge 14
You are given an array of integers in an arbitrary order. Return whether or not it is possible to make the array 
non-decreasing by modifying at most 1 element to any value.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

Example:

[13, 4, 7] should return true, since we can modify 13 to any value 4 or less, to make it non-decreasing.

[13, 4, 1] however, should return false, since there is no way to modify just one element to make the array 
           non-decreasing.

Here is the function signature:
```
def check(lst):
  # Fill this in.

print check([13, 4, 7])
# True
print check([5,1,3,2,5])
# False
```

Can you find a solution in O(n) time?

## Challenge 15
Do DFS and BFS on Binary tree and M tree.

## Challenge 16
Given an integer k and a binary search tree, find the floor (less than or equal to) of k, and the ceiling (larger than 
or equal to) of k. If either does not exist, then print them as None.

Here is the definition of a node for the tree.

Code:
```
class Node:
  def __init__(self, value):
    self.left = None
    self.right = None
    self.value = value

def findCeilingFloor(root_node, k, floor=None, ceil=None):
  # Fill this in.

root = Node(8) 
root.left = Node(4) 
root.right = Node(12) 
  
root.left.left = Node(2) 
root.left.right = Node(6) 
  
root.right.left = Node(10) 
root.right.right = Node(14) 

print findCeilingFloor(root, 5)
# (4, 6)
```

## Challenge 17
You are given the root of a binary tree. Invert the binary tree in place. That is, all left children should become right
children, and all right children should become left children.

Example:
```
    a
   / \
  b   c
 / \  /
d   e f
```

The inverted version of this tree is as follows:
```
  a
 / \
 c  b
 \  / \
  f e  d
```

Here is the function signature:
```
class Node:
  def __init__(self, value):
    self.left = None
    self.right = None
    self.value = value
  def preorder(self):
    print self.value,
    if self.left: self.left.preorder()
    if self.right: self.right.preorder()

def invert(node):
  # Fill this in.

root = Node('a') 
root.left = Node('b') 
root.right = Node('c') 
root.left.left = Node('d') 
root.left.right = Node('e') 
root.right.left = Node('f') 

root.preorder()
# a b d e c f 
print "\n"
invert(root)
root.preorder()
# a c f b e d
```

## Challenge 18
Implement a class for a stack that supports all the regular functions (push, pop) and an additional function of max() 
which returns the maximum element in the stack (return None if the stack is empty). 
Each method should run in constant time.

Code:
```
class challenge_18:
  def __init__(self):
    # Fill this in.

  def push(self, val):
    # Fill this in.

  def pop(self):
    # Fill this in.

  def max(self):
    # Fill this in.

s = challenge_18()
s.push(1)
s.push(2)
s.push(3)
s.push(2)
print s.max()
# 3
s.pop()
s.pop()
print s.max()
# 2
```

## Challenge 19
You are given a positive integer N which represents the number of steps in a staircase. You can either climb 1 or 2 
steps at a time. Write a function that returns the number of unique ways to climb the stairs.

Code:
```
def staircase(n):
  # Fill this in.
  
print staircase(4)
# 5
print staircase(5)
# 8
```

Can you find a solution in O(n) time?

## Challenge 20
Given an array of integers, return a new array such that each element at index i of the new array is the product 
of all the numbers in the original array except the one at i.

For example, if our input was: [1, 2, 3, 4, 5], 
the expected output would be:  [120, 60, 40, 30, 24]. 
If our input was:             [3, 2, 1], 
the expected output would be: [2, 3, 6].

Follow-up: what if you can't use division?

## Challenge 21
Given a list of numbers, find if there exists a pythagorean triplet in that list. A pythagorean triplet is 3 variables a, b, c where a2 + b2 = c2

Example:
```
Input: [3, 5, 12, 5, 13]
Output: True
```
Here, 52 + 122 = 132.
```
def findPythagoreanTriplets(nums):
  # Fill this in.

print findPythagoreanTriplets([3, 12, 5, 13])
# True
```

## Challenge 22
#TODO
Given two strings, determine the edit distance between them. The edit distance is defined as the minimum number of edits
 (insertion, deletion, or substitution) needed to change one string to the other.

For example, "biting" and "sitting" have an edit distance of 2 (substitute b for s, and insert a t).

Here's the signature:

```
def distance(s1, s2):
  # Fill this in.
         
print distance('biting', 'sitting')
# 2
```

## Challenge 23
#TODO
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words,
find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers
as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.