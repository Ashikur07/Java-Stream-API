# ☕ Java Stream API --- Complete Learning Roadmap

A structured, hands-on learning journey to understand **Java Stream
API** --- from the fundamentals to advanced operations and real-world
interview problems.

> 🎯 **Goal:** Understand Java Streams deeply through step-by-step
> explanations, runnable examples, dry runs, practice problems, and code
> reviews.

------------------------------------------------------------------------

## 📌 About This Repository

This repository contains my Java Stream API learning notes and practice
programs. Topics are organized from beginner to advanced so I can learn
each concept, write code, test the output, and solve related problems
independently.

-   📚 Learn concepts step by step
-   💻 Practice with small, focused Java programs
-   🔍 Understand filtering, mapping, matching, and collecting
-   🧠 Learn why each operation works---not just memorize syntax
-   🚀 Progress toward advanced operations and interview-style problems

## 🧭 How I Will Learn

For each topic, follow this cycle:

**Learn → Read the Code → Predict the Output → Run → Solve a Problem →
Review**

For every practice problem, try to record:

1.  **Problem:** What needs to be solved?
2.  **Input:** What data are we starting with?
3.  **Expected output:** What should the program return?
4.  **Concepts:** Which Stream operations are being practiced?
5.  **Solution:** The Java code.
6.  **Explanation:** Why the code works, step by step.
7.  **Extra challenge:** A small variation to solve independently.

> **Learning rule:** Do not rush to advanced operations before the
> basics are clear. Try each problem yourself before checking a
> solution.

------------------------------------------------------------------------

## 🗺️ Learning Roadmap

### 00 · Java Prerequisites

**Level:** Beginner · **Topics:** 5

-   [ ] Packages and imports: `import`, `java.util`, and wildcard
    imports
-   [ ] Collections basics: `List`, `ArrayList`, and `Arrays.asList()`
-   [ ] Lambda expression basics: parameters, `->`, and return values
-   [ ] Functional interface basics: `Predicate` and `Function`
-   [ ] Method chaining and reading expressions from left to right

### 01 · Stream API Foundation

**Level:** Beginner · **Topics:** 5

-   [ ] What is the Stream API, and why do we use it?
-   [ ] Collections vs. Streams
-   [ ] Creating streams: `list.stream()`, `Stream.of()`, and
    `Arrays.stream()`
-   [ ] Intermediate vs. terminal operations
-   [ ] Lazy evaluation and the stream pipeline

### 02 · Filtering & Mapping

**Level:** Beginner · **Topics:** 4

-   [ ] `filter()`, `map()`, and `forEach()`
-   [ ] `distinct()`, `sorted()`, `limit()`, and `skip()`
-   [ ] `mapToInt()`, `mapToLong()`, and `mapToDouble()`
-   [ ] Multiple conditions and operation chaining

### 03 · Finding & Matching

**Level:** Intermediate · **Topics:** 4

-   [ ] `findFirst()` and `findAny()`
-   [ ] `anyMatch()`, `allMatch()`, and `noneMatch()`
-   [ ] `count()`, `min()`, and `max()`
-   [ ] `Optional` and `orElse()`

### 04 · Collecting Results

**Level:** Intermediate · **Topics:** 4

-   [ ] `collect()` and `Collectors.toList()`
-   [ ] `Collectors.toSet()` and `joining()`
-   [ ] `groupingBy()` and `partitioningBy()`
-   [ ] `counting()`, `summingInt()`, and `averagingDouble()`

### 05 · Advanced Operations

**Level:** Advanced · **Topics:** 5

-   [ ] `reduce()` and `reduce()` vs. `collect()`
-   [ ] `flatMap()` and nested collections
-   [ ] `Comparator` and multi-level sorting
-   [ ] `toMap()` and duplicate-key handling
-   [ ] Primitive streams, `IntStream`, and `range()`

### 06 · Real-World & Interview Problems

**Level:** Advanced · **Topics:** 6

-   [ ] Employee salary analysis
-   [ ] Student result processing
-   [ ] E-commerce order analytics
-   [ ] Frequency maps and duplicate detection
-   [ ] Top K, second-highest, and multi-level grouping
-   [ ] Parallel streams, performance, and common pitfalls

------------------------------------------------------------------------

## 📂 Repository Structure

### Current practice files

These are the practice files currently listed in this repository:

``` text
Java-Stream-API/
├── Foundation/
│   ├── EvenNumber.java
│   ├── RelationalOperators.java
│   ├── UpperCase.java
│   └── NamesStartingWithA.java
└── README.md
```

### Suggested structure as the repository grows

Add folders and files gradually as each phase is studied. The entries
below are a suggested future structure, not a claim that every file
already exists.

``` text
Java-Stream-API/
├── 00-Prerequisites/
│   ├── ImportBasics.java
│   ├── ListBasics.java
│   ├── LambdaBasics.java
│   └── MethodChaining.java
├── 01-Foundation/
│   ├── StreamBasics.java
│   ├── StreamCreation.java
│   ├── IntermediateVsTerminal.java
│   └── LazyEvaluation.java
├── 02-Filtering-Mapping/
│   ├── PositiveNumbers.java
│   ├── EvenNumber.java
│   ├── RelationalOperators.java
│   ├── UpperCase.java
│   └── NamesStartingWithA.java
├── 03-Finding-Matching/
├── 04-Collecting/
├── 05-Advanced/
├── 06-Interview-Problems/
└── README.md
```

**Package note:** Java package names are conventionally lowercase, for
example `foundation`. If a file declares `package foundation;`, its
directory structure must match the package name. If you are not using a
package declaration, run the file according to your IDE or Java setup.

------------------------------------------------------------------------

## 💡 Current Practice Examples

  -----------------------------------------------------------------------
  File                                What it practices
  ----------------------------------- -----------------------------------
  `EvenNumber.java`                   Filtering even numbers with
                                      `filter()`

  `RelationalOperators.java`          Filtering numbers with multiple
                                      conditions

  `UpperCase.java`                    Transforming strings with `map()`
                                      and `toUpperCase()`

  `NamesStartingWithA.java`           Filtering strings with
                                      `startsWith()`
  -----------------------------------------------------------------------

As new programs are created, add them to this table with a short
description of the concept being practiced.

------------------------------------------------------------------------

## 🛠️ Requirements

-   **Java 16 or later** for examples that use `Stream.toList()`
-   A Java IDE or editor, such as IntelliJ IDEA, Eclipse, or VS Code
-   Basic knowledge of Java syntax, collections, and lambda expressions

> **Compatibility note:** For Java 8--15, replace `.toList()` with
> `.collect(Collectors.toList())` and add
> `import java.util.stream.Collectors;`. `Stream.toList()` returns an
> unmodifiable list, while `Collectors.toList()` does not promise a
> specific mutability characteristic.

------------------------------------------------------------------------

## ▶️ Run an Example

If your Java file is in the `Foundation` directory and does **not**
declare a package, move into that directory and run:

``` bash
javac EvenNumber.java
java EvenNumber
```

If the file declares a package such as `package foundation;`, compile
and run it from the appropriate source root so the directory structure
matches the package:

``` bash
javac -d . foundation/EvenNumber.java
java foundation.EvenNumber
```

Adjust the path and package name to match your actual files. The package
name and directory capitalization must match on case-sensitive systems.

------------------------------------------------------------------------

<!-- ## ✅ Progress Tracker

Update the checkboxes in the roadmap as each topic is completed.

-   **Learning phases:** 7
-   **Planned topic groups:** 33
-   **Approach:** Learn → Code → Test → Review
-   **Current focus:** Build strong fundamentals before moving to
    advanced problems

------------------------------------------------------------------------ -->

## 🤝 Learning in Public

This repository is part of my ongoing Java learning journey.
Suggestions, corrections, and useful practice ideas are welcome.

**Keep learning. Keep coding. Keep improving.** 🚀

------------------------------------------------------------------------

⭐ If you find this roadmap useful, feel free to star the repository.
