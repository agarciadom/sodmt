<?xml version="1.0" encoding="UTF-8"?>
<UC:UseCasesModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:UC="http://UseCasesModel">
  <modelingActors name="Customer" useCase="//@modelingUseCases.0/@ownedUseCase.0 //@modelingUseCases.0/@ownedUseCase.1 //@modelingUseCases.0/@ownedUseCase.2"/>
  <modelingActors name="Sales Department" useCase="//@modelingUseCases.0/@ownedUseCase.3 //@modelingUseCases.0/@ownedUseCase.4 //@modelingUseCases.0/@ownedUseCase.5"/>
  <modelingUseCases name="SOA Keraben">
    <ownedUseCase xsi:type="UC:BusinessService" name="Order submission" actor="//@modelingActors.0"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Order status reporting" actor="//@modelingActors.0"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Order issue notification" actor="//@modelingActors.0"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Estimated demand submission" actor="//@modelingActors.1"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Production status reporting" actor="//@modelingActors.1"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Production issue notification" actor="//@modelingActors.1"/>
  </modelingUseCases>
</UC:UseCasesModel>
