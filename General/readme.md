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
- We do not usually have constructor with parameters for Entity classes


## General flow

- It is a good idea to draw and visualize before drawing the class requirement
- We can also identify the nouns from the requirements to identify the entities
- Service class should never depend on DTO, it should always depend upon the entities


## LLD requirment gathering

- Draw a high level diagram and ask one by one details for each layer
- For example, for email campaign management - ask about company, campaign, email etc



## TODO

- Read how java reflection works and how it is used to implement annotations
- Read java persistence tutorial
- Make a list of common Java annotations
- udemy java springboot
- General notes on LLD like how to create a command line app etc.
- Creating custom exceptions
- A good design is where controllers are dumb, there job is marshalling and unmarshalling
- Create a general template for LLD like command line app, API app, general class
- what are spring beans
- Practice drawing diagrams etc : draw entites, find composition or aggregation, find caridnality

