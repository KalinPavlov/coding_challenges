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
