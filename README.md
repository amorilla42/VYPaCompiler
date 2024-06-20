# VYPA to VYPACODE Compiler

Welcome to the VYPA to VYPACODE Compiler repository! This project is designed to compile VYPA, an object-oriented programming language, into VYPACODE.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [License](#license)

## Introduction

This repository contains a compiler that translates code written in VYPA, an object-oriented programming language, into VYPACODE.
The compiler is designed to help developers seamlessly convert their VYPA projects into VYPACODE, ensuring efficiency and ease of use.

## Installation

To install the compiler, follow these steps:

1. **Clone the repository**:
    ```sh
    git clone https://github.com/amorilla42/VYPaCompiler.git
    cd VYPaCompiler
    ```

2. **Install dependencies**:
    ```sh
      chmod +x gradlew
      ./gradlew
    ```

## Usage

To compile a VYPA file to VYPACODE, use the following command:

```sh
 ./gradlew run --max-workers=1
```

This will generate a corresponding VYPACODE file in the same directory.

## Examples
### VYPA Code Example

```vypa
  void main(void) {
    string str1, str2;
    int p;
    str1 = "This is some text";
    str2 = str1 + " that can be a little longer.";
    print(str1, length(str2), str2, "\n");
    str1 = readString();
    while ((subStr(str1, p, 1)) != "") {
      p = p + 1;
    } // end of while
    print("\nThe length of \"", str1, "\", is ", p, " characters.\n");
  }
```

### VYPACODE Output

```vypacode
#! /bin/vypint
# VYPCode 1.0
JUMP @initExecution

# FUNCTION DEFINITIONS

LABEL main
SET [$SP+2] 0
SET [$SP+4] [$SP+0]
SET [$SP+3] " that can be a little longer."
ADDI $SP $SP 6
CALL [$SP-1] @Concat
SUBI $SP $SP 6
SET [$SP+3] $0
...
SET $0 [$SP+2]
RETURN [$SP-1]

# END FUNCTION DEFINITIONS

LABEL @initExecution
ADDI $SP $SP 1
CALL [$SP-1] main
LABEL @endExecution
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
