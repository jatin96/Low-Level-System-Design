# Where to Use Command Pattern
- Use command pattern when you have to take commands as input like when creating a command line application.

# How to Use Command Pattern ? 

- Create a folder commands
- Create interface / abstract class which called Command. It has two methods called execute and matches
- All the commands implement Command interface.
- Add a static constant called COMMAND_NAME to all commands.
- Create a CommandRegistry which has register, deregister and execute methods. The register and execute methods take input string as parameter and then do processing.
- In Client, create CommandRegistry object and then add the commands one by one using register method. 

