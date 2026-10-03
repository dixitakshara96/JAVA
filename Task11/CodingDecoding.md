# Coding-Decoding — Answer Key & Key Concepts

## Level 1 – Letter Coding

### Q1. BRAIN → CTDMS; SMART → ?
**Answer: (b) TODVY**

**Concept:** Successive forward shifts of `+1, +2, +3, +4, +5`.

- B → C (+1)
- R → T (+2)
- A → D (+3)
- I → M (+4)
- N → S (+5)

Apply the same shifts to SMART:
- S → T
- M → O
- A → D
- R → V
- T → Y

Therefore, **SMART → TODVY**.

---

### Q2. GARDEN → OFESBH; FLOWER → ?
**Answer: (d) SFXPMG**

**Concept:** Reverse the word, then shift every letter one place forward.

`GARDEN` → `NEDRAG` → `OFESBH`

For `FLOWER`:
`FLOWER` → `REWOLF` → `SFXPMG`

Therefore, **FLOWER → SFXPMG**.

---

### Q3. WATER → DZGVI; SMILE → ?
**Answer: (a) HNROV**

**Concept:** Atbash coding — each letter is replaced by its opposite letter in the alphabet:
`A↔Z, B↔Y, C↔X, ...`

- W → D
- A → Z
- T → G
- E → V
- R → I

For `SMILE`:
- S → H
- M → N
- I → R
- L → O
- E → V

Therefore, **SMILE → HNROV**.

---

### Q4. MOTHER → NMUFFP; FATHER → ?
**Answer: (c) GYUFFP**

**Concept:** Alternating shifts of `+1, -2`.

`MOTHER`:
- M → N (+1)
- O → M (-2)
- T → U (+1)
- H → F (-2)
- E → F (+1)
- R → P (-2)

Apply the same pattern to `FATHER`:
- F → G
- A → Y
- T → U
- H → F
- E → F
- R → P

Therefore, **FATHER → GYUFFP**.

---

### Q5. COMPUTER → PMOCRETU; KEYBOARD → ?
**Answer: (b) BYEKDRAO**

**Concept:** Divide the word into two equal halves and reverse each half separately.

`COMPUTER` → `COMP | UTER` → `PMOC | RETU`

For `KEYBOARD`:
`KEYB | OARD` → `BYEK | DRAO`

Therefore, **KEYBOARD → BYEKDRAO**.

---

## Level 2 – Number Coding

### Q6. PAINT → 74128; EXCEL → 93596; ACCEPT → ?
**Answer: (a) 455978**

**Concept:** Each letter has a fixed numerical code.

From the given examples:
- P = 7
- A = 4
- I = 1
- N = 2
- T = 8
- E = 9
- X = 3
- C = 5
- L = 6

So:
`ACCEPT` = A C C E P T = **4 5 5 9 7 8**

Therefore, **ACCEPT → 455978**.

---

### Q7. ACE → 1925; BAD → 4116; FIG → ?
**Answer: (d) 368149**

**Concept:** Each letter is replaced by the square of its alphabet position, and the results are concatenated.

- A = 1 → 1² = 1
- C = 3 → 3² = 9
- E = 5 → 5² = 25

Thus `ACE → 1 | 9 | 25 = 1925`.

For `FIG`:
- F = 6 → 36
- I = 9 → 81
- G = 7 → 49

So `FIG → 36 | 81 | 49 = 368149`.

Therefore, **FIG → 368149**.

---

### Q8. CAT = 72, DOG = 78, FISH = 168; LION = ?
**Answer: (c) 200**

**Concept:** Add the alphabet positions of the letters and multiply by the number of letters.

- CAT: `(3 + 1 + 20) × 3 = 24 × 3 = 72`
- DOG: `(4 + 15 + 7) × 3 = 26 × 3 = 78`
- FISH: `(6 + 9 + 19 + 8) × 4 = 42 × 4 = 168`

For LION:
`(12 + 9 + 15 + 14) × 4 = 50 × 4 = 200`

Therefore, **LION = 200**.

---

## Level 3 – Sentence, Substitution and Decoding

### Q9. Sentence coding
Given:
- `sky is blue` → `ta na pa`
- `blue and green` → `ka ta ma`
- `green is fresh` → `na ma ra`

**Answer: (a) pa**

**Concept:** Find common words between sentences and match their common codes.

`blue` occurs in the first and second sentences. Their common code is `ta`, so **blue = ta**.

`green` occurs in the second and third sentences. Their common code is `ma`, so **green = ma**.

`is` occurs in the first and third sentences. Their common code is `na`, so **is = na**.

The remaining code in `sky is blue` is `pa`, therefore **sky = pa**.

---

### Q10. Substitution coding
**Answer: (b) sharpener**

**Concept:** Follow the renamed-object chain rather than the object's original name.

Given:
- pen is called pencil
- pencil is called eraser
- eraser is called sharpener
- sharpener is called scale

A student actually uses an **eraser** to rub out a pencil mark. But in this code language, `eraser` is called **sharpener**.

Therefore, the coded answer is **sharpener**.

---

### Q11. KDVK PDS → ?
**Answer: (d) HASH MAP**

**Concept:** Every encoded letter is 3 places after the original letter, so decoding means shifting every letter **3 places backward**.

- K → H
- D → A
- V → S
- K → H
- P → M
- D → A
- S → P

Therefore, **KDVK PDS → HASH MAP**.

---

## Level 4 – Conditional Coding (Q12–Q15)

> **Important note:** The letter/code table in the supplied question text is formatting-corrupted. The entries appear to have lost their row/column alignment (for example, the exact codes associated with some letters are unclear). Because Q12–Q15 depend directly on that table, their option letters cannot be independently verified from the pasted text alone.
>
> The answer choices below are therefore recorded according to the answer key supplied with the questions, while the applicable conditional-coding concepts are explained.

### Q12. EGPKMT
**Supplied answer: (c) 2971%#**

**Key concept:** Conditional coding based on the **first and last letters**. First determine whether the first/last letters are vowels or consonants, then apply the relevant condition before coding the remaining letters.

For this question, the first letter is `E` (a vowel) and the last letter is `T` (a consonant), so **Condition 1** is the relevant rule: interchange the codes of the first and last letters. The remaining letters are coded from the table.

**Answer recorded from the supplied key: (c) 2971%#**.

---

### Q13. MBRADK
**Supplied answer: (a) *@$53***

**Key concept:** Both the first letter `M` and last letter `K` are consonants, so **Condition 2** applies: the first and last positions receive the special consonant-condition code. The letters in the middle are coded according to the given table.

**Answer recorded from the supplied key: (a) *@$53***.

---

### Q14. TGAKPE
**Supplied answer: (b) 295172**

**Key concept:** The first letter `T` is a consonant and the last letter `E` is a vowel, so **Condition 3** applies. The last letter is coded using the code of the first letter; the other letters follow the table.

**Answer recorded from the supplied key: (b) 295172**.

---

### Q15. AKDTPE
**Supplied answer: (d) 51327#**

**Key concept:** Again check the first and last letters before applying ordinary table coding. Here the first letter `A` is a vowel and the last letter `E` is a vowel, so none of the three special conditions involving a vowel/consonant mismatch or two consonants applies. Code the letters directly from the table.

**Answer recorded from the supplied key: (d) 51327#**.

---

## Final Answer Key

| Q | Answer | Core concept |
|---|---|---|
| 1 | **B — TODVY** | Increasing shifts +1, +2, +3, +4, +5 |
| 2 | **D — SFXPMG** | Reverse word + shift every letter +1 |
| 3 | **A — HNROV** | Atbash / opposite alphabet |
| 4 | **C — GYUFFP** | Alternating +1, −2 |
| 5 | **B — BYEKDRAO** | Reverse each half separately |
| 6 | **A — 455978** | Fixed letter-to-number mapping |
| 7 | **D — 368149** | Square of alphabet positions |
| 8 | **C — 200** | Sum of positions × number of letters |
| 9 | **A — pa** | Common-word/common-code elimination |
| 10 | **B — sharpener** | Substitution chain |
| 11 | **D — HASH MAP** | Shift back 3 letters |
| 12 | **C — 2971%#** | Conditional first/last-letter coding* |
| 13 | **A — *@$53*** | Both-end consonant condition* |
| 14 | **B — 295172** | First consonant + last vowel condition* |
| 15 | **D — 51327#** | Direct table coding after condition check* |

\* **Q12–Q15:** The pasted letter/code table is not aligned correctly, so these four answers are recorded from the supplied answer key rather than independently reconstructed from the damaged table.

## Quick Revision: Coding-Decoding Patterns

1. **Progressive shifts:** Look for +1, +2, +3... or another repeating shift pattern.
2. **Reverse + shift:** Check whether the word is reversed before letters are shifted.
3. **Atbash:** Pair alphabet positions from opposite ends: A↔Z, B↔Y, etc.
4. **Alternating shifts:** Test patterns such as +1, −2, +1, −2.
5. **Half reversal:** Split an even-length word into two halves and reverse each half.
6. **Fixed number mapping:** Build a letter→number dictionary from the examples.
7. **Alphabet-position operations:** Test squares, sums, products, or differences of letter positions.
8. **Sentence coding:** Use common words between sentences to identify common codes.
9. **Substitution coding:** Follow the complete chain of renamed objects.
10. **Conditional coding:** Always inspect the first and last letters first; the special rule may change their codes before normal table coding is applied.
