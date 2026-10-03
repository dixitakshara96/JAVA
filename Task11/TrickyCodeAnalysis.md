# Tricky Code Analysis — Cases 1, 2, 3, 4, 6, 8

## Case 1 — `HashMap.put()` Return Value & Duplicate Keys

### Output

```text
10
2
30
```

### Reason

- `map.put("apple", 10)` stores `apple → 10`.
- `map.put("banana", 20)` stores `banana → 20`.
- `map.put("apple", 30)` uses an existing key, so the old value `10` is replaced by `30`.
- `put()` returns the **old value**, so the first output is `10`.
- There are still only two keys, so `map.size()` is `2`.
- `map.get("apple")` returns the new value `30`.

---

## Case 2 — `get()` on a Missing Key

### Output

```text
null
NullPointerException
```

### Reason

- The map contains only `a → 2`.
- `freq.get('b')` returns `null` because key `b` is missing.
- The first `println` therefore prints `null`.
- `int count = freq.get('b');` tries to assign `null` to primitive `int`.
- Java tries to unbox `null` from `Integer` to `int`, which causes a `NullPointerException`.
- Therefore the second `println(count)` is never executed.

---

## Case 3 — `HashSet.add()` Return Value

### Output

```text
true
false
2 true
```

### Reason

- First `set.add(5)` adds a new element, so it returns `true`.
- Second `set.add(5)` tries to add a duplicate. `HashSet` stores only unique elements, so it does not add it and returns `false`.
- `set.add(7)` adds `7`.
- The set now contains `{5, 7}`, so `set.size()` is `2`.
- `set.contains(7)` is `true`.

---

## Case 4 — Removing While Iterating

### Output

```text
Exception in thread "main" java.util.ConcurrentModificationException
```

### Reason

- The map initially contains `1 → one`, `2 → two`, and `3 → three`.
- The enhanced `for` loop is iterating over `map.keySet()`.
- When `key == 2`, `map.remove(key)` structurally modifies the map while its iterator is being used.
- This causes `ConcurrentModificationException`.
- Therefore `System.out.println(map)` is never reached.
- For removal during iteration, `Iterator.remove()` or `removeIf()` should be used.

---

## Case 6 — Comparing Values Taken from Maps

### Output

```text
true
false
true
true
```

### Reason

- Both maps contain the same entries:
  - `x → 100`
  - `y → 500`

### `a.get("x") == b.get("x")`

- Result: `true`
- `100` is within Java's commonly cached `Integer` range, so both references can refer to the same cached `Integer` object.
- `==` compares object references.

### `a.get("y") == b.get("y")`

- Result: `false`
- `500` is outside the default commonly cached `Integer` range.
- The two `Integer` objects are different references, so `==` is false.

### `a.get("y").equals(b.get("y"))`

- Result: `true`
- `.equals()` compares the actual integer values.
- Both values are `500`.

### `a.equals(b)`

- Result: `true`
- Both maps contain the same key-value mappings, so the maps are equal.

---

## Case 8 — Capital Letters in a Count Array

### Output

```text
ArrayIndexOutOfBoundsException
```

### Reason

- The string is `"Java"`.
- The loop uses:

```java
count[ch - 'a']++;
```

- This indexing formula assumes that `ch` is a lowercase letter from `a` to `z`.
- The first character is uppercase `J`.
- `'J' - 'a'` produces a negative index.
- A negative index is invalid for `int[26]`, whose valid indices are `0` through `25`.
- Therefore Java throws `ArrayIndexOutOfBoundsException`.
- `System.out.println(count[0])` is never executed.
