# TDT4250Project

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
        "volume": 0.0
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
    "kronePerVolume": 0.0,
    "kronePerAlcohol": 0.0,
    "mealTypes": ["String"]
}]
```
### Example for folder structure

```bash
.
├── TDT4250Project.polet.diagram
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── bin
│   │   └── TDT4250Project
│   │       └── polet
│   │           └── diagram
│   │               ├── Activator.class
│   │               └── Services.class
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
│   └── representations.aird
└── TDT4250Project.polet.model
    ├── META-INF
    │   └── MANIFEST.MF
    ├── bin
    │   └── polet
    │       ├── Categories.class
    │       ├── Country.class
    │       ├── KronePerAlcohol.class
    │       ├── KronePerVolume.class
    │       ├── MealType.class
    │       ├── PoletFactory.class
    │       ├── PoletPackage$Literals.class
    │       ├── PoletPackage.class
    │       ├── Product.class
    │       ├── ProductType.class
    │       ├── Recipe.class
    │       ├── Region.class
    │       ├── impl
    │       │   ├── CategoriesImpl.class
    │       │   ├── CountryImpl.class
    │       │   ├── KronePerAlcoholImpl.class
    │       │   ├── KronePerVolumeImpl.class
    │       │   ├── MealTypeImpl.class
    │       │   ├── PoletFactoryImpl.class
    │       │   ├── PoletPackageImpl$1.class
    │       │   ├── PoletPackageImpl.class
    │       │   ├── ProductImpl.class
    │       │   ├── ProductTypeImpl.class
    │       │   ├── RecipeImpl.class
    │       │   └── RegionImpl.class
    │       └── util
    │           ├── Constants.class
    │           ├── DataGenerator.class
    │           ├── PoletAdapterFactory$1.class
    │           ├── PoletAdapterFactory.class
    │           ├── PoletResourceFactoryImpl.class
    │           ├── PoletResourceImpl.class
    │           ├── PoletSwitch.class
    │           └── PoletValidator.class
    ├── build.properties
    ├── model
    │   ├── Categories.xmi
    │   ├── data.json
    │   ├── polet.ecore
    │   └── polet.genmodel
    ├── plugin.properties
    ├── plugin.xml
    └── src
        └── polet
            ├── Categories.java
            ├── Country.java
            ├── KronePerAlcohol.java
            ├── KronePerVolume.java
            ├── MealType.java
            ├── PoletFactory.java
            ├── PoletPackage.java
            ├── Product.java
            ├── ProductType.java
            ├── Recipe.java
            ├── Region.java
            ├── impl
            │   ├── CategoriesImpl.java
            │   ├── CountryImpl.java
            │   ├── KronePerAlcoholImpl.java
            │   ├── KronePerVolumeImpl.java
            │   ├── MealTypeImpl.java
            │   ├── PoletFactoryImpl.java
            │   ├── PoletPackageImpl.java
            │   ├── ProductImpl.java
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

### LICENSE
MIT
