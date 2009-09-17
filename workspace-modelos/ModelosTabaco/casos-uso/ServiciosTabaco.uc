<?xml version="1.0" encoding="UTF-8"?>
<UC:UseCasesModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:UC="http://UseCasesModel">
  <modelingActors name="Distribuidoras mayoristas" useCase="//@modelingUseCases.0/@ownedUseCase.2"/>
  <modelingActors name="Plantas empaquetadoras" useCase="//@modelingUseCases.0/@ownedUseCase.1"/>
  <modelingActors name="Plantas de pretratado" useCase="//@modelingUseCases.0/@ownedUseCase.0"/>
  <modelingUseCases name="SOA Tabaco">
    <ownedUseCase xsi:type="UC:BusinessService" name="Compra de tabaco sin tratar" actor="//@modelingActors.2"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Compra de tabaco pretratado" actor="//@modelingActors.1"/>
    <ownedUseCase xsi:type="UC:BusinessService" name="Compra de tabaco empaquetado" actor="//@modelingActors.0"/>
  </modelingUseCases>
</UC:UseCasesModel>
