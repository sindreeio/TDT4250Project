# TDT4250 Project

![](https://img.shields.io/badge/Editor-Eclipse-informational?style=flat&logo=eclipse-ide&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Code-Java-informational?style=flat&logo=java&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Code-Json-informational?style=flat&logo=json&logoColor=white&color=2bbc8a)

**Table of Contents**

[TOCM]

[TOC]

### Java exmaple:
`Press here` for someething.

Java:
```java
public static void main(String[] args) {
    Data d = new Data;
    d.someFunction();
    System.out.println("Github");
}
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
### Example for folder structure

```bash
.
├── README.md
├── TDT4250Project.polet.diagram
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── README.md
│   ├── build.properties
│   ├── description
│   │   └── diagram.odesign
│   ├── plugin.properties
│   ├── plugin.xml
│   └── src
│       └── TDT4250Project
│           └── polet
│               └── diagram
│                   ├── Activator.java
│                   └── Services.java
├── TDT4250Project.polet.diagram.example
│   ├── Categories.xmi
│   ├── README.md
│   └── representations.aird
└── TDT4250Project.polet.model
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
### Libraries
Java

Eclise.EMF  
Apache.HTTP  
Google.GSON   

### LICENSE
MIT
