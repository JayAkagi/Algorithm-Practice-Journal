# 🧠 DSA Practice — Next Phase (After Two Pointers)

## 🧭 Operating Rules (Still Apply)

- Java only
- No streams
- No shortcuts
- Correctness before optimisation
- Explain your logic out loud

If I can’t explain it, I don’t own it yet.

---

## 🔥 Warm-Up (10 minutes)

Re-write **from memory**:

1. Check if an array is sorted  
2. Remove duplicates from a sorted array  

Rules:
- No peeking at old code
- Fix bugs calmly

Goal: confirm retention, not speed.

---

## 🎯 Main Focus — Hashing vs In-Place Thinking

Today is about **contrast**, not just solving.

---

### Exercise 1: Two Sum (Unsorted Array)

Example:
Input: [2,7,11,15], target = 9
Output: true (or indices, depending on choice)


Rules:
- Use `HashMap`
- One pass if possible
- Decide what you return (boolean or indices) and be consistent

Goal:
- Learn when hashing makes problems trivial
- Feel the difference compared to two-pointer problems

---

### Exercise 2: First Repeating Element

Example:
"abca" → 'a'
"abc" → null


Rules:
- Use `HashSet`
- Scan left to right
- Return the first character that repeats while scanning

Goal:
- Reinforce “first seen vs seen before” logic
- Build instinct for early exit

---

### Exercise 3: Frequency Counting

Pick **one**:
- Count frequency of elements in an array
- Count character frequency in a string

Rules:
- Use `HashMap`
- Print counts clearly
- Handle empty or null input

Goal:
- Get comfortable with counting patterns
- Understand how often this shows up everywhere

---

## 🧪 Validation Phase

For each hashing problem:
- Test with edge cases
- Explain why hashing is the right tool
- Explain what would happen without hashing

This is where judgment develops.

---

## 🧱 Pattern Recognition Drill (Important)

Write a short comment answering:
- Why did hashing feel easier here?
- Why would hashing be a bad choice for some array problems?
- When does “extra memory” become worth it?

These answers matter later in future scenarios such as pair prog/interviews.

---

## 🚧 Optional Stretch (Only If Fresh)

### Group Anagrams (Intro Version)

Input:
["eat","tea","tan","ate","nat","bat"]


Rules:
- Use `HashMap`
- Don’t over-optimise
- Focus on clarity

If this feels heavy, stop. It’s optional.

---

## ✅ End Condition ⬅️ 🟢📍🙋🏽‍♂️  Currently Here

I'm done when:
- HashMap problems feel “obvious”
- I know when **not** to use hashing
- I can explain the tradeoff between:
  - in-place logic
  - extra memory logic

---

### Status 🚥
- First Repeating Element : 🟢Completed
- First Non-Repeating Element : 🟢Completed
- Two Sum (HashMap) : 🟢Completed
- Frequency Counting (HashMap) : 🟢Completed