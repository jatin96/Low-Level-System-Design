## General guidelines

Questions to ask:

1. What type of app are we designing
    - web app/apis
    - entity/only class diagram
    - commandline
    - Desktop app (no need to persist), no need to divide in controller, repository etc.
2. Do we need to persist the data
3. How will we take the input? through API or command line
4. Ask about edge cases

## Gathering requirements

- Start with visualization
- Draw class diagram to get idea of if all classes cover the requirements

## How to approach the code of LLD

- First create folders for structure like creation of controllers, services, repositories, models, exceptions, strategies
- Then start with creation of model classes
- Either take values via constructor or instantiate within the class
- Implement features one by one
- Services should be general because they will be used by many controllers
- controllers should be focused on 