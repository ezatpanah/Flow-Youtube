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
