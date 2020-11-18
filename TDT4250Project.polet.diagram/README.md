# TDT4250 Project - Diagram

### File structure

```sh
.
├── README.md
├── META-INF
│   └── MANIFEST.MF
├── bin
│   └── TDT4250Project
│       └── polet
│           └── diagram
│               ├── Activator.class
│               └── Services.class
├── build.properties
├── description
│   └── diagram.odesign
├── plugin.properties
├── plugin.xml
└── src
    └── TDT4250Project
        └── polet
            └── diagram
                ├── Activator.java
                └── Services.java
```
## Content of diagrams in description/diagram.odesign

### ShowAllDiagram
Contains nodes or relations for all the modeled data. Product node is a representation of all the products in the .xmi file. The ProductNode has the realation productInProductTypeEdge to the productTypeNodes through the opposite containment relationship between them. The productTypeNode is a representatation of the productTypes.A product also has a relationship regionInProduct to a region through the relationclass productOfTypeInRegion. Counries are representes by countryContainers with regions as subnodes of the country in question through the regions list in country. sutibleFor is a relationship between ProductNode and MealTypeNode through the ProductOfTypeInMealType relationclass. The mealTypeNode is a representation of mealType with a reltionship to recepie node through the containment relatonship between them.

### EditDiagram
Same diagram as ShowAllDiagram, but with an aql sentence in the sematic canditaes expression of ProductNode, restricting it to only ten products. This makes the diagram cleaner and easier to edit.
