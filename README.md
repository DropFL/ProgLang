# Programming Language Assignment

This repository is created to update files between linux cluster and my PC more easily, and describing about the structure of this project.

## Simple Assignable Calculator using [ANTLR4](https://github.com/antlr/antlr4)

PA#1 is about implementing listener-based calculator that can assign a value to variables and refer to the assigned value while evaluating an expression.

In this version, it does not need to detect referring undefined variable; like JS.

### Description about this repo

This project is managed by [Apache Maven](https://maven.apache.org/), so actual source files are located to `src/main/java` and testing sources are in `src/test/java`. On this README, test files are not covered.

#### [Expr.g4](Expr.g4)

Unlike other source files, this file is located out of `src`, because [VSCode ANTLR4 extension](https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4) has an issue about [producing output files on local .antlr folder](https://github.com/mike-lischke/vscode-antlr4/issues/16), which can mess up the classpath.

There are four lexer tokens and parser rules defined in this file:

* Lexer Tokens
  * `NUM` : decimal notation of real numbers, include integers.
  * `ID` : possible name of variables. The rule is same to C.
  * `WS` : White spaces. It is a skipped token.
  * `END` : Semicolon. It indicates the end of a statement.
* Parser Rules
  * `prog` : Program. It is defined as a array of statements.
  * `stmt` : Statement. It is an expression or an assignment, terminated with a semicolon.
  * `expr` : Expression. It can be a number(`NUM`) or a variable(`ID`), or a valid composition of them (refer to the file). An expression *always* has a value.
  * `assn` : Assignment. It is assigning(`=`) a value(`expr`) to a variable(`ID`). **It is not considered as an expression**, so it does not produce any value.

#### Java Files

Some base classes that ANTLR4 produces from `*.g4` file are not covered in this section. This is the list of those classes:

* `ExprLexer` (child class of [Lexer](https://www.antlr.org/api/Java/org/antlr/v4/runtime/Lexer.html))
* `ExprParser` (child class of [Parser](https://www.antlr.org/api/Java/org/antlr/v4/runtime/Parser.html))
* `ExprListener` (child interface of [ParseTreeListener](https://www.antlr.org/api/Java/org/antlr/v4/runtime/tree/ParseTreeListener.html))
* `ExprBaseListener` (child class of `ExprListener`)

Refer to [ANTLR4 Java Runtime API Documentation](https://www.antlr.org/api/Java/) for more information about them.

##### 1. `ExprEvalApp`: Main Class

This class contains the main function. A flow of this program is following:

1. receives an input file from command arguments. If it is missing, it gets an user input from console.
2. If the input is `"interactive"`, it receives input from the console repeatedly, until the input is `"exit"`. Otherwise, it reads an input from the file.
3. Evaluates the input string. Go back to step 2 on interactive mode.

`eval` function corresponds to step 3 above. It is separated from `main` for unit test.

`testFile` and `testString` are unit test functions, but not used in this version.

##### 2. `ExprEvalListener`: Listener Class

This class is a child class of `ExprBaseListener`. It listens to the trail of `ParseTreeWalker` through `ParseTree`, and does some tasks corresponds to current step.

In detail, this class executes shunting-yard algorithm and produces postfixed expression. At the end of each statement, it finally evaluates the formula. If it is an `expr`, the result is printed to the console. Otherwise, (i.e. if it is an `assn`,) the value is assigned to the indicated variable.

##### 3. `ExprValue`: Value Wrapping Class

`ExprValue` encapsulates `ID` and `NUM`, which have **actual values**. Since the value extraction process is different, it need to be abstracted with `val()`.

Additionally, this class manages object-pool to get the same `ExprValue` from the `ID` nodes have the same texts.

##### 4. `ExprOperator`: Operator Wrapping Class

`ExprOperator` is an enumerator contains a character that corresponds to the operator, actual operation, precedence, and evaluation/operator stack management policy.

In this class, private interfaces `IBinaryOperator` and `IPrecedence` is declared, and operating and stack managing logic is delegated to them, respectively.

##### 5. `ExprUtil`: Utility Class

This is an non-instantiable class that contains some useful static methods. Those methods are about handling objects defined in ANTLR4 and adapting them to the system of this calculator.