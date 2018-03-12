## Jets Project

### Week 2 Homework for Skill Distillery - Jets

#### Description
This project creates a fleet of WWII-era planes with different capabilities. The user is presented with a menu to 
access information on the various planes, including listing all planes, reviewing the fastest one one with the longest range, and adding their own plane. 
To start the program, run JetsApp. The very smart user then types a listed number to choose a <strong>listed</strong> option. The user can keep choosing options until they choose to "exit the airfield" (quit). For the "quit" option, I used some code I found on StackOverflow.
I had an a-ha moment Sunday night on understanding the classes and launching the app, but I didn't want to change things, worried about messing it up right before due-time. 
JetsApp initiates a new AirField. AirField holds the planes array and the methods for listing, adding new, viewing fastest/furthest. The prices are a guess for most of these planes, not sure how one would go about buying a Vickers Warwick. 
The abstract class Jet holds variables for the model, speed, range, and cost plus the getters and setters for these. JetImpl, CargoPlane, and FighterJet all extend from the Jet class. CargoCarrier and CombatReady contain some behaviors for FighterJet and CargoPlane and interface with those two classes. I'm not sure I did this right, still fuzzy on the interfaces. 


#### Technologies used
Objects, interfaces, loops through arrays

#### Lessons learned
I definitely need to learn how to roll code back from github. I messed up one of my files so I just copied/pasted from my last push but I'm sure that's not really the way that's supposed to work. 
Still fuzzy on interfaces, I don't think I added that option correctly. 
