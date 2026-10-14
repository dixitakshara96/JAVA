# Tricky Code Analysis --- Java

## Score: **8/10**

**Attempted:** 8/10 cases\
**Not attempted:** Case 2 and Case 10\
**Scoring note:** This is a strict, concept-based score. Correct output
alone gets credit where it matches the code, but cases with a missed
core bug receive partial or no credit. Case 6 gets partial credit
because the predicted array matches the loop's behavior only after
fixing the compilation error.

------------------------------------------------------------------------

## Case 1 --- Swap Without `temp`

**Actual output:** `olllo`\
**Your answer:** `olllo` --- ✅ Correct

**Why:** `s[l] = s[r]` overwrites the left character. Then `s[r] = s[l]`
copies that already-overwritten character back, so both positions become
the right-side character. This is **not a valid swap**.

**Correct swap:**

``` java
char temp = s[l];
s[l] = s[r];
s[r] = temp;
```

## Case 2 --- Skipping Characters Without a Bound Check

**Actual result:** `StringIndexOutOfBoundsException`\
**Your answer:** Not attempted

**Why:** The string `".,"` contains no letters or digits. The left-skip
loop keeps incrementing `l` until it tries `s.charAt(2)`, but valid
indices are only `0` and `1`.

**Lesson:** Check bounds while skipping:

``` java
while (l <= r && !Character.isLetterOrDigit(s.charAt(l))) l++;
while (l <= r && !Character.isLetterOrDigit(s.charAt(r))) r--;
```

Also ensure the second skip loop is safe after the first loop changes
the pointers.

## Case 3 --- Pair Sum on an Unsorted Array

**Actual output:** `Not found`\
**Your answer:** `Not Found` --- ✅ Output correct

**Why:** The array is `{8, 1, 5, 3}` and a valid pair exists:
`5 + 3 = 8`. But the two-pointer sum strategy relies on the array being
**sorted**. On an unsorted array, moving `l` or `r` based on whether the
sum is too small or too large can skip a valid pair.

**Fix:** Sort the array first (if changing its order is allowed), or use
a `HashSet` to find a pair in linear expected time.

## Case 4 --- `l <= r` in Pair Sum

**Actual output:** `1 1`\
**Your answer:** `1 1` --- ✅ Output correct

**Why:** When `l == r == 1`, the code adds `arr[1] + arr[1]`,
i.e. `5 + 5 = 10`. It uses the **same array element twice**.

**Fix:** For a pair of distinct elements, use:

``` java
while (l < r)
```

## Case 5 --- Move Zeroes, Half Done

**Actual output:**

``` text
[1, 3, 12, 3, 12]
3
```

**Your answer:** Correct --- ✅

**Why:** The first three positions are overwritten with non-zero values,
but the code never fills the remaining positions with zeroes.
`write = 3` correctly counts the three non-zero values.

**Fix:**

``` java
while (write < a.length) {
    a[write] = 0;
    write++;
}
```

Save the non-zero count before this loop if you need to print it
afterward.

## Case 6 --- Sort Colors (Dutch National Flag)

**Your answer:** `{1,0,2}` --- ⚠️ Partial credit

**Important:** As pasted, the code **does not compile** because `mid++`
appears outside any method. If that stray line is removed, the loop
produces `[1, 0, 2]`, which is still incorrect.

**Why:** In the `else` branch, the code swaps `a[mid]` with `a[high]`.
The element swapped into `mid` has not been checked yet, so `mid` must
**not** increase there.

**Fix:**

``` java
} else {
    swap(a, mid, high);
    high--;
}
```

Keep `mid++` only in the `0` and `1` cases.

## Case 7 --- Window Max That Starts From 0

**Actual output:** `0`\
**Your answer:** `max = 0` ---✅ Output correct, reasoning needs
correction

**Why:** All length-2 window sums are negative: `-6`, `-9`, and `-8`.
Since `max` starts at `0`, `Math.max(0, negativeSum)` always remains
`0`. The correct maximum window sum is **`-6`**.

**Fix:** Initialize `max` to the first valid window sum, or to
`Integer.MIN_VALUE` before evaluating windows.

## Case 8 --- Shrinking With `if` Instead of `while`

**Actual output:** `3`\
**Your answer:** `best = 3` --- ✅ Output correct, but the algorithm needs to be remembered 

**Why:** For `"abba"`, when the second `b` repeats, the code removes
only one character from the set. The duplicate `b` remains, yet the code
adds it and counts an invalid window. It reports `3`, although the
longest substring without repeating characters has length **`2`**
(`"ab"` or `"ba"`).

**Fix:**

``` java
while (set.contains(s.charAt(r))) {
    set.remove(s.charAt(l));
    l++;
}
set.add(s.charAt(r));
```

## Case 9 --- `substring()` and Window Length

  -----------------------------------------------------------------------------------
  Expression              Correct result                      Your answer
  ----------------------- ----------------------------------- -----------------------
  `s.substring(1, 5)`     `"acec"`                            `"acec"` ✅

  `s.substring(1, 6)`     `"aceca"`                           `"aceca"` ✅

  `r - l + 1`             `5`                                 `5` ✅

  `s.substring(5, 1)`     Throws                              Exception ✅
                          `StringIndexOutOfBoundsException`   
  -----------------------------------------------------------------------------------

**Why:** Java `substring(begin, end)` includes `begin` but excludes
`end`. For `"racecar"`, index `1` is `c`, and index `5` is `a`. The end
index must be greater than or equal to the begin index.

**Remember:** For an inclusive window from `l` to `r`, use
`substring(l, r + 1)`. Its length is `r - l + 1`.

## Case 10 --- Comparing Two Count Arrays

**Actual output:**

``` text
false
false
true
```

**Your answer:** Not attempted

**Why:** Both arrays contain the same letter counts, but `==` and
`.equals()` on arrays compare **object identity**, not their contents.
`Arrays.equals(c1, c2)` compares the elements, so it returns `true`.

**Correct comparison:**

``` java
Arrays.equals(c1, c2)
```

------------------------------------------------------------------------

## Focus Revision --- Start Here

1.  **Case 2:** Pointer bounds while skipping characters.
2.  **Case 6:** Dutch National Flag --- do not advance `mid` after
    swapping with `high`.
3.  **Case 7:** Initialize maximum correctly when values can all be
    negative.
4.  **Case 8:** Use `while`, not `if`, when a sliding window must remove
    multiple characters.
5.  **Case 10:** Array reference comparison versus content comparison.

### Final takeaway

Your main improvement area is not syntax alone; it is identifying **loop
invariants and edge cases**. Before running a two-pointer or
sliding-window loop, ask: *What must be true about the pointers and the
current window after every iteration?*
