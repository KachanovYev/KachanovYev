# ☕ aibolit Contributions

---

### 🛠️ [Fix NPath metric calculating for `if` conditions (PR #836)](https://github.com/cqfn/aibolit/pull/836)

- **Type:** 🐞 Bug Fix, ✅ test improvements
- **Issue:** [#810 Improved NPath complexity test coverage](https://github.com/cqfn/aibolit/issues/810)
- **Description:**  
  Improved the accuracy of `NPath` complexity calculation for `if` conditional statements.
    - Fixed improper `NPath` metric calculation in the core analyzer.

### 📝 **Contribution summary**

Bug Fixes:
- Fixed a critical bug in `NPath` metric calculation for conditional statements in the aibolit static analyzer.

Test Improvements:
- Enhanced test coverage and accuracy for `NPath` complexity metrics.

---

### 🛠️ [Deprecated classes JavalangImproved and Lines remain in the codebase(PR #841)](https://github.com/cqfn/aibolit/pull/841)

- **Type:** 🧹 Refactoring
- **Issue:** [#834 Deprecated classes JavalangImproved and Lines remain in the codebase](https://github.com/cqfn/aibolit/issues/834)
- **Description:**
  There are deprecated classes JavalangImproved and Lines that are deprecated, with the later one used by the former.
  Both need to be removed as presumably not used anywhere else.
  Lines - https://github.com/cqfn/aibolit/blob/master/aibolit/utils/lines.py
  JavalangImproved - https://github.com/cqfn/aibolit/blob/master/aibolit/utils/java_parser.py

### 📝 **Contribution summary**

Removed legacy Java AST parsing and line handling utilities, including related classes and methods.
Deleted deprecated utility files and associated test files.

---

### 🛠️ [Metrics do not accept ast in test_config.py (PR #839)](https://github.com/cqfn/aibolit/pull/839)

- **Type:**  ✨ features, ✅ test improvements
- **Issue:** [#829 Metrics do not accept ast in test_config.py](https://github.com/cqfn/aibolit/issues/829)
- **Description:**  
  Ensure All Metrics Accept `ast: AST` Parameter with Type Hints
  Verify that all metrics in the config accept an AST parameter with proper type hints.
  Probable solutions:
    1. Every metric factory in patterns_config["metrics"] produces a metric with:
        - A parameter named "ast" in its call signature
        - The "ast" parameter properly annotated as `aibolit.ast_framework.ast.AST` or a subclass
    2. Remove any metrics that cannot comply with this interface.

### 📝 **Contribution summary**

Tests:
- Improved metric configuration tests by ensuring only relevant metrics are checked for correct parameter annotations.
Enhanced test reliability by removing expected failure status and introducing stricter validation for metric
parameters.
Refined tests for method call metrics to explicitly build and use AST objects, improving clarity and test structure. 

New Features:
- Updated metrics to accept abstract syntax tree (AST) objects directly for method call calculations.
Added return type annotations for method call metrics to clarify output as integers.
Introduced new metrics "Local Methods Calls" and "External Methods Called" and a new pattern "This in constructor" to
the configuration.

---

### 🛠️ [Implement bidirect index pattern (PR #842)](https://github.com/cqfn/aibolit/pull/842)

- **Type:**  ✨ features, 📚 documentation, ✅ test improvements
- **Issue:** [#742 bidirect_index.py:18-25: Implement bidirect index pattern](https://github.com/cqfn/aibolit/issues/742)
- **Description:**  
  If the same numeric variable is incremented and decremented within the same method,
  it's a pattern. A numeric variable should either be always growing or decreasing.
  Bi-directional index is confusing. The method must return a list with the line numbers
  of the variables that match this pattern. After implementation, activate tests in
  test_bidirect_index.py

### 📝 **Contribution summary**

New Features:
- Added detection of bidirectional index variables in Java source files, identifying variables that are both incremented
and decremented within the same method or block.
Extended AST node types to include augmented assignments, identifiers, and unary operations.

Documentation: 
- Improved docstrings to provide detailed explanations of the feature's functionality and usage.

Tests:
- Enabled the test case for bidirectional index detection by removing the skip decorator, allowing tests to run.
Updated tests to process Java source code as lists of lines instead of file paths.

---