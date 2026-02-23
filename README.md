#BootcampJava
Java Rest ful Api criada pra estudo
#Diagrama De Código 
mermaid ...
classDiagram

class User {
  - String name
  - Account account
  - Card card
  - List~Feature~ features
  - List~News~ news
}

class Account {
  - String number
  - String agency
  - double balance
  - double limit
}

class Card {
  - String number
  - double limit
  - double availableLimit
  - String brand
}

class Feature {
  - int id
  - String icon
  - String description
}

class News {
  - int id
  - String icon
  - String description
}

User --> Account
User --> Card
User --> Feature
User --> News
...
