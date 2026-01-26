# 🧠 DSA Practice — Next Phase (Recursion)

## 🧭 Operating Rules (Still Apply)

- Java only
- No streams
- No shortcuts
- No loops unless explicitly allowed
- Correctness before optimisation
- Explain each step out loud

If I can’t explain the base case and the recursive step, I don’t own it.

---

## 🔥 Warm-Up (10 minutes)

Re-write **from memory**:

1. Frequency counting using `HashMap`
2. First non-repeating element (two-pass logic)

Rules:
- No peeking
- Fix mistakes calmly
- Focus on clarity

Goal: transition from hashing mindset to recursion mindset.

---

## 🎯 Main Focus — Recursion Fundamentals

This phase is about answering **three questions every time**:

1. What is the base case?
2. What is the smaller subproblem?
3. What does this call trust the next call to do?

If any of these are unclear, stop and rethink.

---

### Exercise 1: Print 1 → N (Recursively)

Input:
N = 5


Output:
1 2 3 4 5


Rules:
- No loops
- One recursive call per function
- Base case must be obvious

Goal:
- Understand call order
- Learn where to place the recursive call

---

### Exercise 2: Print N → 1 (Recursively)

Input:
N = 5


Output:
5 4 3 2 1


Rules:
- No loops
- Same function shape as previous exercise

Goal:
- See how changing call position changes behavior
- Build intuition for stack flow

---

### Exercise 3: Sum of First N Numbers

Input:
N = 5


Return:
15


Rules:
- No loops
- Return values through recursion
- Handle base case cleanly

Goal:
- Learn how values move *back up* the call stack

---

### Exercise 4: Reverse a String (Recursively) ⬅️ 🟢📍🙋🏽‍♂️  Currently Here

Input:
"abcd"


Output:
"dcba"


Rules:
- No loops
- No extra data structures
- Think in terms of:
  - what each call returns
  - how results are combined

Goal:
- Understand recursion as “build result on the way back”

---

## 🧪 Validation Phase

For each recursion problem:
- Write down the base case in a comment
- Write down what the recursive call assumes
- Trace one example by hand (stack frames)

If tracing feels confusing, slow down.

---

## 🧱 Pattern Recognition Drill (Important)

Write short notes answering:
- What stops the recursion?
- How does the problem get smaller?
- What would happen if the base case was wrong?

These answers prevent infinite recursion later.

---

## 🚫 Things I Am Not Doing Yet

- Backtracking
- Trees
- Dynamic programming
- Memoization

Those come later. This tier is about **discipline first**.

---

## ✅ End Condition 

I’m done with this tier when:
- Base cases feel automatic
- I can predict call order without running the code
- Recursion feels structured, not magical

---

> **Recursion works when I stop trying to control everything.**


### Status 🚥
- Print 1 → N (Recursively) : 🟢Completed
- Print N → 1 (Recursively) : 🟢Completed
- Sum of First N Numbers : 🟢Completed
- Reverse a String (Recursively) : 🟡Planned