# Adapter Pattern

This is used when you have multiple external apis which can be used in your code. you cannot depend on the signature of these apis because these can change. So you create a fixed signature through an interface and create concrete implementations of those based on the external apis. 

# How to use

- Create interface defining the contract you would be using in your code.
- Create implementations of that interface based on the external apis.
- Use your interface methods in your entire code.
