# TDT4250 Project - Model

### Data Generator:
The `DataGenerator` class can download, edit and store data from the API that Vinmonopolet provides.  
Location of the file is under:
`/src/util/DataGenerator.java`.  
To initialize an object of type `DataGenerator`, simply write:
```java
DataGenerator dg = new DataGenerator(); // Where "dg" is the variable name
```
Several methods are available. The most usefull ones are:
```java
dg.downloadJson();          // Downloads, edits and saves the data as data.json in ~/model.

dg.saveAsXMI(int limit);    // Creates EObjects and saves them as an XMI file with the structure from the Ecore model.
                            // Has a limit so you don't need to loop through the entire data set.
```
To use the `downloadJson()` function, you would need an API key. You can subscribe for one [here](https://api.vinmonopolet.no/).
Type in your API key as a string in the `Constants` class at:
`/src/util/Constants.java`.  
```java
public static final String API_KEY = "YOUR_API_KEY";
```

### JSON data structure

```json
[{
    "product": {
        "productId": "String",
        "name": "String",
        "price": 0.0,
        "alcoholContent": 0.0,
        "volume": 0.0,
        "pricePerAlcohol": 0.0,
        "pricePerVolume": 0.0
    },
    "country": {
        "countryId": "String",
        "name": "String",
        "region": {
            "regionId": "String",
            "name": "String"
        }
    },
    "productType": {
        "productTypeId": "String",
        "name": "String"
    },
    "mealTypes": ["String"]
}]
```

### File structure

```sh
├── README.md
├── META-INF
│   └── MANIFEST.MF
├── README.md
├── build.properties
├── model
│   ├── polet.ecore
│   └── polet.genmodel
├── plugin.properties
├── plugin.xml
└── src
    └── polet
        ├── Categories.java
        ├── Country.java
        ├── MealType.java
        ├── PoletFactory.java
        ├── PoletPackage.java
        ├── Product.java
        ├── ProductOfTypeInMealType.java
        ├── ProductOfTypeInRegion.java
        ├── ProductType.java
        ├── Recipe.java
        ├── Region.java
        ├── impl
        │   ├── CategoriesImpl.java
        │   ├── CountryImpl.java
        │   ├── MealTypeImpl.java
        │   ├── PoletFactoryImpl.java
        │   ├── PoletPackageImpl.java
        │   ├── ProductImpl.java
        │   ├── ProductOfTypeInMealTypeImpl.java
        │   ├── ProductOfTypeInRegionImpl.java
        │   ├── ProductTypeImpl.java
        │   ├── RecipeImpl.java
        │   └── RegionImpl.java
        └── util
            ├── Constants.java
            ├── DataGenerator.java
            ├── PoletAdapterFactory.java
            ├── PoletResourceFactoryImpl.java
            ├── PoletResourceImpl.java
            ├── PoletSwitch.java
            └── PoletValidator.java
```

