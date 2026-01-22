# 🧠 DSA Practice - Start 🏁

### Task
Implement or re-implement:

1. Reverse an array in place  
2. Check if an array is sorted (ascending)  
3. Count how many times a given number appears  

Rules:
- No streams
- No libraries beyond basic arrays
- One loop per problem if possible

Goal: get into “control mode”.

---

## 🎯 Main Focus — Two Pointers (Core Skill)

This is the **primary objective** for today.

### Exercise 1: Move All Zeros to the End (In Place)

Example:
[0,1,0,3,12] → [1,3,12,0,0]


Rules:
- Modify the array in place
- Preserve order of non-zero elements
- No extra arrays

After writing:
- Rewrite once more from memory

---

### Exercise 2: Remove Duplicates from a Sorted Array

Example:
[1,1,2,2,3] → [1,2,3,,]
Return: 3


Rules:
- Array is already sorted
- Overwrite duplicates
- Return number of unique elements
- Only `a[0..k-1]` is valid after

Mental model:
- One pointer reads
- One pointer writes
- Duplicates are ignored, not deleted

---

### Exercise 3: Remove Duplicates (Allow At Most Two)

Example:
[1,1,1,2,2,3] → [1,1,2,2,3,_]
Return: 5


Rules:
- Same array
- Same in-place idea
- Slightly stricter condition

If this feels hard, that’s normal.  
Think in terms of “what is allowed to be written”.

---

## 🧪 Validation Phase

For each exercise:
- Test with edge cases:
  - empty array
  - single element
  - all duplicates
  - no duplicates
- Say out loud what each pointer represents

If you can explain it, you understand it.

---

## 🧱 Secondary Practice (Optional if Time Allows)  ⬅️ 🟢📍🙋🏽‍♂️  Currently Here

### Hashing Contrast Exercise

Implement **one** of the above problems again using:
- `HashSet` or `HashMap`

Then write a short comment:
- Why this version is easier
- Why it uses more memory
- Why the in-place version still matters

This is about **understanding tradeoffs**, not replacing techniques.

---

## 🧠 Reflection (5 minutes)

In comments or notes, answer:
- Which problem felt most natural?
- Which one required the most discipline?
- What mistake did I catch myself making?

No long writing. Bullet points are enough.

---

## 🚫 Rules for Today

- Do not jump to new topics
- Do not watch solution videos
- Do not optimise prematurely
- Do not rush

Boring correctness is the goal.

---

## ✅ End Condition

Today is a success if:
- Two-pointer problems feel clearer than yesterday
- You can rewrite at least one solution from memory
- You stayed calm while debugging

Stop when tired.  
Progress compounds.

---