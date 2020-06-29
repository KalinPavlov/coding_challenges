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

Here is an example solution in Python language. (Any language is OK to use in an interview, though we'd recommend Python as a generalist language utilized by companies like Google, Facebook, Netflix, Dropbox, Pinterest, Uber, etc.,)

```
class Solution:
  def lengthOfLongestSubstring(self, s):
    # Fill this in.

print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
# 10
```


Can you find a solution in linear time?

## Challenge 4
A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.

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
Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

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