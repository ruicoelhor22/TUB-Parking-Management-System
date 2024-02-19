This was a project developed between Minho's University and a Public Trasnportation Company from Braga, named TUB.
In this project we used mainly Java to develop the system, using SpringBoot to set up the working environment. The main purpose of the system was to read data captured from cameras on the street, that counted the amount of cars parked, and then compare the amount of tickets sold on the area.
  For this we used Neadvance NIOP platform, and it had the purpose of calculating the number of cars that haven't paid ticket.
We used Apache Khafka to send the information between the modules of the systems, creating new Khafka topics for each  new funtionality. 
It also contains a simple HTML interface where the staff of TUB could interact with the alerts generated. 
