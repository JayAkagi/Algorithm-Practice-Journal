## Tier 2: Pattern Recognition (Early Stage) 🧠

### Focus
At this stage, I’m not chasing optimal solutions.

I’m training myself to:
- Stay calm and patient when facing a problem
- Break it down into small, controllable steps
- Translate intent directly into Java code
- Build solutions that work before worrying about elegance

---

## What This Code Represents

This file is a hands-on practice ground for array manipulation and early pattern recognition.

The problems here are solved:
- Explicitly
- Step by step
- Without shortcuts

Some solutions are still verbose or imperfect.  
That’s intentional.

---

## Implemented Exercises

### Reverse Array 🔄

I reverse an array in place by swapping elements from the outside toward the center.

This forces me to:
- Respect index boundaries
- Think in pairs
- Understand when work is complete

The goal isn’t cleverness.  
It’s controlled movement through the array.

---

### Move All Zeros to the End 🧱

This solution works logically but is overstructured on purpose.

I separate the problem into two clear phases:
1. Preserve non-zero values
2. Fill the remaining space with zeros

I use distinct roles for reading and writing to avoid overwriting useful data.

I’m aware this can be simplified.  
I’m choosing correctness and clarity before refinement.

This problem is marked for revisiting once my pointer control is sharper.

---

### Check If Array Is Sorted ✅

I verify whether an array is sorted by comparing each element with the next one.

The moment the order breaks, I stop.

This reinforces:
- Early exits
- Trusting simple logic
- Avoiding unnecessary work

Sometimes the cleanest solution is the most direct one.

---

### Remove Duplicates from Sorted Array 🧩

I remove duplicates **in place** by separating read and write responsibilities.

Array is already sorted.  
I move through the array once:
- One pointer reads new values
- One pointer writes only when a new unique value is found

I return the count of unique elements and leave the remaining values on the right side untouched.

Those extra values do not matter.

This exercise trains:
- Pointer coordination
- In-place modification
- Trusting constraints instead of fighting them

---

### Remove Duplicates (Experimental) 🧪

This version uses a set to track uniqueness.

I am intentionally breaking from the in-place rule here.

The goal is not to improve the main solution.  
The goal is to compare thinking styles.

This helps me see:
- How extra memory simplifies logic
- Why constraints exist
- When clarity is gained and when control is lost

This is exploratory code, not a replacement.

---

## Rules I’m Following 📌

- I write working code first
- I don’t hide behind abstractions
- I allow early solutions to be rough
- I revisit problems when my understanding improves
