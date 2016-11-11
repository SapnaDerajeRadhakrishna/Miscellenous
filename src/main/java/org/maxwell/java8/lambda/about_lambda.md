1. A lambda expression can have zero, one or more parameters.
2. The type of the parameters can be explicitly declared or it can be inferred from the context. e.g. (int a) is same as just (a)
3. Parameters are enclosed in parentheses and separated by commas. e.g. (a, b) or (int a, int b) or (String a, int b, float c)
4. Empty parentheses are used to represent an empty set of parameters. e.g. () -> 42
5. When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a
6. The body of the lambda expressions can contain zero, one or more statements.
7. If body of lambda expression has single statement curly brackets are not mandatory and the return type of the anonymous function 
	is the same as that of the body expression.
8. When there is more than one statement in body than these must be enclosed in curly brackets (a code block)
and the return type of the anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.