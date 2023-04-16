- Each flow API has 3 components : 
   - Flow Builder(Speaker)
   - Operator(Translator)
   - Collector(Listener)

## Speaker 
- It will **think** like do a task and **emit** items.
- There are 4 types of speakers : `flowOf()`, `asFlow()`, `flow{....}`, `channelFlow{....}`
- flowOf() creates a flow from fixed set of values.
- asFlow() prints values from 1 to 5 from the loop (See code).
- ```
   flow{
   
  }.collect{
  
      }
  ```
  
 - ```
    channelFlow{
     // use send instead of emit
     }.collect{
     
     }
     
     ```

## Operators

- There are 2 types of operators : **Terminal and Intermediate.**
- **Why Terminal Operators ?** : Flows are cold and they won't produce a value until a terminal operator is called.
- **collect{...}** is the most common terminal operator.
- **filter{...}** works like if condition.
- **if condition is satisfied?** Execute map part now.
- **first{...}** It returns only the first emission of the flow.
- **last{...}** 
- **toList()**
- **toSet()**
- **reduce{...}**  Reduce operator allows performing operation over all items of the flow to reduce them into one item.
