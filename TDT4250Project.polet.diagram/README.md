# TDT4250 Project - Diagram

## Content of diagrams in description/diagram.odesign

### ShowAllDiagram

Contains nodes or relations for all the modeled data. _ProductNode_ is a representation of all the products in the .xmi file. The _ProductNode_ has the realation _productInProductTypeEdge_ to the _productTypeNodes_ through the opposite containment relationship between them. The _productTypeNode_ is a representatation of the _productTypes_. A product also has a relationship _regionInProduct_ to a region through the relationclass _productOfTypeInRegion_. Counries are representes by _countryContainers_ with regions as subnodes of the country in question through the regions list in country. _sutibleFor_ is a relationship between _ProductNode_ and _MealTypeNode_ through the _ProductOfTypeInMealType_ relationclass. The _mealTypeNode_ is a representation of _mealType_ with a reltionship to recepie node through the containment relatonship between them.

### EditDiagram

Same diagram as ShowAllDiagram, but with an aql sentence in the sematic candidates expression of _ProductNode_, restricting it to only ten products. This makes the diagram cleaner and easier to edit.

### DistributionOfProductionInCountries

Generates a table showing the distribution of production of different product types in each region in every country. The inner most diagram container called _Distribution_ has a lable that does the calculation using the following aql-query:

```sql
self.products -> size() \* 100 / self.region.country.regions.products.products -> size()
```

First it gets the size of the array of product in the current region. The total number of products produced in the country is retrieved by going from region to country to all regions to all products. The ratio between the two numbers times 100 outputs the number we are looking for.
The diagram provides an overview of what type of products countries produce and how its distributed between the regions. Note that products not belonging to a specific region are connected to a region with the same name as the country.

### MealTypeDetails

Generates a table showing details related to a selected meal type. To the left it shows recipes based on the meal type you selected. To the right it will show columns of product types containing a selection of suitable products for the recipes. Each column is sorted by price using aql, enabling the user to easily find a product in a desired price range. The volume of each product is also shown.
If you want to find a suggested wine for a dinner party, add the recipe using the **EditDiagram**. Then open the correct **MealTypeDetails** diagram and you will find suggested wines under the wine column all sorted by price.

### productTypeDiagram

Generates a table of the selected _MealType_'s products sorted by the
_Products_ pricePerAlcohol attribute. The productTypeContainer is a representation of the selected _MealType_. This container contains subnodes productNodes which is a representation of Product. **AQL** is used to find these products in the products refrence in the selected _MealType_ and to order them by the _pricePerAlcohol_ attribute.

### File structure

```sh
.
├── README.md
├── META-INF
│   └── MANIFEST.MF
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
