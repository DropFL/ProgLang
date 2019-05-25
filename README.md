# Programming Language Assignment

This repository is created to update files between Linux cluster and my PC more easily, and describing about the structure of this project.

## Mini-[Kotlin](https://kotlinlang.org/) Project

The goal of PA#2 is writing the *.g4* files describing the [basic grammar of Kotlin](https://kotlinlang.org/docs/reference/basic-syntax.html). Actual parsing task is dealt with [ANTLR4 Library](https://www.antlr.org/), and main objective of this assignment is parsing a valid Kotlin source in a right way **(i.e. generating a correct parse tree)**.

The final version of this project should be able to Translate given Kotlin code into Java **source** (not JVM bytecodes), and it is the objective of PA#3.

### Description about this repo

This project is managed by [Apache Maven](https://maven.apache.org/) but since PA#2 does not include Java program, `src` folder is excluded from this revision.

#### [KotlinLexer.g4](KotlinLexer.g4)

This file is a lexer grammar file, so it only tokenizes given string. There are four non-default modes defined:

* **`PACK_DEF` / `IMPORT_DEF`**
  These modes are package and import statement modes, respectively. Since no whitespaces are allowed in this sentence, there are no skipping tokens in this mode.
* **`STRING`**
  This mode includes a set of tokens inside of string literals. It ignores `WS` token in the `DEFAULT_MODE` and collects any single characters.
* **`ID_TEMPLATE`**
  It is the mode that indicates an `ID`-based string template. This is the sub-mode of `STRING`; it cannot be directly switched from other mode than `STRING`.

  Expression-based string template is parsed on `DEFAULT_MODE`, since separating that mode requires too many extra tokens.

#### [KotlinParser.g4](KotlinParser.g4)

This file is a parser grammar file refers to KotlinLexer. Most contents of it is based on [Kotlin Official Grammar](https://kotlinlang.org/docs/reference/grammar.html).