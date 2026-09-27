### Q1. Rohan (a boy) says, "Priya is the daughter of my mother's only son." How is Priya related to Rohan?
* Answer: Daughter

```mermaid
flowchart TD
    RM(("○ Rohan's Mother"))
    Rohan["△ Rohan (Only Son)"]
    Priya(("○ Priya (Daughter)"))

    RM -->|↓ Mother| Rohan
    Rohan -->|↓ Father| Priya
```

### Q2. Pointing to a boy, Neha says, "He is the son of my Dada's only son." How is the boy related to Neha?
* Answer: Brother
``` mermaid 
flowchart TD
    Dada["△ Dada (Paternal Grandfather)"]
    NF["△ Neha's Father (Only Son)"]
    Neha(("○ Neha (Sister)"))
    Boy["△ Boy (Brother)"]

    Dada -->|↓| NF
    NF -->|↓| Neha
    NF -->|↓| Boy
    Neha --- Boy
```

### Q3. Introducing a girl, Amit says, "Her mother is the only daughter of my mother." How is Amit related to the girl?
* Answer: Maternal Uncle 
``` mermaid 
flowchart TD
    AM(("○ Amit's Mother"))
    Amit["△ Amit (Maternal Uncle)"]
    Sister(("○ Amit's Sister / Girl's Mother"))
    Girl(("○ Girl (Niece)"))

    AM -->|↓| Amit
    AM -->|↓| Sister
    Amit --- Sister
    Sister -->|↓ Mother| Girl
```

### Q4. Pointing to a boy, Anjali says, "His mother is the only daughter of my mother." How is Anjali related to the boy? (Comparison with Q3)
* Answer: Mother

```mermaid 
flowchart TD
    AnjM(("○ Anjali's Mother"))
    Anjali(("○ Anjali (Only Daughter / Mother)"))
    Boy["△ Boy (Son)"]

    AnjM -->|↓| Anjali
    Anjali -->|↓ Mother| Boy
```

### Q5. X is the brother of Y. Y is the sister of Z. Z is the father of W. How is X related to W?
* Answer: Paternal Uncle
```mermaid 
flowchart TD
    X["△ X (Paternal Uncle)"] --- Y(("○ Y (Aunt)"))
    Y --- Z["△ Z (Father)"]
    Z -->|↓ Father| W["W (Child)"]
``` 

### Q6. A is the sister of B. C is the mother of B. D is the father of C. E is the mother of D. How is A related to D?
* Answer: Granddaughter (Maternal Granddaughter)
``` mermaid 
flowchart TD
    E(("○ E (Great-Grandmother)"))
    D["△ D (Maternal Grandfather)"]
    C(("○ C (Mother)"))
    A(("○ A (Granddaughter)"))
    B["B (Sibling)"]

    E -->|↓ Mother| D
    D -->|↓ Father| C
    C -->|↓ Mother| A
    C -->|↓ Mother| B
    A --- B
```

### Q7. Pointing to a lady, Rahul says, "She is the daughter of the woman who is the mother of my mother's husband." How is the lady related to Rahul?
* Answer: Paternal Aunt
```mermaid 
flowchart TD
    E(("○ E (Great-Grandmother)"))
    D["△ D (Maternal Grandfather)"]
    C(("○ C (Mother)"))
    A(("○ A (Granddaughter)"))
    B["B (Sibling)"]

    E -->|↓ Mother| D
    D -->|↓ Father| C
    C -->|↓ Mother| A
    C -->|↓ Mother| B
    A --- B
```

### Q8. Showing a photo of a boy, Kavya (a girl) says, "His father is the only son of my father." How is Kavya related to the boy?
* Answer: Mother-in-law (Saas)
```mermaid
flowchart TD
    KF["△ Kavya's Father"]
    KB["△ Kavya's Brother (Only Son)"]
    Kavya(("○ Kavya (Paternal Aunt)"))
    Boy["△ Boy (Nephew)"]

    KF -->|↓| KB
    KF -->|↓| Kavya
    KB --- Kavya
    KB -->|↓ Father| Boy
```

### Q9. Vikas says, "Aman is the son of the wife of my father's only brother." How is Aman related to Vikas?
* Answer: Cousin
``` mermaid
flowchart TD
    GF["△ Grandfather"]
    VF["△ Vikas's Father"]
    VU["△ Father's Only Brother (Uncle)"]
    VW(("○ Uncle's Wife (Aunt)"))
    Vikas["△ Vikas"]
    Aman["△ Aman (Cousin)"]

    GF -->|↓| VF
    GF -->|↓| VU
    VF --- VU
    VU ---|"+"| VW
    VF -->|↓| Vikas
    VU -->|↓| Aman
    VW -->|↓| Aman
    Vikas -.-|Cousins| Aman
```

### Q10. Pointing to a woman, Deepak says, "Her son's wife is the daughter of my father's only son." How is the woman related to Deepak's daughter?
* Answer: Mother-in-law (Saas)
``` mermaid 
flowchart TD
    DF["△ Deepak's Father"]
    Deepak["△ Deepak (Only Son)"]
    DD(("○ Deepak's Daughter (Wife)"))
    Woman(("○ Woman (Mother-in-law)"))
    WS["△ Woman's Son (Husband)"]

    DF -->|↓| Deepak
    Deepak -->|↓ Father| DD
    Woman -->|↓ Mother| WS
    WS ---|"+" Spouse| DD
```

### Q11. If A \ B + C, how is A related to C?
* Answer: Sister
```mermaid
flowchart TD
    B["△ B (Father)"]
    A(("○ A (Daughter / Sister)"))
    C["C (Child)"]

    B -->|Father| C
    B -->|Father| A
    A ---|Siblings| C
```

### Q12. If M − N + O x P, how is M related to P?
Answer: Mother
```mermaid
flowchart TD
    M(("○ M (Wife / Mother)")) ---|Spouse| N["△ N (Husband / Father)"]
    N -->|Father| O["△ O (Brother)"]
    N -->|Father| P["P (Sibling)"]
    M -->|Mother| O
    M -->|Mother| P
    O ---|Siblings| P
```

### Q13. Which expression shows that R is the grandfather of T?
Answer: (a) R + S + T
```mermaid
flowchart TD
    R["△ R (Paternal Grandfather)"]
    S["△ S (Father)"]
    T["T (Grandchild)"]

    R -->|Father| S
    S -->|Father| T
```

### Q14. How is Kabir related to Ravi?
* Grandson
```mermaid
flowchart TD
    subgraph Gen1 [Generation 1 — Grandparents]
        Ravi["△ Ravi (Husband / Grandfather)"] ---|"+"| Meena(("○ Meena (Wife / Grandmother)"))
    end

    subgraph Gen2 [Generation 2 — Parents]
        Arjun["△ Arjun (Only Son / Father)"] ---|"+"| Sita(("○ Sita (Wife / Mother)"))
    end

    subgraph Gen3 [Generation 3 — Grandchildren]
        Kabir["△ Kabir (Son / Brother)"] --- Tara["Tara (Daughter / Sister)"]
    end

    Ravi -->|↓ Father| Arjun
    Meena -->|↓ Mother| Arjun
    Arjun -->|↓ Father| Kabir
    Arjun -->|↓ Father| Tara
    Sita -->|↓ Mother| Kabir
    Sita -->|↓ Mother| Tara
```

### Q15. How is Ravi related to Sita?
* Answer: Father-in-law
```mermaid
flowchart TD
    Ravi["△ Ravi (Paternal Grandfather)"]
    Arjun["△ Arjun (Father)"]
    Kabir["△ Kabir (Grandson)"]

    Ravi -->|↓ Father| Arjun
    Arjun -->|↓ Father| Kabir
```