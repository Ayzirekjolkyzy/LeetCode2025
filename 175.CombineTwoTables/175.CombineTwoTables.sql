Select a.firstname, a.lastname, b.city, b.state from Person a
Left outer join Address b
On a.personId=b.personId;
