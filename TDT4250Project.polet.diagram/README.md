# TDT4250 Project - Diagram

## Content of diagrams in description/diagram.odesign

### ShowAllDiagram

Contains nodes or relations for all the modeled data. Product node is a representation of all the products in the .xmi file. The ProductNode has the realation productInProductTypeEdge to the productTypeNodes through the opposite containment relationship between them. The productTypeNode is a representatation of the productTypes.A product also has a relationship regionInProduct to a region through the relationclass productOfTypeInRegion. Counries are representes by countryContainers with regions as subnodes of the country in question through the regions list in country. sutibleFor is a relationship between ProductNode and MealTypeNode through the ProductOfTypeInMealType relationclass. The mealTypeNode is a representation of mealType with a reltionship to recepie node through the containment relatonship between them.

### EditDiagram

Same diagram as ShowAllDiagram, but with an aql sentence in the sematic candidates expression of ProductNode, restricting it to only ten products. This makes the diagram cleaner and easier to edit.

### DistributionOfProductionInCountries

Generates a table showing the distribution of production of different product types in each region in every country. The inner most diagram container called Distribution has a lable that does the calculation using the following aql-query: self.products -> size() \* 100 / self.region.country.regions.products.products -> size(). First it gets the size of the array of product in the current region. The total number of products produced in the country is retrieved by going from region to country to all regions to all products. The ratio between the two numbers times 100 outputs the number we are looking for.
The diagram provides an overview of what type of products countries produce and how its distributed between the regions. Note that products not belonging to a specific region are connected to a region with the same name as the country.

### MealTypeDetails

Generates a table showing details related to a selected meal type. To the left it shows recipes based on the meal type you selected. To the right it will show columns of product types containing a selection of suitable products for the recipes. Each column is sorted by price using aql, enabling the user to easily find a product in a desired price range. The volume of each product is also shown.
If you want to find a suggested wine for a dinner party, add the recipe using the edit diagram. Then open the correct meal type details diagram and you will find suggested wines under the wine column all sorted by price.

### productTypeDiagram

Generates a table of the selected MealType's products sorted by the Products pricePerAlcohol attribute. The productTypeContainer is a representation of the selected MealType. This container contains subnodes productNodes which is a representation of Product. AQL is used to find these products in the products refrence in the selected MealType and to order them by the pricePerAlcohol attribute.

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
