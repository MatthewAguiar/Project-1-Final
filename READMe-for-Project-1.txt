Authors: Matt Aguiar and Winnie Ly

Project Title: 
Facebuk/Project 1:

Introduction:
The Facebuk project gives profiles for a person, pet, possession, or moment
and their respective details (i.e., list of friends, moments, possessions, etc.)
It is capable of adding a friend, getting the maximum clique of friends of the target
person/pet, getting the happiest moment, and the friend that the target person/pet is
most happiest with.

Design:
During the beginning of our project, we drew out a hiearchy of classes and methods 
that we needed in order for the project to run without any errors. We had placed a 
class called Identity as top tier class and the class beneath it, called Account, 
which makes Identity "own" Account. From there, we had branched out from Account to 
another subclass called AnimateAccount in which classes Person and Pet inherit 
from it. For classes Moment and Possession, they are inheriting from Acccount.

FriendRequest class:
In the FriendRequest class, it has a method called "approve" in which the given
friend must be friends with two other friends and they both must confirm the friend
request in order to add each other to their respective friends' list. 

Identity class:
The Identity class gives the name and image of the given account. 

Account class:
The Account classi owned by Identity and contains an equals method that 
returns true if the name of the object being passed in with the object are the same.

AnimateAccount class:
The AnimateAccount class contains setters and getters for friends and moments. 
There are methods for adding a friend, finding the average happiness among friends,
getting the friend that the target person/pet is happiest with, finding the happiest 
moments of the given target person/pet, testing if the clique of the target
person's/pet's set of friends are all friends with each other and finding the
maximum clique of friends of the given target person/pet.

Utility class:
In the Utility class, we find the sum of the elements in the array list which 
can be used for the method findMeanOfList that finds the average of the given 
sum of an array list. The methods maxDoubleInList and maxIntInList are used to 
find the maximum value of that given type in the array list. For the buildList 
method, it is used to return the updated array list when there is value to be
added on. This class is essential for providing functionality for the methods 
getOverallHappiestMoment and getFriendWhomIAmHappiest in the AnimateAccount class. 
 

Running Tests:
In the test for finding the best moment, either a person/pet calls the method 
getOverallHappiestMoment and it should return back the moment in which the 
person/pet had the highest average happiness values among its participants. 
This is possible through the method of findAverageHappinessAmoungMoments
which returns a list of the moments that the person/pet is happiest in. Then 
through getOverallHappiestMoment, it takes that list and filters out the moment 
where the average happiness values are the highest.

In the test for finding the friend with whom the target person/pet is happiest
with, it is the same process with finding the happiest moment amoung the target 
person/pet. However, instead of going through an array list of moments, 
it goes through another an array that contains the target person's/pet's friends
in which they participated in the array list of moments. 

In the test for adding a friend, either a person or pet calls the add friend method
with a passed in argument which results in a creation of an array list of that
person or pet with the passed in argument as an element in that list. 

In the test for approving a friend request, we must create some person or pet objects
and then have the creation of a friend request object:

FriendRequest friendRequest = new FriendRequest(person1, person2);

which indicates that when "approve" is called with the passed in agrument, person1 
and person2 must be friends with the argument so then person1 would be added to
person2's list of friends and person2 would be added to person1's list of friends. 


Built With:
Eclipse Java 2018-09
